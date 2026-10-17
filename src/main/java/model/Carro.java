package model;
// classe filha carro para coisas especificas de carro com o super para sobrepor o de veiculo para ter características próprias de carro
public class Carro extends Veiculo {
    private  int qtdPortas;
    private boolean arCondicionado;
    public Carro(String placa, String modelo, String marca, int ano, int quilometragem,int qtdPortas, boolean arCondicionado) {
        super(placa, modelo, marca, ano, quilometragem);
        this.qtdPortas = qtdPortas;
        this.arCondicionado = arCondicionado;
    }
    // taxa adicional para caso o carro tenha ar condicionado
    @Override
    public double calcularTaxaMaoDeObra() {
        double taxa = 100.00;
        if(this.arCondicionado){
            taxa += 30;
        }
        return taxa;
    }


    }

