import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         String nome,senha;
        System.out.print("Informe seu nome de usuário: ");
        nome = s.next();
        System.out.print("\nInforme a sua senha de usuário: ");
        senha = s.next();
        System.out.println(nome + senha);
        
        while (nome.equals(senha)) {
            System.out.println("Erro! Você digitou a senha e o nome iguais");
            System.out.println("Digite novamente");
            System.out.print("Informe seu nome de usuário: ");
            nome = s.next();
            System.out.print("\nInforme a sua senha de usuário: ");
            senha = s.next(); 
        }
    }
}
