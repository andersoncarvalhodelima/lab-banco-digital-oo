
public class Main {

	public static void main(String[] args) throws SaldoInsuficienteException{
		Cliente andersonc = new Cliente();
		andersonc.setNome("Anderson Carvalho");
		andersonc.setSenha("123");
		
		Conta cc = new ContaCorrente(andersonc);
		Conta poupanca = new ContaPoupanca(andersonc);

		cc.depositar(500);
		cc.transferir(500, poupanca, "15");
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
