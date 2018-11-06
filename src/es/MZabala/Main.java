package es.MZabala;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introduzca los números a comparar.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Seleccione una operación, por favor: \n 1-Comparar ambos números. \n 2-Comprobar si son múltiplos. \n 3-Mostrar si son iguales/cuál es mayor. \n 4-Ordenar de mayor-menor.");
        int select=sc.nextInt();
        switch (select){
            case 1:
                compare(a,b);
                break;
            case 2:
                check(a,b);
                break;
            case 3:
                size(a,b);
                break;
            case 4:
                order(a,b);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    /*
    La función main sirve para crear la variable scanner e inicializar los valores a y b.
     */

    private static void compare(int a, int b) {
        if (a==b){
            System.out.println("Los números son iguales.");
        }else{
            System.out.println("Los números no son iguales.");
        }
    }

    /*
    Función que comprueba por un if si los números son iguales o no
     */

    private static void check(int a, int b) {
        if(a%b==0){
            System.out.println("Son múltiplos");
        }else{
            if(b%a==0){
                System.out.println("Son múltiplos");
            }else{
                System.out.println("No son múltiplos");
            }
        }
    }

    /*
    Función para comprobar si son múltiplos o no.
     */

    private static void size(int a, int b) {
        if(a==b){
            System.out.println("Los números introducidos son iguales");
        }else{
            if(a<b){
                System.out.println("El número " +a +" es menor que " +b);
            }else{
                System.out.println("El número " +b +" es menor que " +a);
            }
        }
    }

    /*
    Esta función compara las varibles usadas y saca por pantalla si las variables son iguales o no y cuál es la menor de ambas.
     */

    private static void order(int a, int b) {
        if(a==b){
            System.out.println(a+" "+b);
        }else{
            if(a<b){
                System.out.println(b+" "+a);
            }else{
                System.out.println(a+" "+b);
            }
        }
    }

    /*
    Función que compara y muestra ordenadamente 2 números dados.
     */
}
