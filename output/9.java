//use of empty print()

class A
{
public static void main(String gg[])
{
System.out.print("hello world");
System.out.print();//empty print will not work
}
}

/*
9.java:8: error: no suitable method found for print(no arguments)
System.out.print();//empty println can work
          ^
    method PrintStream.print(boolean) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(char) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(int) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(long) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(float) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(double) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(char[]) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(String) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(Object) is not applicable
      (actual and formal argument lists differ in length)
1 error
*/