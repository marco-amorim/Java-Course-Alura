
public class TesteSacaNegativo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		// coloca em SYSOUT porque retorna true ou false (boolean)
		System.out.println(conta.saca(101));
		
		conta.saca(101);
		
		System.out.println(conta.getSaldo());
		
		conta.numero = 1337;
		
		// proibido:
		// conta.saldo -= 101;
		// System.out.println(conta.saldo);
	}

}
