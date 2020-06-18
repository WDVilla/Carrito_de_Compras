
public class Producto {
	public String nombrepro;
	public int preciopro;
	private String descripcion;
	private int stock;
	public Producto() {
	}
	public Producto(String nombre, int precio) {
		this.nombrepro=nombre;
		this.preciopro=precio;
	}
	public String getNombre() {
		return nombrepro;
	}
	public void setNombre(String nombre) {
		this.nombrepro=nombre;
	}
	public void setDescripcion(String descrip) {
		descripcion=descrip;
	}
	public int getPrecio() {
		return preciopro;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int s) {
		stock=s;
	}
	public void setPrecio(int precio) {
		this.preciopro=precio;
	}
        public void show() {
System.out.println("\t" + nombrepro + " ..... " + preciopro + " pts");
}
}
