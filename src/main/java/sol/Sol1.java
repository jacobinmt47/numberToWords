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

    String tensWord(int n) {
        String ret;
        switch (n) {
            case 0:
                ret = "Ten";
                break;
            case 1:
                ret = "Eleven";
                break;
            case 2:
                ret = "Twelve";
                break;
            case 3:
                ret = "Thirteen";
                break;
            case 4:
                ret = "Fourteen";
                break;
            case 5:
                ret = "Fifteen";
                break;
            case 6:
                ret = "Sixteen";
                break;
            case 7:
                ret = "Seventeen";
                break;
            case 8:
                ret = "Eighteen";
                break;
            case 9:
                ret = "Nineteen";
                break;
            default:
                ret = "invalid digit tens";
        }
        return ret;
    }

    String oneWord(int n) {
        String ret;
        switch (n) {
            case 0:
                ret = null;
                break;
            case 1:
                ret = "One";
                break;
            case 2:
                ret = "Two";
                break;
            case 3:
                ret = "Three";
                break;
            case 4:
                ret = "Four";
                break;
            case 5:
                ret = "Five";
                break;
            case 6:
                ret = "Six";
                break;
            case 7:
                ret = "Seven";
                break;
            case 8:
                ret = "Eight";
                break;
            case 9:
                ret = "Nine";
                break;
            default:
                ret = "invalid digit";
        }
        return ret;
    }

    /**
     * convert groups of three to words
     *
     * @param h hundreds
     * @param t tens
     * @param o zero through nine
     * @return
     */
    String threeWord(int h, int t, int o, String prefix) {
        String ret = null;
        String tens;
        String ones = oneWord(o);

        switch (t) {
            case 0: 
                tens = null;
                break;
            case 1:
                tens = tensWord(o);
                ones = null;
                break;
            case 2:
                tens = "Twenty";
                break;
            case 3:
                tens = "Thirty";
                break;
            case 4:
                tens = "Forty";
                break;
            case 5:
                tens = "Fifty";
                break;
            case 6:
                tens = "Sixty";
                break;
            case 7:
                tens = "Seventy";
                break;
            case 8:
                tens = "Eighty";
                break;
            case 9:
                tens = "Ninety";
                break;
            default:
                tens = "invalid tens";
                break;
        }
        String hundreds = oneWord(h);
        if (h > 0) {
            ret = hundreds + " " + prefix + " " + tens + " " + ones;
        } else {
            if(ones == null){
                ret = tens;
            }else{
                if(tens == null){
                    ret = ones;
                }
                else{
                ret = tens +" "+ones;
            }
           }
        }
            
        return ret;
    }

    /**
     * convert int to english words
     *
     * @param n
     * @return String The english phrase that says the number
     */
    String numberToWords(int n) {
        int arr[] = new int[11];
        int total = 1;
        int d = 1;
        int old = 1;
        String ret = "blank";
        Boolean smaller = true;
        for (int i = 0; (i < 10) && smaller; i++) {
            // System.out.println(n % total);
            smaller = !(n % total == n);
            if (total > 10) {
                d = ((n % total - old) / (total / 10));
            } else {
                d = n % total;
            }
            //System.out.println(d);
            arr[i] = d;
            old = n % total;
            total = total * 10;
        }
        String r4 = null;
        String r3 = null;
        String r2 = null;
        String r1 = threeWord(arr[3], arr[2], arr[1], "Hundred");
        if (arr[10] > 0) {
            r4 = oneWord(arr[10]);
        }
        if ((arr[6] > 0) || (arr[5] > 0) || (arr[4] > 0)) {
            r2 = threeWord(arr[6], arr[5], arr[4], "Hundred");
        }
        if (arr[9] > 0 || arr[8] > 0 || arr[7] > 0) {
            r3 = threeWord(arr[9], arr[8], arr[7], "Hundred");
        }
        Boolean guard = true;
        if(r4 !=null){
            ret = r4+" Billion "+r3+" Million "+r2+" Thousand "+r1;
            guard = false;
        }
        if (r3 != null && guard) {
            if(r2 !=null){
                ret = (r3 + " Million " + r2 + " Thousand " + r1);
            }else{
            ret = r3+" Million "+r1;
            }
            guard = false;
        }
        if (r2 != null && guard) {
            ret = (r2 + " Thousand " + r1);
        }
        if (r3 == null && r2 == null) {
            ret = r1;
        }
        System.out.println(ret);
        return ret;
    }

    public static void main(String args[]) {
        Sol1 s = new Sol1();
       // s.numberToWords(12345);
        //System.out.println(s.threeWord(0, 1, 2,null));
        System.out.println(s.numberToWords(1000000)); 
        
    }
}
