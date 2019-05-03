public class ContaCorrente extends Conta {

    private float limiteChequeEspecial;

    public float getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(float limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void depositar (Cheque cheque){
        super.depositar(cheque.getValor());

    }

    @Override
    public void sacar (float saque){
        if (super.getSaldo() + limiteChequeEspecial >= saque){
            setSaldo(getSaldo() - saque);

            System.out.println("Você realizou");

        }else {
            System.out.println("Saldo insuficiente");
        }
    }


}
