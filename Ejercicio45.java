import java.util.InputMismatchException;
import java.util.Scanner;
class Ejercicio45{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        boolean valido=false;


        do{
            try{
                System.out.println("Introduce un numero entre 1 y 12");
                i=sc.nextInt();
                valido=true;

            }catch(InputMismatchException ex){
                System.out.println("Numero entero no valido");
                sc.next();
            }
        }while(!valido || i <=1 || i>12);
        
        for(int a=0;a<10;a++){
            System.out.println(i + " x "+a+ " = " + i*a);
        }
        sc.close();
    }
}