/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truco;

import java.util.Collections;
import java.util.Random;
import java.util.Stack;

public class Baralho {
    private final Stack<Carta> Cartas;
    private Stack<Carta> BaralhoDeJogo;
    private Random Seed;
    
    
    public Baralho() {
        this.Cartas = new Stack<>();
        // Espada
        this.Cartas.push( new Carta( "4e" , 1 , "4 Espadas" , 'e', 4));    
        this.Cartas.push( new Carta( "5e" , 2 , "5 Espadas" , 'e', 5));    
        this.Cartas.push( new Carta( "6e" , 3 , "6 Espadas" , 'e', 6));    
        this.Cartas.push( new Carta( "7e" , 42, "7 Espadas" , 'e', 7));    
        this.Cartas.push( new Carta( "10e", 6 , "10 Espadas", 'e', 0));    
        this.Cartas.push( new Carta( "11e", 7 , "11 Espadas", 'e', 0));    
        this.Cartas.push( new Carta( "12e", 8 , "12 Espadas", 'e', 0));    
        this.Cartas.push( new Carta( "3e" , 24, "3 Espadas" , 'e', 3));    
        this.Cartas.push( new Carta( "2e" , 16, "2 Espadas" , 'e', 2));    
        this.Cartas.push( new Carta( "1e" , 52, "1 Espadas" , 'e', 1));  
        
        // Paus
        this.Cartas.push( new Carta( "4p" , 1 , "4 Paus" , 'p', 4));    
        this.Cartas.push( new Carta( "5p" , 2 , "5 Paus" , 'p', 5));    
        this.Cartas.push( new Carta( "6p" , 3 , "6 Paus" , 'p', 6));    
        this.Cartas.push( new Carta( "7p" , 4 , "7 Paus" , 'p', 7));    
        this.Cartas.push( new Carta( "10p", 6 , "10 Paus", 'p', 0));    
        this.Cartas.push( new Carta( "11p", 7 , "11 Paus", 'p', 0));    
        this.Cartas.push( new Carta( "12p", 8 , "12 Paus", 'p', 0));    
        this.Cartas.push( new Carta( "3p" , 24, "3 Paus" , 'p', 3));    
        this.Cartas.push( new Carta( "2p" , 16, "2 Paus" , 'p', 2));    
        this.Cartas.push( new Carta( "1p" , 50, "1 Paus" , 'p', 1));  
        
        // Copas
        this.Cartas.push( new Carta( "4c" , 1 , "4 Copas" , 'c', 4));    
        this.Cartas.push( new Carta( "5c" , 2 , "5 Copas" , 'c', 5));    
        this.Cartas.push( new Carta( "6c" , 3 , "6 Copas" , 'c', 6));    
        this.Cartas.push( new Carta( "7c" , 4 , "7 Copas" , 'c', 7));    
        this.Cartas.push( new Carta( "10c", 6 , "10 Copas", 'c', 0));    
        this.Cartas.push( new Carta( "11c", 7 , "11 Copas", 'c', 0));    
        this.Cartas.push( new Carta( "12c", 8 , "12 Copas", 'c', 0));    
        this.Cartas.push( new Carta( "3c" , 24, "3 Copas" , 'c', 3));    
        this.Cartas.push( new Carta( "2c" , 16, "2 Copas" , 'c', 2));    
        this.Cartas.push( new Carta( "1c" , 12, "1 Copas" , 'c', 1));  
        
        // Ouro
        this.Cartas.push( new Carta( "4o" , 1 , "4 Ouro" , 'o', 4));    
        this.Cartas.push( new Carta( "5o" , 2 , "5 Ouro" , 'o', 5));    
        this.Cartas.push( new Carta( "6o" , 3 , "6 Ouro" , 'o', 6));    
        this.Cartas.push( new Carta( "7o" , 40, "7 Ouro" , 'o', 7));    
        this.Cartas.push( new Carta( "10o", 6, "10 Ouro", 'o', 0));    
        this.Cartas.push( new Carta( "11o", 7 , "11 Ouro", 'o', 0));    
        this.Cartas.push( new Carta( "12o", 8 , "12 Ouro", 'o', 0));    
        this.Cartas.push( new Carta( "3o" , 24, "3 Ouro" , 'o', 3));    
        this.Cartas.push( new Carta( "2o" , 16, "2 Ouro" , 'o', 2));    
        this.Cartas.push( new Carta( "1o" , 12, "1 Ouro" , 'o', 1));  
        
        this.BaralhoDeJogo = this.Cartas;
    }
    
    public void Embaralhar() {
        Collections.shuffle(this.BaralhoDeJogo);
        //Collections.shuffle(this.BaralhoDeJogo, this.Seed);
    }
    
    public Carta DarCarta() {
        return this.BaralhoDeJogo.pop();
    }
    
    public void VoltaBaralho(Carta carta) {
        this.BaralhoDeJogo.push(carta);
    }
    public void ResetaBaralho(){
        this.BaralhoDeJogo = Cartas;
    }
}
