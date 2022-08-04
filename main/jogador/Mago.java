package main.jogador;

import main.Interfaces.Curavel;
import main.inimigos.Inimigo;

public class Mago extends Jogador implements Curavel{
    
    public Mago (String nome, double vida){
        super(nome, vida, "Cajado");
    }

    public String atacar(Inimigo inimigo){
        inimigo.tomarDano(30);
        return "Atacando o inimigo " + inimigo.getNome() + " com um Cajado";
    }

    @Override
    public void recuperaVida() {
        this.vida += 35;
    }
}
