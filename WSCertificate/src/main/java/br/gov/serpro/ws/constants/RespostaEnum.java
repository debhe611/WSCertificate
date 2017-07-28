package br.gov.serpro.ws.constants;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@XmlRootElement 
public enum RespostaEnum {
	
	SUCESSO(1,"OK"),
	ERRO_CPF_INVALIDO(200,"CPF_INVALIDO"),
	ERRO_CPF_NAO_ENCONTRADO(201,"CPF_NAO_ENCONTRADO");
	
		
    private int status;
    private String mensagem;
    
    public int getCodigo() {
		return status;
	}

	public String getMensagem() {
		return mensagem;
	}

	RespostaEnum(int codigo, String mensagem) {
		this.status = codigo;
		this.mensagem = mensagem;
	}
	
	

}
