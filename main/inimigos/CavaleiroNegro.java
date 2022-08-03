package main.inimigos;

public class CavaleiroNegro extends Inimigo{
    
    public CavaleiroNegro(String nome, double vida, String tipoArma){
        super(nome, vida, tipoArma);
    }

    @Override
    public String atacando(){
        return "Cavaleiro Negro " + this.getNome() + " atacando!";
    }

    public String ataqueRapido(){
        return "Atacando Rapidamente";
    }
}
