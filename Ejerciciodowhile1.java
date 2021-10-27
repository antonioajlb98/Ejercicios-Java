import java.util.Scanner; 
    class Ejerciciodowhile1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un número");
        int n1=s.nextInt();
        System.out.println("Introduce otro número");
        int n2=s.nextInt();

        if(n1>n2){
            int aux=n1;
            n1=n2;
            n2=aux;
        }
        do{
            if(n1 % 2 == 1){
                System.out.println(n1);
            }
        }while(n1<=n2);
        s.close();
    }
}