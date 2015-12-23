package com.gamis214;

public class Main {

    public static void main(String[] args) {
	    //-->Acceso al metodo SUMA desde una Instancia u Objeto
        Operaciones operaciones = new Operaciones(10,20);
        operaciones.Sumar1();

        //-->Acceso al metodo static SUMA desde la CLASE
        Operaciones.Sumar2(10,12);
    }
}
