package src;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	import java.util.InputMismatchException;

		public class menu{

	private String nomeMenu = "";
	private List<String> opsMenu = new ArrayList<String>();
	private int opSelecionada = 0;

		public static Scanner scan = new Scanner(System.in);

	public menu(String n, List<String> ops){
		this.nomeMenu = n;
		this.opsMenu = ops;
	}

		public void show(){
			System.out.println(nomeMenu);
		for(String string: opsMenu){
			System.out.println(opsMenu.indexOf(string) + " - " + string);
		}
		System.out.println("99 - Sair");
	}

		public int getOption() {
			System.out.println("Digite o valor "+nomeMenu+":");
	try {
	opSelecionada = scan.nextInt();
	scan.nextLine();
	} 	
		catch (InputMismatchException e) {
			System.out.println("Erro de valor,insira somente numeros!");
	scan.nextLine();
}
		return opSelecionada;
	}
}
	


