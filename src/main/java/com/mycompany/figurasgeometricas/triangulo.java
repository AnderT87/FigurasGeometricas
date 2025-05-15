/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author tribe
 */
public class triangulo {
    int ladoUno;
    int ladoDos;
    int ladoTres;
    int baseT;
    int alturaT;
    double A;
    double perimetro;
    double hipotenusa;
    String escaleno;
    String isosceles;
    String equilatero;
    
    public triangulo(int ladoUno,int ladoDos,int ladoTres,int baseT,int alturaT){
        this.baseT = baseT;
        this.alturaT = alturaT;
        this.ladoUno = ladoUno;
        this.ladoDos = ladoDos;
        this.ladoTres = ladoTres;
        
    }
    
    public double calcularArea(){
         
        this.A = (baseT * alturaT) / 2.0 ;
        return A;
    }
    
    public double calcularPerimetro(){
         
        this.perimetro = ladoUno + ladoDos + ladoTres  ;
        return perimetro;
    }
    
    public double calcularHipotenusa(){
        this.hipotenusa = Math.sqrt((ladoUno * ladoUno)+(ladoDos * ladoDos));
        return hipotenusa;
    }
    
    public String tipoTriangulo(int ladoUno,int ladoDos,int ladoTres){
        if(ladoUno == ladoDos && ladoDos == ladoTres){
            return "Equilatero";
        }
        else if(ladoUno == ladoDos || ladoUno == ladoTres || ladoDos == ladoTres){
            return "Isosceles";
        }
        else if(ladoUno != ladoDos && ladoDos != ladoTres){
           return "Escaleno";
        } 
        return "Tipo desconocido";
    }
}
