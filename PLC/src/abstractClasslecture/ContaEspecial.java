package abstractClasslecture;

public class ContaEspecial extends Conta{
	private double bonus;
	
	public ContaEspecial(String num) {
		super(num);
		this.bonus = 0;
	}
	
	@Override
	public void creditar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
		this.bonus+=(valor*0.01);
	}


	public double getBonus() {
		return bonus;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public void renderBonus() {
		this.setSaldo(this.getSaldo() + this.bonus);
		this.bonus = 0;
	}
}