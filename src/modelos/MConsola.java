/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import static java.lang.Math.sqrt;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Chang Pérez
 * cada botón se realiza en la consola, pero al final también muestro una 
 * ventana con JOptionPane
 */
public class MConsola {
    
    public double raizCuadrada(double number) {
        return sqrt(number);
    }
    
    public String caraConcat(char caracteres[]) {
        String line = "";
        
        for(int i = 0; i < 6; i++) {
            line += caracteres[i];
        }
        
        return line;
    }
    
    public double residuoDiv(double n1, double n2) {
        return (n1%n2);
    }
    
    public double valorPagarProds(double precios[], double descuento) {
        int i;
        double suma = 0, pagoImp, pagoFinal;
        
        for(i = 0; i < 4; i++) {
            suma += precios[i];
        }
        
        pagoImp = suma * 1.15;
        pagoFinal = pagoImp * (1 - descuento);
        
        return  pagoFinal;
    }
    
    public void descomponerCifra(int cifra) {
        ArrayList<Integer> descomposicion = new ArrayList<>();
        
        String cant = String.valueOf(cifra);
        
        for(int i = 0; i < cant.length(); i++) {
           
            descomposicion.add(Integer.parseInt(String.valueOf(cant.charAt(i))));
        }
        
        System.out.println("Descomposicion de digitos de la cifra ingresada: ");
        
        
        for(int j = 0; j < descomposicion.size(); j++) {
            System.out.println(descomposicion.get(j));
        }
        
        
        for(int j: descomposicion) {
            System.out.println(j);
        }
    }
    
    public boolean mostrarTablaVerdad(int b1, int b2) {
        boolean bConvertido1 = false, bConvertido2 = false;
        
        
        if(b1 == 1) 
            bConvertido1 = true;
        
        if(b2 == 1) 
            bConvertido2 = true;
        
        
        String status1 = new Boolean(bConvertido1).toString();
        String status2 = new Boolean(bConvertido2).toString();
        
        System.out.println("Estados de valores P y Q: ");
        System.out.println("P: " + status1);
        System.out.println("Q: " + status2);
        
        if(bConvertido1 && bConvertido2) {
            return true;
        }
        
        return false;
    }
    
}
