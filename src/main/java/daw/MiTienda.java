/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
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
        
        //Un producto que no exista
        m1.setCodigo(20);//Busco el 10
        posicion = Collections.binarySearch(listaProductos, m1, criterioCodigo);
        System.out.println(posicion);
        
        //6-Recorre la lista de productos y guarda todos los libros en una lista de libros.
        //Creo lista de libros
        List<Libro> listaLibros = new ArrayList();
        
        for (Producto v : listaProductos) {
            if(v instanceof Libro){
                //Casting explicito
                listaLibros.add((Libro) v);
            }
        }
        //7-Muestra los datos de la lista de libros usando un objeto Iterator. 
        System.out.println("Lista de libros ------------->");
        Iterator <Libro> it = listaLibros.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
        
        //8-Ordena los libros según ISBN, haciendo uso de <<Comparable>>.
        //Muestra la lista de libros ordenada. 
        System.out.println("Lista ordenada por CompareTo");
        Collections.sort(listaLibros);
        for (Libro v : listaLibros) {
            System.out.println(v.getISBN()+v.toString());
        }
        
//        9-Recorre de nuevo la lista de libros y en cada iteración, ejecuta 
//        enviar() o descargar() en función del tipo de libro.
        System.out.println("Aplicar los metodos polimorficos-------->");
        Iterator <Libro> ou = listaLibros.iterator();
        while (ou.hasNext()) {
            Libro libro = ou.next(); 
            if (libro instanceof LibroDigital) {
                //Llama al método descargar si eres un LibroDigital
                //Hace conversion explicita
                ((LibroDigital) libro).descargar(); // Llama al método descargar() 
            }
                //Llama al método enviar si eres un LibroPapel
                //Hace conversion explicita
            if (libro instanceof LibroPapel) {
                ((LibroPapel) libro).enviar("Calle Figueroa");
            }
        }
        
        //Utiliza el método contains(Object) sobre la lista de libros para
        //comprobar si existe un libro o no existe.
        
        System.out.println("Sabemos que esta en la lista. Esta? "+
                listaLibros.contains(libroDigital1));
        System.out.println("Sabemos que pantalon no esta en la lista. Esta? "
                +listaLibros.contains(pantalon1));
        
        //12-Usando la lista de productos inicial, crea una nueva lista con
        //todos los objetos que Se Envian.
        
        List<SeEnvia> listadoSeEnvia = new ArrayList();
        for (Producto e : listaProductos) {
            if(e instanceof SeEnvia){  
                //Casting explicito
                listadoSeEnvia.add((SeEnvia)e);
            }
        }
        System.out.println("Listado de SeeEnvia------->");
        for (SeEnvia seEnvia : listadoSeEnvia) {
            System.out.println(seEnvia.toString());
        }
        
        //13-Recorre la lista de objetos que Se Envian y llama al método de la interfaz.
        for (SeEnvia p : listadoSeEnvia) {
            p.enviar("Málaga");
        }
        
        //Inventa un método abstracto en Libro que tenga comportamientos
        //diferentes en las subclases. Implementa los métodos en las clases hijas.
        for (Libro v : listaLibros) {
            v.queSoy();
        }
        
    }
    
}
