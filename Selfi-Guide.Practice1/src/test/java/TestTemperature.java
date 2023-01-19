import org.example.TemperatureConverter;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTemperature {

    @Test
    public void should_Return_Celcius(){
        assertEquals(37, new TemperatureConverter().FahrenheitToCelsius(98.6));

    }

}