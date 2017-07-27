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
	private CertificadoUtil certificadoUtil;

	@Inject
	private CpfUtil cpfUtil;

	@GET
	@Produces("application/json")
	@Path("/teste")
	public Resposta teste() {
		System.out.println("ENTROU");
		return new Resposta(3, "teste3");
	}

	@GET
	@Produces({ "application/json"})
	@Path("/validarCertificado/{cpf}")
	public RespostaEnum validarCertificado(@PathParam("cpf") String cpf) {
		String cpfExtraido = certificadoUtil.extrairCPf(new Object());

		IRetorno retorno;

		if (!cpfUtil.cpfValido(cpf)) {
			return RespostaEnum.ERRO_CPF_INVALIDO;
		}

		return RespostaEnum.SUCESSO;
	}

	@GET
	@Produces({ "application/xml" })
	@Path("/validarCertificadoX/{cpf}")
	public Object validarCertificadoX(@PathParam("cpf") String cpf) {
		
		String cpfExtraido = certificadoUtil.extrairCPf(new Object());

		IRetorno retorno = FabricaRetornoResultado.criarRetorno(TipoRespostaEnum.XML);
		return retorno.retornaResultado(RespostaEnum.ERRO_CPF_INVALIDO);

	}

	// ITimeArquivoHelper helper =
	// FabricaTimeArquivoHelper.criarHelper(TipoArquivo.TXT);
	// helper.lerTimeDoArquivo(caminho);
	// } else if (opcao == 6) {
	//
	// ITimeArquivoHelper helper =
	// FabricaTimeArquivoHelper.criarHelper(TipoArquivo.XML);
	// helper.lerTimeDoArquivo(caminho);
}
