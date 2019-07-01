/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
import cbr.cbrDescriptions.TrucoDescription;


public class Mesa {
    
    public Jogador Jogador1;
    public Jogador JogadorBOT;
    public Jogador JogadorAtual;
    public TrucoDescription Description;
    public Jogador Empate;
    public Jogador MaoDaRodada;
	public Jogador PeDaRodada;
	public Jogador JogadorGanhador;
    public int Placar[];  
    public Baralho baralho = new Baralho();
    boolean FimDaEtapa = false;
    public Rodada RodadaAtual  =  Rodada.DANDO_CARTAS;
    public int intRodada = 0;
    public int ValorNoPote = 1;
    public ArrayList<Carta> CartasJogadas;
    public Jogadas JogadaDaMesa;
    public ArrayList <Carta> DisplayCartas;
    
    public Mesa() {
        
        this.baralho.Embaralhar();
        this.Jogador1 = new Jogador(1, false);
        //this.JogadorBOT = new Jogador(2, false);// Segundo JOgador é humano
        this.JogadorBOT = new Jogador(2, true);// Segundo JOgador é bot
        this.Empate = new Jogador(0);
        this.JogadorAtual = this.JogadorBOT;
        this.Placar =  new int[2];
        this.CartasJogadas = new ArrayList<Carta>();
        this.MaoDaRodada = this.Jogador1;
        this.PeDaRodada  = this.JogadorBOT;
        this.JogadorGanhador = this.Empate;                   
        this.DisplayCartas = new ArrayList<Carta>();
        this.DisplayCartas.add( new Carta ("        "));
        this.DisplayCartas.add( new Carta ("        "));
        this.DisplayCartas.add( new Carta ("        "));
        this.DisplayCartas.add( new Carta ("        "));
        this.DisplayCartas.add( new Carta ("        "));
        this.DisplayCartas.add( new Carta ("        "));
    }
    public void ResetaBaralho ()
    {
    	this.baralho = new Baralho();
    	this.baralho.Embaralhar();
    }
    
    public void ClearCartasDisplay() 
    {
    	this.DisplayCartas.set(0, new Carta ("        "));
        this.DisplayCartas.set(1, new Carta ("        "));
        this.DisplayCartas.set(2, new Carta ("        "));
        this.DisplayCartas.set(3, new Carta ("        "));
        this.DisplayCartas.set(4, new Carta ("        "));
        this.DisplayCartas.set(5, new Carta ("        "));
    }
    
    public void TrocaJogador(){
        if (JogadorAtual == Jogador1)
        {
            this.JogadorAtual = this.JogadorBOT;
        }
        else
        {
            this.JogadorAtual = this.Jogador1;
        }
    }
    
    public Jogador getJogadorAtual(){
        return JogadorAtual;
    }
    
    public void setPlacar(){
        this.Placar[0] = Jogador1.GetPontuacao();
        this.Placar[1] = JogadorBOT.GetPontuacao();
    }

    public String PlacarToString (){
    	setPlacar();
        return Integer.toString(Placar[0]) + " : " +  Integer.toString(Placar[1]);
    }
    
