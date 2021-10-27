import java.util.Scanner;
    class Ejercicio40{
        public static void main(String[] args) {
            int opcion; int a; int b;

            Scanner sc = new Scanner(System.in);

            System.out.println("Introduce un numero");
            a= sc.nextInt();
            System.out.println("Introduce otro numero");
            b= sc.nextInt();


            do{
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. multiplica");
                System.out.println("4. Divide");
                System.out.println("5. Salir");
                System.out.println("Elija opción");

                opcion= sc.nextInt();

                switch (opcion){
                    case 1:
    
                        System.out.println("La suma es " + (a+b));
                        break;
    
                    case 2:
    
                        System.out.println("La resta es " + (a-b));
                        break;
    
                    case 3:
    
                        System.out.println("La multiplicación es " + (a*b));
                        break;
                    
                    case 4: 
                    
                    if(b==0){
                        System.out.println("La división no es posible realizarla");
                        
                    }else{
                        System.out.println("La división es " + (a/b));
                        break;
    
                    }
                    
                    case 5:
    
                        System.out.println("Ha elegido salir");
                        break;
                    
                    default: 
                    System.out.println("Error elija una opcion correcta");

                }
            }while(opcion!=5);
            sc.close();
        }
    }