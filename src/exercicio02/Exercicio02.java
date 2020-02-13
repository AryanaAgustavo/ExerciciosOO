package exercicio02;

public class Exercicio02 {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(10, 20);
        Triangulo triangulo2 = new Triangulo(30, 15);
        Triangulo triangulo3 = new Triangulo(50,100);

        System.out.println(triangulo1.area());
        System.out.println(triangulo2.area());
        System.out.println(triangulo3.area());
    }
}
