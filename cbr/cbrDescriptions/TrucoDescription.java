package cbr.cbrDescriptions;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;

public class TrucoDescription implements CaseComponent {

	Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	Integer idMao;
	String idPartida;
	Integer jogadorMao;
	Integer cartaAltaRobo;
	Integer cartaMediaRobo;
	Integer cartaBaixaRobo;
	Integer cartaAltaHumano;
	Integer cartaMediaHumano;
	Integer cartaBaixaHumano;
	Integer primeiraCartaRobo;
	Integer primeiraCartaHumano;
	Integer segundaCartaRobo;
	Integer segundaCartaHumano;
	Integer terceiraCartaRobo;
	Integer terceiraCartaHumano;
	Integer ganhadorPrimeiraRodada;
	Integer ganhadorSegundaRodada;
	Integer ganhadorTerceiraRodada;
	Integer roboCartaVirada;
	Integer humanoCartaVirada;
	Integer quemPediuEnvido;
	Integer quemPediuFaltaEnvido;
	Integer quemPediuRealEnvido;
	Integer pontosEnvidoRobo;
	Integer pontosEnvidoHumano;
	Integer quemNegouEnvido;
	Integer quemGanhouEnvido;
	Integer tentosEnvido;
	Integer quemFlor;
	Integer quemContraFlor;
	Integer quemContraFlorResto;
	Integer quemNegouFlor;
	Integer pontosFlorRobo;
	Integer pontosFlorHumano;
	Integer quemGanhouFlor;
	Integer tentosFlor;
	Integer quemEscondeuPontosEnvido;
	Integer quemEscondeuPontosFlor;
	Integer quemTruco;
	Integer quandoTruco;
	Integer quemRetruco;
	Integer quandoRetruco;
	Integer quemValeQuatro;
	Integer quandoValeQuatro;
	Integer quemNegouTruco;
	Integer quemGanhouTruco;
	Integer tentosTruco;
	Integer tentosAnterioresRobo;
	Integer tentosAnterioresHumano;
	Integer tentosPosterioresRobo;
	Integer tentosPosterioresHumano;
	Integer roboMentiuEnvido;
	Integer humanoMentiuEnvido;
	Integer roboMentiuFlor;
	Integer humanoMentiuFlor;
	Integer roboMentiuTruco;
	Integer humanoMentiuTruco;
	Integer quemBaralho;
	Integer quandoBaralho;
	Integer quemContraFlorFalta;
	Integer quemEnvidoEnvido;
	Integer quemFlorFlor;
	Integer quandoCartaVirada;
	String naipeCartaAltaRobo;
	String naipeCartaMediaRobo;
	String naipeCartaBaixaRobo;
	String naipeCartaAltaHumano;
	String naipeCartaMediaHumano;
	String naipeCartaBaixaHumano;
	String naipePrimeiraCartaRobo;
	String naipePrimeiraCartaHumano;
	String naipeSegundaCartaRobo;
	String naipeSegundaCartaHumano;
	String naipeTerceiraCartaRobo;
	String naipeTerceiraCartaHumano;


	double SimilaridadeCaso;

	
	Integer cartaAltaRoboClustering;
	Integer cartaMediaRoboClustering;
	Integer cartaBaixaRoboClustering;

	Integer clusterPrimeiraCartaAgenteMao;
	Integer clusterPrimeiraCartaAgentePe;

	Integer clusterSegundaCartaAgenteGanhouAprimeira;
	Integer clusterSegundaCartaAgentePerdeuAprimeira;
	
	Integer primeiraCartaHumanoClustering;
	Integer segundaCartaHumanoClustering;
	Integer terceiraCartaHumanoClustering;

	Integer primeiraCartaRoboClustering;
	Integer segundaCartaRoboClustering;
	Integer terceiraCartaRoboClustering;


	
	Integer clusterTerceiraCartaAgenteGanhouAsegunda;
	Integer clusterTerceiraCartaAgentePerdeuAsegunda;
	
	Integer clusterGanhadorUltimaRodada;
	
	Integer clusterQuemTruco;
	Integer clusterQuandoTruco;
	
	Integer clusterQuemEnvidoAgenteMao;
	Integer clusterQuemFlor;
	
	
	Integer ganhadorMao;
	
	Integer clusterQuemEnvidoAgentePe;
	
	Integer saldoTruco;
	Integer saldoEnvido;
	Integer saldoFlor;
	
	Integer clusteringindexacao;
	
	


	public Integer getClusteringindexacao() {
		return clusteringindexacao;
	}

	public void setClusteringindexacao(Integer clusteringindexacao) {
		this.clusteringindexacao = clusteringindexacao;
	}

	public double getSimilaridadeCaso() {
		return SimilaridadeCaso;
	}

	public void setSimilaridadeCaso(double SimilaridadeCaso) {
		this.SimilaridadeCaso = SimilaridadeCaso;
	}

	public Integer getIdMao() {
		return idMao;
	}

	public void setIdMao(Integer idMao) {
		this.idMao = idMao;
	}

	public String getIdPartida() {
		return idPartida;
	}

	public void setIdPartida(String idPartida) {
		this.idPartida = idPartida;
	}

	public Integer getJogadorMao() {
		return jogadorMao;
	}

	public void setJogadorMao(Integer jogadorMao) {
		this.jogadorMao = jogadorMao;
	}

	public Integer getCartaAltaRobo() {
		return cartaAltaRobo;
	}

	public void setCartaAltaRobo(Integer cartaAltaRobo) {
		this.cartaAltaRobo = cartaAltaRobo;
	}

	public Integer getCartaMediaRobo() {
		return cartaMediaRobo;
	}

	public void setCartaMediaRobo(Integer cartaMediaRobo) {
		this.cartaMediaRobo = cartaMediaRobo;
	}

	public Integer getCartaBaixaRobo() {
		return cartaBaixaRobo;
	}

	public void setCartaBaixaRobo(Integer cartaBaixaRobo) {
		this.cartaBaixaRobo = cartaBaixaRobo;
	}

	public Integer getCartaAltaHumano() {
		return cartaAltaHumano;
	}

	public void setCartaAltaHumano(Integer cartaAltaHumano) {
		this.cartaAltaHumano = cartaAltaHumano;
	}

	public Integer getCartaMediaHumano() {
		return cartaMediaHumano;
	}

	public void setCartaMediaHumano(Integer cartaMediaHumano) {
		this.cartaMediaHumano = cartaMediaHumano;
	}

	public Integer getCartaBaixaHumano() {
		return cartaBaixaHumano;
	}

	public void setCartaBaixaHumano(Integer cartaBaixaHumano) {
		this.cartaBaixaHumano = cartaBaixaHumano;
	}

	public Integer getPrimeiraCartaRobo() {
		return primeiraCartaRobo;
	}

	public void setPrimeiraCartaRobo(Integer primeiraCartaRobo) {
		this.primeiraCartaRobo = primeiraCartaRobo;
	}

