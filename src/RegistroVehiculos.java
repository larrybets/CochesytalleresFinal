import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Created by DAM on 6/10/16.
 */
public class RegistroVehiculos {


    private Set<Coche> coches = new HashSet<>();

    public void registrarVehiculo(Coche coche){
    }

    // Optional<Coche> es una nueva funcionalidad de Java 8 para evitar trabajar con null
    // Lo puedes omitir si trabajas con Java 7
    public Optional<Coche> obtenerVehiculo(String matricula){

    }

    public void eliminarVehiculo(String matricula){
    }

    public Optional<Coche> obtenerVehiculoPrecioMax(){
    }

    public List<Coche> obtenerVehiculosMarca(String marca){
    }

    public List<Coche> obtenerTodos(){
    }
}



