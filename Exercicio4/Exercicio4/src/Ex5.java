import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double populacaoA, populacaoB,taxaA, taxaB;
        int anos = 0;
        System.out.print("Informe a quantidade da população A: ");
        populacaoA = s.nextDouble();
        System.out.print("Informe a quantidade da população B: ");
        populacaoB = s.nextDouble();
        System.out.print("Informe a taxa de crescimento anual do país A: ");
        taxaA = s.nextDouble();
        System.out.print("Informe a taxa de crescimento anual do país B: ");
        taxaB = s.nextDouble();

        if(populacaoA < populacaoB && taxaA > taxaB) {
            while (populacaoA < populacaoB) {
                populacaoA = populacaoA + (populacaoA * taxaA);
                populacaoB = populacaoB + (populacaoB * taxaB);
                anos += 1;
            }
            System.out.println("");
            System.out.println("São necessários " + anos + " anos para que am população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.");
            System.out.println("");
        }
    }
}
