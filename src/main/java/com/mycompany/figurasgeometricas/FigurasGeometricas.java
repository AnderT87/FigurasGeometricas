/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figurasgeometricas;

public class FigurasGeometricas {

    public static void main(String[] args) {
        /*Se requiere un programa que modele varias figuras geométricas: el círculo, el rectángulo, el cuadrado y el
        triángulo rectángulo. Para ello se debe considerar que:
        • Elcírculo tiene como atributo su radio en centímetros.
        • Elrectángulo, su base y altura en centímetros.
        • Elcuadrado, la longitud de sus lados en centímetros.
        • Eltriángulo, su base y altura en centímetros.
        Además, el programa requiere determinar el área y el perímetro de cada figura geométrica. En el caso
        particular del triángulo rectángulo se requiere: calcular la hipotenusa del rectángulo y determinar qué tipo
        de triángulo es: Equilátero: todos sus lados son iguales; Isósceles: tiene dos lados iguales; Escaleno: todos
        sus lados son diferentes.
        Se debe desarrollar una clase de prueba con un método main para crear las cuatro figuras y probar los
        métodos respectivos.*/
         
         //Asignacion de valores
         circulo objcirculo = new circulo(7);
         cuadrado objCuadrado = new cuadrado(9);
         rectangulo objRectangulo = new rectangulo(8,12);
         triangulo objtriangulo = new triangulo(3,4,7,5,7);
         
         //Calculo de las areas
         
         double areaUno = objcirculo.calcularArea();         
         double areaDos = objCuadrado.calcularArea();                  
         double areaTres = objRectangulo.calcularArea();
         double areaCuatro = objtriangulo.calcularArea();
         
         //Calculo de los perimetros
         double perimetroUno = objcirculo.calcularPerimetro();              
         double perimetroDos = objCuadrado.calcularPerimetro();                
         double perimetroTres = objRectangulo.calcularPerimetro();
         double perimetroCuatro = objtriangulo.calcularPerimetro();
         
         //Calculo de la hipotenusa
         double hipotenusa = objtriangulo.calcularHipotenusa();
         
         //Tipo triangulo
         String tTriangulo = objtriangulo.tipoTriangulo();
         
         System.out.println("-----CIRCULO-----");
         System.out.println("El radio del circulo es: " +areaUno);
         System.out.println("El perimetro del circulo es : "+perimetroUno);
         
         System.out.println("-----CUADRADO-----");
         System.out.println("El radio del cuadrado es: " +areaDos);
         System.out.println("El perimetro del cuadrado es : "+perimetroDos);
         
         System.out.println("-----RECTANGULO-----");
         System.out.println("El radio del rectangulo es: " +areaTres);
         System.out.println("El perimetro del rectangulo es : "+perimetroTres);
         
         System.out.println("-----TRIANGULO-----");
         System.out.println("El radio del triangulo es: " +areaCuatro);
         System.out.println("El perimetro del triangulo es : "+perimetroCuatro);
         System.out.println("Su hipotenusa es de :"+hipotenusa);
         System.out.println("Su triangulo es un :"+tipoTriangulo);
    }
}
