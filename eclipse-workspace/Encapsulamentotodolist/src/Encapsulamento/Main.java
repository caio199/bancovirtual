package Encapsulamento;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Criando um usuário
        Usuario usuario = new Usuario("João", "joao@example.com", "senha123");

        // Criando algumas tarefas
        Tarefa tarefa1 = new Tarefa(1, "Fazer compras", LocalDateTime.now(), null, "Alta", "Em andamento");
        Tarefa tarefa2 = new Tarefa(2, "Pagar contas", LocalDateTime.now(), null, "Média", "Pendente");

        // Imprimindo informações das tarefas
        System.out.println("Tarefas do usuário " + usuario.getNome() + ":");
        System.out.println("ID: " + tarefa1.getId());
        System.out.println("Descrição: " + tarefa1.getDescricao());
        System.out.println("Prioridade: " + tarefa1.getPrioridade());
        System.out.println("Status: " + tarefa1.getStatus());
        System.out.println("-----------------------------");
        System.out.println("ID: " + tarefa2.getId());
        System.out.println("Descrição: " + tarefa2.getDescricao());
        System.out.println("Prioridade: " + tarefa2.getPrioridade());
        System.out.println("Status: " + tarefa2.getStatus());
        System.out.println("-----------------------------");
    }
}
