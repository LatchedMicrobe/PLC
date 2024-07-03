package abstractClasslecture;

public class Poupança extends Conta {

public Poupança (String numero) { 
    super(numero);
  } 

public void renderJuros(double taxa) {  
    double juros = this.getSaldo() * taxa;
    this.creditar(juros); 
	}

}