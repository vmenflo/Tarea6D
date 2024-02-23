/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author victor
 */
final public class LibroPapel extends Libro implements SeEnvia {
    //Atributo
    private int numPaginas;
    
    //Constructor

    public LibroPapel(int numPaginas, String ISBN, int codigo, double precio, double IVA, String descripcion) {
        super(ISBN, codigo, precio, IVA, descripcion);
        this.numPaginas = numPaginas;
    }
    
    //Getter and Setter

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    //To String

    @Override
    public String toString() {
        return super.toString()+ "LibroPapel{" + "numPaginas=" + numPaginas + '}';
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("Se envia el articulo "+this.toString()+" a "+direccion);
    }
    
}
