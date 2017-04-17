import java.util.*;
class palindrome
{
public static void main(String args[])
{
Scanner t=new Scanner(System.in);
String orig=t.nextLine();
StringBuffer buf=new StringBuffer(orig);
buf.reverse();
if(orig.equals(buf.toString()))
System.out.print("Palindrome");
else
System.out.print("Not a Palindrome");}}
