/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Proyect.controller;

/**
 *
 * @author HP
 */
public class operacionesController {
    
   private double resultado;
    private double valor;
    private int unidades1;
    private int unidades2;
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getUnidades1() {
        return unidades1;
    }

    public void setUnidades1(int unidades1) {
        this.unidades1 = unidades1;
    }

    public int getUnidades2() {
        return unidades2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void setUnidades2(int unidades2) {
        this.unidades2 = unidades2;
    }

    public operacionesController() {
    }
    
    public double convertir(){
        
        if ( unidades1 ==0 && unidades2 ==1){
            resultado = valor * 60;
            
        }else if ( unidades1 ==0 &&unidades2 == 0 ){
            resultado  = valor;
            
        }else if (unidades2 ==0 && unidades1 ==1){
            resultado = valor /60;
            
        }else if ( unidades2 ==0 &&unidades1 == 0 ){
            resultado  = valor;   
        }
       
        return resultado;
    }
     
}
