import java.util.Scanner;
class Ejercicio30{
    public static void main(String[] args) {
        int n=0, c=0, suma=0;

        Scanner sc = new Scanner(System.in);

        while(n<=0){
            System.out.println("Introduce un numero positivo");
            n=sc.nextInt();
            
            if(n<=0){
                System.out.println("Error, el numero debe ser positivo");
            }

                while(c<=n){
                    suma=suma+c;
                    c++;
                }
            System.out.println(suma);

        }
        sc.close();      
        }
        


    }