package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.inimigos.Inimigo;
import main.inimigos.ZumbiLerdo;
import main.jogador.Jogador;


public class JogadorTest {
    
    @Test
    public void verificaAtaque(){
        Jogador protagonista = new Jogador("Chosen", 1000, "Espada");
        Inimigo zumbi = new ZumbiLerdo("ze", 100, "maos nuas");
        
        assertEquals("Atacando o inimigo ze", protagonista.atacar(zumbi));
        assertEquals("Nome: ze" + "\nVida: 90.0" + "\nTipo de Arma: maos nuas", zumbi.mostraInfo());
    }
}
