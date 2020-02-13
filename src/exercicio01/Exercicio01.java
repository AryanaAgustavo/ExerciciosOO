package exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Aryana", 22, 100);
        Pessoa pessoa2 = new Pessoa("Maria", 20, 100);
        Pessoa pessoa3 = new Pessoa("Jose", 30, 100);

        pessoa1.andar();
        pessoa1.comer();
        pessoa2.andar();
        pessoa2.comer();
        pessoa3.andar();
        pessoa3.comer();
    }
}
