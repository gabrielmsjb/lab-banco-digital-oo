import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Banco caixaEconomicaFederal = new Banco("Caixa Econômica Federal");

		Cliente venilton = new Cliente("Venilton");

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		List<Conta> contasCaixa = new ArrayList<>();

		contasCaixa.add(cc);
		contasCaixa.add(poupanca);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc.depositar(150);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		Banco.mostrarContasDoBancoComDados(contasCaixa);
	}

}
