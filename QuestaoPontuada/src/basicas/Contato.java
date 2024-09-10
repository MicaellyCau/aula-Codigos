package basicas;

public class Contato {
private String nome;
private String endereco;
private String telefone;

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getEndereco() {
	return endereco;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}
public Contato(String nome, String endereco, String telefone) {
	this.nome = nome;
	this.endereco = endereco;
	this.telefone = telefone;
}

public Contato() {
}
@Override
public String toString() {
	return "Contato nome:" + nome + ", endereco:" + endereco + ", telefone:" + telefone + ".";
}



}