import java.util.Scanner;

public class P4 {

  public void run() {
    // escreva o código da resposta aqui.
    Scanner scanf = new Scanner(System.in);
    System.out.println("digite o parametro a");
    double a = scanf.nextDouble();
    System.out.println("digite o parametro b");
    double b = scanf.nextDouble();
    System.out.println("digite o parametro c");
    double c = scanf.nextDouble();

    // algoritmo para segundo grau
    double x1, x2;
    double delta = (b * b) - 4 * a * c;
    x1 = (- b + Math.sqrt(delta)) / 2*a;
    x2 = (- b - Math.sqrt(delta)) / 2*a;

    
     if (delta == 0)
      {
        System.out.println("a equacao possui duas raizes reais iguais com valor: ");
        System.out.print(x1);
      } else if(delta > 0)
      {
        System.out.println("a equacao possui duas raizes reais com valores: ");
        System.out.print(x1);
        System.out.print(" e ");
        System.out.print(x2);
      }
      else
      {
        System.out.println("a equacao nao possui raizes reais ;/");
      }
       
  }
}