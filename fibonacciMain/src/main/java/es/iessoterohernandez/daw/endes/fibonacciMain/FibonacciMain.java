package es.iessoterohernandez.daw.endes.fibonacciMain;
import es.iessoterohernandez.daw.endes.fibonacci.*;
import java.util.*;

public class FibonacciMain 
{
    public static void main( String[] args )
    {
    	Fibonacci fb = new Fibonacci();
    	Scanner sc = new Scanner(System.in);
        System.out.println("Serie fibonacci.");
        
        System.out.print("Inserte un numero maximo para la serie: ");
        fb.indicarMaximo(sc.nextInt());
        System.out.println("");
    }
}
