package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.inimigos.Inimigo;
import main.inimigos.ZumbiLerdo;

public class InimigoTest {

    @Test
    public void testeZumbiLerdoAtacando() {
        assertTrue(true);
        Inimigo zumbi = new ZumbiLerdo("ze", 100, "Machadinha quebrada");
        assertEquals("Nome: ze" + "\nVida: 100.0" + "\nTipo de Arma: Machadinha quebrada", zumbi.mostraInfo());
	}

    @Test
    public void testeCavaleiroNegroAtacando() {
        assertTrue(true);
    }

    @Test
    public void testeCavaleiroPrataAtacando() {
        assertTrue(true);
    }
	
}
