package Bancovirtual;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Registro registro = new Registro();
        Scanner scanner = new Scanner(System.in);
        
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Excluir Cliente");
            System.out.println("4 - Sair do Programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    cadastrarCliente(registro, scanner);
                    break;
                case 2:
                    listarClientes(registro);
                    break;
                case 3:
                    excluirCliente(registro, scanner);
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
    
    private static void cadastrarCliente(Registro registro, Scanner scanner) {
        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.next();
        
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.next();
        
        Cliente cliente = new Cliente(cpf, nome);
        
        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.next();
        
        System.out.print("Digite a agência da conta: ");
        String agencia = scanner.next();
        
        System.out.print("Digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();
        
        Conta conta = new Conta(numeroConta, agencia, saldo);
        cliente.adicionarConta(conta);
        
        System.out.print("Digite o CEP do endereço: ");
        String cep = scanner.next();
        
        System.out.print("Digite o logradouro do endereço: ");
        String logradouro = scanner.next();
        
        System.out.print("Digite o número do endereço: ");
        int numero = scanner.nextInt();
        
        Endereco endereco = new Endereco(cep, logradouro, numero);
        cliente.setEndereco(endereco);
        
        System.out.print("Digite a quantidade de telefones: ");
        int quantidadeTelefones = scanner.nextInt();
        
        for (int i = 0; i < quantidadeTelefones; i++) {
            System.out.print("Digite o DDD do telefone: ");
            String ddd = scanner.next();
            
            System.out.print("Digite o número do telefone: ");
            String numeroTelefone = scanner.next();
            
            Telefone telefone = new Telefone(ddd, numeroTelefone);
            cliente.adicionarTelefone(telefone);
        }
        
        registro.cadastrarCliente(cliente);
        
        System.out.println("Cliente cadastrado com sucesso!");
    }
    
    private static void listarClientes(Registro registro) {
        System.out.println("===== CLIENTES CADASTRADOS =====");
        
        for (Cliente cliente : registro.listarClientes()) {
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Nome: " + cliente.getNome());
            
            System.out.println("Contas:");
            for (Conta conta : cliente.getContas()) {
                System.out.println("  Número: " + conta.getNumeroConta());
                System.out.println("  Agência: " + conta.getAgencia());
                System.out.println("  Saldo: " + conta.getSaldo());
                System.out.println();
            }
            
            System.out.println("Endereço: " + cliente.getEndereco().getLogradouro() + ", " + cliente.getEndereco().getNumero() + ", " + cliente.getEndereco().getCep());
            
            System.out.println("Telefones:");
            for (Telefone telefone : cliente.getTelefones()) {
                System.out.println("  DDD: " + telefone.getDdd());
                System.out.println("  Número: " + telefone.getNumeroTelefone());
                System.out.println();
            }
            
            System.out.println("================================");
        }
    }
    
    private static void excluirCliente(Registro registro, Scanner scanner) {
        System.out.print("Digite o CPF do cliente que deseja excluir: ");
        String cpf = scanner.next();
        
        if (registro.excluirCliente(cpf)) {
            System.out.println("Cliente excluído com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}

