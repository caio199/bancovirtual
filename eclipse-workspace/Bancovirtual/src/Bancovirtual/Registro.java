package Bancovirtual;

import java.util.ArrayList;
import java.util.List;

public class Registro {
    private List<Cliente> clientes;
    
    public Registro() {
        clientes = new ArrayList<>();
    }
    
    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public List<Cliente> listarClientes() {
        return clientes;
    }
    
    public boolean excluirCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                clientes.remove(cliente);
                return true;
            }
        }
        
        return false;
    }
}
