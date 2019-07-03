/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import CbrQuerys.CBR;
import cbr.cbrDescriptions.TrucoDescription;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.cbrcore.Connector;
import jcolibri.exception.ExecutionException;
import jcolibri.method.retrieve.RetrievalResult;


public class Jogador {
    private final boolean BOT;
	public final int id;
    public int Pontuacao;
    public int Falta;
    public ArrayList <Carta> Mao;
    public ArrayList <Jogadas>JogadasDisponiveis;
    public int PontosEnvido;   
    public Jogadas UltimaEscolha;
    public ArrayList <Carta> CartasJogadas;
    // VARIAVEIS DO BOT    
    public Connector _connectorMaos;
	public CBRCaseBase _caseBaseMaos;
    public CBR cbr;
    public int CartaAlta;
    public int CartaMedia;
    public int CartaBaixa;
    
    public List <String> FrasesFlor = Arrays.asList(" Atirei uma pedra por cima da vacaria\n Deu no cravo, deu na rosa\n Deu na FLOR que eu queria",
    												" Sinto um vento lá de fora\n Canto FLOR e vou-me embora",
    												" Eu vinha de Santiago\n Juntinho com meu amor\n Parei na beira da estrada\n Pra colher um ramo de FLOR",
    												" Eu tinha uma vaquinha\n Que se arrastava de pança\n Dava 33 litros de leite\n e era uma FLOR de mansa",
    												" Pra pintar uma china Minha\n Não tem pinceis nem pintor\n Nem todo o meu jardim\n Se compara com minha FLOR",
    												" Dormi fora de casa\n Esqueci meu cobertor\n Bateu um vento na roseira\n Que me tapou todo de FLOR",
    												" Marrequinha da lagoa\n Bate a asa e não afunda\n Eu gosto de mulher gorda\n Que tenha graxa na bunda\n E seja FLOR de vagabunda",
    												" Flor" ); 
    
    
    public Jogador(int id) {
    	this.id = id;
        this.Pontuacao = 0;
        this.Falta = 24;
        this.Mao = new ArrayList <>();
        this.JogadasDisponiveis = new ArrayList <>();
        this.CartasJogadas = new ArrayList <Carta>();
        this.BOT = false;
    }
    
    public Jogador(int id, boolean __boot) {
        this.id = id;
        this.Pontuacao = 0;
        this.Falta = 24;
        this.Mao = new ArrayList <>();
        this.JogadasDisponiveis = new ArrayList <>();
        this.CartasJogadas = new ArrayList <Carta>();
        this.BOT = __boot;
        if (this.BOT == true) { this.InicializaBot(); }              
    }
    
    public void InicializaBot() {
    	this.cbr = new CBR();
    	try {
			_caseBaseMaos =  cbr.initialize_caseBase();
			_connectorMaos = cbr.initialize_conectorMaos();
			_caseBaseMaos =  cbr.openConnectionBase(_caseBaseMaos, _connectorMaos);
		} catch (jcolibri.exception.ExecutionException e) {			
			org.apache.commons.logging.LogFactory.getLog(CBR.class).error(e);
    	}
    	
    }
    
    public void ReceberCartas(Carta carta) throws IndexOutOfBoundsException  {
        this.Mao.add(carta);
        if( this.Mao.size() == 3) {
        	int ArrayForSort [] =  new int[3];
        	ArrayForSort[0] = this.Mao.get(0).GetCodificacao();
        	ArrayForSort[1] = this.Mao.get(1).GetCodificacao();
        	ArrayForSort[2] = this.Mao.get(2).GetCodificacao();
        	Arrays.sort(ArrayForSort);
        	this.CartaBaixa = ArrayForSort[0];
        	this.CartaMedia = ArrayForSort[1];
        	this.CartaAlta  = ArrayForSort[2];        	      
        	
        }
        
        if( this.Mao.size() > 3) {
            throw new IndexOutOfBoundsException("Mao do jogador maior que 3");
        }        
    }
    
    public void LimparMao (){
        this.Mao.clear();
    }
    
    public ArrayList <Carta> GetCartas () {
        return this.Mao;
    }
    
