package org.decorator;

public class Bacon extends IngredientDecorator {
    public Bacon(Ingredientes ingredientes) {
        super(ingredientes);
    }
    public float getPercentualPrecoHamburguer() {
        return 20.0f;
    }
    public String getNomeIngredientes() {
        return "Bacon";
    }
}