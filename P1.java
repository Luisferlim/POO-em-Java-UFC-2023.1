import java.util.Scanner;

public class P1 {

  public void run() {
    // escreva o código da resposta aqui.
    Scanner nuns = new Scanner(System.in);

    System.out.println("Digite o primeiro numero: ");
    int num1 = nuns.nextInt(); // lendo numero 1

    System.out.println("Digite o primeiro numero: ");
    int num2 = nuns.nextInt(); // lendo numero 2

    if (num1 > num2) {
      System.out.println(num1);
    } else if (num2 > num1) {
      System.out.println(num2);
    } else {
      System.out.println("ERROR 703 - numeros iguais");
      run();
    }
  }
}