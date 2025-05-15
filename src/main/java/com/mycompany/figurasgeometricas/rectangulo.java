/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author tribe
 */
public class rectangulo {
    int base;
    int altura;
    double A;
    double perimetro;
    
    public rectangulo(int base,int altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double calcularArea(){
         
        this.A = base * altura ;
        return A;
    }
    
    public double calcularPerimetro(){
         
        this.perimetro = 2*(base * altura) ;
        return A;
    }
}
