package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.inimigos.CavaleiroNegro;
import main.inimigos.CavaleiroPrata;
import main.inimigos.Inimigo;
import main.inimigos.ZumbiLerdo;

public class InimigoTest {

    @Test
    public void testeZumbiLerdoAtacando() {
        Inimigo zumbi = new ZumbiLerdo("ze", 100, "Machadinha quebrada");
        assertEquals("Zumbi Lerdo ze atacando!", zumbi.atacando());
	}

    @Test
    public void InfosZumbiLerdo(){
        Inimigo zumbi = new ZumbiLerdo("ze", 100, "Machadinha quebrada");
        assertEquals("Nome: ze" + "\nVida: 100.0" + "\nTipo de Arma: Machadinha quebrada", zumbi.mostraInfo());
    }

    @Test
    public void testeCavaleiroNegroAtacando() {
        CavaleiroNegro cavaleiro = new CavaleiroNegro("joao", 300, "Alabarda");
        assertEquals("Cavaleiro Negro joao atacando!", cavaleiro.atacando());
        assertEquals("Atacando Rapidamente", cavaleiro.ataqueRapido());
    }

    @Test
    public void InfosCavaleiroNegro(){
        Inimigo cavaleiro = new CavaleiroNegro("joao", 300, "Alabarda");
        assertEquals("Nome: joao" + "\nVida: 300.0" + "\nTipo de Arma: Alabarda", cavaleiro.mostraInfo());
    }

    @Test
    public void testeCavaleiroPrataAtacando() {
        CavaleiroPrata cavaleiro = new CavaleiroPrata("batman", 280, "Espada Encantada");
        assertEquals("Cavaleiro de Prata batman atacando!", cavaleiro.atacando());
        assertEquals("Ataque pesado no jogador!", cavaleiro.ataquePesado());
    }

    @Test
    public void InfosCavaleiroPrata(){
        Inimigo cavaleiro = new CavaleiroPrata("batman", 280, "Espada Encantada");
        assertEquals("Nome: batman" + "\nVida: 280.0" + "\nTipo de Arma: Espada Encantada", cavaleiro.mostraInfo());
    }
	
}
