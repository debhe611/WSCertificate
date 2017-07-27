package br.gov.serpro.ws.facade;

import com.thoughtworks.xstream.XStream;

import br.gov.serpro.ws.constants.RespostaEnum;

public class RetornoXml implements IRetorno {

	@Override
	public Object retornaResultado(RespostaEnum respostaEnum) {
		XStream xstream = new XStream();
		String xml = xstream.toXML(respostaEnum);
		return xml;
	}

}
