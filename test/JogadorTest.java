package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.inimigos.Inimigo;
import main.inimigos.ZumbiLerdo;
import main.jogador.Arqueiro;
import main.jogador.Guerreiro;
import main.jogador.Jogador;
import main.jogador.Sacerdote;
import main.jogador.Mago;


public class JogadorTest {
    
    @Test
    public void verificaAtaqueGuerreiro(){
        Jogador protagonista = new Guerreiro("Chosen", 1000);
        Inimigo zumbi = new ZumbiLerdo("ze", 100, "maos nuas");
        assertEquals("Atacando o inimigo ze com um Machado", protagonista.atacar(zumbi));
    }

    @Test
    public void testeDanoAtaqueGuerreiro(){
        Jogador protagonista = new Guerreiro("Chosen", 1000);
        Inimigo zumbi = new ZumbiLerdo("ze", 100, "maos nuas");
        protagonista.atacar(zumbi);
        assertEquals("Nome: ze" + "\nVida: 65.0" + "\nTipo de Arma: maos nuas", zumbi.mostraInfo());
    }

    @Test
    public void verificaAtaqueArqueiro(){
        Jogador rombinWood = new Arqueiro("Chosen", 800);
        Inimigo zumbi = new ZumbiLerdo("ze", 100, "maos nuas");
        assertEquals("Atacando o inimigo ze com um Arco", rombinWood.atacar(zumbi));
    }
    

    @Test
    public void testeDanoAtaqueArqueiro(){
        Jogador rombinWood = new Arqueiro("Chosen", 800);
        Inimigo zumbi = new ZumbiLerdo("ze", 100, "maos nuas");
        rombinWood.atacar(zumbi);
        assertEquals("Nome: ze" + "\nVida: 82.0" + "\nTipo de Arma: maos nuas", zumbi.mostraInfo());
    }

    @Test
    public void verificaAtaqueMago(){
        Jogador merlin = new Mago("Chosen", 700);
        Inimigo zumbi = new ZumbiLerdo("ze", 100, "maos nuas");
        assertEquals("Atacando o inimigo ze com um Cajado", merlin.atacar(zumbi));
    }

    @Test
    public void testeDanoAtaqueMago(){
        Jogador merlin = new Mago("Chosen", 700);
        Inimigo zumbi = new ZumbiLerdo("ze", 100, "maos nuas");
        merlin.atacar(zumbi);
        assertEquals("Nome: ze" + "\nVida: 70.0" + "\nTipo de Arma: maos nuas", zumbi.mostraInfo());
    }

    @Test
    public void testaCuraMago(){
        Mago merlin = new Mago("Chosen", 700);
        assertEquals("Nome: Chosen" + "\nVida: 700.0" + "\nTipo de Arma: Cajado", merlin.mostraStatus());
        merlin.recuperaVida();
        assertEquals("Nome: Chosen" + "\nVida: 735.0" + "\nTipo de Arma: Cajado", merlin.mostraStatus());
    }

    @Test
    public void verificaAtaqueSacerdote(){
        Jogador karl = new Sacerdote("Chosen", 600);
        Inimigo zumbi = new ZumbiLerdo("ze", 100, "maos nuas");
        assertEquals("Atacando o inimigo ze com um Cajado de Cura", karl.atacar(zumbi));
    }

    @Test
    public void testeDanoAtaqueSacerdote(){
        Jogador karl = new Sacerdote("Chosen", 600);
        Inimigo zumbi = new ZumbiLerdo("ze", 100, "maos nuas");
        karl.atacar(zumbi);
        assertEquals("Nome: ze" + "\nVida: 85.0" + "\nTipo de Arma: maos nuas", zumbi.mostraInfo());
    }

    @Test
    public void testaCuraSacerdote(){
        Sacerdote karl = new Sacerdote("Chosen", 600);
        assertEquals("Nome: Chosen" + "\nVida: 600.0" + "\nTipo de Arma: Cajado de Cura", karl.mostraStatus());
        karl.recuperaVida();
        assertEquals("Nome: Chosen" + "\nVida: 650.0" + "\nTipo de Arma: Cajado de Cura", karl.mostraStatus());
    }

    @Test
    public void testaTelaDeStatus(){
        Jogador merlin = new Mago("Merlin", 700);
        Jogador rombinWood = new Arqueiro("Robin", 800);
        Jogador protagonista = new Guerreiro("Chosen", 1000);
        Jogador karl = new Sacerdote("Karl", 600);

        assertEquals("Nome: Merlin" + "\nVida: 700.0" + "\nTipo de Arma: Cajado", merlin.mostraStatus());
        assertEquals("Nome: Robin" + "\nVida: 800.0" + "\nTipo de Arma: Arco", rombinWood.mostraStatus());
        assertEquals("Nome: Chosen" + "\nVida: 1000.0" + "\nTipo de Arma: Machado", protagonista.mostraStatus());
        assertEquals("Nome: Karl" + "\nVida: 600.0" + "\nTipo de Arma: Cajado de Cura", karl.mostraStatus());
    }
}
