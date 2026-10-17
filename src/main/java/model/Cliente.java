package model;
// Classe para cadastrar o cliente e o tipo de veiculo que ele trouxe para oficina
public class Cliente {
    private String nome;
    private String telefone;
    private String cpf;
    private Veiculo veiculo;
    //Construtor para cadastrar o Cliente e seus dados
    public Cliente(String nome, String telefone, String cpf, Veiculo veiculo) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.veiculo = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
