import java.util.*;
public class Main{
    public static int convertUSDtoINR(int USD){
        int INR = USD*76;
        return INR;
    }
    public static int convertINRtoEU(int EU){
        int IndR = EU*84;
        return IndR;
    }
   
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your USD to convert");
        int USD = sc.nextInt();
        int INR = convertUSDtoINR(USD);
        System.out.println("Your Indian Currency is "+ INR);
        System.out.println("Enter your Currency in EU.");
        int EU = sc.nextInt();
        int IndR = convertINRtoEU(EU);
        System.out.println("Your Converted INR is "+ IndR);
   
    }
}