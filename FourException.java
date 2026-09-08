import java.util.*;
public class FourException{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] data = {"50", "0", "five", null, "10"};
        int[] multipliers = {1, 2, 3};
        int val;
        double ans;
        for(int i = 0;i < 5;i++)
        {
            try{
                System.out.println("Length of string "+data[i].length());
                val = Integer.parseInt(data[i]);
                ans = 100 / val;
                System.out.println("Result : "+ans);
                System.out.println("Multipliers : "+multipliers[i]);
            }
            catch(ArithmeticException e){
                System.out.println("Arithmetic exception !");
            }
            catch(ArrayIndexOutOfBoundsException a){
                System.out.println("Array INdex out of bounds !");
            }
            catch(NumberFormatException f){
                System.out.println("Number Format Exception !");
            }
            catch(NullPointerException n){
                System.out.println("Null pointer Exception !");
            }
            catch(Exception e){
                System.out.println("Catch an unknown exception !");
            }
            System.out.println("--- Moving to next loop ---");
            sc.close();
        }
    }
}