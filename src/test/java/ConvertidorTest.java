import com.model.Convertidor;
import com.model.Fahrenheit;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertidorTest {

    @Test
    public void convertirGradosFahrenheitaCelsius(){
        Convertidor convertidor = new Convertidor("Fahrenheit",71.6, "Celsius");
        double resultado = 0;
        resultado = convertidor.convertirGrado();
        assertEquals(resultado,22);
    }

    @Test
    public void convertirGradosCelciusaFahrenheit(){
        Convertidor convertidor = new Convertidor("Celsius",22, "Fahrenheit");
        double resultado = 0;
        resultado = convertidor.convertirGrado();
        assertEquals(resultado,71.6);
    }

}
