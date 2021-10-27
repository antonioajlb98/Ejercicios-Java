import java.util.Scanner;
import java.util.InputMismatchException;
class Ejercicio50_5{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        boolean valido=false;
        int numero=0;
        int j=1;
        int i=1;

        do{
            try{
                System.out.println("Introduce un valor entero");
                numero=sc.nextInt();
                valido=true;

            }catch(InputMismatchException ex){
                System.out.println("Numero entero no valido");
                sc.next();

            }
        }while(!valido || numero <3 || numero>10);

            for(j=1;j<=numero;j++){
                for(i=1;i<=(numero-j);i++);
                System.out.print(" ");
           for(i=1;i<=j;i++){
               System.out.print(i);
           }
           for(i-=j;i>=1;i--){
               System.out.println("");
           }
    }       
        
}
}
