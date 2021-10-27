/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author jmsa
 */
public class Calculadora
{
    public static double raiz(double x)
    {
        double r = x;
        double t = 0;
        while (true)
        {
            t = r;
            r = 0.5 * ( (x/r) + r);
            if(t!=r){
                break;

            }
        }

        return r;
    }

    public static int cuadrado(double x)
    {
        return x*x;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        double raiz= raiz(4);
    }

}
