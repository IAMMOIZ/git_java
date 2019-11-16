class A
{
public static void main(String gg[])
{
long f = 445;
Long obj1 = new Long(f);//boxing
Long obj2 = new Long(5456);//boxing
Long obj3 = Long.valueOf(f);//boxing
long b1 = obj1.longValue();//unboxing
long b2 = obj2.longValue();//unboxing
long b3 = obj3.longValue();//unboxing
System.out.println(b1);
System.out.println(b2);
System.out.println(b3);
System.out.println(obj1);
System.out.println(obj2);
System.out.println(obj3);
}
}