package main.inimigos;

public class CavaleiroPrata extends Inimigo{
    
    public CavaleiroPrata(String nome, double vida, String tipoArma){
        super(nome, vida, tipoArma);
    }
    
    @Override
    public String atacando(){
        return "Cavaleiro de Prata " + this.getNome() + " atacando!";
    }

    public String ataquePesado(){
        return "Ataque pesado no jogador!";
    }
}
