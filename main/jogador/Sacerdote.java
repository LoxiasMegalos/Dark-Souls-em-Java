package main.jogador;
import main.Interfaces.Curavel;
import main.inimigos.Inimigo;

public class Sacerdote extends Jogador implements Curavel{
    
    public Sacerdote (String nome, double vida){
        super(nome, vida, "Cajado de Cura");
    }

    public String atacar(Inimigo inimigo){
        inimigo.tomarDano(15);
        return "Atacando o inimigo " + inimigo.getNome() + " com um Cajado de Cura";
    }

    @Override
    public void recuperaVida() {
        this.vida += 50;
    }
}

