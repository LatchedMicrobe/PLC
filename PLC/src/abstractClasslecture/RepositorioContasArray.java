package abstractClasslecture;

import java.util.ArrayList;

public class RepositorioContasArray implements RepositorioContas {
	
	private ArrayList<ContaAbstrata> array;
	
	public RepositorioContasArray() {
		this.array = new ArrayList<ContaAbstrata>(); 
	}

	@Override
	public void inserir(ContaAbstrata conta) {
		array.add(conta);
	}

	@Override
	public ContaAbstrata procurar(String num) {
		for(ContaAbstrata c : array) {
			if(c.getNumero() == num) {
				return c;
			}
		}
		return null;
	}

	@Override
	public void remover(String num) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizar(ContaAbstrata conta) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean existe(String num) {
		for(ContaAbstrata c : array) {
			if(c.getNumero() == num) {
				return true;
			}
		}
		return false;
	}

}
