/*Name: Ng Ke Rong*/
/*No.Matrik: 271063*/

import java.util.*;

public class HelloWorld2{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*Input miles*/
        System.out.print("Enter an miles\t\t:");
        double miles = input.nextDouble();
        System.out.println("Your answer\t\t:" +miles);
        
        /*Output kilometer*/
        double KM = miles*1.609;
        System.out.println("Convert to kilometer\t:" +KM);
        
        input.close();
    }


}