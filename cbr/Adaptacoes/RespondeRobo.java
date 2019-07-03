package cbr.Adaptacoes;

import java.util.ArrayList;
import java.util.Collection;

import CbrQuerys.CBR;

import cbr.cbrDescriptions.TrucoDescription;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.cbrcore.Connector;
import jcolibri.exception.ExecutionException;
import jcolibri.method.retrieve.RetrievalResult;

public class RespondeRobo  {

	Connector _connectorMaos;
	CBRCaseBase _caseBaseMaos;
	CBR cbr = new CBR();

	public RespondeRobo() {

		try {

			_caseBaseMaos = cbr.initialize_caseBase();
			_connectorMaos =cbr. initialize_conectorMaos();
			_caseBaseMaos = cbr.openConnectionBase(_caseBaseMaos, _connectorMaos);
		} catch (ExecutionException e) {
			org.apache.commons.logging.LogFactory.getLog(CBR.class).error(e);
		}
	}

	
	public TrucoDescription CasoMaisSimilar(TrucoDescription gameState, int rodada) throws ExecutionException {
		TrucoDescription queryDesc = gameState;
		CBRQuery query = new CBRQuery();
		query.setDescription(queryDesc);
		Collection<RetrievalResult> bestMatch = cbr.executeQueryJogada(_caseBaseMaos, query);	
		return  (TrucoDescription) bestMatch.iterator().next().get_case().getDescription();
	}
	
	
	public int primeiraCarta(TrucoDescription gameState, int rodada) throws ExecutionException {

		TrucoDescription queryDesc = gameState;
		CBRQuery query = new CBRQuery();
		query.setDescription(queryDesc);
		
		Collection<RetrievalResult> bestMatch = cbr.executeQueryJogada(_caseBaseMaos, query);
		
		return primeiraCartaRobo(gameState, rodada, bestMatch);
	}

	private int primeiraCartaRobo(TrucoDescription gameState, int rodada, Collection<RetrievalResult> best) {
		int QuantAlta  = 0;
		int QuantMedia = 0;
		int QuantBaixa = 0;
		try {
			TrucoDescription Caso = (TrucoDescription) best.iterator().next().get_case().getDescription();
			int alta = Caso.getCartaAltaRobo();
			int media = Caso.getCartaMediaRobo();
			int baixa = Caso.getCartaBaixaRobo();
			int primeira = Caso.getPrimeiraCartaHumano();
			if (primeira == alta)
				QuantAlta++;
			else if (primeira == media)
				QuantMedia++;
			else if (primeira == baixa)
				QuantBaixa++;
			System.out.println((alta + "-----" + media + "-----" + baixa));
		} catch (Exception e) {
			System.out.println("erro no catch");
		}
		
		if (QuantAlta >= QuantBaixa && QuantAlta >= QuantMedia)
			return gameState.getCartaAltaRobo();
		if (QuantMedia >= QuantAlta && QuantMedia >= QuantBaixa)
			return gameState.getCartaMediaRobo();
		if (QuantBaixa >= QuantAlta && QuantBaixa >= QuantMedia)
			return gameState.getCartaBaixaRobo();
		
		// na duvida retorna a media
		return gameState.getCartaMediaRobo();
	}
	
	public boolean chamarTruco(TrucoDescription gameState, int rodada) throws ExecutionException {

		TrucoDescription queryDesc = gameState;
		CBRQuery query = new CBRQuery();
		query.setDescription(queryDesc);
		
		Collection<RetrievalResult> bestMatch = cbr.executeQueryJogada(_caseBaseMaos, query);
		
		return chamarTrucoRobo(gameState, rodada, bestMatch);
	}

	private boolean chamarTrucoRobo(TrucoDescription gameState, int rodada, Collection<RetrievalResult> best) {
		int QuantChamou = 0;
		int QuantNegou = 0;
		//int QuantAceitou = 0;
		try {
			TrucoDescription Caso = (TrucoDescription) best.iterator().next().get_case().getDescription();
			
			if(Caso.getQuemTruco() == 1) 
				QuantChamou++;
			
			if(Caso.getQuemNegouTruco() == 1) 
				QuantNegou++;
			
		} catch (Exception e) {
			System.out.println("erro no catch");
		}
//		System.out.println((QuantAlta + "-----" + QuantMedia + "-----" + QuantBaixa));
		return (QuantChamou > QuantNegou ? true:false);
	}
	
	public boolean chamarEnvido(TrucoDescription gameState, int rodada) throws ExecutionException {

		TrucoDescription queryDesc = gameState;
		CBRQuery query = new CBRQuery();
		query.setDescription(queryDesc);
		
		Collection<RetrievalResult> bestMatch = cbr.executeQueryJogada(_caseBaseMaos, query);
		
		return chamarEnvidoRobo(gameState, rodada, bestMatch);
	}

	private boolean chamarEnvidoRobo(TrucoDescription gameState, int rodada, Collection<RetrievalResult> best) {
		int QuantChamou = 0;
		int QuantNegou = 0;
		if(rodada != 0) {
			return false;
		}
		try {
			TrucoDescription Caso = (TrucoDescription) best.iterator().next().get_case().getDescription();
			
			if(Caso.getQuemPediuEnvido() == 1) 
				QuantChamou++;
			
			if(Caso.getQuemNegouEnvido() == 1) 
				QuantNegou++;
			
		} catch (Exception e) {
			System.out.println("erro no catch");
		}
//		System.out.println((QuantAlta + "-----" + QuantMedia + "-----" + QuantBaixa));
		return (QuantChamou > QuantNegou ? true:false);
	}


	public void fechaBase() {

		_caseBaseMaos.close();
	}
		
}




