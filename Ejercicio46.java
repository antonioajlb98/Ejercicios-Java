import java.util.Scanner;
import java.util.InputMismatchException;
class Ejercicio46{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valido=false;
        int i=1;
        int a=0;
        
        
        do{
            try{
                System.out.println("Introduce un numero mayor que 0");
                i=sc.nextInt();
                valido=true;

            }catch(InputMismatchException ex){
                System.out.println("Numero entero no valido");
                sc.next();
            }
        }while(!valido || i > 0);
        for(a=1;a<i;a++){
            if(i%a==0){
                System.out.println(i);
            }
            sc.close();
        }
    }
}