package br.gov.serpro.ws.business;

import javax.inject.Inject;

import br.gov.serpro.ws.constants.TipoRespostaEnum;
import br.gov.serpro.ws.domain.Resposta;
import br.gov.serpro.ws.domain.TipoResposta;
import br.gov.serpro.ws.facade.IRetorno;
import br.gov.serpro.ws.factory.FabricaRetornoResultado;
import br.gov.serpro.ws.util.CertificadoUtil;
import br.gov.serpro.ws.util.CpfUtil;

public class CertificadoBC {
	
	@Inject
	private CpfUtil cpfUtil;
	
	@Inject
	private CertificadoUtil certificadoUtil;
	
	
	public Resposta validarCertificado(Object certificado){
		
		String cpfExtraido = certificadoUtil.extrairCPf(certificado);
		
		IRetorno retorno;		
		
		retorno = FabricaRetornoResultado.criarRetorno(TipoRespostaEnum.JSON);	
		
		Resposta re = new Resposta(1, "testeeeeeeee");
		return Resposta.from(TipoResposta.SUCESSO);
		

//		if (!cpfUtil.cpfValido(cpfExtraido)) {
//			return RespostaEnum.ERRO_CPF_INVALIDO;
//		}
//
//		return RespostaEnum.SUCESSO;	
	
		
	}

}
