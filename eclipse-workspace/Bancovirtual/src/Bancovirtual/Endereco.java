package Bancovirtual;

public class Endereco {
    private String cep;
    private String logradouro;
    private int numero;
    
    public Endereco(String cep, String logradouro, int numero) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
    }
    
    public String getCep() {
        return cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public String getLogradouro() {
        return logradouro;
    }
    
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
}

