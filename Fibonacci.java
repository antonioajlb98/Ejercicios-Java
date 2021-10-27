class Fibonacci{
    public static void main(String[] args) {
        int aux=0;
        int a=1;
        int resultado=0;
        for(int i=0;i<10;i++){
            System.out.println(resultado);
            aux=resultado;
            resultado=a+resultado;
            a=aux; 
        }
    }
}