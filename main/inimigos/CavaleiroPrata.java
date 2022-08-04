package main.inimigos;

import main.Interfaces.Curavel;

public class CavaleiroPrata extends Inimigo implements Curavel{
    
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

    @Override
    public void recuperaVida() {
        this.vida += 25;
    }
}