    public Carta JogarCarta(int i) {
       Carta c;
       c = this.Mao.get(i);
       this.Mao.remove(c);
       this.Mao.trimToSize();
       return c;
    }
    
    public Carta JogarCartaBOT(Carta c) {    	
    	this.Mao.remove(c);
    	this.Mao.trimToSize();
    	return c;
    }
    public void AdicionarPontuacao(int pontuacao) {
        Pontuacao += pontuacao;
        Falta -= pontuacao;
    }
     
    public ArrayList GetJogadasDisponiveis()
    {
    	return this.JogadasDisponiveis;
    }
    
    public int GetFalta() {
        return Falta;
    }
    
    public int GetPontuacao() {
        return Pontuacao;
    }
    
    public Jogadas UltimaEscolha()
    {
    	return UltimaEscolha;
    }
    
    public void PrintCantarPontos()
    {
    	System.out.println(this.PontosEnvido +" Pontos");
    }
    
    public void AceitarTruco()
    {
        this.JogadasDisponiveis.remove( this.JogadasDisponiveis.indexOf(Jogadas.TRUCO));
        this.JogadasDisponiveis.trimToSize();
        this.JogadasDisponiveis.add(Jogadas.RETRUCO);
    }
    
    public void AceitarRetruco ()
    {
        this.JogadasDisponiveis.remove( this.JogadasDisponiveis.indexOf(Jogadas.RETRUCO));
        this.JogadasDisponiveis.trimToSize();
        this.JogadasDisponiveis.add(Jogadas.VALE4);
    }
            
    public void AceitarEnvido()
    {    	
        this.JogadasDisponiveis.add(0, Jogadas.CANTAR);
        this.JogadasDisponiveis.add(1, Jogadas.E_BOM);
        //this.JogadasDisponiveis.add(Jogadas.REAL_ENVIDO);
        //this.JogadasDisponiveis.add(Jogadas.FALTA_ENVIDO);
    }
    
    public void AceitarRealEnvido(){
        this.JogadasDisponiveis.remove( this.JogadasDisponiveis.indexOf(Jogadas.REAL_ENVIDO));
        this.JogadasDisponiveis.trimToSize();
    }
    
    public void AceitarFaltaEnvido(){
        this.JogadasDisponiveis.remove( this.JogadasDisponiveis.indexOf(Jogadas.FALTA_ENVIDO));
        this.JogadasDisponiveis.trimToSize();
    }
    
    public void ChamarVale4() {
        TrocaJogadasDisponiveis (Jogadas.VALE4);
        System.out.println(" VALE 4 !");
    }
    
    public void ChamarRetruco() {
        TrocaJogadasDisponiveis (Jogadas.RETRUCO);
        System.out.println(" RETRUCO !");
    }
    
    public void ChamarTruco() {
        TrocaJogadasDisponiveis (Jogadas.TRUCO);
        System.out.println(" TRUCO !");
    }
    
    public void ChamarEnvido() {
        TrocaJogadasDisponiveis (Jogadas.ENVIDO); // Remove a jogada escolhida das possiveis
        TrocaJogadasDisponiveis (Jogadas.FLOR); // Remove a jogada escolhida das possiveis
    	System.out.println(" ENVIDO !");
    }
    
    public boolean VerificaFlor() {
        if(this.Mao.size() < 2) return false; // caso ja tenha jgoado, nao pode chamar
        if(this.Mao.get(0).GetNaipe() == this.Mao.get(1).GetNaipe() &&
           this.Mao.get(1).GetNaipe() == this.Mao.get(2).GetNaipe())        
        {        
        	System.out.println("*****");
        	System.out.println(this.FrasesFlor.get(new Random().nextInt(FrasesFlor.size())));
        	System.out.println("*****");
            return true;
        }
        else
        {                	
            return false;
        }
    }
    
    public void LimparJogadasDisponiveis()
    {
    	this.JogadasDisponiveis.clear();
    }
    
    public void AddJogada(Jogadas __Jogada) 
    {
    	this.JogadasDisponiveis.add(__Jogada);
    	this.JogadasDisponiveis.trimToSize();    	
    	
    }
    
