/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dijkstra;

/**
 *
 * @author KevinT
 */
public class DijkstraFormula {

    public void DijkstraFormula(String[][] m, int a, int n) {
        String[] s = new String[n];
        String[] d = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = "0";
            d[i] = m[a][i];
        }
        s[a] = "1";
        d[a] = "∞";
        for (int k = 1; k < n; k++) {
            int j = this.getArrayMin(d, s);
            s[j] = "1";
            for (int i = 0; i<s.length;i++) {
                if(Character.isDigit(d[i].charAt(0))==true && Integer.parseInt(s[i])==0){
                    if (Integer.parseInt(d[j]) + Integer.parseInt(m[j][i]) < Integer.parseInt(d[i])) {
                        d[i] = Integer.parseInt(d[j]) + Integer.parseInt(m[j][i])+" ";
                    }
                }
            }

        }

        for(int i = 0;i<s.length;i++){
            System.out.println("Barisan S =" + s[i]);
            System.out.println("Barisan D=" + d[i]);
        }

    }

    public int getArrayMin(String[] input, String []input2) {
        int res = 99999;
        int output = 0;
        for (int i = 0; i < input.length; i++) {
            
            if (Character.isDigit(input[i].charAt(0))==true && res>Integer.parseInt(input[i]) &&Integer.parseInt(input2[i])==0) {
                System.out.println("test");
                res=Integer.parseInt(input[i]);
                output = i;
            }
            else
            {
                
            }
        }
        return output;
    }
}
