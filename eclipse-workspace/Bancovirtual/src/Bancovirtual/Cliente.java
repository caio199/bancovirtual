package Bancovirtual;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String cpf;
    private String nome;
    private List<Conta> contas;
    private Endereco endereco;
    private List<Telefone> telefones;
    
    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        contas = new ArrayList<>();
        telefones = new ArrayList<>();
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Conta> getContas() {
        return contas;
    }
    
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public List<Telefone> getTelefones() {
        return telefones;
    }
    
    public void adicionarTelefone(Telefone telefone) {
        telefones.add(telefone);
    }
}
