/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author tribe
 */
public class circulo {
    
    int radio = 0;
    double A=0;
    double pi = 3.1416;
    double perimetro;
    
    //Atributos
    //Constructor
    public circulo(int radio){
        this.radio = radio;
    }
    
    //Metodos
    public double calcularArea(){
        
        this.A = (pi*(radio * radio));
        return A;
    }
    
    public double calcularPerimetro(){
          
        this.perimetro = 2 * pi * radio;
        return perimetro;
    }
}