	public Integer getPrimeiraCartaHumano() {
		return primeiraCartaHumano;
	}

	public void setPrimeiraCartaHumano(Integer primeiraCartaHumano) {
		this.primeiraCartaHumano = primeiraCartaHumano;
	}

	public Integer getSegundaCartaRobo() {
		return segundaCartaRobo;
	}

	public void setSegundaCartaRobo(Integer segundaCartaRobo) {
		this.segundaCartaRobo = segundaCartaRobo;
	}

	public Integer getSegundaCartaHumano() {
		return segundaCartaHumano;
	}

	public void setSegundaCartaHumano(Integer segundaCartaHumano) {
		this.segundaCartaHumano = segundaCartaHumano;
	}

	public Integer getTerceiraCartaRobo() {
		return terceiraCartaRobo;
	}

	public void setTerceiraCartaRobo(Integer terceiraCartaRobo) {
		this.terceiraCartaRobo = terceiraCartaRobo;
	}

	public Integer getTerceiraCartaHumano() {
		return terceiraCartaHumano;
	}

	public void setTerceiraCartaHumano(Integer terceiraCartaHumano) {
		this.terceiraCartaHumano = terceiraCartaHumano;
	}

	public Integer getGanhadorPrimeiraRodada() {
		return ganhadorPrimeiraRodada;
	}

	public void setGanhadorPrimeiraRodada(Integer ganhadorPrimeiraRodada) {
		this.ganhadorPrimeiraRodada = ganhadorPrimeiraRodada;
	}

	public Integer getGanhadorSegundaRodada() {
		return ganhadorSegundaRodada;
	}

	public void setGanhadorSegundaRodada(Integer ganhadorSegundaRodada) {
		this.ganhadorSegundaRodada = ganhadorSegundaRodada;
	}

	public Integer getGanhadorTerceiraRodada() {
		return ganhadorTerceiraRodada;
	}

	public void setGanhadorTerceiraRodada(Integer ganhadorTerceiraRodada) {
		this.ganhadorTerceiraRodada = ganhadorTerceiraRodada;
	}

	public Integer getRoboCartaVirada() {
		return roboCartaVirada;
	}

	public void setRoboCartaVirada(Integer roboCartaVirada) {
		this.roboCartaVirada = roboCartaVirada;
	}

	public Integer getHumanoCartaVirada() {
		return humanoCartaVirada;
	}

	public void setHumanoCartaVirada(Integer humanoCartaVirada) {
		this.humanoCartaVirada = humanoCartaVirada;
	}

	public Integer getQuemPediuEnvido() {
		return quemPediuEnvido;
	}

	public void setQuemPediuEnvido(Integer quemPediuEnvido) {
		this.quemPediuEnvido = quemPediuEnvido;
	}

	public Integer getQuemPediuFaltaEnvido() {
		return quemPediuFaltaEnvido;
	}

	public void setQuemPediuFaltaEnvido(Integer quemPediuFaltaEnvido) {
		this.quemPediuFaltaEnvido = quemPediuFaltaEnvido;
	}

	public Integer getQuemPediuRealEnvido() {
		return quemPediuRealEnvido;
	}

	public void setQuemPediuRealEnvido(Integer quemPediuRealEnvido) {
		this.quemPediuRealEnvido = quemPediuRealEnvido;
	}

	public Integer getPontosEnvidoRobo() {
		return pontosEnvidoRobo;
	}

	public void setPontosEnvidoRobo(Integer pontosEnvidoRobo) {
		this.pontosEnvidoRobo = pontosEnvidoRobo;
	}

	public Integer getPontosEnvidoHumano() {
		return pontosEnvidoHumano;
	}

	public void setPontosEnvidoHumano(Integer pontosEnvidoHumano) {
		this.pontosEnvidoHumano = pontosEnvidoHumano;
	}

	public Integer getQuemNegouEnvido() {
		return quemNegouEnvido;
	}

	public void setQuemNegouEnvido(Integer quemNegouEnvido) {
		this.quemNegouEnvido = quemNegouEnvido;
	}

	public Integer getQuemGanhouEnvido() {
		return quemGanhouEnvido;
	}

	public void setQuemGanhouEnvido(Integer quemGanhouEnvido) {
		this.quemGanhouEnvido = quemGanhouEnvido;
	}

	public Integer getTentosEnvido() {
		return tentosEnvido;
	}

	public void setTentosEnvido(Integer tentosEnvido) {
		this.tentosEnvido = tentosEnvido;
	}

	public Integer getQuemFlor() {
		return quemFlor;
	}

	public void setQuemFlor(Integer quemFlor) {
		this.quemFlor = quemFlor;
	}

	public Integer getQuemContraFlor() {
		return quemContraFlor;
	}

	public void setQuemContraFlor(Integer quemContraFlor) {
		this.quemContraFlor = quemContraFlor;
	}

	public Integer getQuemContraFlorResto() {
		return quemContraFlorResto;
	}

	public void setQuemContraFlorResto(Integer quemContraFlorResto) {
		this.quemContraFlorResto = quemContraFlorResto;
	}

	public Integer getQuemNegouFlor() {
		return quemNegouFlor;
	}

	public void setQuemNegouFlor(Integer quemNegouFlor) {
		this.quemNegouFlor = quemNegouFlor;
	}

	public Integer getPontosFlorRobo() {
		return pontosFlorRobo;
	}

	public void setPontosFlorRobo(Integer pontosFlorRobo) {
		this.pontosFlorRobo = pontosFlorRobo;
	}

	public Integer getPontosFlorHumano() {
		return pontosFlorHumano;
	}

	public void setPontosFlorHumano(Integer pontosFlorHumano) {
		this.pontosFlorHumano = pontosFlorHumano;
	}

	public Integer getQuemGanhouFlor() {
		return quemGanhouFlor;
	}
	
	public void setQuemGanhouFlor(Integer quemGanhouFlor) {
		this.quemGanhouFlor = quemGanhouFlor;
	}

	public Integer getTentosFlor() {
		return tentosFlor;
	}

	public void setTentosFlor(Integer tentosFlor) {
		this.tentosFlor = tentosFlor;
	}

	public Integer getQuemEscondeuPontosEnvido() {
		return quemEscondeuPontosEnvido;
	}

	public void setQuemEscondeuPontosEnvido(Integer quemEscondeuPontosEnvido) {
		this.quemEscondeuPontosEnvido = quemEscondeuPontosEnvido;
	}

	public Integer getQuemEscondeuPontosFlor() {
		return quemEscondeuPontosFlor;
	}

	public void setQuemEscondeuPontosFlor(Integer quemEscondeuPontosFlor) {
		this.quemEscondeuPontosFlor = quemEscondeuPontosFlor;
	}

	public Integer getQuemTruco() {
		return quemTruco;
	}

