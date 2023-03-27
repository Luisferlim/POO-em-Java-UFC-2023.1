import java.util.Scanner;

public class P3 {

  public void run() {
    // escreva o código da resposta aqui.
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o primeiro numero: ");
    float n1 = scan.nextFloat();
    System.out.println("Digite o segundo numero numero: ");
    float n2 = scan.nextFloat();

    System.out.println("selecione a opc: '+','-','*','/'");
    char opc = scan.next().charAt(0);

    switch (opc) {
      case '+':
        System.out.print(n1 + n2);
        break;
      case '-':
        System.out.print(n1 - n2);
        break;
      case '*':
        System.out.print(n1 * n2);
        break;
      case '/':
        System.out.print(n1 / n2);
        break;
      default:
        System.out.println("ERRO 21313, retornando");
        run();

    }
  }

}