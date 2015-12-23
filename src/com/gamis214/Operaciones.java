package com.gamis214;


public class Operaciones {

    private int num1,num2;

    public Operaciones(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void Sumar1(){
        int sumaTotal = this.num1 + this.num2;
        System.out.println("SUMA DESDE OBJETO ---- ");
        System.out.println(sumaTotal);
    }

    public static void Sumar2(int a,int b){
        int sumaTotal = a + b;
        System.out.println("SUMA DESDE METODO CLASE ---- ");
        System.out.println(sumaTotal);
    }

}
