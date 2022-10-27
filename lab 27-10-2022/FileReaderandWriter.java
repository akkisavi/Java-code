package lab_27_10_2022;

import java.io.FileReader;
import java.io.FileWriter;  
public class FileReaderandWriter
  {  
    public static void main(String args[])
    {    
         try{    
           FileWriter x=new FileWriter("D:\\ReadWrite.txt");    
           x.write("Hello this is test lab file");    
           x.close();    
           FileReader y=new FileReader(D:\\ReadWrite.txt);    
           int i;    
           while((i=y.read())!=-1)    
           System.out.print((char)i);    
           y.close();    
          }
          catch(Exception e)
          {
            System.out.println(e);
        }    
          System.out.println("\n File created successfully...");    
     }  
  }    
