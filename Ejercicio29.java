import java.util.Scanner;
    class Ejercicio29{
        public static void main(String[] args) {
            int n=0;
            int m=0;
            int aux;

            Scanner sc = new Scanner(System.in);

            System.out.println("Introduce un numero\n ");
            n = sc.nextInt();

            System.out.println("Introduce otro numero\n" );
            m = sc.nextInt();
            sc.close();

            if(m>n){
            aux=m;
            m=n;
            n=aux;
            }

            while(n>m){
                if(n%2==1){
                System.out.println(n);
                }
            n--;
            }
            
        }
    }
