package projcontacorrente;

public class ContaCorrente {
    public double saldo;
    
    public double ConsultarSaldo(){
        return this.saldo;
    }
    
    public void Sacar(double valor){
        this.saldo = this.saldo - valor;
    }
    
    public void Depositar(double valor){
        this.saldo = this.saldo + valor;
    }
}
