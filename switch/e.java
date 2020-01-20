class E 
{
enum Test{CON1,CON2,CON3,CON4,CON5,CON6,HELLO,BLR};
public static void main(String[] args) 
{
System.out.println(Test.CON1.ordinal());
System.out.println(Test.CON2.ordinal());
System.out.println(Test.CON6.ordinal());
System.out.println(Test.HELLO.ordinal());
System.out.println(Test.BLR.ordinal());
System.out.println("INT MIN " + Integer.MIN_VALUE);
System.out.println("INT MAX " + Integer.MAX_VALUE);
}
}
