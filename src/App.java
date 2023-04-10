import java.util.Scanner;

/* Nome do Aluno: Lukas santos rufino
* RA: 12723134472
* Data: 08/04/2023 */

public class App {

  public static void main(String[] args) {
    System.out.println("Digite uma temperatura, em Farenheit: ");
    float farenheit = new Scanner(System.in).nextFloat();
    double celsius = (5 * (farenheit - 32)) / 9;
    System.out.printf("A temperatura, em Celsius, eh de: %.2f °C", celsius);
  }

}