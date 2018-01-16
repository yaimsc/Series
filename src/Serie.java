
public class Serie {
	
	/*
	 * ATRIBUTOS
	 *
	 */
	
	private String nombre; 
	private String tipo; 
	private String productora; 
	private int temporadas; 
	private int duracion_cap;
	protected int numCapitulos; 
	protected int numCapitulosVistos; 
	
	/*
	 * CONSTRUCTOR
	 */
	
	public Serie(){
		
	}
	
	public Serie(String nombre,int temporadas, int numCapitulosVistos ){
		this.nombre = nombre; 
		 
	}
	
	/*
	 * METODOS
	 */
	
	public void mostarInfo(){
		System.out.println(getNombre() + " de " + getProductora() + ", del genero " + getTipo() + " con " + getTemporadas() + " temporadas"); 
	}
	
	public double añadirCapitulos(int num_capitulos){
		//añadir un 70% mas de capitulos a la serie
		int capitulos = (int) (num_capitulos*1.7); 
	
		System.out.print("En la siguiente temporada habra el siguiente numero de capitulos de " + getNombre() + " : ");
		
		return capitulos;  
	}
	
	public void nuevaTemporada(){
		//añadir una nueva temporada a la serie
		for( int i = 0; i < temporadas; i++){
			if( i <= temporadas){
				temporadas++; 
				System.out.println(getProductora() + " ha decidido renovar " + getNombre() + " por una nueva temporada! YAAAY!");
			}
		}

	}
	
	/*
	 * GETTERS & SETTERS
	 */

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the productora
	 */
	public String getProductora() {
		return productora;
	}

	/**
	 * @param productora the productora to set
	 */
	public void setProductora(String productora) {
		this.productora = productora;
	}

	/**
	 * @return the temporadas
	 */
	public int getTemporadas() {
		return temporadas;
	}

	/**
	 * @param temporadas the temporadas to set
	 */
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	/**
	 * @return the duracion_cap
	 */
	public int getDuracion_cap() {
		return duracion_cap;
	}

	/**
	 * @param duracion_cap the duracion_cap to set
	 */
	public void setDuracion_cap(int duracion_cap) {
		this.duracion_cap = duracion_cap;
	}

	/**
	 * @return the num_capitulos
	 */
	public int getNum_capitulos() {
		return numCapitulos;
	}

	/**
	 * @param num_capitulos the num_capitulos to set
	 */
	public void setNum_capitulos(int num_capitulos) {
		this.numCapitulos = num_capitulos;
	}
	
	
	
	
}
