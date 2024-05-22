package projcontacorrente;

import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        ContaCorrente cc = new ContaCorrente();
        int op=0;
        String menu="1-Cadastrar Cliente \n2-Exibir Cliente \n3-Consultar Saldo \n4-Depositar \n5-Sacar \n0-Sair";
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog(menu));
                    switch(op){
                        case 1:
                            cliente.Cadastrar();
                            break;
                        case 2:
                            cliente.Exibir();
                            break;
                        case 3:
                            double sd=cc.ConsultarSaldo();
                            JOptionPane.showMessageDialog(null, "seu saldo é: " +sd);
                            break;
                        case 4:
                            cc.Depositar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: ")));
                            sd=cc.ConsultarSaldo();
                            JOptionPane.showMessageDialog(null, "seu saldo é: " +sd);
                            break;
                        case 5:
                            cc.Sacar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: ")));
                            sd=cc.ConsultarSaldo();
                            JOptionPane.showMessageDialog(null, "seu saldo é: " +sd);
                            break;
                    }
        }
        while(op!=0);

    }
}
