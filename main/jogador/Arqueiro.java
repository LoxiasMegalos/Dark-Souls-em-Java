package main.jogador;

import main.inimigos.Inimigo;

public class Arqueiro extends Jogador{

    public Arqueiro (String nome, double vida){
        super(nome, vida, "Arco");
    }
    
    public String atacar(Inimigo inimigo){
        inimigo.tomarDano(18);
        return "Atacando o inimigo " + inimigo.getNome() + " com um Arco";
    }
}
