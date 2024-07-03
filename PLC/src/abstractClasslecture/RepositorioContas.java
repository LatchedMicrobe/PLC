package abstractClasslecture;

public interface RepositorioContas {
	void inserir(ContaAbstrata conta);
	ContaAbstrata procurar(String num);
	void remover(String num);
	void atualizar(ContaAbstrata conta);
	boolean existe(String num);
}
