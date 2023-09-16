package br.com.poo.extrato;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.poo.banco.contas.Conta;

public class ExtratoCliente extends AbstractTableModel{
	private static final long serialVersionUID = 1L;
    private static final String[] COLUNAS = {"CPF do Cliente", "Número da Conta"};

    @Override
    public int getRowCount() {
        return Conta.mapaContas.size();
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
        List<Conta> contas = new ArrayList<>(Conta.mapaContas.values());

        if (rowIndex < 0 || rowIndex >= contas.size()) {
            return null;
        }

        Conta conta = contas.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return conta.getCpf();
            case 1:
                return conta.getNumConta();
            default:
                return null;
        }
    }
}
