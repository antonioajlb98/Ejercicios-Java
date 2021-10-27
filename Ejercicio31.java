import java.util.Scanner;
    class Ejercicio31{
        public static void main(String[] args){
            int n=0;
            Scanner  sc=new Scanner(System.in);

            System.out.println("Introduce un numero");
            n=sc.nextInt();


                while(n<=0){
                    System.out.println("Introduce un numero positivo");
                    n=sc.nextInt();
                }

                while(n>=0){
                    System.out.println(n);
                    n--;
                }
            sc.close();    
        }
    }
