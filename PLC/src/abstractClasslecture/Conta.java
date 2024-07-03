package abstractClasslecture;


public class Conta extends ContaAbstrata{
	
	public Conta(String num) {
		super(num);
	}
	
	@Override
	public void debitar(double valor) {
		setSaldo(getSaldo() - valor);
	}
	
}