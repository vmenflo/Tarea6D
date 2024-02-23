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
final public class Musica extends Producto {
    //Atributos
    private String grupo;
    
    //constructores

    public Musica(String grupo, int codigo, double precio, double IVA, String descripcion) {
        super(codigo, precio, IVA, descripcion);
        this.grupo = grupo;
    }
    
    //Sin parametros

    public Musica() {
    }
    
    
    //Getter y Setter

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
    //To String

    @Override
    public String toString() {
        return super.toString()+ "Musica{" + "grupo=" + grupo + '}';
    }
    
    //Equals y hashCode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.grupo);
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
        final Musica other = (Musica) obj;
        return Objects.equals(this.grupo, other.grupo);
    }
    
    
}
