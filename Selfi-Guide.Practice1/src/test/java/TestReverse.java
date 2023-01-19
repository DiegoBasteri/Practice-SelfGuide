
import org.example.StringHelper;
import org.example.TemperatureConverter;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReverse {


    @Test
    public void test_reverse_string() {

        assertEquals("alponitnatsnoC",new StringHelper().reverseWord("Constantinopla"));
    }

    @Test
    public void should_Return_IlegalArgument_When_Zero(){
        assertThrows(IllegalArgumentException.class, () -> new StringHelper().reverseWord(""));

    }

    @Test
            (expected = IllegalArgumentException.class)
    public void test_reverseWord_with_null_string() {
        String word = null;
        StringHelper.reverseWord(word);
    }

}
