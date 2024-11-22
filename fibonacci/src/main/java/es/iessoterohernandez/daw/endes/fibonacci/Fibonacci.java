package es.iessoterohernandez.daw.endes.fibonacci;

public class Fibonacci {
    
	  int num1 = 1;
	  int num2 = 1;
	  int fibo = 0;
	  int max;
	  
	  public void indicarMaximo(int nuevoMaximo) {
	  max = nuevoMaximo;
	  
	  System.out.print(num1 + " ");
	  for (int i = 0; i < max; i++) {
		  fibo = num1 + num2;
		  num1 = num2;
		  num2 = fibo;
		  System.out.print(num1 + " ");
	  }
  }
}