    public void AddJogada (int index, Jogadas __Jogada) {
        this.JogadasDisponiveis.add(index, __Jogada);
        this.JogadasDisponiveis.trimToSize();    	
    }
    
    @SuppressWarnings("unchecked")
	public void AddJogadasIniciais() 
    {
    	this.JogadasDisponiveis.clear();
    	this.JogadasDisponiveis.add(Jogadas.JOGAR_CARTA);
    	this.JogadasDisponiveis.add(Jogadas.ENVIDO);
        this.JogadasDisponiveis.add(Jogadas.TRUCO);
        this.JogadasDisponiveis.add(Jogadas.FUGIR);
        this.JogadasDisponiveis.add(Jogadas.FLOR);
    }
    
    // Dada uma jogada feita no jogo, baseando-se nas jogadas disponiveis, muda as seguintes
    public void TrocaJogadasDisponiveis( Object JogadaEscolhida)
    {    	
    	this.JogadasDisponiveis.remove(JogadaEscolhida);
    	this.JogadasDisponiveis.trimToSize();
    }
    
    public void EscolherJogada(TrucoDescription Description, int RodadaToInt, Jogadas JogadaDaMesa)
    {   
    	if ( this.BOT == false) // HUMANO
    	{
    		Scanner input = new Scanner(System.in);
        	int valor = input.nextInt();
        	System.out.flush();    	
        	//input.close();     	
        	this.UltimaEscolha = ( Jogadas) this.JogadasDisponiveis.get( valor-1);
        	this.TrocaJogadasDisponiveis( this.JogadasDisponiveis.get( valor-1));	        	
    	}
    	else 
    	{ // BOT
    		try
    		{
    			System.out.println(" DEBUG: "+ Description.toString());
    			//TrucoDescription queryDesc = Description;
        		CBRQuery query = new CBRQuery();    		
        		query.setDescription( Description);
        		Collection <RetrievalResult > bestMatch = cbr.executeQueryJogada( _caseBaseMaos, query);
        		
    			TrucoDescription Case = ( TrucoDescription) bestMatch.iterator().next().get_case().getDescription();    
    			    			    			    			    			
    			// Verifica a jogada que o BOT realizara
    			
    			
    			// Caso truco tenha sido chamado
    			if ( JogadaDaMesa == Jogadas.TRUCO)
    			{
    				// Aceitar Truco
        			if ( Case.getQuandoTruco() == RodadaToInt && Description.getQuemTruco() != this.GetId() && this.JogadasDisponiveis.contains(Jogadas.ACEITAR))
        			{
        				this.UltimaEscolha = Jogadas.ACEITAR;
        				this.TrocaJogadasDisponiveis(Jogadas.ACEITAR);    				
        			}
        			// CHAMAR RETRUCO
        			else if ( Case.getQuandoRetruco() == RodadaToInt && this.JogadasDisponiveis.contains(Jogadas.RETRUCO))
        			{
        				this.UltimaEscolha = Jogadas.RETRUCO;
        				this.TrocaJogadasDisponiveis(Jogadas.RETRUCO);
        				Description.setQuemRetruco( this.GetId());
        			}
        			else // Recusar Truco
        			{
        				this.UltimaEscolha = Jogadas.RECUSAR;
        				this.TrocaJogadasDisponiveis(Jogadas.RECUSAR);        				
        			}
        			
    			}
    			// CAso retruco tenha sido cahamado
    			else if ( JogadaDaMesa == Jogadas.RETRUCO)
    			{
    				// Aceitar REtruco
    				if ( Case.getQuandoRetruco() == RodadaToInt && Description.getQuemRetruco() != this.GetId() && this.JogadasDisponiveis.contains(Jogadas.ACEITAR))
    				{
    					this.UltimaEscolha = Jogadas.ACEITAR;
        				this.TrocaJogadasDisponiveis(Jogadas.ACEITAR);
    				}
    				// CHAMAR VALE 4
        			else if ( Case.getQuandoValeQuatro() == RodadaToInt && this.JogadasDisponiveis.contains(Jogadas.VALE4))
        			{
        				this.UltimaEscolha = Jogadas.VALE4;
        				this.TrocaJogadasDisponiveis(Jogadas.VALE4);
        				Description.setQuemValeQuatro(this.GetId());
        			}
        			else // REcusar Retruco 
        			{
        				this.UltimaEscolha = Jogadas.RECUSAR;
        				this.TrocaJogadasDisponiveis(Jogadas.RECUSAR);
        			}
    			}
    			else if ( JogadaDaMesa == Jogadas.VALE4)
    			{
    				// Aceitar Vale 4
    				if ( Case.getQuandoValeQuatro() == RodadaToInt && Description.getQuemValeQuatro() != this.GetId() && this.JogadasDisponiveis.contains(Jogadas.ACEITAR))
    				{
    					this.UltimaEscolha = Jogadas.ACEITAR;
        				this.TrocaJogadasDisponiveis(Jogadas.ACEITAR);
    				}
    				else // REcusa o VAle 4 
    				{
    					this.UltimaEscolha = Jogadas.RECUSAR;
        				this.TrocaJogadasDisponiveis(Jogadas.RECUSAR);        			
    				}
    			}
    			
    			else if ( JogadaDaMesa == Jogadas.ENVIDO)
    			{
    				if ( this.JogadasDisponiveis.contains( Jogadas.ACEITAR) || this.JogadasDisponiveis.contains( Jogadas.RECUSAR)) 
        			{    					
    					// Aceita Envido
        				if ( Description.getQuemPediuEnvido() != this.GetId() && Case.getQuemGanhouEnvido() != null )
        				{
        					// Verifica se no caso esse jogador foi o ganhador
        					if (  Case.getQuemGanhouEnvido() == this.GetId()) 
        					{
        						this.UltimaEscolha = Jogadas.ACEITAR;
        						this.TrocaJogadasDisponiveis( Jogadas.ACEITAR);
        					}
        					else // Caso considera mais nao vai ganhar recusa
        					{ 
        						this.UltimaEscolha = Jogadas.RECUSAR;
                				this.TrocaJogadasDisponiveis( Jogadas.RECUSAR);
        					}
        				}
        				else// Recusa Envido
        				{        					
        					this.UltimaEscolha = Jogadas.RECUSAR;
            				this.TrocaJogadasDisponiveis( Jogadas.RECUSAR);
        				}
        			}
    				
    			}
    			    			
    			// FUGIR
    			if ( Case.getQuandoBaralho() != null && Case.getQuandoBaralho() == RodadaToInt)
    			{
    				this.UltimaEscolha = Jogadas.FUGIR;
        			this.TrocaJogadasDisponiveis(Jogadas.FUGIR);
        			Description.setQuemBaralho( this.GetId());        			
    			} 
    			// Chamar FLor
    			else if ( this.JogadasDisponiveis.contains(Jogadas.FLOR) && Case.getQuemFlor () != null && this.VerificaFlor() == true )
    			{
    				this.UltimaEscolha = Jogadas.FLOR;
    				this.TrocaJogadasDisponiveis( Jogadas.FLOR);    			
    			}
    				    		
    			// Chamar envido
    			else if ( this.JogadasDisponiveis.contains( Jogadas.ENVIDO) && Case.getQuemPediuEnvido() == this.GetId() )
    			{
    				this.UltimaEscolha = Jogadas.ENVIDO;
    				this.TrocaJogadasDisponiveis( Jogadas.ENVIDO);
    				Description.setQuemPediuEnvido( this.GetId());
    			}    			
    			
 
    			// Cantar os pontos    			
    			else if ( this.JogadasDisponiveis.contains( Jogadas.CANTAR)  )
    			{
    				if ( Case.getQuemEscondeuPontosEnvido() == null || Case.getQuemEscondeuPontosEnvido() != this.GetId())
    				{
    					this.UltimaEscolha = Jogadas.CANTAR;
        				this.TrocaJogadasDisponiveis( Jogadas.CANTAR);
    				}
    				    				    			
    			}
    			// Nao cantar os pontos do envido
    			else if ( this.JogadasDisponiveis.contains( Jogadas.E_BOM) && Case.getQuemEscondeuPontosEnvido() != null && Case.getQuemEscondeuPontosEnvido() == this.GetId() )
    			{
    				this.UltimaEscolha = Jogadas.E_BOM;
    				this.TrocaJogadasDisponiveis( Jogadas.E_BOM);
    				Description.setQuemEscondeuPontosEnvido( this.GetId());
    			}
    			// CHAMAR TRUCO
    			else if ( Case.getQuandoTruco() == RodadaToInt && this.JogadasDisponiveis.contains(Jogadas.TRUCO) && JogadaDaMesa != Jogadas.ENVIDO)
    			{	
    				this.UltimaEscolha = Jogadas.TRUCO;
    				this.TrocaJogadasDisponiveis(Jogadas.FUGIR);
    				Description.setQuemTruco(this.GetId());
    			}
    			
    			// Só joga carta    			    			    			    			    			    		
    			else if (this.JogadasDisponiveis.contains(Jogadas.JOGAR_CARTA))
    			{    				
    				this.UltimaEscolha = Jogadas.JOGAR_CARTA;
            		this.TrocaJogadasDisponiveis(Jogadas.JOGAR_CARTA);
    			}
    			else 
    			{
    				System.out.println("Nao escolheu nada");
    				System.out.println(" Debug Description:" + Description.toString());
    			}
    			System.out.println( " BOT ESCOLHEU: " + this.UltimaEscolha);
    			
    		}
    		catch ( Exception e) 
    		{
    			// e.printStackTrace();
    			//System.out.println("\n\n\n ERRRRROUUUUU \n\n\n");
    			this.UltimaEscolha = Jogadas.JOGAR_CARTA;
        		this.TrocaJogadasDisponiveis(Jogadas.JOGAR_CARTA);
    		} 
    	
    	}
    		
    }
    
