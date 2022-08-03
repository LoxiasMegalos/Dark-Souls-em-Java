package main.inimigos;

public class Inimigo{

    protected String nome;
	protected double vida;
	protected String tipoArma;

	public Inimigo(String nome, double vida, String tipoArma) {
		this.nome = nome;
		this.vida = vida;
		this.tipoArma = tipoArma;
	}

	public void tomarDano(int dano){
		if(this.vida <= 0)
			return;
		this.vida -= dano;
	}

	public String getNome(){
		return this.nome;
	}

	public String mostraInfo(){
		return "Nome: " + this.nome + "\nVida: "+ this.vida + "\nTipo de Arma: " + this.tipoArma;
	}
}