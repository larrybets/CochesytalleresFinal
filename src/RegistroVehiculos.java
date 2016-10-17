import com.sun.istack.internal.Nullable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken.Optional;


/**
 * Created by DAM on 6/10/16.
 */
public class RegistroVehiculos {


    private Set<Coche> coches = new HashSet<>();

    public void registrarVehiculo(Coche coche) {
        coches.add(coche);
    }

    // Optional<Coche> es una nueva funcionalidad de Java 8 para evitar trabajar con null
    // Lo puedes omitir si trabajas con Java 7
    public Coche obtenerVehiculo(String matricula) {

        Coche devuelto = null;
        for (Coche obten : coches) {
            if (obten.getMatricula().equals(matricula)) {
                devuelto = obten;
                break;
            }
        }
        return devuelto;
    }

    public void eliminarVehiculo(String matricula) {
        Coche eliminado = null;
        for ( Coche encontrado: coches){
            if (encontrado.getMatricula().equals(matricula)){
                eliminado = encontrado;
            }
        }
    }

    public Coche obtenerVehiculoPrecioMax() {
        Coche max = new Coche("", "", "", 0);
        for (Coche obten : coches) {
            if (obten.getPrecio() > max.getPrecio()) {
                max = obten;
            }
        }
        return max;
    }

    public List<Coche> obtenerVehiculosMarca(String marca) {
        List<Coche> lista = new ArrayList<Coche>();
        for (Coche obten : coches) {
            if (obten.getMarca().equals(marca)) {
                lista.add(obten);
            }
        }
        return lista;
    }

    public List<Coche> obtenerTodos() {
        return new ArrayList<Coche>(coches);
    }
}



