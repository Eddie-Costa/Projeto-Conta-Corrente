package projcontacorrente;

import javax.swing.JOptionPane;

public class Cliente {
    public String nome;
    public String banco;
    public int agencia;
    public int conta;
    
    public void Cadastrar(){
        this.nome = JOptionPane.showInputDialog("Digite o nome: ");
        this.banco = JOptionPane.showInputDialog("Digite o banco: ");
        this.agencia = Integer.parseInt(JOptionPane.showInputDialog("Digite o agencia: "));
        this.conta = Integer.parseInt(JOptionPane.showInputDialog("Digite a conta: ")); 
        JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!!!");
    }
    
    public void Exibir(){
        JOptionPane.showMessageDialog(null, "nome:" +this.nome+ "\nbanco" +this.banco+ "\nAgencia" +this.agencia+ "\nConta: " +this.conta);     
    }
}
