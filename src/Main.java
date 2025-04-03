import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        do {
            System.out.println("Escolha o produto que deseja calcular o tributo");
            System.out.println("1 - Alimentação");
            System.out.println("2 - Saúde e Bem Estar");
            System.out.println("3 - Vestuário");
            System.out.println("4 - Cultura");
            System.out.println("5 - Sair do Programa");
            int option = scanner.nextInt();
            Tributos tributos;
            if (option == 1)
                tributos = tributosAlimentacao(digitaPreco());
            else if (option == 2)
                tributos = tributosSaude(digitaPreco());
            else if (option == 3)
                tributos = tributosVestiario(digitaPreco());
            else if (option == 4)
                tributos = tributosCultura(digitaPreco());
            else if (option == 5)
                break;
            else {
                System.out.println("Opção Invalida");
                continue;
            }

            System.out.println("O preco com imposto é "+ tributos.calculaImposto());

        }while(true);
    }

    private static double digitaPreco(){

        System.out.print("Digite o Preço do Produto:");
        return scanner.nextDouble();


    }

    private static Tributos tributosCultura(double preco) {
        return new Cultura(preco);
    }

    private static Tributos tributosVestiario(double preco) {
        return new Vestiario(preco);
    }

    private static Tributos tributosSaude(double preco) {
        return new Saude(preco);
    }

    private static Tributos tributosAlimentacao(double preco) {

        return new Alimentacao(preco);
    }
}