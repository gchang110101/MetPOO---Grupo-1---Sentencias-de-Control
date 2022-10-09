/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Laura Cuevas López
 */
public class MSwitch {
    
     Scanner leer = new Scanner(System.in);

    /**
     * Verifica en que grupo se encuentra el mes
     *
     * @param mes
     * @return
     */
    public String diasMes(String mes) {
        String m = mes;

        switch (m) {

            case "Enero":
                return "Pertenece al grupo de 31 días";

            case "Marzo":
                return "Pertenece al grupo de 31 días";

            case "Abril":
                return "Pertenece al grupo de 30 días";

            case "Mayo":
                return "Pertenece al grupo de 31 días";

            case "Junio":
                return "Pertenece al grupo de 30 días";

            case "Julio":
                return "Pertenece al grupo de 31 días";

            case "Agosto":
                return "Pertenece al grupo de 31 días";

            case "Septiembre":
                return "Pertenece al grupo de 30 días";

            case "Octubre":
                return "Pertenece al grupo de 31 días";

            case "Noviembre":
                return "Pertenece al grupo de 31 días";

            case "Diciembre":
                return "Pertenece al grupo de 30 días";

            case "Febrero":
                return "Pertenece al grupo de 28 días";

            default:
                break;
        }

        return "No se reconoce el mes";
    }

    /**
     * Determina la época del año según el mes
     *
     * @param mes
     * @return
     */
    public String epocaMes(int mes) {

        switch (mes) {

            case 1:
                return "La época es invierno";

            case 3:
                return "La época es primavera";

            case 4:
                return "La época es primavera";

            case 5:
                return "La época es primavera";

            case 6:
                return "La época es verano";

            case 7:
                return "La época es verano";

            case 8:
                return "La época es verano";

            case 9:
                return "La época es otoño";

            case 10:
                return "La época es otoño";

            case 11:
                return "La época es otoño";

            case 12:
                return "La época es invierno";

            case 2:
                return "La época es invierno";

            default:
                break;
        }

        return "No se reconoce el mes";
    }

    /**
     * Determina los días según el número del mes
     *
     * @param mes
     * @return
     */
    public String diasMes(int mes) {

        switch (mes) {

            case 1:
                return "Pertenece al grupo de 31 días";

            case 3:
                return "Pertenece al grupo de 31 días";

            case 4:
                return "Pertenece al grupo de 30 días";

            case 5:
                return "Pertenece al grupo de 31 días";

            case 6:
                return "Pertenece al grupo de 30 días";

            case 7:
                return "Pertenece al grupo de 31 días";

            case 8:
                return "Pertenece al grupo de 31 días";

            case 9:
                return "Pertenece al grupo de 30 días";

            case 10:
                return "Pertenece al grupo de 31 días";

            case 11:
                return "Pertenece al grupo de 31 días";

            case 12:
                return "Pertenece al grupo de 30 días";

            case 2:
                return "Pertenece al grupo de 28 días";

            default:
                break;
        }

        return "No se reconoce el mes";
    }

    /**
     * Calcula la raíz cuadrada de un número
     *
     * @param numero
     * @return
     */
    public double calcularRaiz(int numero) {
        double raiz = Math.sqrt(numero);
        return raiz;
    }

    /**
     * Calcula el residuo de una división entera
     *
     * @param numero1
     * @param numero2
     * @return
     */
    public double calcularResiduo(double numero1, double numero2) {
       double residuo = numero1 % numero2;
       return residuo;
    }

    /**
     *Calcula el menor de n números
     * @param n
     * @return
     */
    public String menorNumero(int n) {
        double menor = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingresa el valor de un numero: ");
            double numero = leer.nextDouble();
            leer.nextLine();
            if (i == 1 || numero < menor) {
                menor = numero;
            }
            System.out.println();
        }
        return "Valor de menor: " + menor;
    }


/**
 * Determina si el número es par o impar
 *
 * @return
 */
public int parImpar(int numero){
    return numero%2;
     }
}
