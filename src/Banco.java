import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco(String nome) {
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void mostrarContasDoBanco(List<Conta> contas) {
		System.out.println(contas);
	}

	public static void mostrarContasDoBancoComDados(List<Conta> contas) {
		for (Conta c : contas) {
			c.imprimirExtrato();
		}
	}

}
