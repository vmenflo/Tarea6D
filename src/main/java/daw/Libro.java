/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Objects;

/**
 *
 * @author victor
 */
public abstract class Libro extends Producto implements Comparable<Libro>{
    //Atributo
    private String ISBN;
    
    //Constructor

    public Libro(String ISBN, int codigo, double precio, double IVA, String descripcion) {
        super(codigo, precio, IVA, descripcion);
        this.ISBN = ISBN;
    }
    
    //Getter and setter

    public String getISBN() {
        return ISBN;
    }

    //Equals and hashCode

    @Override
    final public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.ISBN);
        return hash;
    }

    @Override
    final public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        return Objects.equals(this.ISBN, other.ISBN);
    }
    
    //CompareTO

    @Override
    public int compareTo(Libro o) {
        return this.getISBN().compareToIgnoreCase(o.getISBN());
    }
    
}
