package br.com.poo.relatorios;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.poo.banco.contas.Conta;

public class RelatorioG extends AbstractTableModel {
    private static final long serialVersionUID = 1L;
    private static final String[] COLUNAS = {"Cpf", "N°Agencia"};
    private String numAgencia;
    private List<Conta> contasFiltradas;
   


    public RelatorioG(String numAgencia) {
    	
    	this.numAgencia = numAgencia;
        this.contasFiltradas = filtrarContasPorAgencia(numAgencia);

    }
    
    private List<Conta> filtrarContasPorAgencia(String numAgencia) {
        List<Conta> contasFiltradas = new ArrayList<>();
        for (Conta conta : Conta.mapaContas.values()) {
            if (conta.getNumAgencia().equals(this.numAgencia)) {
                contasFiltradas.add(conta);
            }
        }
        return contasFiltradas;
    }
    
    @Override
    public int getRowCount() {
    	return contasFiltradas.size();
    }

    @Override
    public int getColumnCount() {
        return COLUNAS.length;
    }

    @Override
    public String getColumnName(int column) {
        return COLUNAS[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (rowIndex >= 0 && rowIndex < contasFiltradas.size()) {
            Conta conta = contasFiltradas.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return conta.getCpf();
                case 1:
                    return conta.getNumConta();
                default:
                    return null;
            }
        }
        return null;
    }
}