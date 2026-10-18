import model.Carro;
import model.Moto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Bem-vindo ao OficinaPro ---");
        System.out.println("O que você deseja cadastrar?");
        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite a placa: ");
        String placa = sc.nextLine();
        System.out.println("Digite a marca: ");
        String marca = sc.nextLine();
        System.out.println("Digite o modelo: ");
        String modelo = sc.nextLine();
        System.out.println("Digite o ano: ");
        int ano = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite a quilometragem: ");
        int quilometragem = sc.nextInt();
        sc.nextLine();
        switch (opcao){
            case 1:
                System.out.println("Fale quantas portas tem o seu carro:");
                int qtdPortas = sc.nextInt();
                sc.nextLine();
                System.out.println("O carro possui ar condicionado? (sim/nao)");
                String respostaAr = sc.nextLine();
                boolean arCondicionado = respostaAr.equalsIgnoreCase("sim");
                Carro carro = new Carro(placa, marca, modelo, ano, quilometragem, qtdPortas, arCondicionado);
                System.out.println("O valor da mão de obra para este carro é: R$ " + carro.calcularTaxaMaoDeObra());
                break;
            case 2:
                System.out.println("Quantas cilindradas tem a sua moto?");
                int cilindradas = sc.nextInt();
                Moto moto = new Moto(placa,modelo,marca,ano,quilometragem,cilindradas);
                System.out.println("O valor da mão de obra para esta moto é: R$ " + moto.calcularTaxaMaoDeObra());
        }

    }
}

