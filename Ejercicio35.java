import java.util.Scanner;
    class Ejercicio35{
        public static void main(String[] args) {
            int n=1;
            int aux=0;
            Scanner sc=new Scanner(System.in);

            while(n>0){
                System.out.println("Introduce un numero");
                n=sc.nextInt();
                if(n>aux){
                    aux=n;
                }
           }if(n==0){
               System.out.println("El mayor numero que has introducido es " + aux);
           }
           sc.close();
        }
    }