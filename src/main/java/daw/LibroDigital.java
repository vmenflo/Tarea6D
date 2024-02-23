/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author victor
 */
final public class LibroDigital extends Libro implements SeDescarga{
    //Atributos
    private int numKBytes;
    
    //Constructor

    public LibroDigital(int numKBytes, String ISBN, int codigo, double precio, double IVA, String descripcion) {
        super(ISBN, codigo, precio, IVA, descripcion);
        this.numKBytes = numKBytes;
    }
    
    //Getter and Setter

    public int getNumKBytes() {
        return numKBytes;
    }

    public void setNumKBytes(short numKBytes) {
        this.numKBytes = numKBytes;
    }
    
    //To string

    @Override
    public String toString() {
        return super.toString()+"LibroDigital{" + "numKBytes=" + numKBytes + '}';
    }
    
    //SeDescarga

    @Override
    public void descargar() {
         System.out.println("http://Victor.daw/"+this.hashCode());
    }

    @Override
    void queSoy() {
        System.out.println("Soy un libro digital");
    }
    }
