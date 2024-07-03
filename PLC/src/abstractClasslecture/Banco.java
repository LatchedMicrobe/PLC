package abstractClasslecture;

public class Banco {
	private RepositorioContas contas;
	
	public Banco(RepositorioContas rep) {
		this.contas = rep;
	}
	
	public void addConta(ContaAbstrata c) {
		contas.inserir(c);
	}
	
	public ContaAbstrata findContaByNum(String num) {
		return contas.procurar(num);
	}
	
	public void renderBonus(String num) {
		ContaAbstrata c = this.findContaByNum(num);
		if(c instanceof ContaEspecial) {
			((ContaEspecial) c).renderBonus();
		}
		else {
			System.out.println("objeto não encontrado");
		}
	}
	
	public void transferir(String numFonte, String numDest, double valor) {
		this.findContaByNum(numFonte).debitar(valor);
		this.findContaByNum(numDest).creditar(valor);
	}
}