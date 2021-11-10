package com.mycompany.poop8;

/**
 *
 * @author brandon
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("------------[Objetos se comportan como sus superclases]------------\n");
        PoligonoC poligonoC = new PoligonoC();
        //Plogono puede comportarse como su superclase Object
        Object objeto = poligonoC;
        System.out.println(poligonoC);
        System.out.println(objeto);
        // INCORRECTO poligonoC = objeto
        poligonoC = (PoligonoC) objeto; // Se requiere hacer un casteo ->NO RECOMENDABLE (se pierden atributos y metodos)
        System.out.println(poligonoC);
        
        poligonoC = new TrianguloC();
        System.out.println(poligonoC);
        poligonoC = new CuadrilateroC();
        System.out.println(poligonoC);
        
        PoligonoC poli = new CuadrilateroC();
        System.out.println(poli.toString());
        //poli.setBase(9.9f); // EL metodo no esta definido en el poligonoC por lo tanto no puefo sobreescribirlo
        //poligonoC.setBase(5.5f);
        
        System.out.println("\n------------------------[Clases Abstractas]------------------------¬\n");
        
        //PoligonoA polA = new PoligonoA(); -> NO se pueden crear objetos de clases abstractas
        PoligonoA polA = new TrianguloA();
        System.out.println(polA);
        polA = new CuadrilateroA();
        System.out.println(polA);
        
        System.out.println("\n----------------------[Interfaces o Contrato]-----------------------¬\n");
        
        //Podemos crear una referencia a interfaz
        InstrumentoMusical instrumento;
        //Peron no podemos implementarla
        //InstrumentoMusical instru = new InstrumentoMusical();  -> NO esta permitido
        
        instrumento = new Flauta();
        instrumento.tocar();
        System.out.println(instrumento.tipoInstrumento());
        System.out.println(instrumento);
        
        System.out.println("\n----------------------[Atributos de Interfaces]-----------------------¬\n");
        
        System.out.print("El mes " + Meses.DOS + " corresponde a: ");
        System.out.println(Meses.NOMBRE_MESES[Meses.DOS]);
    }
}
