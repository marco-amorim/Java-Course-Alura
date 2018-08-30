
public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(123123);
		conta.deposita(200);
		Conta conta2 = new Conta(1337, 15634);
		conta2.setAgencia(123);
		Conta conta3 = new Conta(2122, 31234);
		conta3.setAgencia(456);
		
		System.out.println(Conta.getTotal());
		System.out.println(conta2.getAgencia());
	}

}
