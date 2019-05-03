public abstract class Conta {

    private float saldo;
    private Cliente cliente;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void sacar(float saque){
        if (saque <= saldo){
            saldo = saldo - saque;
            System.out.println("Saque no valor de R$" + saque + " efetuado com sucesso.");
            System.out.println("Saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar (float deposito){
        saldo = saldo + deposito;
        System.out.println("Depósito de R$" + deposito + " efetuado com sucesso.");
        System.out.println("Saldo: R$" + saldo);

    }

    public void imprimirSaldo (){
        System.out.println(saldo);
    }
}
