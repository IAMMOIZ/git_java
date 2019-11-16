class A
{
public static void main(String gg[])
{
boolean flag = false;
Boolean obj1 = new Boolean(flag);//boxing
Boolean obj2 = new Boolean(true);//boxing
Boolean obj3 = Boolean.valueOf(flag);//boxing
boolean b1 = obj1.booleanValue();//unboxing
boolean b2 = obj2.booleanValue();//unboxing
boolean b3 = obj3.booleanValue();//unboxing
System.out.println(b1);
System.out.println(b2);
System.out.println(b3);
System.out.println(obj1);
System.out.println(obj2);
System.out.println(obj3);
}
}