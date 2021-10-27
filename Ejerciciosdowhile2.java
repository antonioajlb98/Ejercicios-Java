import java.util.Scanner;
    class Ejerciciodowhile2{
        public static void main(String[] args) {
            int x=0;
            Scanner s = new Scanner(System.in);

        do{
            System.out.println("Introduce un número");
            x = s.nextInt();
        }while(x<=0);

        do{
            System.out.println(x--);
        }while (x>=0);
        s.close();
        }
    }