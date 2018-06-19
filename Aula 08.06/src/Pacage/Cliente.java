package Pacage;

import javax.swing.*;

public class Cliente extends Pessoa {
	public int codcli = 0;
	public String nomecli = null;
	public String enderecocli = null;
	public String bairrocli = null;
	public String cidadecli = null;
	public String ufcli = null;
	public static String telefonecli = null;
	public String celularcli = null;
	
	  public Cliente(int _cod, String _nome, String _endereco, String _bairro, String _cidade, String _uf, String _tel,
			String _cel) {
		super(_cod, _nome, _endereco, _bairro, _cidade, _uf, _tel, _cel);
		this.codcli = _cod;
		this.nomecli = _nome;
		this.enderecocli = _endereco;
		this.bairrocli = _bairro;
		this.cidadecli = _cidade;
		this.ufcli = _uf;
		Cliente.telefonecli = _tel;
		this.celularcli = _cel;
	}
	  double limiteCredito = 0;
      double rendaMensal = 0;
      String rg = null;
      String cpf = null;
      
      
      public void inserirDadosCliente() {
    	 for(int i = 0; i>0; i++) {
    		 codcli = i;
    	 }
 		 nomecli = JOptionPane.showInputDialog(null,"Digite o nome do cliente.");	
 		 enderecocli = JOptionPane.showInputDialog(null,"Digite o endereço do cliente.");	
 		 bairrocli = JOptionPane.showInputDialog(null,"Digite o bairro do cliente.");	
 		 cidadecli = JOptionPane.showInputDialog(null,"Digite o cidade do cliente.");	
 		 ufcli = JOptionPane.showInputDialog(null,"Digite o UF do cliente.");	
 		 telefonecli = JOptionPane.showInputDialog(null,"Digite o telefone do cliente.");	
 		 celularcli = JOptionPane.showInputDialog(null,"Digite o telefone celular do cliente.");	
		 limiteCredito = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o limite de credito do cliente."));
    	 rendaMensal = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a renda mensal do cliente."));
         rg = JOptionPane.showInputDialog(null,"Digite o RG do cliente.");
         cpf = JOptionPane.showInputDialog(null,"Digite o CPF do cliente.");		 
      }
      public void apresentarCliente() {
    	  JOptionPane.showMessageDialog(null, 
    			  "O cliente se chama " + nomecli + " e seu código é " + codcli +
    			  "\nPossui residência em " + enderecocli + 
    			  "\nNo bairro " + bairrocli + ", na cidade " + cidadecli + " e na unidade federativa " + ufcli +
    			  "\nSeu telefone residencial é " + telefonecli + " e seu telefone celular é " + celularcli +
    			  "\nSeu RG é " + rg + " e seu CPF é " + cpf +
    			  "\n Possui limite de crédito de R$ " + limiteCredito + " e renda mensal de R$ " + rendaMensal);
      }
}
