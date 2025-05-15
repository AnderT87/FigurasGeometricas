/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author tribe
 */
public class cuadrado {
    int lados = 0;
    double A=0;
    double pi = 3.1416;
    double perimetro;
    
    //Atributos
    //Constructor
    public cuadrado(int lados){
        this.lados = lados;
    }
    
    //Metodos
    public double calcularArea(){
        
        this.A = lados * lados;
        return A;
    }
    
    public double calcularPerimetro(){
          
        this.perimetro = lados + lados + lados + lados;
        return perimetro;
    }
}
