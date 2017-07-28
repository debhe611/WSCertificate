package br.gov.serpro.ws.facade;

import br.gov.serpro.ws.constants.RespostaEnum;

public class RetornoJson implements IRetorno {

	@Override
	public RespostaEnum retornaResultado(RespostaEnum respostaEnum) {
		
		return respostaEnum;
	}

}
