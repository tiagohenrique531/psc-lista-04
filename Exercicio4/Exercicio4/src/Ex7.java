import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] nome = {"primeiro","segundo","terceiro","quarto","quinto"};
        int[] numero = new int[5];
        int maiorN =0 ;

        for(int x = 0; x <  5; x++) {
            System.out.print("\nDigite o " + nome[x] + " número: ");
            numero[x] = s.nextInt();
            if (x == 0) {
                maiorN =  numero[x];
            }

            if (numero[x] > maiorN) {
                maiorN = numero[x];
            }
        }

        System.out.println("\nO maior número é " + maiorN);
    }
}
