
/**
 * 5. Implemente um programa que recebe um número de 1 a 7 e imprime o dia da semana correspondente.
*/
import java.util.Scanner;

public class Q5Pagina44 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 7: ");
        int dia = input.nextInt();
        input.close();

        String mensagem;

        switch (dia) {
            case 1:
                mensagem = "Domingo";
                break;
            case 2:
                mensagem = "Segunda";
                break;
            case 3:
                mensagem = "Terca";
                break;
            case 4:
                mensagem = "Quarta";
                break;
            case 5:
                mensagem = "Quinta";
                break;
            case 6:
                mensagem = "Sexta";
                break;
            case 7:
                mensagem = "Sabado";
                break;
            default:
                mensagem = "Dia invalido";
        }

        System.out.println(mensagem);
    }
}
