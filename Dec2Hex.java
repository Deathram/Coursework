import java.util.Scanner;
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
              System.out.println("Converting the Decimal Value " + num + " to Hex...");

              while(num != 0)
              {
                  rem=num%16;
                  hexadecimal= ch[rem] + hexadecimal;
                  num= num/16;
              }
            
              System.out.println("Hexadecimal representation is: " + hexadecimal);
          }

        else
        {
            System.out.println("Please input something into the field and don't leave it empty" + e);
        }

        }
        catch (NumberFormatException e)
        {
            System.out.println("You tried inputting a non int into a converter this error occured: " + e);
        }
    }
}
