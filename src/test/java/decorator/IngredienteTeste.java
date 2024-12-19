package decorator;

import org.decorator.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IngredienteTeste {
    @Test
    void deveRetornarPrecoIngredienteHamburguer() {
        Ingredientes ingredientes = new IngredienteHamburguer(1000.0f);
        assertEquals(1000.0f, ingredientes.getPrecoHamburguer());
    }

    @Test
    void deveRetornarPrecoIngredienteHamburguerComQueijo() {
        Ingredientes ingredientes = new Queijo(new IngredienteHamburguer(1000.0f));
        assertEquals(1300.0f, ingredientes.getPrecoHamburguer());
    }

    @Test
    void deveRetornarPrecoIngredienteHamburguerComBacon() {
        Ingredientes ingredientes = new Bacon(new IngredienteHamburguer(1000.0f));
        assertEquals(1200.0f, ingredientes.getPrecoHamburguer());
    }

    @Test
    void deveRetornarPrecoIngredienteHamburguerComQueijoMaisBacon() {
        Ingredientes ingredientes = new Bacon(new Queijo(new IngredienteHamburguer(1000.0f)));
        assertEquals(1560.0f, ingredientes.getPrecoHamburguer(), 0.1f);
    }
    @Test
    void deveRetornarPrecoIngredienteHamburguerComQueijoMaisBaconMaisAlface() {
        Ingredientes ingredientes = new Alface(new Bacon(new Queijo(new IngredienteHamburguer(1000.0f))));
        assertEquals(1716.0f, ingredientes.getPrecoHamburguer(), 0.1f);
    }


    @Test
    void deveRetornarIngredientesHamburguerSimples() {
        Ingredientes ingredientes = new IngredienteHamburguer();
        assertEquals("Pão/Carne", ingredientes.getIngredientes());
    }

    @Test
    void deveRetornarIngredienteHamburguerComQueijo() {
        Ingredientes ingredientes = new Queijo(new IngredienteHamburguer());
        assertEquals("Pão/Carne/Queijo", ingredientes.getIngredientes());
    }

    @Test
    void deveRetornarIngredienteHamburguerComBacon() {
        Ingredientes ingredientes = new Bacon(new IngredienteHamburguer());
        assertEquals("Pão/Carne/Bacon", ingredientes.getIngredientes());
    }

    @Test
    void deveRetornarIngredienteHamburguerComQueijoMaisBacon() {
        Ingredientes ingredientes = new Bacon(new Queijo(new IngredienteHamburguer()));
        assertEquals("Pão/Carne/Queijo/Bacon", ingredientes.getIngredientes());
    }
    @Test
    void deveRetornarIngredienteHamburguerComQueijoMaisBaconMaisAlface() {
        Ingredientes ingredientes = new Alface(new Bacon(new Queijo(new IngredienteHamburguer())));
        assertEquals("Pão/Carne/Queijo/Bacon/Alface", ingredientes.getIngredientes());
    }

}
