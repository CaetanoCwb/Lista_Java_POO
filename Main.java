import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá!\n\nDigite 2 numeros");

        System.out.printf("Numero 1: ");
        float num1 = Float.parseFloat(leitor.nextLine());

        System.out.printf("Numero 2: ");
        float num2 = Float.parseFloat(leitor.nextLine());

        Calculadora calc = new Calculadora(num1, num2);

        calc.soma();
        calc.subtrai();
        calc.multiplica();
        calc.divide();

    }

}
