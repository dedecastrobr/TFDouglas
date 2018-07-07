
	package src;

	import java.sql.Connection;
	import java.sql.SQLException;
	import java.sql.Statement;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

	public class materiais<Relatorios> {

			
			
			private long codigoMaterial = 0;
			private String descricaoMaterial = "";

			private pedidos pedidoMaterial = null;
			
			private ArrayList<relatorios> listaRelatorios = new ArrayList<relatorios>();
			
			private Scanner scan = new Scanner(System.in);
			//gets
			public long getCodigoMaterial(){
				return codigoMaterial;
			}
			
			public String getDescricaoMaterial(){
				return descricaoMaterial;
		}
			public pedidos getpedidoMaterial() {
				return pedidoMaterial;
			}
			
			
			public List<relatorios> getListaRelatorios() {
				return listaRelatorios;
		}
			//sets
			public void setCodigoMaterial(long codigoMaterial){
				this.codigoMaterial = codigoMaterial;
			}

			public void setDescricaoMaterial (String descricaoMaterial){
				this.descricaoMaterial = descricaoMaterial;
		}
			
			public void setListaRelatorios(ArrayList<Relatorios> listaRelatorios) {
				this.listaRelatorios = (ArrayList<relatorios>) listaRelatorios;
			}
			
			public materiais( long codigoMaterial, String descricaoMaterial, pedidos pedido){
				
				this.codigoMaterial = codigoMaterial;
				this.descricaoMaterial = descricaoMaterial;
				this.pedidoMaterial = pedido;
		}
			public materiais(pedidos pedido){
				try{
					System.out.println("Código do Produto: ");
					this.codigoMaterial = scan.nextLong();
					scan.nextLine();
					pedidoMaterial = pedido;
				}catch(InputMismatchException e){
					System.out.println("Erro de valor,insira somente números!");
					scan.nextLine();			
				}
				
				System.out.println("Descrição do material: ");
				this.descricaoMaterial = scan.nextLine();
				
				try{
					scan.nextLine();
				}catch(InputMismatchException e){
					System.out.println("Erro de valor,insira somente números!");
					scan.nextLine();
				}		
		}
			public boolean save(){
				Estofaria.listaMateriais.add(this);
				return true;
			}
			
			public void updateMateriais(){
		try{
			System.out.println("Novo Código do material: ");
			this.codigoMaterial = scan.nextLong();
			scan.nextLine();
		}catch(InputMismatchException e){
			System.out.println("Erro de valor,injsira somente números!");
			scan.nextLine();			
		}
		
		System.out.println("Nova descrição do material: ");
		this.descricaoMaterial = scan.nextLine();

		}
			public boolean update(){
				Estofaria.listaMateriais.set(this.getIndice(), this);
				return true;
			}
			
			public void mostraMaterial(){
				System.out.println("Material:");
				System.out.println("Código: " + this.codigoMaterial);
				System.out.println("Descrição: " + this.descricaoMaterial);
			}
		}

	