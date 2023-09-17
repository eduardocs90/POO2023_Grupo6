package br.com.poo.banco.enums; 

public enum AgenciaEnum {
	AGENCIA_1234_0("1234-0",1),
    AGENCIA_3456_0("3456-0",2),
    AGENCIA_5678_0("5678-0",3),
    AGENCIA_7890_0("7890-0",4),
    AGENCIA_9012_0("9012-0",5);
	
	private String tipoAgencia;
	private int id;
	
	AgenciaEnum(String tipoAgencia,int id) {
		this.tipoAgencia = tipoAgencia;
		this.id = id;
	}
	
	public String getTipoAgencia() {
		return tipoAgencia;
	}
	
	public int getId() {
		return id;
	}
}
