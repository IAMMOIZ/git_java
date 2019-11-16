class A
{
public static void main(String gg[])
{
Double obj1 = new Double(5.5);//boxing
double t = 3.4;
Double obj2 = new Double(t);//boxing
double d1 = obj1.doubleValue();//unboxing
double d2 = obj2.doubleValue();//unboxing

System.out.println(obj1);//unboxing
System.out.println(d1);

System.out.println(obj2);//unboxing
System.out.println(d2);
}
}