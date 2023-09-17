package br.com.poo.relatorios;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import br.com.poo.banco.pessoas.Funcionario;

public class RelatorioP extends AbstractTableModel{
	private static final long serialVersionUID = 1L;
    private static final String[] COLUNAS = {"Nome", "Agência de Controle", "Tipo de Funcionario"};
    private List<Funcionario> funcionario;

    public RelatorioP(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public int getRowCount() {
        return funcionario.size();
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
        if (rowIndex >= 0 && rowIndex < funcionario.size()) {
            Funcionario func = funcionario.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return func.getNome();
                case 1:
                    return func.getAgencia();
                case 2:
                    return func.getTipoFuncionario();
                default:
                    return null;
            }
        }
        return null;
    }

}
