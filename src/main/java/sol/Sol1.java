/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol;

/**
 *
 * @author jacob
 */
public class Sol1 {
    /**
     * convert int to english words
     * @param n
     * @return String The english phrase that says the number
     */
    String intToWord(int n){
        int total = 1;
        int old  = 0;
        Boolean smaller = true;
        for (int i = 0; (i < 9)&&smaller; i++) {
            System.out.println(n%total);
            smaller = !(n%total == n);
            System.out.println((n%total - old));
            old = n%total;
            total = total*10;
        }
        return "";
    }
    public static void main(String args[]){
        Sol1 s = new Sol1();
        s.intToWord(123456);
    }
}
