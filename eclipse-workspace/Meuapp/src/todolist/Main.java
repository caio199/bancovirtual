package todolist;

public class Main {
    public static void main(String[] args) {
        // Criando um usuário
        Usuario usuario = new Usuario("João", "joao@example.com", "senha123");

        // Utilizando o objeto usuario
        System.out.println("Nome do usuário: " + usuario.getNome());
    }
}
