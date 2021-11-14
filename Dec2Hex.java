import java.util.Scanner;
import java.util.logging;
class Dec2Hex
{

    public static int Arg1;

    public static void main(String args[])
    {

        try
        {
            if(args.length != 0)
            {
              String input = args[0];
              Arg1 = Integer.parseInt(input);
              char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
              int rem, num;
              num = Arg1;
              String hexadecimal="";
              logger.log("Converting the Decimal Value " + num + " to Hex...");

              while(num != 0)
              {
                  rem=num%16;
                  hexadecimal= ch[rem] + hexadecimal;
                  num= num/16;
              }
            
              logger.log("Hexadecimal representation is: " + hexadecimal);
          }

        else
        {
            logger.log("Please input something into the field and don't leave it empty");
        }

        }
        catch (NumberFormatException e)
        {
            logger.log("You tried inputting a non int into a converter this error occured: " + e);
        }
    }
}
