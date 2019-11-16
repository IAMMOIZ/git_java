class A
{
public static void main(String gg[])
{
String s1 = "10";
int i = Integer.parseInt(s1);
System.out.println(i);


String s2 = "10.3";
Double j = Double.parseDouble(s2);
System.out.println(j);

String s3 = "10.3";
Float k = Float.parseFloat(s3);
System.out.println(k);

String s4 = "10444";
long l = Long.parseLong(s4);
System.out.println(l);

String s5 = "1345";
short m = Short.parseShort(s5);
System.out.println(m);

String s6 = "10";
byte n = Byte.parseByte(s6);
System.out.println(n);

String s7 = "true";
boolean o = Boolean.parseBoolean(s7);
System.out.println(o);
}
}

//we can use parseXxx methods to convert String to primitive.