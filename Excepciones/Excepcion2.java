package Excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;
class Excepcion2{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        boolean valido=false;
    do{    

        try{

            System.out.println("Inserte un numero entero: ");
            numero=teclado.nextInt();
            System.out.println("Elcuadrado de su numero es :"+Math.pow(numero,2));

            }catch(InputMismatchException ex){
                System.out.println("Numero entero no valido");
            }catch(Exception ex){
                System.out.println("Error descnocido");
                valido=true;
            }finally{
                teclado.close();
        }
    }while(valido==false);
        System.out.println("Gracias por usar nuestro software");
    }
}
