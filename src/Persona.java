import java.util.Scanner;

public class Persona extends Serie{
	
	/*
	 * ATRIBUTOS
	 */
	
	private int num_series_totales; 
	private int num_series_vistas; 
	private int num_series_pendientes; 
	
	
	/*
	 * CONSTRUCTOR
	 */
	
	public Persona(){
		
	}


	/*
	 * METODOS
	 */
	
	public int seriesVistas(){
		
		int capitulosPendientes = numCapitulos; 
		
		Scanner lector = new Scanner(System.in);
		
		do{
			
			System.out.println("Escoge una serie de las siguientes que estes viendo");
			System.out.println("1. Juego de Tronos"); 
			System.out.println("2. Narcos");
			System.out.println("3. Black Mirror"); 
			System.out.println("4. Orange is the New Black");
			
			
			int opcion = 0; 
			
			switch (opcion) {
			case 1:
				System.out.println(x);
				break;

			default:
				break;
			}
			
		
		
	
		for(int i = getNum_capitulos(); i < capitulosPendientes; i--){
			
		}
	}
		return null; 
	}
	/**
	 * @return the num_series_totales
	 */
	public int getNum_series_totales() {
		return num_series_totales;
	}


	/**
	 * @param num_series_totales the num_series_totales to set
	 */
	public void setNum_series_totales(int num_series_totales) {
		this.num_series_totales = num_series_totales;
	}


	/**
	 * @return the num_series_vistas
	 */
	public int getNum_series_vistas() {
		return num_series_vistas;
	}


	/**
	 * @param num_series_vistas the num_series_vistas to set
	 */
	public void setNum_series_vistas(int num_series_vistas) {
		this.num_series_vistas = num_series_vistas;
	}


	/**
	 * @return the num_series_pendientes
	 */
	public int getNum_series_pendientes() {
		return num_series_pendientes;
	}


	/**
	 * @param num_series_pendientes the num_series_pendientes to set
	 */
	public void setNum_series_pendientes(int num_series_pendientes) {
		this.num_series_pendientes = num_series_pendientes;
	}
	
	

}
