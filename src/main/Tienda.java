package main;
import java.util.*;
public class Tienda {
    //TODO atributo
    Scanner leer = new Scanner (System.in);
    private String nombre, direccion;
    private int nroProducto;
    private String [][] producto = new String[100][2];
    //TODO constructor
    Tienda(){ }
    //TODO getters y setters

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNroProducto() {
        return nroProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNroProducto(int nroProducto) {
        this.nroProducto = nroProducto;
    }
    //TODO leer
    public void leer(){
        System.out.print("Ingrese Nombre: ");
        setNombre(leer.next());
        System.out.print("Ingrese Direccion: ");
        setDireccion(leer.next());
        System.out.print("Ingrese nro de productos: ");
        setNroProducto(leer.nextInt());
        for(int i=0; i<getNroProducto(); i++) {
            System.out.print("Producto: ");
            producto[i][0] = leer.next();
            System.out.print("Precio: ");
            producto[i][1] = leer.next();
        }
    }
    //TODO mostrar
    public void mostrar(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Direción: "+getDireccion());
        System.out.println("\tNombre\t\t\tPrecio");
        for (int i=0; i<getNroProducto(); i++)
            System.out.println("\t"+producto[i][0]+"\t\t\t"+producto[i][1]);
    }
    //TODO adicionar
    public void adicionar(int n) {
        int m = getNroProducto();
        setNroProducto(getNroProducto()+n);
        for (int i=m; i<getNroProducto(); i++) {
            System.out.print("Producto: ");
            producto[i][0] = leer.next();
            System.out.print("Precio: ");
            producto[i][1] = leer.next();
        }
    }
    //TODO actualizar
    public void actualizar (String n) {
        for (int i=0; i<getNroProducto(); i++) {
            if (producto[i][0].equals(n)) {
                System.out.print("Producto: ");
                producto[i][0] = leer.next();
                System.out.print("Precio: ");
                producto[i][1] = leer.next();
            }
        }
    }
    //TODO eliminar
    public void eliminar (String n) {
        int c = 0;
        for (int i=0; i<getNroProducto(); i++) {
            if (producto[i][0].equals(n) && c==0)
                c = i;
            if(c > 0) {
                producto[i][0] = producto[i+1][0];
                producto[i][1] = producto[i+1][1];
            }
        }
        producto[getNroProducto()-1][0] = null;
        producto[getNroProducto()-1][1] = null;
        setNroProducto(getNroProducto()-1);
    }
}