package main.jogador;
import main.inimigos.Inimigo;

public class Jogador {
    
    private String nome;
    private double vida;
    private String arma;

    public Jogador(String nome, double vida, String arma){
        this.nome = nome;
        this.vida = vida;
        this.arma = arma;
    }

    public String atacar(Inimigo inimigo){
        inimigo.tomarDano(10);
        return "Atacando o inimigo " + inimigo.getNome();
    }

}
