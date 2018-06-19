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
 		 nomefun = JOptionPane.showInputDialog(null,"Digite o nome do funcionário.");	
 		 enderecofun = JOptionPane.showInputDialog(null,"Digite o endereço do funcionário.");	
 		 bairrofun = JOptionPane.showInputDialog(null,"Digite o bairro do funcionário.");	
 		 cidadefun = JOptionPane.showInputDialog(null,"Digite o cidade do funcionário.");	
 		 uffun = JOptionPane.showInputDialog(null,"Digite o UF do funcionário.");	
 		 telefonefun = JOptionPane.showInputDialog(null,"Digite o telefone do funcionário.");	
 		 celularfun = JOptionPane.showInputDialog(null,"Digite o telefone celular do funcionário.");	
    	 salarioBase = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o salário base do funcionário."));
         salarioFinal = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a salário final do funcionário."));
       }
       public void apresentarFuncionario() {
       	JOptionPane.showMessageDialog(null, 
       			"O funcionário se chama " + nomefun + " e seu código é " + codfun +
      			"\nPossui residência em " + enderecofun + 
      			"\nNo bairro " + bairrofun + ", na cidade " + cidadefun + " e na unidade federativa " + uffun +
      		    "\nSeu telefone residencial é " + telefonefun + ", seu telefone celular é " + celularfun +
      			"\nSeu salário base é R$ " + salarioBase + " e seu salário final é R$ " + salarioFinal);
       }
}
