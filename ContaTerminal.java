package entities;

public class ContaTerminal {
	int numeroConta;
	String agencia;
	String nomeCliente;
	Double saldo;
	
	public ContaTerminal(String nomeCliente, int numeroConta, String agencia, Double saldo) {
		
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numeroConta;
	}

	public void setNumero(int numero) {
		this.numeroConta = numeroConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Olá " + nomeCliente  + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + 
				" e o seu saldo de  " + saldo + " já está disponível para saque.";
	}
	
	

}
