class A
{
public static void main(String gg[])
{
short f = 445;
Short obj1 = new Short(f);//boxing
Short obj2 = new Short(45);//boxing//error bcz only short.short(short) constructor is available
short obj3 = Short.valueOf(f);//boxing
short b1 = obj1.shortValue();//unboxing
short b2 = obj2.shortValue();//unboxing
short b3 = obj3.shortValue();//unboxing
System.out.println(b1);
System.out.println(b2);
System.out.println(b3);
System.out.println(obj1);
System.out.println(obj2);
System.out.println(obj3);
}
}