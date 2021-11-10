package com.mycompany.poop8;
/**
 *
 * @author brandon
 */
public class InstrumentoViento extends Object implements InstrumentoMusical{

    public InstrumentoViento() {
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Instrumento de Viento");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando instrumento de Vientp");
    }

    @Override
    public String tipoInstrumento() {
        return "Instrumento de Viento";
    }

    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
}
