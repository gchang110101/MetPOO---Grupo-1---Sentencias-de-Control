/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Megan Bougle y Camilo Herradora
 */
public class MAritmetico {
    
   public double sonMultiplos(double num1, double num2) {
       if(num1 % num2 ==0) return 0;
       return num1%num2;
   }
   
   public double calcularExpresion1(double num1, double num2, double num3, double num4, double num5){
       return num1+num2-num3*num4/num5;
   }
   
   public double calcularExpresion2(double num1, double num2, double num3, double num4, double num5){
       return (num1+num2)*num3-(num4/num5);
   }
           
}
