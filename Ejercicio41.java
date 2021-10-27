import java.util.Scanner;
 class Ejercicio41{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0;
        int opcion;
        double factorial=1;
        int i=1;
        int fibonacci=1;
        int aux;
        int a=0;

        while(numero<1 || numero>15){
            System.out.println("Introduce un numero");
            numero=sc.nextInt();
            if(numero<1 || numero>15){
                System.out.println("Error, Introduce un numero entre 1 y 15");
            }
        }
                
            do{
                System.out.println("0 para salir del programa");
                System.out.println("1 para factorial del numero");
                System.out.println("2 Tabla de multiplicar del numero");
                System.out.println("3 serie de fibonacci");
                System.out.println("4 Cambiar el numero");

                opcion= sc.nextInt();



                switch (opcion){
                    case 0:

                        System.out.println("Ha elegido salir del programa");
                        break;

                    case 1:

                        while(numero!=0){
                            factorial=factorial*numero;
                            numero--;
                        }
                            System.out.println("El factorial del numero es " + factorial);
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

                    case 4:
                    
                        System.out.println("Introducir nuevo numero");
                        numero=sc.nextInt();

                            if(numero<1 || numero>15){
                                System.out.println("Error, Introduce un numero entre 1 y 15");
                            numero=sc.nextInt();
                        }
                        break;
                    }

            }while(opcion!=0);
    
            sc.close(); 
     
    }
    
}