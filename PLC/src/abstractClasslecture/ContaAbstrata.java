package abstractClasslecture;

public abstract class ContaAbstrata {
	private double saldo;
	private String numero;
	
	public ContaAbstrata(String num) {
		this.saldo = 0;
		this.numero = num;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	protected void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	public void creditar(double valor) {
		this.saldo+=valor;
	}
	
	protected abstract void debitar(double valor);
	
}
