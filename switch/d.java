class D 
{
public static void main(String[] args) 
{
String s1 = "Hello";
String s2 = "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello";
System.out.println(s1 + "," + s1.hashCode());
System.out.println(s2 + "," + s2.hashCode());
System.out.println("INT MIN " + Integer.MIN_VALUE);
System.out.println("INT MAX " + Integer.MAX_VALUE);
}
}
