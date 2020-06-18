/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */

public class Factura{
public String mNumero, mFecha;
public Producto mProducto[];

public Factura(String n, String f){
mNumero=n; 
mFecha=f;
mProducto=new Producto[10];
}

public void add(Producto l){
    int i=0;
    for (i=0; mProducto[i]!=null; i++);
    mProducto[i]=l;
     }
public void quitar (int i){
    mProducto[i].nombrepro=null;
    mProducto[i].preciopro=0;
    
    
}

public void show() {
double total=0;
System.out.println(mNumero + "; " + mFecha); for (int i=0; mProducto[i]!=null; i++) {
mProducto[i].show();
total+=mProducto[i].preciopro; }
System.out.println("\tTotal .... " + total + " pts.");





}

/*
public void show() {
double total=0;

System.out.println(mNumero + "; " + mFecha); for (int i=0; mLineas[i]!=null; i++) {
mLineas[i].show();
total+=mLineas[i].mPrecio; }
System.out.println("\tTotal .... " + total + " pts.");
System.out.println("\t     " + (total/kCambio) + " euros");
}
*/











//holaworld
}

