package Pacage;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Principal extends JFrame {
    JLabel rotulo1;
    JButton insdc, insfor, insfun, apsdc, apsdfor, apsdfun, telpes;
    public Principal() {
         super("Sistema");
         Container tela = getContentPane();
         setLayout(null);
         tela.setBackground(Color.WHITE);
         rotulo1 = new JLabel("Olá!!!!!!");
         insdc = new JButton("Inserir dados do cliente");
         apsdc = new JButton("Apresentar dados do cliente");
         insfor = new JButton("Inserir dados do fornecedor");
         apsdfor = new JButton("Apresentar dados do fornecedor");
         insfun = new JButton("Inserir dados do funcionário");
         apsdfun = new JButton("Apresentar dados do funcionário");
         telpes = new JButton("Apresentar telefone das pessoas");
         
         rotulo1.setBounds(10,10,325,30);
         insdc.setBounds(10,65,325,30);
         apsdc.setBounds(10,100,325,30);
         insfor.setBounds(10,165,325,30);
         apsdfor.setBounds(10,200,325,30);
         insfun.setBounds(10,265,325,30);
         apsdfun.setBounds(10,300,325,30);
         telpes.setBounds(10,365,325,30);
         
         insdc.setBackground(SystemColor.textHighlight);
         apsdc.setBackground(Color.cyan);
         insfor.setBackground(Color.red);
         apsdfor.setBackground(Color.orange);
         insfun.setBackground(Color.pink);
         apsdfun.setBackground(Color.magenta);
         telpes.setBackground(Color.lightGray);
         
         Cliente cliente = new Cliente(getDefaultCloseOperation(), getTitle(), getTitle(), getTitle(), getTitle(), getTitle(), getTitle(), getTitle());
         Funcionario funcionario = new Funcionario(getDefaultCloseOperation(), getTitle(), getTitle(), getTitle(), getTitle(), getTitle(), getTitle(), getTitle());
     	 Fornecedor fornecedor = new Fornecedor(getDefaultCloseOperation(), getTitle(), getTitle(), getTitle(), getTitle(), getTitle(), getTitle(), getTitle());
    	 Pessoa pessoa = new Pessoa(getDefaultCloseOperation(), getTitle(), getTitle(), getTitle(), getTitle(), getTitle(), getTitle(), getTitle());
     	
         insdc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	cliente.inserirDadosCliente();
            }
         });
         
         apsdc.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent evt) {
            	cliente.apresentarCliente();
             }
          });
         insfor.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent evt) {
             	fornecedor.inserirDadosFornecedor();
             }
          });
         apsdfor.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent evt) {
            	 fornecedor.apresentarFornecedor();
             }
          });
         insfun.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent evt) {
            	 funcionario.inserirDadosFuncionario();
             }
          });
         apsdfun.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent evt) {
            	 funcionario.apresentarFuncionario();
             }
          });
         telpes.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent evt) {
            	 pessoa.mostrarTelefones();
             }
          });
         
         tela.add(rotulo1);
         tela.add(insdc);
         tela.add(apsdc);
         tela.add(insfor);
         tela.add(apsdfor);
         tela.add(insfun);
         tela.add(apsdfun);
         tela.add(telpes);
         setSize(360, 500);                      
         setVisible(true);
         setLocationRelativeTo(null);
     }
    public static void main(String[] args) {                 
    	Principal app = new Principal();              
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
    }
}  