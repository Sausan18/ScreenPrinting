import java.util.Scanner;
/**
 * class Main ini adalah untuk menjalankan program dan menampilkan output program dan menerima inputan.
 */
public class Main
{
    // method untuk menjalankan program
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // variable
        String category;
        ScreenPrint screenPrinting = new ScreenPrint();
        String currency;
        String exchangeCurrency;
        int chooseCurrency = 0;
        int inputMoney = 0;
        Currency c;
        Currency converted;
        double change = 0 ;

        System.out.println("========== San's Screen Printing ==========\n");
        System.out.println("Please select your currency : ");            
        System.out.println("1. Ringgit Malaysia \n2. Dollar Singapore");
        System.out.print("\nYour Currency : ");
        chooseCurrency = input.nextInt();
        
        // untuk memilih antara mata uang(currency) yang tersedia
        if(chooseCurrency == 1){
            System.out.println("Your Currency is Ringgit Malaysia");
        }
        else {
            System.out.println("Your Currency is Dollar Singapore");
        }
        
        System.out.println("\nPlease select the design category you want to print :\n");
        System.out.println("A = Typography\t\t\t\t(Rp. 50.000) \nB = Sketch/Picture\t\t\t(Rp. 50.000) \nC = Typography and Sketch/Picture\t(Rp. 90.000)\n");
        System.out.print("Enter your Choise : ");
        category = input.next();
        
        // untuk memilih ingin mencetak design A,B,atau c
        if(category.equalsIgnoreCase("A")){
            screenPrinting.setScreenPrinting(new DesignA());
        }
        else if(category.equalsIgnoreCase("B")){
            screenPrinting.setScreenPrinting(new DesignB());
        }
        else if(category.equalsIgnoreCase("C")){
            screenPrinting.setScreenPrinting(new DesignC());
        }

        System.out.println("============================================\n");
        System.out.println("The design to be printed is : " +screenPrinting.getScreenPrinting());
        screenPrinting.designCategory();
        System.out.println();
        
        System.out.println("============================================");
        // untuk menjalankan penginputan dalam ringgit jika yang dipilih pilihan 1
        if(chooseCurrency == 1) {
            System.out.print("\nInput your money (1Rm = 3433.23) : ");
            inputMoney = input.nextInt();
            c = new Ringgit(inputMoney);
            converted = new RmToRp(c);
            change = converted.getMoney() -  screenPrinting.getPrice();
            
            // untuk menjalankan penginputan uang kembali jika uang tidak cukup dan pengembalian uang jika ada
            while(change < 0){
                change = change * -1;
                System.out.println("\nSorry, your money is not enough, please input your money again!");
                System.out.println("Remain cost : " +change );
                System.out.print("\nInput your money (1Rm = 3433.23) : ");
                inputMoney = input.nextInt();
                c = new Ringgit(inputMoney);
                converted = new RmToRp(c);
                change = converted.getMoney() -  change;
            }
        }
        // untuk menjalankan penginputan dalam dollar singapore jika yang dipilih pilihan 2
        else if(chooseCurrency == 2) {
            System.out.print("\nInput your money (S$1 = 10553.50) : ");
            inputMoney = input.nextInt();
            c = new DollarSingapore(inputMoney);
            converted = new DsToRp(c);
            change = converted.getMoney() -  screenPrinting.getPrice();
                
            // untuk menjalankan penginputan uang kembali jika uang tidak cukup dan pengembalian uang jika ada
            while(change < 0){
                change = change * -1;
                System.out.println("\nSorry, your money is not enough, please input your money again!");
                System.out.println("Remain cost : " +change );
                System.out.print("\nInput your money (S$1 = 10553.50) : ");
                inputMoney = input.nextInt();
                c = new DollarSingapore(inputMoney);
                converted = new DsToRp(c);
                change = converted.getMoney() -  change;
            }   
        }
        System.out.println("Change Money : "+change);
   
        input.close();
    }
}