    public void JogarJogada(Object JogadaEscolhida, Jogador MaoDaRodada)
    {    	
    	if (JogadaEscolhida == Jogadas.ENVIDO) // Chamou envido ====================================================
    	{
    		this.JogadaDaMesa = Jogadas.ENVIDO;
            this.JogadorAtual.ChamarEnvido(); // remove o Truco das jogadas disponiveis
            
            this.Description.setQuemPediuEnvido( this.JogadorAtual.GetId());
            
            this.TrocaJogador();
            this.JogadorAtual.TrocaJogadasDisponiveis(Jogadas.ENVIDO); // Remove a possibilidade de chamar envido de quem ira aceitar ou nao     
            this.JogadorAtual.TrocaJogadasDisponiveis(Jogadas.JOGAR_CARTA); // Remove a possibilidade de chamar truco de quem ira aceitar ou nao
            this.JogadorAtual.TrocaJogadasDisponiveis( Jogadas.TRUCO);
            this.JogadorAtual.AddJogada(0, Jogadas.ACEITAR);
            this.JogadorAtual.AddJogada(1, Jogadas.RECUSAR);    		                                    
    		    		
    	} // FIM ENVIDO
    	
    	else if ( JogadaEscolhida == Jogadas.ACEITAR && JogadaDaMesa == Jogadas.ENVIDO)//===========================
    	{
    		this.JogadorAtual.TrocaJogadasDisponiveis(Jogadas.ACEITAR);
    		this.JogadorAtual.TrocaJogadasDisponiveis(Jogadas.RECUSAR);
    		this.JogadorAtual.AceitarEnvido();
    		this.TrocaJogador();
    		this.JogadorAtual.PrintCantarPontos();
    		
    		this.Description.setPontosEnvidoHumano( this.JogadorAtual.PontosEnvido);
    		
    		this.TrocaJogador();
    	}// Fim ACEITE ENVIDO
    	
    	else if ( JogadaEscolhida == Jogadas.CANTAR)//==============================================================
    	{
    		int Pontos1 = this.JogadorAtual.PontosEnvido;
    		int Pontos2 = 0;
    		this.JogadorAtual.TrocaJogadasDisponiveis(Jogadas.CANTAR);
    		this.JogadorAtual.TrocaJogadasDisponiveis(Jogadas.E_BOM);
    		this.JogadorAtual.AddJogada(0, Jogadas.JOGAR_CARTA);
    		this.TrocaJogador();
    		Pontos2 = this.JogadorAtual.PontosEnvido;
    		if ( Pontos1 > Pontos2 || ( Pontos1 == Pontos2 && this.JogadorAtual == PeDaRodada )) 
    		{// CAso quem aceitou tenha mais ou e o MAO da rodada
    			this.TrocaJogador();
    			this.JogadorAtual.PrintCantarPontos();
    			this.JogadorAtual.Pontuacao += 1;
    		}else { 
    			this.JogadorAtual.PrintCantarPontos();
    			this.JogadorAtual.Pontuacao += 1;
    		}
    		this.TrocaJogador();
    	} // Fim CANTAR
    	
    	else if ( JogadaEscolhida == Jogadas.E_BOM)//===============================================================
    	{
    		this.JogadorAtual.TrocaJogadasDisponiveis(Jogadas.CANTAR);
    		this.JogadorAtual.TrocaJogadasDisponiveis(Jogadas.E_BOM);
    		this.TrocaJogador();
    		this.JogadorAtual.Pontuacao += 1;
    	}// Fim EH BOM
    	
    	else if ( JogadaEscolhida == Jogadas.RECUSAR && JogadaDaMesa == Jogadas.ENVIDO)//===========================
    	{
    		this.JogadorAtual.TrocaJogadasDisponiveis(Jogadas.ACEITAR);
    		this.JogadorAtual.TrocaJogadasDisponiveis(Jogadas.RECUSAR);
    		this.JogadorAtual.AddJogada(0, Jogadas.JOGAR_CARTA);
    		this.Description.setQuemNegouEnvido( this.JogadorAtual.GetId());
    		TrocaJogador();
    		this.JogadorAtual.Pontuacao +=1;
    	} // FIm RECUSA ENVIDO
    	
    	else if ( JogadaEscolhida == Jogadas.JOGAR_CARTA)//========================================================= 
    	{    		
    	    this.CartasJogadas.add(JogadorAtual.EscolherCarta(Description, RodadaAtual));
    	    if ( this.JogadorAtual == this.MaoDaRodada)
    	    {
    	    	this.DisplayCartas.set( this.intRodada, this.CartasJogadas.get(this.CartasJogadas.size() - 1));
    	    }
    	    else if (this.JogadorAtual == this.PeDaRodada)
    	    {
    	    	this.DisplayCartas.set( this.intRodada + 1, this.CartasJogadas.get(this.CartasJogadas.size() - 1));
    	    }
    	    
    	    AdicionaCartaAoDescription();
    	    
    		this.JogadorAtual.TrocaJogadasDisponiveis(Jogadas.JOGAR_CARTA); // Remove a possibilidade de jogar antes de decidir
    		//this.JogadaDaMesa = Jogadas.JOGAR_CARTA;
    		this.TrocaJogador(); // Jogar uma carta troca o jogador    		    	
    	} // Fim Jogar Carta
    	
        else if ( JogadaEscolhida == Jogadas.FLOR)//================================================================
        {
          if (JogadorAtual.VerificaFlor()) JogadorAtual.Pontuacao += 3;          
        } // Fim Flor
    	
        else if ( JogadaEscolhida == Jogadas.FUGIR)//===============================================================
        {
            this.TrocaJogador();
            //this.JogadorAtual.Pontuacao += 1;
            FimDaEtapa = true; // Acaba a estapa
            RodadaAtual = Rodada.FIM;
            this.JogadorGanhador = JogadorAtual;
            this.TrocaJogador();
            if( this.JogadaDaMesa == Jogadas.TRUCO || this.JogadaDaMesa == Jogadas.RETRUCO || this.JogadaDaMesa == Jogadas.VALE4)
            {
            	this.ValorNoPote -=1;
            }
            
        } // Fim Fugir
    	    
        else if ( JogadaEscolhida == Jogadas.TRUCO)
        {
            this.JogadaDaMesa = Jogadas.TRUCO;
            this.JogadorAtual.ChamarTruco(); // remove o Truco das jogadas disponiveis           
            this.TrocaJogador();
            this.JogadorAtual.TrocaJogadasDisponiveis(Jogadas.TRUCO); // Remove a possibilidade de chamar truco de quem aceitou                    
            this.JogadorAtual.TrocaJogadasDisponiveis(Jogadas.JOGAR_CARTA); // Remove a possibilidade de jogar antes de decidir                    
            this.JogadorAtual.AddJogada(0, Jogadas.ACEITAR);
            this.JogadorAtual.AddJogada(1, Jogadas.RECUSAR);    		            
            this.JogadorAtual.AddJogada(2, Jogadas.RETRUCO);
            
            this.Description.setQuemTruco(JogadorAtual.GetId());
            
            ValorNoPote += 1;
            
        }// Fim Truco
        else if ( JogadaEscolhida == Jogadas.RETRUCO)
        {
            this.JogadorAtual.ChamarRetruco(); // remove o reTruco das jogadas disponiveis           
            this.TrocaJogador();
            
            this.JogadorAtual.TrocaJogadasDisponiveis(Jogadas.JOGAR_CARTA); // Remove Jogar carta
            
            if ( JogadaDaMesa == Jogadas.TRUCO) // Chamou em cima de truco
            {
                this.JogadorAtual.AddJogada(0, Jogadas.ACEITAR);
                this.JogadorAtual.AddJogada(1, Jogadas.RECUSAR);
                this.TrocaJogador();
            }
            
            this.JogadorAtual.AddJogada(0, Jogadas.ACEITAR);
            this.JogadorAtual.AddJogada(1, Jogadas.RECUSAR);
            this.JogadorAtual.AddJogada(2, Jogadas.VALE4);
            this.JogadaDaMesa = Jogadas.RETRUCO;            
            ValorNoPote += 1;
            
        }// Fim Retruco
    	
        else if ( JogadaEscolhida == Jogadas.VALE4)
        {
            this.JogadorAtual.ChamarVale4(); // remove o Vale4 das jogadas disponiveis           
            this.TrocaJogador();            
            this.JogadorAtual.TrocaJogadasDisponiveis(Jogadas.JOGAR_CARTA);
            
            // Se NAO contem jogada Aceitar disponivel, Adiciona
            if ( this.JogadorAtual.JogadasDisponiveis.contains(Jogadas.ACEITAR) == false) { this.JogadorAtual.AddJogada(0, Jogadas.ACEITAR); }
            //Se NAO contem jogada Recusar disponivel, Adiciona
            if ( this.JogadorAtual.JogadasDisponiveis.contains(Jogadas.ACEITAR) == false) { this.JogadorAtual.AddJogada(0, Jogadas.ACEITAR); }
            
            this.JogadaDaMesa = Jogadas.VALE4;
            ValorNoPote += 1;
            
        }// Fim VALE4
        
        else if ( JogadaEscolhida == Jogadas.ACEITAR && JogadaDaMesa == Jogadas.TRUCO   ||
                  JogadaEscolhida == Jogadas.ACEITAR && JogadaDaMesa == Jogadas.RETRUCO ||
                  JogadaEscolhida == Jogadas.ACEITAR && JogadaDaMesa == Jogadas.VALE4 ) // Aceitou o truco
        {
            this.JogadorAtual.TrocaJogadasDisponiveis(Jogadas.ACEITAR); // Remove essa jogada
            this.JogadorAtual.TrocaJogadasDisponiveis(Jogadas.RECUSAR); // Remove essa jogada
            this.JogadorAtual.AddJogada(0, Jogadas.JOGAR_CARTA); // Adiciona essa jogada
            
            this.JogadaDaMesa = Jogadas.ACEITAR;
            
            this.TrocaJogador();
            //ValorNoPote += 1;
            
        }// Fim ACEITE TRUCO RETRUCO E VALE4
        
        else if ( JogadaEscolhida == Jogadas.RECUSAR && JogadaDaMesa == Jogadas.TRUCO   || // Recusou Truco
                  JogadaEscolhida == Jogadas.RECUSAR && JogadaDaMesa == Jogadas.RETRUCO || // Recusou Returco
                  JogadaEscolhida == Jogadas.RECUSAR && JogadaDaMesa == Jogadas.VALE4    ) // Recusou vale4
        {
                        
        	ValorNoPote -= 1;
            FimDaEtapa = true; // Acaba a estapa
            RodadaAtual = Rodada.FIM;
            
        }// Fim RECUSATRUCO RETRUCO E VALE4
    }
    
