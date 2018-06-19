package Pacage;

import javax.swing.*;

public class Funcionario extends Pessoa {
	public int codfun = 0;
	public String nomefun = null;
	public String enderecofun = null;
	public String bairrofun = null;
	public String cidadefun = null;
	public String uffun = null;
	public static String telefonefun = null;
	public String celularfun = null;
	
	  public Funcionario(int _cod, String _nome, String _endereco, String _bairro, String _cidade, String _uf, String _tel,
			String _cel) {
		super(_cod, _nome, _endereco, _bairro, _cidade, _uf, _tel, _cel);
		this.codfun = _cod;
		this.nomefun = _nome;
		this.enderecofun = _endereco;
		this.bairrofun = _bairro;
		this.cidadefun = _cidade;
		this.uffun = _uf;
		Funcionario.telefonefun = _tel;
		this.celularfun = _cel;
	}
       double salarioBase = 0;
       double salarioFinal = 0;
       
       public void inserirDadosFuncionario() {
    	 for(int i = 0; i>0; i++) {
    		 codfun = i;
    	 }
 		 nomefun = JOptionPane.showInputDialog(null,"Digite o nome do funcion�rio.");	
 		 enderecofun = JOptionPane.showInputDialog(null,"Digite o endere�o do funcion�rio.");	
 		 bairrofun = JOptionPane.showInputDialog(null,"Digite o bairro do funcion�rio.");	
 		 cidadefun = JOptionPane.showInputDialog(null,"Digite o cidade do funcion�rio.");	
 		 uffun = JOptionPane.showInputDialog(null,"Digite o UF do funcion�rio.");	
 		 telefonefun = JOptionPane.showInputDialog(null,"Digite o telefone do funcion�rio.");	
 		 celularfun = JOptionPane.showInputDialog(null,"Digite o telefone celular do funcion�rio.");	
    	 salarioBase = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o sal�rio base do funcion�rio."));
         salarioFinal = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a sal�rio final do funcion�rio."));
       }
       public void apresentarFuncionario() {
       	JOptionPane.showMessageDialog(null, 
       			"O funcion�rio se chama " + nomefun + " e seu c�digo � " + codfun +
      			"\nPossui resid�ncia em " + enderecofun + 
      			"\nNo bairro " + bairrofun + ", na cidade " + cidadefun + " e na unidade federativa " + uffun +
      		    "\nSeu telefone residencial � " + telefonefun + ", seu telefone celular � " + celularfun +
      			"\nSeu sal�rio base � R$ " + salarioBase + " e seu sal�rio final � R$ " + salarioFinal);
       }
}
