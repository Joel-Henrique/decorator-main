package org.decorator;

public class IngredienteHamburguer implements Ingredientes {
    public float precoHamburguer;
    public IngredienteHamburguer() {
    }
    public IngredienteHamburguer(float precoHamburguer) {
        this.precoHamburguer = precoHamburguer;
    }
    public float getPrecoHamburguer() {
        return precoHamburguer;
    }
    public String getIngredientes() {
        return "Pão/Carne";
    }
}