package com.mycompany.poop8;
/**
 *
 * @author brandon
 */
public class CuadrilateroA extends PoligonoA{
    //Cuadrilatero A esta obligada a implementar los metodos del padre o de la superclase
    private int alfa, beta;
    private float a,b, base, altura;

    public CuadrilateroA() {
    }

    public CuadrilateroA(int alfa, int beta, float a, float b, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }

    public int getAlfa() {
        return alfa;
    }

    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    public int getBeta() {
        return beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    @Override
    public double area() {
        return base*altura;
    }

    @Override
    public double perimetro() {
        return 2*(a+b);
    }

    @Override
    public String toString() {
        return "CuadrilateroA{" + "alfa=" + alfa + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
    
}
