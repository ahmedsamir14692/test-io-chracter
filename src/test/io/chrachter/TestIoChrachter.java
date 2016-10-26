
package test.io.chrachter;
import java.io.*;

public class TestIoChrachter {

    
    public static void main(String[] args) {
File txt10 = new File ("C:/Documents and Settings/ahmed samir/Desktop/New Text Document (3).txt");
try
{
//    FileOutputStream ss = new FileOutputStream (txt10);
//   
//  
//    DataOutputStream towr = new DataOutputStream (ss);
//    towr.writeUTF("amal sotha law7do buhigne");
     
//    FileWriter write = new FileWriter (txt10);
//    write.write("ana nafse a7don teez ammal");
    FileReader read = new FileReader (txt10);
    BufferedReader buf = new BufferedReader (read);
      System.out.println(buf.ready());
      int len;
      char [] arr = new char [50];
      
//    System.out.println(buf.readLine());
    System.out.println(buf.ready());
    File txt6= new File ("C:/Documents and Settings/ahmed samir/Desktop/New Text Document (6).txt");
    FileWriter write = new FileWriter (txt6);
   String ss;

//    write.write(ss);
//    BufferedWriter bufw = new BufferedWriter (write);
//    while ((len=buf.read(arr))>0)
//    bufw.write(arr,0,len);
PrintWriter print = new PrintWriter (write,true);
print.println(buf.readLine());



    
    
}
    
    catch(IOException ex)
    {
        ex.printStackTrace();
        
    }    

File monir = new File ("E:songs/محمد منير/01 الألبومات/2012 يا اهل العرب و الطرب/Nogomi.com_Mohamed_Mounir-04.Albi_Maishbhnesh.mp3");



    }
    
}
