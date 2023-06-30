package est;

import java.util.Objects;

public class Materia
{
    private String codigo;
    private String nombreMat;
    private Notas notas;

    public Materia(String codigo, String nombreMat, Notas notas) {
        this.codigo = codigo;
        this.nombreMat = nombreMat;
        this.notas = notas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreMat() {
        return nombreMat;
    }

    public void setNombreMat(String nombreMat) {
        this.nombreMat = nombreMat;
    }

    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "est.Materia{" +
                "codigo='" + codigo + '\'' +
                ", nombreMat='" + nombreMat + '\'' +
                ", notas=" + notas.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Materia materia = (Materia) o;
        return Objects.equals(codigo, materia.codigo) && Objects.equals(nombreMat, materia.nombreMat) && Objects.equals(notas, materia.notas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombreMat, notas);
    }
}
