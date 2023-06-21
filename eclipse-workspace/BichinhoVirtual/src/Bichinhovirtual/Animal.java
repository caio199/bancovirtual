package Bichinhovirtual;

public class Animal {
    private String nome;
    private String classe;
    private String familia;
    private int idade;
    private boolean estado;
    private int caloria;
    private int forca;

    public Animal(String nome, String classe, String familia) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = 0;
        this.estado = true;
        this.caloria = 10;
        this.forca = 10;
        System.out.println("O animal se chama " + nome + " é da classe " + classe + " da família " + familia + ".");
        System.out.println("O animal possui força de " + forca + ", caloria de " + caloria + " e idade de " + idade + ".");
    }

    public void nascer() {
        // Implementação do método nascer
    }

    public void morrer() {
        // Implementação do método morrer
    }

    public void comer() {
        // Implementação do método comer
    }

    public void correr() {
        // Implementação do método correr
    }

    public void dormir() {
        // Implementação do método dormir
    }
}
