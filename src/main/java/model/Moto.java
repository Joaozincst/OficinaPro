package model;

// classe filha moto para coisas especificas de moto com o super para sobrepor o de veiculo para ter características próprias da moto
public class Moto extends Veiculo{
    private int cilindradas;
    public Moto(String placa, String modelo, String marca, int ano, int quilometragem,int cilindradas) {
        super(placa, modelo, marca, ano, quilometragem);
        this.cilindradas = cilindradas;
    }
// taxa de 70 reais de mão de obra pra moto e se a cilindrada for mais de 250 bote mais 50 reais de taxa
    @Override
    public double calcularTaxaMaoDeObra() {
        double taxa = 70.00;
        if(this.cilindradas>250){
            taxa += 50;
        }
        return taxa;
    }
}
