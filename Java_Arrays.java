/* general syntax
data type[] array name = new data type[size];
*/
public class Java_Arrays{
    public static void main(String[] args){
        //telling the program I want an array called prices of the double type length 5 (up to index 4)
        double [] prices= new double[3];
        // this could be done via the scanner as well
        prices[0]=1.99;
        prices[1]=2.86;
        prices[2]=.49;
        double total= prices[0]+prices[1]+prices[2];
        System.out.println("The total is: " + total);
    }
}