    public Carta EscolherCarta(TrucoDescription Description, Rodada Rodada) 
    {
    	Carta __CartaJogada;
    	if ( this.BOT == false) // HUMANO
    	{			
			System.out.println(this.PrintCartas());
		    Scanner input = new Scanner(System.in);
		    
			int valor = input.nextInt();
			//input.close();
		    System.out.flush();
		    valor = valor - 1; // Atualiza o Index
		    __CartaJogada = this.JogarCarta (valor);
			System.out.println (__CartaJogada.GetValor());
			
			this.CartasJogadas.add(__CartaJogada);
			return __CartaJogada;
			
    	} 
    	else // BOT
    	{
    		int CartaParaJogar;     		    		
    		CBRQuery query = new CBRQuery();    		
    		query.setDescription(Description);
    			
    		try{    			
    			Collection<RetrievalResult> bestMatch = cbr.executeQueryJogada(_caseBaseMaos, query);    			
    			TrucoDescription Case = (TrucoDescription) bestMatch.iterator().next().get_case().getDescription();
    			    		
    			if ( Rodada == Rodada.INICIAL) // Caso seja no inicio
    			{
    				CartaParaJogar = Case.getPrimeiraCartaRobo();
    				__CartaJogada = this.ReturnCartaPelaSimilaridade(Case, CartaParaJogar);
    			}
    			else if( Rodada == Rodada.MEIO) 
    			{
    				CartaParaJogar = Case.getSegundaCartaRobo();
    				__CartaJogada = this.ReturnCartaPelaSimilaridade(Case, CartaParaJogar);
    			}
    			else //(Rodada == Rodada.FINAL)
    			{
    				CartaParaJogar = Case.getTerceiraCartaRobo();
    				__CartaJogada = this.ReturnCartaPelaSimilaridade(Case, CartaParaJogar);    				
    			}
    		
    			this.CartasJogadas.add( __CartaJogada);
    			return this.JogarCartaBOT(__CartaJogada);
    			
    		}
    		catch (ExecutionException e)
    		{
    			System.out.println("Erro escolhendo a carta");
    			System.out.println(e);    			
    		}  
    		System.out.println("\n\n\n O QUE");
    		__CartaJogada = this.ReturnCartaPelaCodificacao(-1);
    		return this.JogarCartaBOT(__CartaJogada);
    		
    	}// FIM BOT
    }
        
