
public class Cliente {

	private String nome;
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha){
		this.senha = senha;
	}

	public boolean verificarSenha(String senhaInformada) {
		return this.senha.equals(senhaInformada);
	}

}
