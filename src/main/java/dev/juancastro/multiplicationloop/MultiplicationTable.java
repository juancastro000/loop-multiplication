package dev.juancastro.multiplicationloop;

public class MultiplicationTable {

    public String[] generateTable(int n) {
        String[] table = new String[10];
        
        for (int i = 0; i < 10; i++) {
            int multiplier = i + 1;
            table[i] = n + " x " + multiplier + " = " + (n * multiplier);
        }
        
        return table;
    }
}
