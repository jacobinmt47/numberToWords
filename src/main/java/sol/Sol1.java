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
     *
     * @param n
     * @return String The english phrase that says the number
     */
    String intToWord(int n) {
        int arr[] = new int[10];
        int total = 1;
        int d = 1;
        int old = 1;
        Boolean smaller = true;
        for (int i = 0; (i < 9) && smaller; i++) {
           // System.out.println(n % total);
            smaller = !(n % total == n);
            if (total > 10) {
                d = ((n % total - old) / (total / 10));
            } 
            else{
                d = n%total;
            }
            //System.out.println(d);
            arr[i]=d;
            old = n % total;
            total = total * 10;
        }

        for (int i = 0; i < arr.length; i++) {
            int j = arr[i];
            System.out.println(j);
            
        }
        return "";
    }

    public static void main(String args[]) {
        Sol1 s = new Sol1();
        s.intToWord(123456);
    }
}
