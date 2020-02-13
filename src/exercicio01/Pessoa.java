package exercicio01;

public class Pessoa {
    private String nome;
    private int idade;
    private int energia;

    public Pessoa(String nome, int idade, int energia) {
        this.nome = nome;
        this.idade = idade;
        this.energia = energia;
    }

    public void comer(){
        System.out.println("Esta pessoa acabou de comer");
    }
    public void andar(){
        System.out.println("Esta pessoa está andando");
    }
}
