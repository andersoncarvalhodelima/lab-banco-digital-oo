
public interface IConta {
	
	void sacar(double valor, String senha) throws SaldoInsuficienteException, SecurityException;
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino, String senha) throws SaldoInsuficienteException, SecurityException;
	
	void imprimirExtrato();
}
