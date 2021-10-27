package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

class Excepcion1{
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int numero=0;
        
    try{
        System.out.println("Inserte un numero entero");
        numero=teclado.nextInt();
        numero/=0;
        System.out.println("El numero insertado es "+numero);
    }catch(InputMismatchException ex){
        System.out.println("¡¡¡¡ERROR!!!!! Inserte un numero entero");
        //System.out.println(ex);
        //ex.printStackTrace();
    }catch(ArithmeticException ex){
        System.out.println("No dividas entre 0");
    }catch(Exception ex){
        System.out.println("Error desconocido");
    }finally{
        System.out.println("En cualquier caso esto se va a ejecutar");
    }
    teclado.close();
    }
}
