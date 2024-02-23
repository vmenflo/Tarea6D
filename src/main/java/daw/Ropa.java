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
public abstract class Ropa extends Producto implements SeEnvia{
    //Atributos
    private String marca;
    
    //constructores

    public Ropa(String marca, int codigo, double precio, double IVA, String descripcion) {
        super(codigo, precio, IVA, descripcion);
        this.marca = marca;
    }
    
    //Getter and Setter

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    //To string

    @Override
    public String toString() {
        return super.toString() + "Ropa{" + "marca=" + marca + '}';
    }
    
    //Equals and HashCode

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.marca);
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
        final Ropa other = (Ropa) obj;
        return Objects.equals(this.marca, other.marca);
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("Se envia este articulo de ropa "
                + this.toString()+" a " + direccion);
    }
    
}
