import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
if(isPalindrome(s))
System.out.println(s+" is palindrome");
else
System.out.println(s+" is not a palindrome");
}
static boolean isPalindrome(String s)
{
if(s.length()==0 || s.length()==1)
return true;
if(s.charAt(0)==s.charAt(s.length()-1))
return isPalindrome(s.substring(1,s.length()-1));
return false;
}
}

output1:

madam
madam is palindrome

output2:

class
class is not a palindrome