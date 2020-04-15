/*A positive number is called armstrong number if it is equal to the sum of cubes of its digits.
 * Example- 0, 1, 153, 370, 371, 407.
 */


import java.io.*;  
class Armstrong
{    
public static void main(String args[])throws Exception
{   
    InputStreamReader reader=new InputStreamReader(System.in);    
    BufferedReader input=new BufferedReader(reader);
    int sum=0,r,temp;
    int n;
    System.out.println("Enter the number");
    n=Integer.parseInt(input.readLine());
    
    temp=n;
    while(n>0)
    {
        r=n%10;
        n=n/10;
        sum=sum+(r*r*r);
    }
    if (temp==sum)
        System.out.println("Armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  
}  


        
    