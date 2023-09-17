package br.com.poo.extrato;

import javax.swing.table.AbstractTableModel;

import br.com.poo.banco.contas.Conta;

public class ExtratoCliente extends AbstractTableModel {
	private static final long serialVersionUID = 1L;
	private static final String[] COLUNAS = { "CPF do Cliente", "Número da Conta" };
	private String cpf;

	public ExtratoCliente(String cpf) {
        this.cpf = cpf;
    }
	
	@Override
	public int getRowCount() {
		return Conta.mapaContas.containsKey(cpf) ? 1 : 0;
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
        if (rowIndex == 0 && Conta.mapaContas.containsKey(cpf)) {
            Conta conta = Conta.mapaContas.get(cpf);
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
