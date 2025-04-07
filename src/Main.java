import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int option;
        Tributos tributos;

        do {
            System.out.println("Escolha o produto que deseja calcular o tributo");
            System.out.println("1 - Alimentação");
            System.out.println("2 - Saúde e Bem Estar");
            System.out.println("3 - Vestuário");
            System.out.println("4 - Cultura");
            System.out.println("5 - Sair do Programa");
            option = scanner.nextInt();
            switch(option){
                case 1 : tributos = tributosAlimentacao(digitaPreco());
                break;
                case 2:  tributos = tributosSaude(digitaPreco());
                break;
                case 3: tributos = tributosVestiario(digitaPreco());
                break;
                case 4: tributos = tributosCultura(digitaPreco());
                break;
                case 5: continue;
                default :
                    System.out.println("Opção Invalida");
                    continue;
            }
            System.out.println("O preco com imposto é "+ tributos.calculaImposto());
        }while(option != 5);
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