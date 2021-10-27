import java.util.Scanner;
    class Ejercicio34{
        public static void main(String[] args) {
            int edad=1; 
            int suma=0;
            int n=-1;
            int e=0;
            double media;
            
            Scanner sc=new Scanner(System.in);

            while(edad>0){
                    if(edad>18){
                        e++;
                    }
                System.out.println("Introduce edad");
                edad= sc.nextInt();
                suma=edad+suma;
                n++;
            }
            media=(double)suma/(double)n;
            System.out.println("La suma de las edades es " + suma + " El total de alumnos es " + n + " La media aritmetica es " + media + " Y son mayores de edad " + e + " alumnos");
            sc.close();
        }
    }