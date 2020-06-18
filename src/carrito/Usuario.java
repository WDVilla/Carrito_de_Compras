
import java.util.Vector;


public class Usuario {
	public String nombre;
        Vector mFacturas;
        
        
        
	public String getNombre() {
		return nombre;
	}
	public Usuario(String codusuario, String us) { //registra el usuario
		nombre=us;
                mFacturas=new Vector();

	}
        
        
        
     


public void add(Factura f) { 
    mFacturas.addElement(f);
}

 public void show() {
    System.out.println("Facturas del cliente " + nombre + ":"); 
        for (int i=0; i<mFacturas.size(); i++) {
    System.out.println("Factura " + (i+1)); ((Factura) mFacturas.elementAt(i)).show(); 
    System.out.println("-------------------\n\n");
}
 }}
