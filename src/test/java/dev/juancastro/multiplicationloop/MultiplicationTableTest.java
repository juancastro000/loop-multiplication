package dev.juancastro.multiplicationloop;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class MultiplicationTableTest {

     @Test
    void testGenerateTable() {
        MultiplicationTable table = new MultiplicationTable();
        String[] result = table.generateTable(5);
        
        assertThat(result, arrayWithSize(10));
        assertThat(result, arrayContaining(
            "5 x 1 = 5",
            "5 x 2 = 10",
            "5 x 3 = 15",
            "5 x 4 = 20",
            "5 x 5 = 25",
            "5 x 6 = 30",
            "5 x 7 = 35",
            "5 x 8 = 40",
            "5 x 9 = 45",
            "5 x 10 = 50"
        ));
    }
}
