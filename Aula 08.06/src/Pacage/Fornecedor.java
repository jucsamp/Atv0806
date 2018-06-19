package Pacage;

import javax.swing.JOptionPane;

public class Fornecedor extends Pessoa {
	public int codfor = 0;
	public String nomefor = null;
	public String enderecofor = null;
	public String bairrofor = null;
	public String cidadefor = null;
	public String uffor = null;
	public static String telefonefor = null;
	public String celularfor = null;
	
	  public Fornecedor(int _cod, String _nome, String _endereco, String _bairro, String _cidade, String _uf, String _tel,
			String _cel) {
		super(_cod, _nome, _endereco, _bairro, _cidade, _uf, _tel, _cel);
		this.codfor = _cod;
		this.nomefor = _nome;
		this.enderecofor = _endereco;
		this.bairrofor = _bairro;
		this.cidadefor = _cidade;
		this.uffor = _uf;
		Fornecedor.telefonefor = _tel;
		this.celularfor = _cel;
	}
	String cpnj = null;
    String ie = null;
    String contato = null;
    public void inserirDadosFornecedor() {
   	 for(int i = 0; i>0; i++) {
		 codfor = i;
	 }
		nomefor = JOptionPane.showInputDialog(null,"Digite o nome do fornecedor.");	
		enderecofor = JOptionPane.showInputDialog(null,"Digite o endereço do fornecedor.");	
		bairrofor = JOptionPane.showInputDialog(null,"Digite o bairro do fornecedor.");	
		cidadefor = JOptionPane.showInputDialog(null,"Digite o cidade do fornecedor.");	
		uffor = JOptionPane.showInputDialog(null,"Digite o UF do fornecedor.");	
		telefonefor = JOptionPane.showInputDialog(null,"Digite o telefone do fornecedor.");	
		celularfor = JOptionPane.showInputDialog(null,"Digite o telefone celular do fornecedor.");	
    	cpnj = JOptionPane.showInputDialog(null,"Digite o CPNJ do fornecedor.");
        ie = JOptionPane.showInputDialog(null,"Digite a inscrição estadual do fornecedor.");
        contato = JOptionPane.showInputDialog(null,"Digite um número de telefone para contato com o fornecedor.");	
    }
    public void apresentarFornecedor() {
    	JOptionPane.showMessageDialog(null, 
    		"O fornecedor se chama " + nomefor + " e seu código é " + codfor +
  			"\nPossui residência em " + enderecofor + 
  			"\nNo bairro " + bairrofor + ", na cidade " + cidadefor + " e na unidade federativa " + uffor +
  			"\nSeu telefone residencial é " + telefonefor + ", seu telefone celular é " + celularfor + " e seu telefone de contato é " + ie + 
  			"\nSeu CPNJ é " + cpnj + " e sua inscrição estadual é " + ie);
    }

}
