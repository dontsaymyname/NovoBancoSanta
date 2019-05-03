import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Michael");
        cliente1.setCpf("000000");
        cliente1.setSobrenome("Pires");
        cliente1.setNumero("12");
        cliente1.setRg("122345");

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setLimiteChequeEspecial(400F);
        contaCorrente.setSaldo(100F);
        contaCorrente.setCliente(cliente1);

        Cheque cheque = new Cheque();
        cheque.setBanco("Santa");
        cheque.setValor(500F);
        cheque.setDataPagamento(new Date());

        contaCorrente.depositar(cheque);
        System.out.println(contaCorrente.getSaldo());






    }
}
