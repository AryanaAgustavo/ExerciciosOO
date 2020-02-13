package exercicio04;

public class Cliente extends Pessoa {
    private String CPF;


    public Cliente(String nome, int idade, String cidadeDeNascimento, String CPF) {
        super(nome, idade, cidadeDeNascimento);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void exibirDados() {
       // System.out.println((this.getNome(), this.getIdade());
    }
}
