package Pacage;

import javax.swing.JOptionPane;

public class Pessoa {
	public int codigo = 0;
	public String nome = null;
	public String endereco = null;
	public String bairro = null;
	public String cidade = null;
	public String uf = null;
	public String telefone = null;
	public String celular = null;
	
	public Pessoa(int _cod, String _nome, String _endereco, String _bairro, String _cidade, String _uf, String _tel, String _cel) {
		this.codigo = _cod;
		this.nome = _nome;
		this.endereco = _endereco;
		this.bairro = _bairro;
		this.cidade = _cidade;
		this.uf = _uf;
		this.telefone = _tel;
		this.celular = _cel;
	}
	public void mostrarTelefones() {
		JOptionPane.showMessageDialog(null, 
				"Telefone do cliente: " + Cliente.telefonecli + 
				"\nTelefone do fornecedor: " + Fornecedor.telefonefor + 
				"\nTelefone do funcionário: " + Funcionario.telefonefun, "Telefones!", 0);
	}

}
