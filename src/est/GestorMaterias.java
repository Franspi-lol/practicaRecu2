package est;

import est.materiaYaExistenteException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GestorMaterias <K,T> //implements ico.IColecciones<T>
{
    private HashMap<K,T> materias;

    public GestorMaterias()
    {
        materias=new HashMap<>();
    }

    public Iterator getIterator()
    {
        return materias.entrySet().iterator();
    }


    public void agregar( K Key, T objeto) throws materiaYaExistenteException {
        if (materias.containsKey(Key))
        {
            throw new materiaYaExistenteException("Ya estaba esta materia");
        }else
        {
            materias.put(Key, objeto);
        }
    }

    public String listar()
    {
        String a= new String();
        Iterator iterator = getIterator();
        while (iterator.hasNext())
        {
            Map.Entry entry = (Map.Entry) iterator.next();
            T objeto = (T) entry.getValue();
            a=a+objeto.toString();

        }
        return a;
    }


    public int contar(){
        return materias.size();
    }


    public void vaciar()
    {
        materias.clear();
    }

}
