/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Gurdian
 */
public class Mlogico {
    
    public boolean sonIguales(int num1, int num2){
        /**
         * Verifica si 2 numeros reales son iguales
         */
        return num1 == num2;
        
    }
    
    public boolean sonIguales(double num1, double num2){
        return num1== num2;
    }
    
    public double numeroMayor(double num1, double num2){
        
        if(num1>num2)return num1;
        return num2;
    }
     public double numeroMenor(double num1, double num2){
        
        if(num1<num2)return num1;
        return num2;
    }
     public boolean esMenor(double num1, double num2){
         if(num1<= num2){
		return true;
		}
         
            else if(num1==num2){
                return true;
                }
            return false;
         
     }
     public boolean esMayor(double num1, double num2){
         if(num1>= num2){
		return true;
		}
         
            else if(num1==num2){
                return true;
                }
            return false;

         
         
     }
     
     public static boolean caracteresIguales(String char1, String char2){
         
         if(char1.equals(char2))return true;
         return false;
         
         
     }
     public static boolean caracteresDiferentes(String char1, String char2){
         
         if(char1.equals(char2))return false;
         return true;
         
         
     }
      public static boolean cadenasIguales(String cadena1, String cadena2){
         
         if(cadena1.compareTo(cadena2)== 0)return false;
         return true;
         
         
     }
      public static boolean cadenasMayores(String cadena1, String cadena2){
         
         if(cadena1.compareTo(cadena2)> 0)return true;
         return false;
         
         
     }
       public static boolean positivoOnegativo(double num1){
         
           if(num1>0)
               return true;
           else
               return false;
        
     }
         
         
     }
         
     
   
    

