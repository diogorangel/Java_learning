public class TestaBanco {
	public static void main(String[] args) {
		
	}
		Conta paulo = new Cliente();
		paulo.nome = Paulo Silveira;
		paulo.cpf="222.222.22";
		paulo.profissao = "programador";
		
		Conta contaDoPaulo = new Conta ();
		contadoPaulo.deposita(100);

		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contadoPaulo.titular);

}