	public void setQuemTruco(Integer quemTruco) {
		this.quemTruco = quemTruco;
	}

	public Integer getQuandoTruco() {
		return quandoTruco;
	}

	public void setQuandoTruco(Integer quandoTruco) {
		this.quandoTruco = quandoTruco;
	}

	public Integer getQuemRetruco() {
		return quemRetruco;
	}

	public void setQuemRetruco(Integer quemRetruco) {
		this.quemRetruco = quemRetruco;
	}

	public Integer getQuandoRetruco() {
		return quandoRetruco;
	}

	public void setQuandoRetruco(Integer quandoRetruco) {
		this.quandoRetruco = quandoRetruco;
	}

	public Integer getQuemValeQuatro() {
		return quemValeQuatro;
	}

	public void setQuemValeQuatro(Integer quemValeQuatro) {
		this.quemValeQuatro = quemValeQuatro;
	}

	public Integer getQuandoValeQuatro() {
		return quandoValeQuatro;
	}

	public void setQuandoValeQuatro(Integer quandoValeQuatro) {
		this.quandoValeQuatro = quandoValeQuatro;
	}

	public Integer getQuemNegouTruco() {
		return quemNegouTruco;
	}

	public void setQuemNegouTruco(Integer quemNegouTruco) {
		this.quemNegouTruco = quemNegouTruco;
	}

	public Integer getQuemGanhouTruco() {
		return quemGanhouTruco;
	}

	public void setQuemGanhouTruco(Integer quemGanhouTruco) {
		this.quemGanhouTruco = quemGanhouTruco;
	}

	public Integer getTentosTruco() {
		return tentosTruco;
	}

	public void setTentosTruco(Integer tentosTruco) {
		this.tentosTruco = tentosTruco;
	}

	public Integer getTentosAnterioresRobo() {
		return tentosAnterioresRobo;
	}

	public void setTentosAnterioresRobo(Integer tentosAnterioresRobo) {
		this.tentosAnterioresRobo = tentosAnterioresRobo;
	}

	public Integer getTentosAnterioresHumano() {
		return tentosAnterioresHumano;
	}

	public void setTentosAnterioresHumano(Integer tentosAnterioresHumano) {
		this.tentosAnterioresHumano = tentosAnterioresHumano;
	}

	public Integer getTentosPosterioresRobo() {
		return tentosPosterioresRobo;
	}

	public void setTentosPosterioresRobo(Integer tentosPosterioresRobo) {
		this.tentosPosterioresRobo = tentosPosterioresRobo;
	}

	public Integer getTentosPosterioresHumano() {
		return tentosPosterioresHumano;
	}

	public void setTentosPosterioresHumano(Integer tentosPosterioresHumano) {
		this.tentosPosterioresHumano = tentosPosterioresHumano;
	}

	public Integer getRoboMentiuEnvido() {
		return roboMentiuEnvido;
	}

	public void setRoboMentiuEnvido(Integer roboMentiuEnvido) {
		this.roboMentiuEnvido = roboMentiuEnvido;
	}

	public Integer getHumanoMentiuEnvido() {
		return humanoMentiuEnvido;
	}

	public void setHumanoMentiuEnvido(Integer humanoMentiuEnvido) {
		this.humanoMentiuEnvido = humanoMentiuEnvido;
	}

	public Integer getRoboMentiuFlor() {
		return roboMentiuFlor;
	}

	public void setRoboMentiuFlor(Integer roboMentiuFlor) {
		this.roboMentiuFlor = roboMentiuFlor;
	}

	public Integer getHumanoMentiuFlor() {
		return humanoMentiuFlor;
	}

	public void setHumanoMentiuFlor(Integer humanoMentiuFlor) {
		this.humanoMentiuFlor = humanoMentiuFlor;
	}

	public Integer getRoboMentiuTruco() {
		return roboMentiuTruco;
	}

	public void setRoboMentiuTruco(Integer roboMentiuTruco) {
		this.roboMentiuTruco = roboMentiuTruco;
	}

	public Integer getHumanoMentiuTruco() {
		return humanoMentiuTruco;
	}

	public void setHumanoMentiuTruco(Integer humanoMentiuTruco) {
		this.humanoMentiuTruco = humanoMentiuTruco;
	}

	public Integer getQuemBaralho() {
		return quemBaralho;
	}

	public void setQuemBaralho(Integer quemBaralho) {
		this.quemBaralho = quemBaralho;
	}

	public Integer getQuandoBaralho() {
		return quandoBaralho;
	}

	public void setQuandoBaralho(Integer quandoBaralho) {
		this.quandoBaralho = quandoBaralho;
	}

	public Integer getQuemContraFlorFalta() {
		return quemContraFlorFalta;
	}

	public void setQuemContraFlorFalta(Integer quemContraFlorFalta) {
		this.quemContraFlorFalta = quemContraFlorFalta;
	}

	public Integer getQuemEnvidoEnvido() {
		return quemEnvidoEnvido;
	}

	public void setQuemEnvidoEnvido(Integer quemEnvidoEnvido) {
		this.quemEnvidoEnvido = quemEnvidoEnvido;
	}

	public Integer getQuemFlorFlor() {
		return quemFlorFlor;
	}

	public void setQuemFlorFlor(Integer quemFlorFlor) {
		this.quemFlorFlor = quemFlorFlor;
	}

	public Integer getQuandoCartaVirada() {
		return quandoCartaVirada;
	}

	public void setQuandoCartaVirada(Integer quandoCartaVirada) {
		this.quandoCartaVirada = quandoCartaVirada;
	}

	public String getNaipeCartaAltaRobo() {
		return naipeCartaAltaRobo;
	}

	public void setNaipeCartaAltaRobo(String naipeCartaAltaRobo) {
		this.naipeCartaAltaRobo = naipeCartaAltaRobo;
	}

	public String getNaipeCartaMediaRobo() {
		return naipeCartaMediaRobo;
	}

	public void setNaipeCartaMediaRobo(String naipeCartaMediaRobo) {
		this.naipeCartaMediaRobo = naipeCartaMediaRobo;
	}

	public String getNaipeCartaBaixaRobo() {
		return naipeCartaBaixaRobo;
	}

	public void setNaipeCartaBaixaRobo(String naipeCartaBaixaRobo) {
		this.naipeCartaBaixaRobo = naipeCartaBaixaRobo;
	}

	public String getNaipeCartaAltaHumano() {
		return naipeCartaAltaHumano;
	}

	public void setNaipeCartaAltaHumano(String naipeCartaAltaHumano) {
		this.naipeCartaAltaHumano = naipeCartaAltaHumano;
	}

	public String getNaipeCartaMediaHumano() {
		return naipeCartaMediaHumano;
	}

	public void setNaipeCartaMediaHumano(String naipeCartaMediaHumano) {
		this.naipeCartaMediaHumano = naipeCartaMediaHumano;
	}

	public String getNaipeCartaBaixaHumano() {
		return naipeCartaBaixaHumano;
	}

