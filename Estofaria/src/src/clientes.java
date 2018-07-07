package src;
	
	import java.util.InputMismatchException;
	import java.util.Scanner;
	import java.util.ArrayList;
	import java.util.List;

	public class clientes<Pedidos>{
		
		
		private String nomeCliente = "";
		private String enderecoCliente = "";
		private String emailCliente = "";
		private int indice = 0;
		
		
		private ArrayList<Pedidos> listaPedidos = new ArrayList<Pedidos>();
		
		private Scanner scan = estofaria.scan;
		
		//adição dos Gets
		public String getNomeCliente(){
			return nomeCliente;
		}
		
		public String getEnderecoCliente(){
			return enderecoCliente;
		}
			
		public String getEmailCliente(){
			return emailCliente;
		}
		
		public int getIndice(){
			return indice;
		}
		
				public List<Pedidos> getListaPedidos() {
			return listaPedidos;
		}
		
		
		//adição dos Sets
		public void setNomeCliente(String nomeCliente){
			this.nomeCliente = nomeCliente;
		}
			
		public void setEnderecoCliente(String enderecoCliente){
			this.enderecoCliente = enderecoCliente;
		}
			
		public void setEmailCliente(String emailCliente){
			this.emailCliente = emailCliente;
		}
		
		public void setIndice(int indice){
			this.indice = indice;
		}
		
		public void setListaPedidos(ArrayList<Pedidos> listaPedidos) {
			this.listaPedidos = listaPedidos;
		}
		
		
		public void Clientes(String nomeCliente, String enderecoCliente, String emailCliente){
			this.nomeCliente = nomeCliente;
			this.enderecoCliente = enderecoCliente;
			this.emailCliente = emailCliente;
		}
			
		public void Clientes(){
			System.out.println("Nome: ");
			this.nomeCliente = scan.nextLine();
			
			System.out.println("Endereço: ");
			this.enderecoCliente = scan.nextLine();
			
			System.out.println("Email: ");
			this.emailCliente = scan.nextLine();
			
			try{
			}catch(InputMismatchException e){
				System.out.println("Erro de valor,inserir somente números!");
				scan.nextLine();
			}
		}
		
		public boolean save(){
			estofaria.listaClientes.add(this);
			return true;
		}
		
		public void updateCliente(){
			System.out.println("Novo nome: ");
			this.nomeCliente = scan.nextLine();
			
			System.out.println("Novo endereço: ");
			this.enderecoCliente = scan.nextLine();
			
			System.out.println("Novo email: ");
			this.emailCliente = scan.nextLine();
			
			try{
			}catch(InputMismatchException e){
				System.out.println("Erro de valor,inserir somente números!");
				scan.nextLine();
			}
		}
	    
	    public boolean update(){
	    	((ArrayList<Pedidos>) estofaria.listaClientes).set(this.getIndice(), (Pedidos) this);
	    	return true;
	    }
		
		public void mostraCliente(){
			System.out.println("Cliente");
			System.out.println("Nome: " + this.nomeCliente);
			System.out.println("Endereço: " + this.enderecoCliente);
			System.out.println("Email: " + this.emailCliente);
		}
	}
