import java.util.InputMismatchException;
import java.util.Scanner;
class Ejercicio47{
    public static void main(String[] args) {
        int notas=0;
        float nota=0;
        float mayor=0;
        float menor=10;
        boolean valido=false;
        Scanner sc = new Scanner(System.in);
        float suma=0;
        do{
            try{
                System.out.println("Introduce el numero de notas");
                notas=sc.nextInt();
                valido=true;

            }catch(InputMismatchException ex){
                System.out.println("Numero entero no valido");
                sc.next();

            }
        }while(!valido || notas<=0);

            for(int i=0;i<notas;i++){
            do{
                try{
                    System.out.println("Introduce nota");
                    nota=sc.nextFloat();
    
                }catch(InputMismatchException ex){
                    System.out.println("Numero entero no valido");
                    sc.next();
    
                }
            }while(!valido || nota<0 || nota>10);
            
                if(nota>mayor){
                    mayor=nota;
                }   
                if(nota<menor){
                    menor=nota;
                }
                suma+=nota;
                
        }

    System.out.println("La nota mayor es " +mayor+ " La nota menor es " +menor+ " La media es " +(suma/notas));
    sc.close();
}
}