	public void setNaipeCartaBaixaHumano(String naipeCartaBaixaHumano) {
		this.naipeCartaBaixaHumano = naipeCartaBaixaHumano;
	}

	public String getNaipePrimeiraCartaRobo() {
		return naipePrimeiraCartaRobo;
	}

	public void setNaipePrimeiraCartaRobo(String naipePrimeiraCartaRobo) {
		this.naipePrimeiraCartaRobo = naipePrimeiraCartaRobo;
	}

	public String getNaipePrimeiraCartaHumano() {
		return naipePrimeiraCartaHumano;
	}

	public void setNaipePrimeiraCartaHumano(String naipePrimeiraCartaHumano) {
		this.naipePrimeiraCartaHumano = naipePrimeiraCartaHumano;
	}

	public String getNaipeSegundaCartaRobo() {
		return naipeSegundaCartaRobo;
	}

	public void setNaipeSegundaCartaRobo(String naipeSegundaCartaRobo) {
		this.naipeSegundaCartaRobo = naipeSegundaCartaRobo;
	}

	public String getNaipeSegundaCartaHumano() {
		return naipeSegundaCartaHumano;
	}

	public void setNaipeSegundaCartaHumano(String naipeSegundaCartaHumano) {
		this.naipeSegundaCartaHumano = naipeSegundaCartaHumano;
	}

	public String getNaipeTerceiraCartaRobo() {
		return naipeTerceiraCartaRobo;
	}

	public void setNaipeTerceiraCartaRobo(String naipeTerceiraCartaRobo) {
		this.naipeTerceiraCartaRobo = naipeTerceiraCartaRobo;
	}

	public String getNaipeTerceiraCartaHumano() {
		return naipeTerceiraCartaHumano;
	}

	public void setNaipeTerceiraCartaHumano(String naipeTerceiraCartaHumano) {
		this.naipeTerceiraCartaHumano = naipeTerceiraCartaHumano;
	}
	
	
	
	

	public Integer getGanhadorMao() {
		return ganhadorMao;
	}

	public void setGanhadorMao(Integer ganhadorMao) {
		this.ganhadorMao = ganhadorMao;
	}

	@Override
	public Attribute getIdAttribute() {
		// TODO Auto-generated method stub
		return null;
	}



