import java.util.Scanner;

public class Sueldo {
    public static void main(String[] args) {
        int sueldo;
        int antiguedad;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce sueldo:\n ");
        sueldo = teclado.nextInt();
        System.out.println("Introduce antiguedad:\n ");
        antiguedad = teclado.nextInt();
        teclado.close();

        int aumento = (sueldo * 20 / 100);
        int aumentoa = (sueldo * 5 / 100); 
        int sueldofinal = (sueldo + aumento);
        int sueldofinala = (sueldo + aumentoa);

        if (sueldo >= 1000) {
            System.out.println("Su sueldo es " + sueldo);
        }
            if (sueldo < 1000 && antiguedad >= 10) {
                System.out.println("Su sueldo inicial es " + sueldo + "€" + " Su aumento es de " + aumento + "€" + " Su sueldo final es " + sueldofinal + "€");
            } else if (sueldo < 1000 && antiguedad < 10) {
                System.out.println("Su sueldo inicial es " + sueldo + "€" + " Su aumento es de " + aumentoa + "€" + " Su sueldo final es " + sueldofinala + "€");
            }

    }

}