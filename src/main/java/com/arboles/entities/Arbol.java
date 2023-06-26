
package com.arboles.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "arbol")
public class Arbol {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String ruta_imagen;
    private String nombre_comun;
    private String tipo_flor;
    private String dureza_madera; 
    private Integer Hojas;
    private String Altura; 
    private boolean activo;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_comun() {
        return nombre_comun;
    }

    public void setNombre_comun(String nombre_comun) {
        this.nombre_comun = nombre_comun;
    }

    public String getTipo_flor() {
        return tipo_flor;
    }

    public void setTipo_flor(String tipo_flor) {
        this.tipo_flor = tipo_flor;
    }

    public String getDureza_madera() {
        return dureza_madera;
    }

    public void setDureza_madera(String dureza_madera) {
        this.dureza_madera = dureza_madera;
    }

    public Integer getHojas() {
        return Hojas;
    }

    public void setHojas(Integer Hojas) {
        this.Hojas = Hojas;
    }

    public String getAltura() {
        return Altura;
    }

    public void setAltura(String Altura) {
        this.Altura = Altura;
    }

    

    public String getRuta_imagen() {
        return ruta_imagen;
    }

    public void setRuta_imagen(String ruta_imagen) {
        this.ruta_imagen = ruta_imagen;
    }

    public boolean isActivo() {
        return activo;
}

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}
