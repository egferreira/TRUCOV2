package truco;


public class Carta {
    private final String Simb; 
    private final int Codificacao;
    private final String Valor;
    private final char Naipe;    
    private final int ValorInvido;
    
    
    public Carta(String Valor) 
    {
    	this.Simb = " ";
        this.Codificacao = -1;
    	this.Valor = Valor;
    	this.Naipe = 'z';
        this.ValorInvido = -1;
    	
    }
    
    public Carta(String Simb, int Codificacao, String Valor, char Naipe, int ValorInvido) {
        this.Simb = Simb;
        this.Codificacao = Codificacao;
        this.Valor = Valor;
        this.Naipe = Naipe;
        this.ValorInvido = ValorInvido;
    }
    
    public String GetSimb() {
        return this.Simb;
    }
    
    public int GetCodificacao(){
        return this.Codificacao;
    }
    
    public String GetValor() {
        return this.Valor;
    }
    
    public char GetNaipe() {
        return this.Naipe;
    }
    
    public int GetValorInvido() {
    	return this.ValorInvido;
    }
    
    public void PrintValor() {
    	
    	System.out.print(" " + this.GetValor() + " ");
    	
    }
    
   
   

   
}
