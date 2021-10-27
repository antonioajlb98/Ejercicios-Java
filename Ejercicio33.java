import java.util.Scanner;
    class Ejercicio33{
        public static void main(String[] args){
            int n=1;

            Scanner sc=new Scanner(System.in);
            
            while(n!=0){
                System.out.println("Introducir un numero");
                n=sc.nextInt();
                    if(n%2==0 && n>0){
                    System.out.println("El numero es par, positivo y su cuadrado es " + (n*n));
                    }
                    else if(n%2==0 && n<0){
                        System.out.println("El numero es par, negativo y su cuadrado es " + (n*n));
                    }
                    else if(n%2==1 && n>0){
                        System.out.println("El numero es impar, positivo y su cudarado es " + (n*n));
                    }
                    else if(n%2==1 && n<0){
                        System.out.println("El numero es impar, negativo y su cuadrado es " + (n*n));
                    }                
            }
            if(n==0){
                System.out.println("El programa finalizó");
            }
            sc.close();
                       
        }
    }