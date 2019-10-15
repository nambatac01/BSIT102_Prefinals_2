import java.io.*;
import java.util.*;


public class Reader
  
{
public static void main (String[] args) throws IOException
    {
Base64.Decoder decs = Base64.getDecoder(); //this is for returning the string that decodes using basic types of base64
    
       
   System.out.println("Enter your file: ");
   Scanner deybid = new Scanner(System.in);
   
   File filemo = new File(deybid.nextLine() +".DMN"); //to read the file name
   deybid = new Scanner(filemo);
 
 
   String a = deybid.nextLine();
   String decoded = new String(decs.decode(a)); //use to converts the given base64 encryption
      System.out.println(decoded); //to print the decode word
   
   deybid.close();
}
   
   
   
}