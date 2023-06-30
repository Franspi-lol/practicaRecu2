package ico;

public interface IColecciones <T>
{
    public void agregar(T objeto);

    public String listar();


    public int contar();


    public void vaciar();

}
