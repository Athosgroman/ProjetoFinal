package agendamento;

public class FuncoesAgendamento {

	public static void exibirMenu() {
        System.out.println("PROGRAMA AGENDAMENTO");
        System.out.println("Escolha sua op��o!");
        System.out.println("1 - Digitar horarios dispon�veis para agendamento");
        System.out.println("2 - Agendar cliente");
        System.out.println("3 - Exibir agenda");
        System.out.println("4 - Desligar programa");

    }
	
	public static boolean login(String nome, String senha) {

		Scanner pega = new Scanner(System.in);

		String nomeLogin = "java";
		String senhaLogin = "java";

		if(nomeLogin.equalsIgnoreCase(nome) && senhaLogin.equalsIgnoreCase("senha")) {
		return true;
		}
		else {
		return false;

		}

}
