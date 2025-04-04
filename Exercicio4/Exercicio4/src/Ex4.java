public class Ex4 {
    public static void main(String[] args) {
        double populacaoA = 80000, populacaoB = 200000;
        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA = populacaoA + (populacaoA * 0.03);
            populacaoB = populacaoB + (populacaoB * 0.015);
            anos += 1;
        }
        System.out.println("");
        System.out.println("São necessários " + anos + " anos para que am população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.");
        System.out.println("");
    }
}
