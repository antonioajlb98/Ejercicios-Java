import java.util.Scanner;
    class Ejercicio32{
        public static void main(String[] args) {

            int n=5; int i=1; int mult=1;

            Scanner sc=new Scanner(System.in);

            System.out.println("Introduce un numero");
            n=sc.nextInt();

            while(i<=n){
                mult=mult*i;
                i++;
            }
            System.out.println(mult);

            sc.close();
        }
    
}