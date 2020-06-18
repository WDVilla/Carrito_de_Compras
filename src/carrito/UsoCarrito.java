

public class UsoCarrito {

	public static void main(String[] args) throws Exception {
		Usuario a = new Usuario("1212esq2", "Franco");
		Producto p1 = new Producto();
		Producto p2 = new Producto("Bananita dolca", 15);
		p1.setNombre("alfajor jorgito");
		p1.setPrecio(20);
		p1.setStock(13);
		p2.setStock(10);
		Carrito f = new Carrito(a);
		f.setDetalle(p1, 2);
		f.setDetalle(p2, 4);
		System.out.println("Nombre del usuario: "+a.getNombre()+" id del carrito: "+f.getId()+" Total de la compra: "+ f.getTotal()+" Pesos");
		System.out.println("Cantidad de "+ p1.getNombre()+" en Stock:"+p1.getStock());
                
 // Casos de Pruebas usuario
  
 Usuario c=new Usuario(null, null); 
 c.show();
 
 
 // pruebas unitarias factura
 Factura f1 =new Factura(null, null); 
 f1.show();  
 Factura f2=new Factura("1/2001", null); 
 f2.show();
 
 Factura f3= new Factura(null, null); 
 Producto l3=new Producto(null, 0); 
 f3.add(l3);
 f3.show();
        
        
 // prueba unitaria producto
 Producto l=new Producto(null, 0); 
 l.show();
 
 Producto l1=new Producto("Agua fresca", 0); 
 l1.show();

 // prueba unitaria 
 // prueba unitaria factura

        }

}
