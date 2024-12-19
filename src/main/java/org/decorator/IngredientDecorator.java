package org.decorator;

public abstract class IngredientDecorator implements Ingredientes {
    private Ingredientes ingredientes;
    public String ingredientesDoHamburguer;
    public IngredientDecorator(Ingredientes ingredientes) {
        this.ingredientes = ingredientes;
    }
    public Ingredientes getIngrediente() {
        return ingredientes;
    }
    public void setIngredientes(Ingredientes ingredientes) {
        this.ingredientes = ingredientes;
    }
    public abstract float getPercentualPrecoHamburguer();

    public float getPrecoHamburguer() {
        return this.ingredientes.getPrecoHamburguer() * (1 + (this.getPercentualPrecoHamburguer() / 100));
    }
    public abstract String getNomeIngredientes();
    public String getIngredientes() {
        return this.ingredientes.getIngredientes() + "/" + this.getNomeIngredientes();
    }
    public void setIngredientes(String ingredientesDoHamburguer) {
        this.ingredientesDoHamburguer = ingredientesDoHamburguer;
    }

}