import java.util.Scanner;

public class ShallWeContinue {


    public static void main(String[] args)
    {
          String ans;


          Scanner scan= new Scanner (System.in);
//This do while method caters for values other than "y" and "n" and diplays Thank you if the answere is "n"
         do{

             System.out.println("Do you want to Continue?");
             ans=scan.next ();
             if( ans.equalsIgnoreCase ( "n" ) )
             {
                 System.out.println("Thank you!");

                // System.exit ( 0 );
             }


         }while(ans.equalsIgnoreCase ( "y" )||ans.equalsIgnoreCase ( "n" ));


    }
}
