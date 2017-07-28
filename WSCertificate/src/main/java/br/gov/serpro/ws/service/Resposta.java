package br.gov.serpro.ws.service;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public class Resposta implements Serializable{

	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	
	private int i;
	
	public String status;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Resposta(int i, String status) {
		super();
		this.i = i;
		this.status = status;
	}



}
