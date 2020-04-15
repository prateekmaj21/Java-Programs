/*A palindrome number is a number that is same after reverse.
 *For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 
 */

import java.io.*;  
class Palindrome
{    
public static void main(String args[])throws Exception
{   
    InputStreamReader in=new InputStreamReader(System.in);    
    BufferedReader input=new BufferedReader(in);
    int r ,sum=0,temp;
    int n;
   
    System.out.println("Enter the number");
    n=Integer.parseInt(input.readLine());
    
    temp=n;
    while(n>0)
    {
        r=n%10; //getting the remainder
        sum=(sum*10) + r;
        n=n/10;
    }
    if (temp==sum)
     System.out.println(temp+" Is a palindrome number");
    else
     System.out.println(temp+" Is not a palindrome number");
    }
}

    
 


