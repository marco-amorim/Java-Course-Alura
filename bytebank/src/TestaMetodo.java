
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoMarco = new Conta();
		contaDoMarco.saldo = 100;
		contaDoMarco.deposita(50);
		System.out.println(contaDoMarco.saldo);

		boolean conseguiuRetirar = contaDoMarco.saca(20);
		System.out.println(contaDoMarco.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		if (contaDaMarcela.transfere(300, contaDoMarco)) {
			System.out.println("Transferencia feita com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoMarco.saldo);

		contaDoMarco.titular = "marco amorim";
		System.out.println(contaDoMarco.titular);
	}

}
