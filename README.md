# Metodos Static en Java
Ejemplo creando metodos Static en java

##Ejemplo
Existen dos ambitos:
* Ambito Estatico
* Ambito No Estatico

O conocidos tambien como:
* Metodos de instancia
* Metodos de Clase

###Metodos de instancia
Son aquellos metodos que pueden ser solo accedidos cuando se instancia o crea un objeto de la clase:
```java
Operaciones operaciones = new Operaciones(10,20);
operaciones.Sumar1();
```

###Metodos de la clase
Son aquellos metodos que solo pueden ser accedidos atravez de la definicion de la clase, utilizando la palabra reservada **static** 
en nuestro metodo de la clase padre:
```java
public static void Sumar2(int a,int b){
        int sumaTotal = a + b;
        System.out.println("SUMA DESDE METODO CLASE ---- ");
        System.out.println(sumaTotal);
    }
```
Simplemente para hacer uso de nuestro metodo static:
```java
Operaciones.Sumar2(10,12);
```
