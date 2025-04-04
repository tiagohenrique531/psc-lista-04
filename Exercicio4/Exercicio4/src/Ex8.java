import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);

        String[] nome = {"primeiro","segundo","terceiro","quarto","quinto"};
        int[] numero = new int[5];
        double soma = 0;
        double media;

        for(int x = 0; x <  5; x++) {
            System.out.print("\nDigite o " + nome[x] + " número: ");
            numero[x] = s.nextInt();
            soma = soma + numero[x];
        }
        media = soma / 5;
        System.out.println("\nA soma dos núemros é " + soma);
        System.out.println("A média dos núemros é " + media);
    }
}
