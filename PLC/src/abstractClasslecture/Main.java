package abstractClasslecture;

public class Main {

	public static void main(String[] args) {
		RepositorioContasArray array = new RepositorioContasArray();
		Banco b = new Banco(array);
		
		ContaImposto c = new ContaImposto("123");
		c.creditar(10);
		
		b.addConta(c);
		c.debitar(5);
		
		System.out.println(c.getSaldo());
	}

}
