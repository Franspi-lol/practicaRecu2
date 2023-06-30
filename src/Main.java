import JSON.LecturaEscritura;
import est.*;
import org.json.JSONException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws materiaYaExistenteException, JSONException {

        Notas notas=new Notas<>();
        notas.agregar(1);
        Materia a = new Materia("pro", "programacion", notas);

        Materia b = new Materia("mat","matematica", notas);
        Materia c = new Materia("ber","verga", notas);
        GestorMaterias<String,Materia> gestorMaterias = new GestorMaterias<>();
        gestorMaterias.agregar(a.getCodigo(),a);
        gestorMaterias.agregar(b.getCodigo(),b);
        gestorMaterias.agregar(c.getCodigo(),c);
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("franco");
        estudiante.setApellido("bernar");
        estudiante.setMaterias(gestorMaterias);
        System.out.println(estudiante.getMaterias().listar());
        LecturaEscritura lye=new LecturaEscritura();
        lye.grabarEstudiante("test",estudiante);

    }
}