    public void AdicionaCartaAoDescription ()
    {
    	if ( JogadorAtual.IsBot() == false)
    	{
    		if ( this.RodadaAtual == Rodada.INICIAL) 
    		{ 
    			this.Description.setPrimeiraCartaHumano( this.Jogador1.CartasJogadas.get(0).GetCodificacao());
    			//this.Description.setNaipePrimeiraCartaHumano();
    		}
    		if ( this.RodadaAtual == Rodada.MEIO)    
    		{ 
    			this.Description.setSegundaCartaHumano ( this.Jogador1.CartasJogadas.get(1).GetCodificacao());
    			
    		}
    		if ( this.RodadaAtual == Rodada.FIM)     
    		{ 
    			this.Description.setTerceiraCartaHumano( this.Jogador1.CartasJogadas.get(2).GetCodificacao());
    		}
    	}
    }
    
    public Jogador CalculaGanhadorDaEtapa(Rodada _Atual)
    {
    	Carta PrimeiraCarta;
    	Carta SegundaCarta;
    	int index = 0;
        
    	if (_Atual == Rodada.INICIAL) { index = 0; } 
    	if (_Atual == Rodada.MEIO)    { index = 1; } 
    	if (_Atual == Rodada.FINAL)   { index = 2; }
    	        
    	PrimeiraCarta = this.JogadorAtual.CartasJogadas.get(index);
        this.TrocaJogador();
        SegundaCarta = this.JogadorAtual.CartasJogadas.get(index);
        
        if (PrimeiraCarta.GetCodificacao() > SegundaCarta.GetCodificacao()) {
                this.TrocaJogador();
                return this.JogadorAtual;
        }
        else if(PrimeiraCarta.GetCodificacao() < SegundaCarta.GetCodificacao()) {
                return this.JogadorAtual;

        }else {			
                return Empate;
        }
    }
    // Remove invido e flor de serem chamadas na Segunda Rodada
    public void AtualizaJogadasMeio() {   
        JogadorAtual.JogadasDisponiveis.remove(Jogadas.ENVIDO); // Caso envido nao tenha sido chamado na primeira rodada remove
        JogadorAtual.JogadasDisponiveis.remove(Jogadas.FLOR); // Caso flor nao tenha sido chamado na primeira rodada remove
        if (JogadorAtual.JogadasDisponiveis.contains(Jogadas.JOGAR_CARTA) == false) { JogadorAtual.JogadasDisponiveis.add(0, Jogadas.JOGAR_CARTA); };
        
        this.TrocaJogador();
        JogadorAtual.JogadasDisponiveis.remove(Jogadas.ENVIDO); // Caso envido nao tenha sido chamado na primeira rodada remove
        JogadorAtual.JogadasDisponiveis.remove(Jogadas.FLOR); // Caso flor nao tenha sido chamado na primeira rodada remove
        if (JogadorAtual.JogadasDisponiveis.contains(Jogadas.JOGAR_CARTA) == false) { JogadorAtual.JogadasDisponiveis.add(0, Jogadas.JOGAR_CARTA); };
        this.TrocaJogador();
    }
   
