import java.util.*;
import java.io.*;

public class PreFinals_Activity2
  {

   public static void main(String[] args) throws IOException
   {
 
   
   ArrayList<String> words = new ArrayList<String>(); //for storing the word that user have entered
   Scanner deybid = new Scanner(System.in);
   //
   Boolean x = false;
       while(!x)
   {
 
   String letter = deybid.nextLine();
   if(!letter.equals(":q")) //if the entered word is not correct then it will continuously and it will stop
   {
   
 
  Base64.Encoder tagaEncode = Base64.getEncoder(); //this is for returning the string that encodes using base64
  String enc;
  enc = tagaEncode.encodeToString(letter.getBytes()); //converts the given String to base64 encryption
  words.add(enc); //adding the word to arraylis
  System.out.println(enc); //this is to rpint the encrpted word
   }
   else
   {
   x = true; //to stop the condition
   }
      }
     
      System.out.println("Do u want to save it? ");
        System.out.println("Yes or No? ");
        String save = deybid.next();
       
       if(save.equals("yes")) 
        {
       
        System.out.println("Enter your file name: ");
   String Input_Filename = deybid.next();
   Writer fw = new FileWriter(Input_Filename+".DMN"); //this is for saving the word in the file
   for(String a: words) //to get the store words in array list and relocate it to string
   {
   fw.write(a); //to get the encrypted word and shifted it to the file
        }
       
        fw.close();
        }
        else
        {
        System.out.println("Not Save");
        }
   
  }
  }  