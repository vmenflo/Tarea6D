/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author victor
 */
final public class Pantalon extends Ropa{
    //Atributos
    private int talla;
    
    //Constructores

    public Pantalon(int talla, String marca, int codigo, double precio, double IVA, String descripcion) {
        super(marca, codigo, precio, IVA, descripcion);
        this.talla = talla;
    }
    
    //Getter and Setter

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }
    
    //To String

    @Override
    public String toString() {
        return super.toString()+ "Pantalon{" + "talla=" + talla + '}';
    }
    
    //Equals and HashCode

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.talla;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pantalon other = (Pantalon) obj;
        return this.talla == other.talla;
    }
    
}
