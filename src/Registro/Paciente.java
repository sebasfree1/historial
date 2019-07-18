
package Registro;

import java.io.Serializable;


public class Paciente implements Serializable{
    private int identificacion;
    private String nombre;
    private String calendario;
    private String descripcion;
    private String genero;
    private String tiposangre;

    /**
     * @return the identificacion
     */
    public int getIdentificacion() {
        return identificacion;
    }

    /**
     * @param identificacion the identificacion to set
     */
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the tiposangre
     */
    public String getTiposangre() {
        return tiposangre;
    }

    /**
     * @param tiposangre the tiposangre to set
     */
    public void setTiposangre(String tiposangre) {
        this.tiposangre = tiposangre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the calendario
     */
    public String getCalendario() {
        return calendario;
    }

    /**
     * @param calendario the calendario to set
     */
    public void setCalendario(String calendario) {
        this.calendario = calendario;
    }
    
}
