import java.util.Scanner;
import java.util.InputMismatchException;

class Ejercicio41bueno{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0;
        boolean valido=false;
        int opcion=0;
        int fibonacci=1, aux, a=0, i=1, factorial=1;

        do{
            try{
                System.out.println("Introduce un valor entero");
                numero=sc.nextInt();
                valido=true;

            }catch(InputMismatchException ex){
                System.out.println("Numero entero no valido");
                sc.next();

            }
        }while(!valido || numero <=0 || numero>15);
        do{
            try{


                System.out.println("----MENU----");
                System.out.println("Pulsa 0 para salir");
                System.out.println("Pulsa 1 para Factorial");
                System.out.println("Pulsa 2 para tabla de multiplicar");
                System.out.println("Pulsa 3 para suesion de fibonacci");
                System.out.println("Pulsa 4 para cambiar de numero");
                System.out.println("Introduzca opcion");
                opcion=sc.nextInt();

                switch(opcion){
                    case 0: System.out.println("Ha elegido salir");
                    break;


                    case 1: 
                        while(numero!=0){
                            factorial=factorial*numero;
                            numero--;
                    }


                    break;

                    case 2: 
                        while(i<=10){
                            System.out.println(i + "*" + numero + "=" + i*numero);
                            ++i;
                        }

                    break;

                    case 3: 
                        while(numero>=fibonacci){
                            System.out.println("La sucesion es "+ fibonacci);
                            aux=fibonacci;
                            fibonacci=a+fibonacci;
                            a=aux;
                        } 

                    break;

                    case 4: System.out.println("Introduzca nuevo numero");
                            numero=sc.nextInt();
                    break;

                    default:System.out.println("Opcion incorrecta");
                }
            }catch(InputMismatchException ex){}    

        }while(opcion!=0);
        sc.close();






    }
}