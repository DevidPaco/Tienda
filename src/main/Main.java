package main;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Tienda Tienda1 = new Tienda();
        Tienda1.leer();
        Tienda1.mostrar();
        System.out.print("Nro de productos a adicionar: ");
        Tienda1.adicionar(leer.nextInt());
        Tienda1.mostrar();
        System.out.print("Nombre de producto a actualizar: ");
        Tienda1.actualizar(leer.next());
        Tienda1.mostrar();
        System.out.print("Nombre de producto a eliminar: ");
        Tienda1.eliminar(leer.next());
        Tienda1.mostrar();
    }
}