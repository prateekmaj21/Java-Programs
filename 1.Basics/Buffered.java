//Usage of Buffered Reader to take input from console

import java.io.*;  
public class Buffered
{    
public static void main(String args[])throws Exception
{             
    int age;
    InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);            
    System.out.println("Enter your name");    
    String name=br.readLine();    
    System.out.println("Enter your age");
    age=Integer.parseInt(br.readLine());
    System.out.println("Welcome "+name); 
    System.out.println("Age= "+age);
}    
}  