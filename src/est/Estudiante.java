package est;

import java.util.Objects;


public class Estudiante
{
    private String nombre;
    private String apellido;
    private String legajo;
    private GestorMaterias<String, Materia> materias;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String legajo, GestorMaterias materias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public GestorMaterias getMaterias() {
        return materias;
    }

    public void setMaterias(GestorMaterias materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        return "est.Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo='" + legajo + '\'' +
                ", materias=" + materias.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido) && Objects.equals(legajo, that.legajo) && Objects.equals(materias, that.materias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, legajo, materias);
    }
}