	public TrucoDescription(Integer idMao, String idPartida, Integer jogadorMao, Integer cartaAltaRobo,
			Integer cartaMediaRobo, Integer cartaBaixaRobo, Integer cartaAltaHumano, Integer cartaMediaHumano,
			Integer cartaBaixaHumano, Integer primeiraCartaRobo, Integer primeiraCartaHumano, Integer segundaCartaRobo,
			Integer segundaCartaHumano, Integer terceiraCartaRobo, Integer terceiraCartaHumano,
			Integer ganhadorPrimeiraRodada, Integer ganhadorSegundaRodada, Integer ganhadorTerceiraRodada,
			Integer roboCartaVirada, Integer humanoCartaVirada, Integer quemPediuEnvido, Integer quemPediuFaltaEnvido,
			Integer quemPediuRealEnvido, Integer pontosEnvidoRobo, Integer pontosEnvidoHumano, Integer quemNegouEnvido,
			Integer quemGanhouEnvido, Integer tentosEnvido, Integer quemFlor, Integer quemContraFlor,
			Integer quemContraFlorResto, Integer quemNegouFlor, Integer pontosFlorRobo, Integer pontosFlorHumano,
			Integer quemGanhouFlor, Integer tentosFlor, Integer quemEscondeuPontosEnvido,
			Integer quemEscondeuPontosFlor, Integer quemTruco, Integer quandoTruco, Integer quemRetruco,
			Integer quandoRetruco, Integer quemValeQuatro, Integer quandoValeQuatro, Integer quemNegouTruco,
			Integer quemGanhouTruco, Integer tentosTruco, Integer tentosAnterioresRobo, Integer tentosAnterioresHumano,
			Integer tentosPosterioresRobo, Integer tentosPosterioresHumano, Integer roboMentiuEnvido,
			Integer humanoMentiuEnvido, Integer roboMentiuFlor, Integer humanoMentiuFlor, Integer roboMentiuTruco,
			Integer humanoMentiuTruco, Integer quemBaralho, Integer quandoBaralho, Integer quemContraFlorFalta,
			Integer quemEnvidoEnvido, Integer quemFlorFlor, Integer quandoCartaVirada, String naipeCartaAltaRobo,
			String naipeCartaMediaRobo, String naipeCartaBaixaRobo, String naipeCartaAltaHumano,
			String naipeCartaMediaHumano, String naipeCartaBaixaHumano, String naipePrimeiraCartaRobo,
			String naipePrimeiraCartaHumano, String naipeSegundaCartaRobo, String naipeSegundaCartaHumano,
			String naipeTerceiraCartaRobo, String naipeTerceiraCartaHumano, double similaridadeCaso,

			Integer cartaAltaRoboClustering, Integer cartaMediaRoboClustering, Integer cartaBaixaRoboClustering,
			Integer clusterPrimeiraCartaAgenteMao, Integer clusterPrimeiraCartaAgentePe,
			Integer clusterSegundaCartaAgenteGanhouAPrimeira, Integer clusterSegundaCartaAgentePerdeuAPrimeira,
			Integer primeiraCartaHumanoClustering, Integer segundaCartaHumanoClustering,
			Integer terceiraCartaHumanoClustering, Integer primeiraCartaRoboClustering,
			Integer segundaCartaRoboClustering, Integer terceiraCartaRoboClustering,
			Integer clusterTerceiraCartaAgenteGanhouAsegunda, Integer clusterTerceiraCartaAgentePerdeuAsegunda,
			Integer clusterGanhadorUltimaRodada, Integer clusterQuemTruco, Integer clusterQuandoTruco,
			Integer clusterQuemEnvido, Integer clusterQuandoFlor, Integer ganhadorMao, Integer clusterQuemEnvidoAgentePe,
			Integer saldoEnvido, Integer saldoFlor, Integer saldoTruco

	) {
		super();
		this.idMao = idMao;
		this.idPartida = idPartida;
		this.jogadorMao = jogadorMao;
		this.cartaAltaRobo = cartaAltaRobo;
		this.cartaMediaRobo = cartaMediaRobo;
		this.cartaBaixaRobo = cartaBaixaRobo;
		this.cartaAltaHumano = cartaAltaHumano;
		this.cartaMediaHumano = cartaMediaHumano;
		this.cartaBaixaHumano = cartaBaixaHumano;
		this.primeiraCartaRobo = primeiraCartaRobo;
		this.primeiraCartaHumano = primeiraCartaHumano;
		this.segundaCartaRobo = segundaCartaRobo;
		this.segundaCartaHumano = segundaCartaHumano;
		this.terceiraCartaRobo = terceiraCartaRobo;
		this.terceiraCartaHumano = terceiraCartaHumano;
		this.ganhadorPrimeiraRodada = ganhadorPrimeiraRodada;
		this.ganhadorSegundaRodada = ganhadorSegundaRodada;
		this.ganhadorTerceiraRodada = ganhadorTerceiraRodada;
		this.roboCartaVirada = roboCartaVirada;
		this.humanoCartaVirada = humanoCartaVirada;
		this.quemPediuEnvido = quemPediuEnvido;
		this.quemPediuFaltaEnvido = quemPediuFaltaEnvido;
		this.quemPediuRealEnvido = quemPediuRealEnvido;
		this.pontosEnvidoRobo = pontosEnvidoRobo;
		this.pontosEnvidoHumano = pontosEnvidoHumano;
		this.quemNegouEnvido = quemNegouEnvido;
		this.quemGanhouEnvido = quemGanhouEnvido;
		this.tentosEnvido = tentosEnvido;
		this.quemFlor = quemFlor;
		this.quemContraFlor = quemContraFlor;
		this.quemContraFlorResto = quemContraFlorResto;
		this.quemNegouFlor = quemNegouFlor;
		this.pontosFlorRobo = pontosFlorRobo;
		this.pontosFlorHumano = pontosFlorHumano;
		this.quemGanhouFlor = quemGanhouFlor;
		this.tentosFlor = tentosFlor;
		this.quemEscondeuPontosEnvido = quemEscondeuPontosEnvido;
		this.quemEscondeuPontosFlor = quemEscondeuPontosFlor;
		this.quemTruco = quemTruco;
		this.quandoTruco = quandoTruco;
		this.quemRetruco = quemRetruco;
		this.quandoRetruco = quandoRetruco;
		this.quemValeQuatro = quemValeQuatro;
		this.quandoValeQuatro = quandoValeQuatro;
		this.quemNegouTruco = quemNegouTruco;
		this.quemGanhouTruco = quemGanhouTruco;
		this.tentosTruco = tentosTruco;
		this.tentosAnterioresRobo = tentosAnterioresRobo;
		this.tentosAnterioresHumano = tentosAnterioresHumano;
		this.tentosPosterioresRobo = tentosPosterioresRobo;
		this.tentosPosterioresHumano = tentosPosterioresHumano;
		this.roboMentiuEnvido = roboMentiuEnvido;
		this.humanoMentiuEnvido = humanoMentiuEnvido;
		this.roboMentiuFlor = roboMentiuFlor;
		this.humanoMentiuFlor = humanoMentiuFlor;
		this.roboMentiuTruco = roboMentiuTruco;
		this.humanoMentiuTruco = humanoMentiuTruco;
		this.quemBaralho = quemBaralho;
		this.quandoBaralho = quandoBaralho;
		this.quemContraFlorFalta = quemContraFlorFalta;
		this.quemEnvidoEnvido = quemEnvidoEnvido;
		this.quemFlorFlor = quemFlorFlor;
		this.quandoCartaVirada = quandoCartaVirada;
		this.naipeCartaAltaRobo = naipeCartaAltaRobo;
		this.naipeCartaMediaRobo = naipeCartaMediaRobo;
		this.naipeCartaBaixaRobo = naipeCartaBaixaRobo;
		this.naipeCartaAltaHumano = naipeCartaAltaHumano;
		this.naipeCartaMediaHumano = naipeCartaMediaHumano;
		this.naipeCartaBaixaHumano = naipeCartaBaixaHumano;
		this.naipePrimeiraCartaRobo = naipePrimeiraCartaRobo;
		this.naipePrimeiraCartaHumano = naipePrimeiraCartaHumano;
		this.naipeSegundaCartaRobo = naipeSegundaCartaRobo;
		this.naipeSegundaCartaHumano = naipeSegundaCartaHumano;
		this.naipeTerceiraCartaRobo = naipeTerceiraCartaRobo;
		this.naipeTerceiraCartaHumano = naipeTerceiraCartaHumano;
		this.SimilaridadeCaso = similaridadeCaso;

		this.cartaAltaRoboClustering = cartaAltaRoboClustering;
		this.cartaMediaRoboClustering = cartaMediaRoboClustering;
		this.cartaBaixaRoboClustering = cartaBaixaRoboClustering;
		this.clusterPrimeiraCartaAgenteMao = clusterPrimeiraCartaAgenteMao;
		this.clusterPrimeiraCartaAgentePe = clusterPrimeiraCartaAgentePe;
		this.clusterSegundaCartaAgenteGanhouAprimeira = clusterSegundaCartaAgenteGanhouAPrimeira;
		this.clusterSegundaCartaAgentePerdeuAprimeira = clusterSegundaCartaAgentePerdeuAPrimeira;
		this.primeiraCartaHumanoClustering = primeiraCartaHumanoClustering;
		this.segundaCartaHumanoClustering = segundaCartaHumanoClustering;
		this.terceiraCartaHumanoClustering = terceiraCartaHumanoClustering;
		this.primeiraCartaRoboClustering = primeiraCartaRoboClustering;
		this.segundaCartaRoboClustering = segundaCartaRoboClustering;
		this.terceiraCartaRoboClustering = terceiraCartaRoboClustering;
		this.clusterTerceiraCartaAgenteGanhouAsegunda = clusterTerceiraCartaAgenteGanhouAsegunda;
		this.clusterTerceiraCartaAgentePerdeuAsegunda = clusterTerceiraCartaAgentePerdeuAsegunda;
		this.clusterGanhadorUltimaRodada = clusterGanhadorUltimaRodada;
		this.clusterQuemTruco = clusterQuemTruco;
		this.clusterQuandoTruco = clusterQuandoTruco;
		this.clusterQuemEnvidoAgenteMao = clusterQuemEnvido;
		this.clusterQuemFlor = clusterQuandoFlor;
		this.ganhadorMao = ganhadorMao;
		this.clusterQuemEnvidoAgentePe = clusterQuemEnvidoAgentePe;
		this.saldoEnvido = saldoEnvido;
		this.saldoFlor = saldoFlor;
		this.saldoTruco = saldoTruco;
		
	}

	public TrucoDescription() {
		super();
	}

	public Integer getCartaAltaRoboClustering() {
		return cartaAltaRoboClustering;
	}

	public void setCartaAltaRoboClustering(Integer cartaAltaRoboClustering) {
		this.cartaAltaRoboClustering = cartaAltaRoboClustering;
	}

	public Integer getCartaMediaRoboClustering() {
		return cartaMediaRoboClustering;
	}

	public void setCartaMediaRoboClustering(Integer cartaMediaRoboClustering) {
		this.cartaMediaRoboClustering = cartaMediaRoboClustering;
	}

	public Integer getCartaBaixaRoboClustering() {
		return cartaBaixaRoboClustering;
	}

