package org.decorator;

public class Alface extends IngredientDecorator {
    public Alface(Ingredientes ingredientes) {
        super(ingredientes);
    }
    public float getPercentualPrecoHamburguer() {
        return 10.0f;
    }
    public String getNomeIngredientes() {
        return "Alface";
    }
}