    public void AtualizaJogadasFim() {
        JogadorAtual.JogadasDisponiveis.add(0, Jogadas.JOGAR_CARTA);
        this.TrocaJogador();
        JogadorAtual.JogadasDisponiveis.add(0, Jogadas.JOGAR_CARTA);
        this.TrocaJogador();
    }
    
    public void VerificaFinalDeJogo()
    {
        if( this.Placar[0] > 25 || this.Placar[1] > 25)
        {
            System.out.println( "ACABOU O VIDEOGAME");
            System.out.println( this.PlacarToString());
            System.exit(0); // Finaliza Jogo
        }
    }
    
    public void AtualizaDescriptionDoJogo ( int rodada, Jogador GanhadoresDasRodadas[])
    {
    	if ( JogadorAtual.IsBot() == true)
    	{
    		this.Description.setId( JogadorAtual.GetId()); // Seta o id do BOt
    		this.Description.setJogadorMao( this.MaoDaRodada.GetId()); // Seta a mao da rodada
    		
    		if ( rodada == 0 ) {  this.Description.setGanhadorPrimeiraRodada( GanhadoresDasRodadas[0].GetId());}
    		if ( rodada == 1 ) {  this.Description.setGanhadorPrimeiraRodada( GanhadoresDasRodadas[1].GetId());}
    		if ( rodada == 2 ) {  this.Description.setGanhadorPrimeiraRodada( GanhadoresDasRodadas[2].GetId());}
    	}
    	else 
    	{
    		return;
    	}
    }
    
