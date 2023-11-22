/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;
import java.util.Scanner;
/**
 *
 * @author alumnot
 */
public class Examen {





    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n; // No hace falta inicializar la variable
	// int i=0; No se usa esta variable
        do {
        System.out.print("Introduzca un número que sea mayor que 0");                                                           
            n = sc.nextInt();
        } while (n <= 0); // i no es usada, por lo que se sustituye por n

        System.out.print("\nBinario: ");
        decBin(n);//Nombre del metodo mal escrito
    }

  
    //Método para pasar de decimal a binario
    public static void decBin(int n) {
        if (n == 1) { // 2 no es binario por lo que n tiene que ser menor que 2 ( n == 1 )
            System.out.print(n);
        } else {
            decBin(n / 2);
            System.out.print(n % 2); // Estaba mal la operación
        }
    }
}