
    import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nome;
        
        char sexo, estadoCivil;
        int idade;
        float salario;
       System.out.print("Informe o seu nome: ");
       nome = s.next();
       System.out.print("\nInforme a sua idade: ");
       idade = s.nextInt();
       System.out.print("\nInforme o seu sálario: ");
       salario = s.nextFloat();
       System.out.print("\nInforme o seu sexo: (f/m): ");
       sexo = s.next().charAt(0);;
       System.out.print("\nInforme o seu Estado Civil: (s/c/v/d): ");
       estadoCivil = s.next().charAt(0);;

       if(nome.length() > 3) {
            System.out.println(nome + " Válido");
       } else {
            System.out.println(nome + " Inválido");
       }

       if (idade >= 0 && idade <= 150) {
            System.out.println(idade + " Válido");
       } else {
            System.out.println(idade + " Inválido");
       }

       if (salario > 0f ) {
            System.out.println(salario + " Válido");
       } else {
            System.out.println(salario + " Inválido");
       }  
       
       if (sexo == 'f' || sexo == 'm' || sexo == 'F' || sexo == 'M') {
            System.out.println(sexo + " Válido");
       } else {
            System.out.println(sexo + " Inválido");
       }

       if (estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd') {
            System.out.println(estadoCivil + " Válido");
       } else {
            System.out.println(estadoCivil + "Inválido");
       }
    }
}