    public void Jogo(){
    	// Setando os valores para o inicio do jogo
    	boolean FimDeJogo = false;   
    	    	    	
    	this.JogadorAtual = this.MaoDaRodada; // COmeï¿½a com pï¿½    	
    	Jogador GanhadoresDasRodadas [] = new Jogador [3];
    	

    	while (FimDeJogo == false) 
    	{   
    		
    		if ( RodadaAtual == Rodada.INICIAL) { this.intRodada = 0; }
    		if ( RodadaAtual == Rodada.MEIO)    { this.intRodada = 2; }
    		if ( RodadaAtual == Rodada.FINAL) { this.intRodada = 4;}
	    	switch (RodadaAtual)
	    	{
	    		case DANDO_CARTAS:
	    			System.out.println("\n \n \n \n Dando Cartas ...");
	    			MaoDaRodada.ReceberCartas( baralho.DarCarta());    			
	    			PeDaRodada.ReceberCartas ( baralho.DarCarta());
	    			MaoDaRodada.ReceberCartas( baralho.DarCarta());    			
	    			PeDaRodada.ReceberCartas ( baralho.DarCarta());
	    			MaoDaRodada.ReceberCartas( baralho.DarCarta());    			
	    			PeDaRodada.ReceberCartas ( baralho.DarCarta());	    			
                    MaoDaRodada.CalculaEnvido();
                    PeDaRodada.CalculaEnvido ();                                                                              
                                        
                    this.Description = new TrucoDescription();
                    Description.setJogadorMao(this.MaoDaRodada.GetId());                   
                    Description.setCartaAltaRobo (this.JogadorBOT.GetCartaAlta());
                    Description.setCartaMediaRobo(this.JogadorBOT.GetCartaMedia());
                    Description.setCartaBaixaRobo(this.JogadorBOT.GetCartaBaixa());
                    //AtualizaDescriptionDoJogo();                    
	    			RodadaAtual = Rodada.INICIAL;
	    			// DEBUG
	    			AtualizaDescriptionDoJogo( -1, GanhadoresDasRodadas);
	    			//this.MostraJogo();
	    			break;
	    			
	    		case INICIAL:
	    			PeDaRodada.AddJogadasIniciais();
	    			MaoDaRodada.AddJogadasIniciais();
	    			while (FimDaEtapa == false) // Loop da Etapa inicial / Primeiras 2 cartas
	    			{
                        MostraJogo();                        
                        
                        this.JogadorAtual.EscolherJogada( Description, 1, JogadaDaMesa);		    				
	    				this.JogarJogada( this.JogadorAtual.UltimaEscolha(), MaoDaRodada);
	    				if (this.CartasJogadas.size() == 2) FimDaEtapa = true; // Caso os dois tenham jogado carta, acaba a etapa
	    			}
	    			if(RodadaAtual == Rodada.FIM) 
	    			{
                        FimDaEtapa = false;
                        TrocaJogador();
                        this.JogadorGanhador = this.JogadorAtual;
                        break;
                                
	    			}
                    
	    			GanhadoresDasRodadas[0] = this.CalculaGanhadorDaEtapa(RodadaAtual);
	    			System.out.println("Ganhador da Mao  1: " + GanhadoresDasRodadas[0].toString());
	    			RodadaAtual = Rodada.MEIO;
	    			FimDaEtapa = false;
	    			
	    			
	    			AtualizaDescriptionDoJogo( 0, GanhadoresDasRodadas);
	    			break;
	    			
	    		case MEIO:
	    			System.out.println(" Quem TRUCO : " + this.Description.getQuemTruco());
	    			AtualizaJogadasMeio();	    			
	    			while (FimDaEtapa == false) // Loop da Etapa Meio / Primeiras 2 cartas
	    			{
	    				MostraJogo();
	    				this.JogadorAtual.EscolherJogada(Description, 2, JogadaDaMesa);
	    				this.JogarJogada( this.JogadorAtual.UltimaEscolha(), MaoDaRodada);
	    				if (this.CartasJogadas.size() == 4) FimDaEtapa = true; // Caso os dois tenham jogado carta, acaba a etapa
	    			}
	    			
                    if(RodadaAtual == Rodada.FIM) 
                    {	
                    	FimDaEtapa = false;
                    	TrocaJogador();
                    	this.JogadorGanhador = this.JogadorAtual;
                    	break;
                    }
                    
	    			GanhadoresDasRodadas[1] = this.CalculaGanhadorDaEtapa(RodadaAtual);
	    			
	    			System.out.println("Ganhador da Mao  2: " + GanhadoresDasRodadas[1].toString());
	    			
	    			if( GanhadoresDasRodadas[0] == GanhadoresDasRodadas[1])// Ganhou a primeira e a segunda
	    			{ 
	    				JogadorGanhador = GanhadoresDasRodadas[1];
	    				RodadaAtual = Rodada.FIM;	    				
                    }
	    			else if (GanhadoresDasRodadas[0] == this.Empate) // Empardou a primeira, vale a segunda 
	    			{ 
                            JogadorGanhador = GanhadoresDasRodadas[1];
                            RodadaAtual = Rodada.FIM;	    				
                    }
	    			else if( GanhadoresDasRodadas[1] == this.Empate) // Empardou a segunda, vale a primeira
	    			{ 
                            JogadorGanhador = GanhadoresDasRodadas[0];
                            RodadaAtual = Rodada.FIM;	    				                              
	    			}
	    			else
	    			{
	    				RodadaAtual = Rodada.FINAL;	    				
	    			}	
	    				    			
	    			FimDaEtapa = false;
	    			
	    			
	    			AtualizaDescriptionDoJogo( 1, GanhadoresDasRodadas);
	    			break;
	    			
	    		case FINAL:
                    AtualizaJogadasFim();
                    while (FimDaEtapa == false) // Loop da Etapa Meio / Primeiras 2 cartas
	    			{
	    				MostraJogo();
	    				this.JogadorAtual.EscolherJogada(Description , 3, JogadaDaMesa);
	    				this.JogarJogada( this.JogadorAtual.UltimaEscolha(), MaoDaRodada);
	    				if (this.CartasJogadas.size() == 6) FimDaEtapa = true; // Caso os dois tenham jogado carta, acaba a etapa
	    			}
                    
                    if(RodadaAtual == Rodada.FIM) {FimDaEtapa = false; break;}
                    
	    			GanhadoresDasRodadas[2] = this.CalculaGanhadorDaEtapa(RodadaAtual);
	    			
	    			System.out.println("Ganhador da Mao  3: " + GanhadoresDasRodadas[2].toString());
	    			
                    if( ( GanhadoresDasRodadas[0] == GanhadoresDasRodadas[2]  || GanhadoresDasRodadas[1] == GanhadoresDasRodadas[2]) && 
                          GanhadoresDasRodadas[2] != this.Empate )
                    {                    
                        JogadorGanhador = GanhadoresDasRodadas[2];
	
	    			}else if (GanhadoresDasRodadas[2] == this.Empate){ // Empardou a terceira, vale a primeira
                        JogadorGanhador = GanhadoresDasRodadas[0];
                    }
                    else 
                    { // Empardou as tres
                         JogadorGanhador = MaoDaRodada;
                    }
                        RodadaAtual = Rodada.FIM;	    				
                        FimDaEtapa = false;
                        
                        
    	    			AtualizaDescriptionDoJogo( 1, GanhadoresDasRodadas);
                        break;
                                
	    		case FIM:
	    			MostraJogo();
                    FimDaEtapa = false;
                    
                    JogadorGanhador.Pontuacao += ValorNoPote;
                    ValorNoPote = 1;
                    RodadaAtual = Rodada.DANDO_CARTAS;
                    
                    System.out.println("Ganhador da Rodada " + JogadorGanhador.toString());
                    
                    Jogador SwapTemp = MaoDaRodada;                                
                    MaoDaRodada = PeDaRodada;
                    PeDaRodada = SwapTemp;
                    
                    MaoDaRodada.LimparMao();
                    MaoDaRodada.ResetaCartasJogadas();
                    PeDaRodada.LimparMao();
                    PeDaRodada.ResetaCartasJogadas();
                    
                    ResetaBaralho();
                    
                    this.CartasJogadas.clear();
                    
                    JogadorGanhador = Empate;
                    GanhadoresDasRodadas[0] = null;
                    GanhadoresDasRodadas[1] = null;
                    GanhadoresDasRodadas[2] = null;

                    ClearCartasDisplay();
                    VerificaFinalDeJogo();
                    break;
	    		
	    	}
    	}
    }
    
    public void MostraJogo()
    {   
    	// Mostra as cartas jogadas
    	//System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    	System.out.println(" \n");
    	System.out.println(" DEBUG : \n Mao do Bot:" + JogadorBOT.PrintCartas());
    	System.out.println(" Mao da rodada :" + this.MaoDaRodada);
    	System.out.println(" Ultima Escolha BOT :" + this.JogadorBOT.UltimaEscolha );
    	System.out.println(" Jogadas Disponiveis BOT :" + this.JogadorBOT.PrintJogadas() );
    	
    	System.out.println("\n\n"); 
    	    	
    	
    	//this.CartasJogadas.forEach(CartasJogadas -> CartasJogadas.PrintValor());      			             
    	this.DisplayCartas.forEach(CartasJogadas -> CartasJogadas.PrintValor());
    	System.out.println();
    	
        String Mostra = "------------------------------------------------\n" +
                        "|  Jogador  |" + PlacarToString() + "|   BOT   |\n" +
                         "------------------------------------------------\n" +
                        JogadorAtual.toString()+"| " + JogadorAtual.PrintCartas() + "\n" +
                        JogadorAtual.PrintJogadas();
        
        System.out.println(Mostra);
    }
    
}
