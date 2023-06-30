package est;

import ico.IColecciones;

import java.util.ArrayList;

public class Notas<T> implements IColecciones<T>
{
    private ArrayList<T> notas;

    public Notas()
    {
        notas=new ArrayList<>();
    }

    public void agregar(T objeto)
    {
        //boolean seAgrego = false;
        notas.add(objeto);
    }

    public String listar()
    {
        String a =new String();
        if (notas.isEmpty())
        {
            a="vacio";
        }else
        {
            for (T b:notas)
            {
                a=notas.toString();
            }
        }
        return a;
    }

    public int contar()
    {
        return notas.size();
    }

    public void vaciar()
    {
        this.notas.clear();
    }



}
