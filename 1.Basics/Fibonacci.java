/*In fibonacci series, next number is the sum of previous two numbers.
 *For example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
 *The first two numbers of fibonacci series are 0 and 1.
 */


import java.io.*;  
class Fibonacci
{    
public static void main(String args[])throws Exception
{   
    InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);
    int a=0,b=1,c,i,n;
    System.out.println("Enter the number of terms=");
    n=Integer.parseInt(br.readLine());
    
   System.out.println(a);
   System.out.println(b);
   
   for(i=3;i<=n;++i)//loop starts from 2 because 0 and 1 are already printed    
   {    
    c=a+b;    
    System.out.println(c);    
    a=b;    
    b=c;    
   } 
}
}
