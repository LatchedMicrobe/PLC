package abstractClasslecture;

public class ContaImposto extends ContaAbstrata{
	private final double cpmf = 0.001;
	public ContaImposto(String num) {
		super(num);
	}
	
	public void debitar(double valor) {
		setSaldo(getSaldo() - valor - (valor * cpmf));
	}
}
