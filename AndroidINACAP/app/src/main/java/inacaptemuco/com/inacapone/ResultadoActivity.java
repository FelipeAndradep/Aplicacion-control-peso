package inacaptemuco.com.inacapone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import Operaciones.Salud;

public class ResultadoActivity extends AppCompatActivity {
   //1.- Creamos un objeto de la clase TextView
    TextView txvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        //2. Asociar al objeto el componente del layout
        txvResultado            = (TextView) findViewById(R.id.txv_resultado);
        //3. Capturamos el objeto de la clase Intent que se envía desde el MainActivity
        Intent intento          = getIntent();
        //4.- Obtenemos los datos enviados en el activity
        Bundle datosRecibidos   = intento.getExtras();
        //5. Capturamos uno de los datos enviados desde el Activity mediante el intento.
        int edadRecibida      = datosRecibidos.getInt("p_edad");
        String nombreRecibido = datosRecibidos.getString("p_nombre");
        int pesoActualRecibido      = datosRecibidos.getInt("p_pesoActual");

        //5.0 Creamos objeto de la clase salud
        Salud salud = new Salud();
        //5.1 mediante los setter asignamos las propiedades al objeto
        salud.setNombre(nombreRecibido);
        salud.setEdad(edadRecibida);
        salud.setpesoActual(pesoActualRecibido);

        //6. Modificamos el TextView de Resultado con lo que corresponda
        txvResultado.setText("Peso ideal de "+salud.getNombre()+" es: "+ salud.calcularPesoIdeal()+ " Su estado de peso es:  "+ salud.compararPeso());
        }
    }


