import model.Carro;
import model.Cliente;
import model.Moto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Oi tudo bem? Pode dizer seu nome para começarmos o seu antendimento?");
        String nome = sc.nextLine();
        System.out.println("Agora o seu telefone por favor");
        String telefone = sc.nextLine();
        System.out.println("Por último o seu CPF para cadastrarmos aqui no sistema");
        String cpf = sc.nextLine();
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
        Cliente cliente = null;
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
                cliente = new Cliente(nome, telefone, cpf, carro);
                break;
            case 2:
                System.out.println("Quantas cilindradas tem a sua moto?");
                int cilindradas = sc.nextInt();
                Moto moto = new Moto(placa,modelo,marca,ano,quilometragem,cilindradas);
                System.out.println("O valor da mão de obra para esta moto é: R$ " + moto.calcularTaxaMaoDeObra());
                cliente = new Cliente(nome, telefone, cpf, moto);
                break;
            default:
                System.out.println("Opção inválida! Nenhum veículo foi cadastrado.");
        }
        if (cliente != null) {
            System.out.println("\n--- RESUMO DA ORDEM DE SERVIÇO ---");
            System.out.println("Cliente: " + cliente.getNome());
            System.out.println("Veículo: " + cliente.getVeiculo().getModelo() + " (" + cliente.getVeiculo().getPlaca() + ")");
            System.out.println("Valor da Mão de Obra: R$ " + cliente.getVeiculo().calcularTaxaMaoDeObra());
        }



    }
}

