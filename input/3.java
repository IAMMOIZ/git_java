//how to get a String from user as a input and store it into a variable and print it.

import java.util.Scanner;//this should be imported every time
class A
{
public static void main(String gg[])
{
Scanner input = new Scanner(System.in);
String str = input.next();//we will use next() method of Scanner class to get String.
System.out.println(str);
}
}

//next is suitable for only words not for sentance.[IMP]