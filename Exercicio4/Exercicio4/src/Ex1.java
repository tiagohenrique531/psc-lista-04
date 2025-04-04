import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int nota = 0;
        System.out.println("Digite um nota entre 0 e 10: ");
        nota = s.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("Valor inválido");
            System.out.println("Digite um nota entre 0 e 10: ");
            nota = s.nextInt();
        }

        System.out.println("Valor válido");
        

    }
}
