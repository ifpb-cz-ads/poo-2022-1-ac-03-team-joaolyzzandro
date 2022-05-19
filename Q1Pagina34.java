
/** 
 * 1. Faça um programa que dada a idade de uma pessoa verifique sua classe eleitoral:
 * menor que 16 anos não pode votar;
 * com 16 ou 17 anos ou mais que 65 anos, votar é facultativo;
 * entre 18 e 65 anos (inclusive), votar é obrigatório.
*/
import java.util.Scanner;

public class Q1Pagina34 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = input.nextInt();
        input.close();

        String mensagem = (idade < 16 ? "Nao pode votar"
                : (idade < 18 || idade > 65 ? "Votar nao eh obrigatorio" : ("Votar eh obrigatorio")));

        System.out.println(mensagem);
    }
}