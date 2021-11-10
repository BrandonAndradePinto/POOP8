package com.mycompany.poop8;
/**
 *
 * @author brandon
 */
public abstract class PoligonoA {
    // En clase abstractas podemos tener metodos abstractos y concretos
    public abstract double area();
    public abstract double perimetro();

    @Override
    public String toString() {
        return "PoligonoA{" + '}';
    }
    
}
