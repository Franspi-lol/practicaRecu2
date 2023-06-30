package JSON;

import est.Estudiante;
import est.Materia;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class LecturaEscritura extends JsonUtiles
{
    public void grabarEstudiante(String archivo, Estudiante estudiante) throws JSONException
    {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", estudiante.getNombre());
        jsonObject.put("apellido", estudiante.getApellido());
        jsonObject.put("legajo", estudiante.getLegajo());
        //jsonObject.put("Materias", estudiante.getMaterias());
        JSONArray jsonArray=new JSONArray();


        Iterator iterator=estudiante.getMaterias().getIterator();
        while (iterator.hasNext())
        {
            JSONObject jsonObjectMaterias = new JSONObject();
            //JSONArray jsonArray=new JSONArray();
            Map.Entry entry= (Map.Entry) iterator.next();
            Materia materia = (Materia) entry.getValue();
            jsonObjectMaterias.put("codigo",materia.getCodigo());
            jsonObjectMaterias.put("nombre", materia.getNombreMat());
            jsonArray.put(jsonObjectMaterias);
        }
        jsonObject.put("Materias", jsonArray);
        JsonUtiles.grabar(jsonObject,archivo);
    }

   public Estudiante leerEstudiante(String archivo)
    {
        ArrayList<Estudiante>arrayList=new ArrayList<>();
        String jsonArrayEstudiante= JsonUtiles.leer(archivo);
        try {
            JSONArray jsonArray=new JSONArray(jsonArrayEstudiante);
            JSONObject jsonObjectEstudiante = jsonArray.getJSONObject(0);

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        return null;
    }


}
