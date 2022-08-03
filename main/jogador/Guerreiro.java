package main.jogador;

import main.inimigos.Inimigo;

public class Guerreiro extends Jogador{

    public Guerreiro (String nome, double vida){
        super(nome, vida, "Machado");
    }

    public String atacar(Inimigo inimigo){
        inimigo.tomarDano(35);
        return "Atacando o inimigo " + inimigo.getNome() + " com um Machado";
    }
}
