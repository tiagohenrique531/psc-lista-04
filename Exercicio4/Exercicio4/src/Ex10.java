import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1,n2;
        System.out.print("Digite o primeiro número: ");
        n1 = s.nextInt();
        System.out.print("\nDigite o segundo número: ");
        n2 = s.nextInt();
        if (n1 > n2) {
            System.out.println("Os números que estão intervalo de " + n2 + " e "+  n1 + " é: ");
            while (n2 < n1) {
                n2++;
                System.out.print(" " + n2);
            }
            
        } else {
            System.out.println("Os números que estão intervalo de " + n1 + " e "+  n2 + " é: ");
            
            while (n1 < n2) {
                n1++;
                System.out.print(" " + n1);
            }
        }
        
    

    }
}
