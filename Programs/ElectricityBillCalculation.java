import java.io.*;

class ElectricityBillCalculation {
    public static void main(String[] args) throws IOException {
        int units = 0, charge = 0;
        double payableAmount = 0.0;

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter the units : ");
        units = Integer.parseInt(br.readLine());
          
        if(units <= 100)
        {
                payableAmount = units * 2.5;
        }
        if (units >= 101 && units <= 300 ) 
        {
               payableAmount = (100 * 2.5) + ((units - 100) * 3.5);
        }
        if(units >= 301 && units <= 500) 
        {
                payableAmount = (300 * 3.5) + ((units - 300) * 4.5);
        }
        if (units > 500) 
        {
                payableAmount = units * 5;
        }
        System.out.println("The total amount for " + units + " units is : " + payableAmount);

    } 
} 