package Hometask;
import java.util.*;


public class FilterLaptop {
    public static void main (String[] args) 
    {

        Laptop MSI_01 = new Laptop("MSI", "123qwe", "15", "500", "black");
        Laptop MSI_02 = new Laptop("MSI", "aqsd234", "17", "1024", "grey");
        Laptop Samsung_01 = new Laptop("Samsung", "sdf45", "15", "2048", "white");
        Laptop Samsung_02 = new Laptop("Samsung", "ghj700", "15", "500", "black");
        Laptop Sony_01 = new Laptop("Sony", "as1200", "17", "1024", "black");
        Laptop Sony_02 = new Laptop("Sony", "555dfg", "17", "2048", "grey");
        Laptop Asus_01 = new Laptop("Asus", "hhj56", "15", "500", "white");
        Laptop Asus_02 = new Laptop("Asus", "432zxc", "17", "2048", "black");

        List<Laptop> laptoplist = List.of(MSI_01, MSI_02, Samsung_01, Samsung_02, 
            Sony_01, Sony_02, Asus_01, Asus_02);

        
           
       
        Scanner userInputType = new Scanner(System.in);
        System.out.println("Enter number of what you want to search:\n1 - Name\n" +
                            "2 - color\n" + "3 - size\n");
        int typeofsearch = userInputType.nextInt();
        
        Scanner userInputValue = new Scanner(System.in);
        if (typeofsearch==1){
            System.out.println("Enter one of values:\nBrand: MSI  Samsung  Sony  Asus\n");
            }
        if (typeofsearch==2){
            System.out.println("Enter one of values:\nColor: Black  White  Grey\n");
            }
        if (typeofsearch==3){
            System.out.println("Enter one of values:\nSize: 15  17\n");
            }
        String valueofsearch = userInputValue.next();
        
        System.out.println(valueofsearch);

        if (typeofsearch == 1) 
        {
            for (Laptop name : laptoplist) 
            {
                if (name.getName().equalsIgnoreCase(valueofsearch)) 
                {
                    name.printInfo();
                }
                else 
                {
                    System.out.println("Error message: you enter wrong value");
                }
            }
        } 
        else if (typeofsearch == 2)
        {
            for (Laptop color : laptoplist) 
            {
                if (color.getColor().equalsIgnoreCase(valueofsearch)) 
                {
                    color.printInfo();
                }
                else 
                {
                    System.out.println("Error message: you enter wrong value");
                }
            }
        } 
        else if (typeofsearch == 3)
        {
            for (Laptop size : laptoplist) 
            {
                if (size.getSize().equalsIgnoreCase(valueofsearch)) 
                {
                    size.printInfo();
                }
                else 
                {
                    System.out.println("Error message: you enter wrong value");
                }
            }
        
        }

        userInputType.close();
    }
}
