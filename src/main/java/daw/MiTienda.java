/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author victor
 */
public class MiTienda {
    public static void main(String[] args) {
        //1-Creamos la lista de productos
        List<Producto> listaProductos = new ArrayList();
        
        Pantalon pantalon1 = new Pantalon(42, "Levis", 1, 15, 0.21, "Pantalon levis");
        Pantalon pantalon2 = new Pantalon(42, "Levis", 3, 18, 0.21, "Pantalon levis");
        Musica musica1 = new Musica("ACDC", 2, 50, 0.21, "Grupo de rock");
        Musica musica2 = new Musica("Pantera", 10, 60, 0.21, "Grupo de Metal");
        LibroPapel libroPapel1 = new LibroPapel(200, "ISDS4554", 5, 30, 0.18, "Frankestein");
        LibroPapel libroPapel2 = new LibroPapel(200, "ISDS45784", 9, 23, 0.18, "Sin noticias de Grub");
        LibroDigital libroDigital1 = new LibroDigital(0123, "IDWw662", 6, 4, 0.21, "La paciente silenciosa");
        LibroDigital libroDigital2 = new LibroDigital(0145, "IDW8556", 7, 6, 0.21, "El cuarto mono");
        
        //Lo metemos en la lista
        //Hace conversion implicita
        listaProductos.add(pantalon1);
        listaProductos.add(pantalon2);
        listaProductos.add(musica1);
        listaProductos.add(musica2);
        listaProductos.add(libroPapel1);
        listaProductos.add(libroPapel2);
        listaProductos.add(libroDigital1);
        listaProductos.add(libroDigital2);
        
        //2-Mostrar
        for (Producto v : listaProductos) {
            System.out.println(v);
        }
        
        //3-Ordena la lista de productos según el precio, haciendo uso de 
        //<<Comparator>> y una expresión lambda. Muestra la lista de productos 
        //ordenados por precio.
        
        Comparator<Producto> criterioPrecio = (p1,p2)->Double.compare(p1.getPrecio(), p2.getPrecio());
        listaProductos.sort(criterioPrecio);
        System.out.println("Lo mostramos ordenador por precio------------->");
        for (Producto v : listaProductos) {
            System.out.println(v);
        }
        
        
//       4- Ordena la lista de productos según el código, haciendo uso de <<Comparator>> 
//                y una expresión lambda. Muestra la lista de productos ordenados 
//                        por código.

        Comparator<Producto> criterioCodigo = (p1,p2)->Integer.compare(p1.getCodigo(), p2.getCodigo());
        listaProductos.sort(criterioPrecio);
        System.out.println("Lo mostramos ordenador por codigo------------->");
        for (Producto v : listaProductos) {
            System.out.println(v);
        }
        
//      Realiza la búsqueda binaria, según su código, de algún producto que exista dentro de la lista y otro que no exista, mostrando la posición que ocupa en la lista.
     
        //OJO IMPORTANTE ORDENARLA PRIMERO POR EL CRITERIO PERO COMO YA ESTA ORDENADA
        Musica m1 = new Musica();
        m1.setCodigo(10);//Busco el 10
        int posicion = Collections.binarySearch(listaProductos, m1, criterioCodigo);
        System.out.println(posicion);
    }
    
}
