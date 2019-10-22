//compatible method for input for each data types.

import java.util.Scanner;
class A
{
public static void main(String gg[])
{
Scanner input = new Scanner(System.in);

int a = input.nextInt();
System.out.println(a);
System.out.println("-------------");

long b = input.nextLong();
System.out.println(b);
System.out.println("-------------");

short c = input.nextShort();
System.out.println(c);
System.out.println("-------------");

float d = input.nextFloat();
System.out.println(d);
System.out.println("-------------");

double e = input.nextDouble();
System.out.println(e);
System.out.println("-------------");

byte f = input.nextByte();
System.out.println(f);
System.out.println("-------------");

boolean g = input.nextBoolean();//nextBoolean() method will except true or false and it is not case sencitive
System.out.println(g);
System.out.println("-------------");



/*
char i = input.nextChar();
System.out.println(i);
System.out.println("-------------");

char[] j = input.nextChar();
System.out.println(j);
System.out.println("-------------");

error causing code 
*/
}
}

// there is not special method to get input is a character we can use []


