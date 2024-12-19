package org.decorator;

public class Queijo extends IngredientDecorator {
    public Queijo(Ingredientes ingredientes) {
        super(ingredientes);
    }
    public float getPercentualPrecoHamburguer() {
        return 30.0f;
    }
    public String getNomeIngredientes() {
        return "Queijo";
    }
}