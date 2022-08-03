package main.jogador;
import main.inimigos.Inimigo;

public abstract class Jogador {
    
    private String nome;
    private double vida;
    private String arma;

    public Jogador(String nome, double vida, String arma){
        this.nome = nome;
        this.vida = vida;
        this.arma = arma;
    }

    public String mostraStatus(){
		return "Nome: " + this.nome + "\nVida: "+ this.vida + "\nTipo de Arma: " + this.arma;
	}

    public abstract String atacar(Inimigo inimigo);

}
