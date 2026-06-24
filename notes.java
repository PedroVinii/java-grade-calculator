import java.util.Scanner;

public class notes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nota A1");
        double a1 = input.nextDouble();

        System.out.println("Nota A2");
        double a2 = input.nextDouble();

        System.out.println("Nota A3");
        double a3 = input.nextDouble();

        System.out.println("Nota A4");
        double a4 = input.nextDouble();

        if (a1 < 0 || a1 > 10 ||
                a2 < 0 || a2 > 10 ||
                a3 < 0 || a3 > 10 ||
                a4 < 0 || a4 > 10) {

            System.out.println("Uma ou mais notas são inválidas.");
            input.close();
            return;
        }

        double total = a1 + a2 + a3 + a4;

        double media = total / 4;
        System.out.printf("Sua Nota Final É %.2f%n", media);

        if (media >= 6) {
            System.out.println("Aprovado");
        } else if (media >=4) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        input.close();
    }
}
