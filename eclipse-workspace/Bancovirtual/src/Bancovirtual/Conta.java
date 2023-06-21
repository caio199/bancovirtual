package Bancovirtual;

public class Conta {
    private String numeroConta;
    private String agencia;
    private double saldo;
    
    public Conta(String numeroConta, String agencia, double saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }
    
    public String getNumeroConta() {
        return numeroConta;
    }
    
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    
    public String getAgencia() {
        return agencia;
    }
    
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor) {
        saldo += valor;
    }
    
    public void sacar(double valor) {
        saldo -= valor;
    }
    
    public void extrato() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: " + saldo);
    }
}
