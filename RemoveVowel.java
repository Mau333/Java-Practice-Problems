/*Write a program in Java to accept a string and display the new string after removing all 
the vowels present in it.
Input: computer applications
Output: c@mp@t@r @ppl@c@t@@ns */
import java.util.Scanner;
public class RemoveVowel {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string :- ");
        StringBuilder s=new StringBuilder(sc.nextLine());
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
            {
                s.replace(i,i+1,"@");
            }
        }
    
        System.out.println(s);

    }
    
}