    public Carta ReturnCartaPelaSimilaridade ( TrucoDescription Case, int IdCarta)
    {
    	if ( Case.getCartaAltaRobo()  == IdCarta) { return this.ReturnCartaPelaCodificacao ( this.CartaAlta  ) ;}
    	if ( Case.getCartaMediaRobo() == IdCarta) { return this.ReturnCartaPelaCodificacao ( this.CartaMedia ) ;}
    	if ( Case.getCartaBaixaRobo() == IdCarta) { return this.ReturnCartaPelaCodificacao ( this.CartaBaixa ) ;}
    	System.out.println("\n\n\n Realmente não era pra isso acontecer");
    	return this.ReturnCartaPelaCodificacao(-1);
    }
    
    public Carta ReturnCartaPelaCodificacao(int valor) {
    	try {
			if ( this.Mao.get(0).GetCodificacao() == valor) {return this.Mao.get(0); }
			if ( this.Mao.get(1).GetCodificacao() == valor) {return this.Mao.get(1); }
			if ( this.Mao.get(2).GetCodificacao() == valor) {return this.Mao.get(2); }
    	}catch(Exception e){
    		return this.Mao.get(0);
    	}
    	System.out.println( "\n\n Retornando qqr carta");
    	return this.Mao.get(1);
    }
    
    
    // Calcula o valor do envido 
    public void CalculaEnvido ()
    {
    	if (this.Mao.get(0).GetNaipe() == this.Mao.get(1).GetNaipe())
    	{   // Primeira carta igual a segunda
    		this.PontosEnvido = 20 + this.Mao.get(0).GetValorInvido() + this.Mao.get(1).GetValorInvido();   		
    	}
    	else if (this.Mao.get(0).GetNaipe() == this.Mao.get(2).GetNaipe()) 
    	{   // Primeira carta igual a terceira
    		this.PontosEnvido = 20 + this.Mao.get(0).GetValorInvido() + this.Mao.get(2).GetValorInvido();
    	} 
    	else if (this.Mao.get(1).GetNaipe() == this.Mao.get(2).GetNaipe())
    	{   // Segunda carta igual a terceira
    		this.PontosEnvido = 20 + this.Mao.get(1).GetValorInvido() + this.Mao.get(2).GetValorInvido();
    	}
    	else if (this.Mao.get(0).GetNaipe() == this.Mao.get(1).GetNaipe() &&
    	         this.Mao.get(1).GetNaipe() == this.Mao.get(2).GetNaipe() )
    	{   // Todas as cartas iguais
    		this.PontosEnvido = 20 + this.Mao.get(0).GetValorInvido() + this.Mao.get(1).GetValorInvido() + this.Mao.get(2).GetValorInvido();
    	}
    	else
    	{
    		// Todas as cartas DIFERENTES    		
    		this.PontosEnvido = 0;
    		if (this.PontosEnvido < this.Mao.get(0).GetValorInvido()) {this.PontosEnvido = this.Mao.get(0).GetValorInvido();}
    		if (this.PontosEnvido < this.Mao.get(1).GetValorInvido()) {this.PontosEnvido = this.Mao.get(1).GetValorInvido();}
    		if (this.PontosEnvido < this.Mao.get(2).GetValorInvido()) {this.PontosEnvido = this.Mao.get(2).GetValorInvido();}
    	}
    	//System.out.println(this.PontosEnvido);
    }
    
    public int GetId()
    {
    	return this.id;
    }
    
    public boolean IsBot()
    {
    	return this.BOT;
    }
    
    public void ResetaCartasJogadas(){
        this.CartasJogadas.clear();
    }
    
    public int GetCartaAlta() {
    	return this.CartaAlta;
    }
    
    public int GetCartaMedia() {
    	return this.CartaMedia;
    }
    
    public int GetCartaBaixa() {
    	return this.CartaBaixa;
    }
    
    @Override
    public String toString() {
        return "Jogador " + Integer.toString(id) + " ";
    } 
    
    public String PrintCartas() {
    	String print = "";
    	for (Carta carta: this.Mao) {
    		print = print + carta.GetValor() + "| ";
    	}    	
    	return print;  	   
    }
    
    public String PrintJogadas() {
    	return JogadasDisponiveis.toString();
    }
}
