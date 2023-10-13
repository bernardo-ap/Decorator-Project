import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @Test
    void deveRetornarArmadura() {
        Personagem personagem = new PersonagemTank(20.0f);

        assertEquals(20.0f, personagem.getArmadura());
    }

    @Test
    void deveRetornarArmaduraComPeitoral(){
        Personagem personagem = new Peitoral(new PersonagemTank(20.0f));

        assertEquals(270.0f, personagem.getArmadura());
    }

    @Test
    void deveRetornarArmaduraComCapacete(){
        Personagem personagem = new Capacete(new PersonagemTank(20.0f));

        assertEquals(100.0f, personagem.getArmadura());
    }

    @Test
    void deveRetornarArmaduraComBota(){
        Personagem personagem = new Bota(new PersonagemTank(20.0f));

        assertEquals(95.0f, personagem.getArmadura());
    }

    @Test
    void deveRetornarArmaduraComCapaceteEBota(){
        Personagem personagem = new Bota(new Capacete(new PersonagemTank(20.0f)));

        assertEquals(175.0f, personagem.getArmadura());
    }

    @Test
    void deveRetornarArmaduraComCapaceteMaisBotaMaisPeitoralMaisCalca(){
        Personagem personagem = new Calca(new Peitoral(new Bota(new Capacete(new PersonagemTank(20.0f)))));

        assertEquals(625.0f, personagem.getArmadura());
    }
}