	public void setCartaBaixaRoboClustering(Integer cartaBaixaRoboClustering) {
		this.cartaBaixaRoboClustering = cartaBaixaRoboClustering;
	}

	public Integer getClusterPrimeiraCartaAgenteMao() {
		return clusterPrimeiraCartaAgenteMao;
	}

	public void setClusterPrimeiraCartaAgenteMao(Integer clusterPrimeiraCartaAgenteMao) {
		this.clusterPrimeiraCartaAgenteMao = clusterPrimeiraCartaAgenteMao;
	}

	public Integer getClusterPrimeiraCartaAgentePe() {
		return clusterPrimeiraCartaAgentePe;
	}

	public void setClusterPrimeiraCartaAgentePe(Integer clusterPrimeiraCartaAgentePe) {
		this.clusterPrimeiraCartaAgentePe = clusterPrimeiraCartaAgentePe;
	}

	
	public Integer getClusterSegundaCartaAgenteGanhouAprimeira() {
		return clusterSegundaCartaAgenteGanhouAprimeira;
	}

	public void setClusterSegundaCartaAgenteGanhouAprimeira(Integer clusterSegundaCartaAgenteGanhaPrimeira) {
		this.clusterSegundaCartaAgenteGanhouAprimeira = clusterSegundaCartaAgenteGanhaPrimeira;
	}

	public Integer getClusterSegundaCartaAgentePerdeuAprimeira() {
		return clusterSegundaCartaAgentePerdeuAprimeira;
	}

	public void setClusterSegundaCartaAgentePerdeuAprimeira(Integer clusterSegundaCartaAgentePerdePrimeira) {
		this.clusterSegundaCartaAgentePerdeuAprimeira = clusterSegundaCartaAgentePerdePrimeira;
	}

	
	
	public Integer getClusterSegundaCartaAgenteGanhouAPrimeira() {
		return clusterSegundaCartaAgenteGanhouAprimeira;
	}

	public void setClusterSegundaCartaAgenteGanhouAPrimeira(Integer clusterSegundaCartaAgenteGanhouAPrimeira) {
		this.clusterSegundaCartaAgenteGanhouAprimeira = clusterSegundaCartaAgenteGanhouAPrimeira;
	}

	public Integer getClusterSegundaCartaAgentePerdeuAPrimeira() {
		return clusterSegundaCartaAgentePerdeuAprimeira;
	}

	public void setClusterSegundaCartaAgentePerdeuAPrimeira(Integer clusterSegundaCartaAgentePerdeuAPrimeira) {
		this.clusterSegundaCartaAgentePerdeuAprimeira = clusterSegundaCartaAgentePerdeuAPrimeira;
	}

	public Integer getPrimeiraCartaHumanoClustering() {
		return primeiraCartaHumanoClustering;
	}

	public void setPrimeiraCartaHumanoClustering(Integer primeiraCartaHumanoClustering) {
		this.primeiraCartaHumanoClustering = primeiraCartaHumanoClustering;
	}

	public Integer getSegundaCartaHumanoClustering() {
		return segundaCartaHumanoClustering;
	}

	public void setSegundaCartaHumanoClustering(Integer segundaCartaHumanoClustering) {
		this.segundaCartaHumanoClustering = segundaCartaHumanoClustering;
	}

	public Integer getTerceiraCartaHumanoClustering() {
		return terceiraCartaHumanoClustering;
	}

	public void setTerceiraCartaHumanoClustering(Integer terceiraCartaHumanoClustering) {
		this.terceiraCartaHumanoClustering = terceiraCartaHumanoClustering;
	}

	public Integer getPrimeiraCartaRoboClustering() {
		return primeiraCartaRoboClustering;
	}

	public void setPrimeiraCartaRoboClustering(Integer primeiraCartaRoboClustering) {
		this.primeiraCartaRoboClustering = primeiraCartaRoboClustering;
	}

	public Integer getSegundaCartaRoboClustering() {
		return segundaCartaRoboClustering;
	}

	public void setSegundaCartaRoboClustering(Integer segundaCartaRoboClustering) {
		this.segundaCartaRoboClustering = segundaCartaRoboClustering;
	}

	public Integer getTerceiraCartaRoboClustering() {
		return terceiraCartaRoboClustering;
	}

	public void setTerceiraCartaRoboClustering(Integer terceiraCartaRoboClustering) {
		this.terceiraCartaRoboClustering = terceiraCartaRoboClustering;
	}

	public Integer getClusterTerceiraCartaAgenteGanhouAsegunda() {
		return clusterTerceiraCartaAgenteGanhouAsegunda;
	}

	public void setClusterTerceiraCartaAgenteGanhouAsegunda(Integer clusterTerceiraCartaAgenteGanhouAsegunda) {
		this.clusterTerceiraCartaAgenteGanhouAsegunda = clusterTerceiraCartaAgenteGanhouAsegunda;
	}

	public Integer getClusterTerceiraCartaAgentePerdeuAsegunda() {
		return clusterTerceiraCartaAgentePerdeuAsegunda;
	}

	public void setClusterTerceiraCartaAgentePerdeuAsegunda(Integer clusterTerceiraCartaAgentePerdeuAsegunda) {
		this.clusterTerceiraCartaAgentePerdeuAsegunda = clusterTerceiraCartaAgentePerdeuAsegunda;
	}

	public Integer getClusterGanhadorUltimaRodada() {
		return clusterGanhadorUltimaRodada;
	}

	public void setClusterGanhadorUltimaRodada(Integer clusterGanhadorUltimaRodada) {
		this.clusterGanhadorUltimaRodada = clusterGanhadorUltimaRodada;
	}

	public Integer getClusterQuemTruco() {
		return clusterQuemTruco;
	}

	public void setClusterQuemTruco(Integer clusterQuemTruco) {
		this.clusterQuemTruco = clusterQuemTruco;
	}

	public Integer getClusterQuandoTruco() {
		return clusterQuandoTruco;
	}

	public void setClusterQuandoTruco(Integer clusterQuandoTruco) {
		this.clusterQuandoTruco = clusterQuandoTruco;
	}

	public Integer getClusterQuemEnvido() {
		return clusterQuemEnvidoAgenteMao;
	}

	public void setClusterQuemEnvido(Integer clusterQuemEnvido) {
		this.clusterQuemEnvidoAgenteMao = clusterQuemEnvido;
	}

	public Integer getClusterQuemFlor() {
		return clusterQuemFlor;
	}

	public void setClusterQuemFlor(Integer clusterQuandoFlor) {
		this.clusterQuemFlor = clusterQuandoFlor;
	}

