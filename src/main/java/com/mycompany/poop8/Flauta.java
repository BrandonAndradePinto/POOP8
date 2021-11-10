package com.mycompany.poop8;
/**
 *
 * @author brandon
 */
public class Flauta extends InstrumentoViento{

    public Flauta() {
    }
    //Podemos sobreescribir los metodos
    
    @Override
    public String tipoInstrumento(){
        return "Flauta";
    }
    
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
    
}
