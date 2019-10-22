//nextLine() method is working for all the datatypes .

import java.util.Scanner;
class A
{
public static void main(String gg[])
{
Scanner input = new Scanner(System.in);

int a = input.nextLine();
System.out.println(a);
System.out.println("-------------");

long b = input.nextLine();
System.out.println(b);
System.out.println("-------------");

short c = input.nextLine();
System.out.println(c);
System.out.println("-------------");

float d = input.nextLine();
System.out.println(d);
System.out.println("-------------");

double e = input.nextLine();
System.out.println(e);
System.out.println("-------------");

byte f = input.nextLine();
System.out.println(f);
System.out.println("-------------");

boolean g = input.nextLine();
System.out.println(g);
System.out.println("-------------");

String h = input.nextLine();
System.out.println(h);
System.out.println("-------------");

char i = input.nextLine();
System.out.println(i);
System.out.println("-------------");

char[] j = input.nextLine();
System.out.println(j);
System.out.println("-------------");

}
}

//next() method is apllicable for words not for sentance [not for others datatype accept String]. 
//and also not for char and char array.

/*

5.java:10: error: incompatible types: String cannot be converted to int
int a = input.nextLine();
                      ^
5.java:14: error: incompatible types: String cannot be converted to long
long b = input.nextLine();
                       ^
5.java:18: error: incompatible types: String cannot be converted to short
short c = input.nextLine();
                        ^
5.java:22: error: incompatible types: String cannot be converted to float
float d = input.nextLine();
                        ^
5.java:26: error: incompatible types: String cannot be converted to double
double e = input.nextLine();
                         ^
5.java:30: error: incompatible types: String cannot be converted to byte
byte f = input.nextLine();
                       ^
5.java:34: error: incompatible types: String cannot be converted to boolean
boolean g = input.nextLine();
                          ^
5.java:42: error: incompatible types: String cannot be converted to char
char i = input.nextLine();
                       ^
5.java:46: error: incompatible types: String cannot be converted to char[]
char[] j = input.nextLine();
                         ^
9 errors*/