	@Override
	public String toString() {
		return "TrucoDescription [id=" + id + ", idMao=" + idMao + ", idPartida=" + idPartida + ", jogadorMao="
				+ jogadorMao + ", cartaAltaRobo=" + cartaAltaRobo + ", cartaMediaRobo=" + cartaMediaRobo
				+ ", cartaBaixaRobo=" + cartaBaixaRobo + ", cartaAltaHumano=" + cartaAltaHumano + ", cartaMediaHumano="
				+ cartaMediaHumano + ", cartaBaixaHumano=" + cartaBaixaHumano + ", primeiraCartaRobo="
				+ primeiraCartaRobo + ", primeiraCartaHumano=" + primeiraCartaHumano + ", segundaCartaRobo="
				+ segundaCartaRobo + ", segundaCartaHumano=" + segundaCartaHumano + ", terceiraCartaRobo="
				+ terceiraCartaRobo + ", terceiraCartaHumano=" + terceiraCartaHumano + ", ganhadorPrimeiraRodada="
				+ ganhadorPrimeiraRodada + ", ganhadorSegundaRodada=" + ganhadorSegundaRodada
				+ ", ganhadorTerceiraRodada=" + ganhadorTerceiraRodada + ", roboCartaVirada=" + roboCartaVirada
				+ ", humanoCartaVirada=" + humanoCartaVirada + ", quemPediuEnvido=" + quemPediuEnvido
				+ ", quemPediuFaltaEnvido=" + quemPediuFaltaEnvido + ", quemPediuRealEnvido=" + quemPediuRealEnvido
				+ ", pontosEnvidoRobo=" + pontosEnvidoRobo + ", pontosEnvidoHumano=" + pontosEnvidoHumano
				+ ", quemNegouEnvido=" + quemNegouEnvido + ", quemGanhouEnvido=" + quemGanhouEnvido + ", tentosEnvido="
				+ tentosEnvido + ", quemFlor=" + quemFlor + ", quemContraFlor=" + quemContraFlor
				+ ", quemContraFlorResto=" + quemContraFlorResto + ", quemNegouFlor=" + quemNegouFlor
				+ ", pontosFlorRobo=" + pontosFlorRobo + ", pontosFlorHumano=" + pontosFlorHumano + ", quemGanhouFlor="
				+ quemGanhouFlor + ", tentosFlor=" + tentosFlor + ", quemEscondeuPontosEnvido="
				+ quemEscondeuPontosEnvido + ", quemEscondeuPontosFlor=" + quemEscondeuPontosFlor + ", quemTruco="
				+ quemTruco + ", quandoTruco=" + quandoTruco + ", quemRetruco=" + quemRetruco + ", quandoRetruco="
				+ quandoRetruco + ", quemValeQuatro=" + quemValeQuatro + ", quandoValeQuatro=" + quandoValeQuatro
				+ ", quemNegouTruco=" + quemNegouTruco + ", quemGanhouTruco=" + quemGanhouTruco + ", tentosTruco="
				+ tentosTruco + ", tentosAnterioresRobo=" + tentosAnterioresRobo + ", tentosAnterioresHumano="
				+ tentosAnterioresHumano + ", tentosPosterioresRobo=" + tentosPosterioresRobo
				+ ", tentosPosterioresHumano=" + tentosPosterioresHumano + ", roboMentiuEnvido=" + roboMentiuEnvido
				+ ", humanoMentiuEnvido=" + humanoMentiuEnvido + ", roboMentiuFlor=" + roboMentiuFlor
				+ ", humanoMentiuFlor=" + humanoMentiuFlor + ", roboMentiuTruco=" + roboMentiuTruco
				+ ", humanoMentiuTruco=" + humanoMentiuTruco + ", quemBaralho=" + quemBaralho + ", quandoBaralho="
				+ quandoBaralho + ", quemContraFlorFalta=" + quemContraFlorFalta + ", quemEnvidoEnvido="
				+ quemEnvidoEnvido + ", quemFlorFlor=" + quemFlorFlor + ", quandoCartaVirada=" + quandoCartaVirada
				+ ", naipeCartaAltaRobo=" + naipeCartaAltaRobo + ", naipeCartaMediaRobo=" + naipeCartaMediaRobo
				+ ", naipeCartaBaixaRobo=" + naipeCartaBaixaRobo + ", naipeCartaAltaHumano=" + naipeCartaAltaHumano
				+ ", naipeCartaMediaHumano=" + naipeCartaMediaHumano + ", naipeCartaBaixaHumano="
				+ naipeCartaBaixaHumano + ", naipePrimeiraCartaRobo=" + naipePrimeiraCartaRobo
				+ ", naipePrimeiraCartaHumano=" + naipePrimeiraCartaHumano + ", naipeSegundaCartaRobo="
				+ naipeSegundaCartaRobo + ", naipeSegundaCartaHumano=" + naipeSegundaCartaHumano
				+ ", naipeTerceiraCartaRobo=" + naipeTerceiraCartaRobo + ", naipeTerceiraCartaHumano="
				+ naipeTerceiraCartaHumano + ", cartaAltaRoboClustering=" + cartaAltaRoboClustering
				+ ", cartaMediaRoboClustering=" + cartaMediaRoboClustering + ", cartaBaixaRoboClustering="
				+ cartaBaixaRoboClustering + ", clusterPrimeiraCartaAgenteMao=" + clusterPrimeiraCartaAgenteMao
				+ ", clusterPrimeiraCartaAgentePe=" + clusterPrimeiraCartaAgentePe
				+ ", clusterSegundaCartaAgenteGanhaPrimeira=" + clusterSegundaCartaAgenteGanhouAprimeira
				+ ", clusterSegundaCartaAgentePerdePrimeira=" + clusterSegundaCartaAgentePerdeuAprimeira
				+ ", SimilaridadeCaso=" + SimilaridadeCaso + ", getId()=" + getId() + ", getSimilaridadeCaso()="
				+ getSimilaridadeCaso() + ", getIdMao()=" + getIdMao() + ", getIdPartida()=" + getIdPartida()
				+ ", getJogadorMao()=" + getJogadorMao() + ", getCartaAltaRobo()=" + getCartaAltaRobo()
				+ ", getCartaMediaRobo()=" + getCartaMediaRobo() + ", getCartaBaixaRobo()=" + getCartaBaixaRobo()
				+ ", getCartaAltaHumano()=" + getCartaAltaHumano() + ", getCartaMediaHumano()=" + getCartaMediaHumano()
				+ ", getCartaBaixaHumano()=" + getCartaBaixaHumano() + ", getPrimeiraCartaRobo()="
				+ getPrimeiraCartaRobo() + ", getPrimeiraCartaHumano()=" + getPrimeiraCartaHumano()
				+ ", getSegundaCartaRobo()=" + getSegundaCartaRobo() + ", getSegundaCartaHumano()="
				+ getSegundaCartaHumano() + ", getTerceiraCartaRobo()=" + getTerceiraCartaRobo()
				+ ", getTerceiraCartaHumano()=" + getTerceiraCartaHumano() + ", getGanhadorPrimeiraRodada()="
				+ getGanhadorPrimeiraRodada() + ", getGanhadorSegundaRodada()=" + getGanhadorSegundaRodada()
				+ ", getGanhadorTerceiraRodada()=" + getGanhadorTerceiraRodada() + ", getRoboCartaVirada()="
				+ getRoboCartaVirada() + ", getHumanoCartaVirada()=" + getHumanoCartaVirada()
				+ ", getQuemPediuEnvido()=" + getQuemPediuEnvido() + ", getQuemPediuFaltaEnvido()="
				+ getQuemPediuFaltaEnvido() + ", getQuemPediuRealEnvido()=" + getQuemPediuRealEnvido()
				+ ", getPontosEnvidoRobo()=" + getPontosEnvidoRobo() + ", getPontosEnvidoHumano()="
				+ getPontosEnvidoHumano() + ", getQuemNegouEnvido()=" + getQuemNegouEnvido()
				+ ", getQuemGanhouEnvido()=" + getQuemGanhouEnvido() + ", getTentosEnvido()=" + getTentosEnvido()
				+ ", getQuemFlor()=" + getQuemFlor() + ", getQuemContraFlor()=" + getQuemContraFlor()
				+ ", getQuemContraFlorResto()=" + getQuemContraFlorResto() + ", getQuemNegouFlor()="
				+ getQuemNegouFlor() + ", getPontosFlorRobo()=" + getPontosFlorRobo() + ", getPontosFlorHumano()="
				+ getPontosFlorHumano() + ", getQuemGanhouFlor()=" + getQuemGanhouFlor() + ", getTentosFlor()="
				+ getTentosFlor() + ", getQuemEscondeuPontosEnvido()=" + getQuemEscondeuPontosEnvido()
				+ ", getQuemEscondeuPontosFlor()=" + getQuemEscondeuPontosFlor() + ", getQuemTruco()=" + getQuemTruco()
				+ ", getQuandoTruco()=" + getQuandoTruco() + ", getQuemRetruco()=" + getQuemRetruco()
				+ ", getQuandoRetruco()=" + getQuandoRetruco() + ", getQuemValeQuatro()=" + getQuemValeQuatro()
				+ ", getQuandoValeQuatro()=" + getQuandoValeQuatro() + ", getQuemNegouTruco()=" + getQuemNegouTruco()
				+ ", getQuemGanhouTruco()=" + getQuemGanhouTruco() + ", getTentosTruco()=" + getTentosTruco()
				+ ", getTentosAnterioresRobo()=" + getTentosAnterioresRobo() + ", getTentosAnterioresHumano()="
				+ getTentosAnterioresHumano() + ", getTentosPosterioresRobo()=" + getTentosPosterioresRobo()
				+ ", getTentosPosterioresHumano()=" + getTentosPosterioresHumano() + ", getRoboMentiuEnvido()="
				+ getRoboMentiuEnvido() + ", getHumanoMentiuEnvido()=" + getHumanoMentiuEnvido()
				+ ", getRoboMentiuFlor()=" + getRoboMentiuFlor() + ", getHumanoMentiuFlor()=" + getHumanoMentiuFlor()
				+ ", getRoboMentiuTruco()=" + getRoboMentiuTruco() + ", getHumanoMentiuTruco()="
				+ getHumanoMentiuTruco() + ", getQuemBaralho()=" + getQuemBaralho() + ", getQuandoBaralho()="
				+ getQuandoBaralho() + ", getQuemContraFlorFalta()=" + getQuemContraFlorFalta()
				+ ", getQuemEnvidoEnvido()=" + getQuemEnvidoEnvido() + ", getQuemFlorFlor()=" + getQuemFlorFlor()
				+ ", getQuandoCartaVirada()=" + getQuandoCartaVirada() + ", getNaipeCartaAltaRobo()="
				+ getNaipeCartaAltaRobo() + ", getNaipeCartaMediaRobo()=" + getNaipeCartaMediaRobo()
				+ ", getNaipeCartaBaixaRobo()=" + getNaipeCartaBaixaRobo() + ", getNaipeCartaAltaHumano()="
				+ getNaipeCartaAltaHumano() + ", getNaipeCartaMediaHumano()=" + getNaipeCartaMediaHumano()
				+ ", getNaipeCartaBaixaHumano()=" + getNaipeCartaBaixaHumano() + ", getNaipePrimeiraCartaRobo()="
				+ getNaipePrimeiraCartaRobo() + ", getNaipePrimeiraCartaHumano()=" + getNaipePrimeiraCartaHumano()
				+ ", getNaipeSegundaCartaRobo()=" + getNaipeSegundaCartaRobo() + ", getNaipeSegundaCartaHumano()="
				+ getNaipeSegundaCartaHumano() + ", getNaipeTerceiraCartaRobo()=" + getNaipeTerceiraCartaRobo()
				+ ", getNaipeTerceiraCartaHumano()=" + getNaipeTerceiraCartaHumano() + ", getIdAttribute()="
				+ getIdAttribute() + ", getCartaAltaRoboClustering()=" + getCartaAltaRoboClustering()
				+ ", getCartaMediaRoboClustering()=" + getCartaMediaRoboClustering()
				+ ", getCartaBaixaRoboClustering()=" + getCartaBaixaRoboClustering()
				+ ", getClusterPrimeiraCartaAgenteMao()=" + getClusterPrimeiraCartaAgenteMao()
				+ ", getClusterPrimeiraCartaAgentePe()=" + getClusterPrimeiraCartaAgentePe()
				+ ", getClusterSegundaCartaAgenteGanhaPrimeira()=" + getClusterSegundaCartaAgenteGanhouAprimeira()
				+ ", getClusterSegundaCartaAgentePerdePrimeira()=" + getClusterSegundaCartaAgentePerdeuAprimeira()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public Integer getClusterQuemEnvidoAgenteMao() {
		return clusterQuemEnvidoAgenteMao;
	}

	public void setClusterQuemEnvidoAgenteMao(Integer clusterQuemEnvidoAgenteMao) {
		this.clusterQuemEnvidoAgenteMao = clusterQuemEnvidoAgenteMao;
	}

	public Integer getClusterQuemEnvidoAgentePe() {
		return clusterQuemEnvidoAgentePe;
	}

	public void setClusterQuemEnvidoAgentePe(Integer clusterQuemEnvidoAgentePe) {
		this.clusterQuemEnvidoAgentePe = clusterQuemEnvidoAgentePe;
	}

	public Integer getSaldoTruco() {
		return saldoTruco;
	}

	public void setSaldoTruco(Integer saldoTruco) {
		this.saldoTruco = saldoTruco;
	}

	public Integer getSaldoEnvido() {
		return saldoEnvido;
	}

	public void setSaldoEnvido(Integer saldoEnvido) {
		this.saldoEnvido = saldoEnvido;
	}

	public Integer getSaldoFlor() {
		return saldoFlor;
	}

	public void setSaldoFlor(Integer saldoFlor) {
		this.saldoFlor = saldoFlor;
	}
	
	

	
}