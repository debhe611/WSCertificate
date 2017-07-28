package br.gov.serpro.ws.service;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.gov.serpro.ws.business.CertificadoBC;
import br.gov.serpro.ws.constants.RespostaEnum;
import br.gov.serpro.ws.constants.TipoRespostaEnum;
import br.gov.serpro.ws.facade.IRetorno;
import br.gov.serpro.ws.factory.FabricaRetornoResultado;
import br.gov.serpro.ws.util.CertificadoUtil;
import br.gov.serpro.ws.util.CpfUtil;
import com.thoughtworks.xstream.XStream;

@Path("certificado")
public class CertificadoService {
	
	@Inject
	private CertificadoBC certificadoBc;

	@GET
	@Produces("application/json")
	@Path("/teste")
	public Resposta teste() {
		
		return new Resposta(3, "teste3");
	}

	@GET
	@Produces({ "application/xml" ,"application/json"})
	@Path("/validarCertificado/{cpf}")
	public Resposta validarCertificado(@PathParam("cpf") String certificado) {
		
		return certificadoBc.validarCertificado(certificado);

	}

	@GET
	@Produces({ "application/xml" })
	@Path("/validarCertificadoX/{cpf}")
	public Object validarCertificadoX(@PathParam("cpf") String cpf) {		

		IRetorno retorno = FabricaRetornoResultado.criarRetorno(TipoRespostaEnum.XML);
		return retorno.retornaResultado(RespostaEnum.ERRO_CPF_INVALIDO);

	}


}
