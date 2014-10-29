/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dijkstra;

/**
 *
 * @author KevinT
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Dijkstra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader("src/1.in")));
        DijkstraFormula DF = new DijkstraFormula();
        String n = sc.next();
        String[][] A = new String[Integer.parseInt(n)][Integer.parseInt(n)];
        for (int i = 0; i < Integer.parseInt(n); i++) {
            for (int j = 0; j < Integer.parseInt(n); j++) {
                A[i][j] = sc.next();
            }
        }
        DF.DijkstraFormula(A,0 , Integer.parseInt(n));
    }
}
