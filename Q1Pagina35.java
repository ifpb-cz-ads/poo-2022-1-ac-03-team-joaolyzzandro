import java.util.Scanner;
public class Q1Pagina35 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe sua idade: ");
        int idade = input.nextInt();
        input.close();

        String mensagem = (idade < 16 ? "Nao pode votar": (idade < 18 || idade > 65 ? "Votar nao eh obrigatorio": ("Votar eh obrigatorio")));

        System.out.println(mensagem);
    }
}