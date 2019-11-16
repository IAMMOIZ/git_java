class A
{
public static void main(String gg[])
{
float f = 4.5f;
Float obj1 = new Float(f);//boxing
Float obj2 = new Float(5.6f);//boxing
Float obj3 = Float.valueOf(f);//boxing
float b1 = obj1.floatValue();//unboxing
float b2 = obj2.floatValue();//unboxing
float b3 = obj3.floatValue();//unboxing
System.out.println(b1);
System.out.println(b2);
System.out.println(b3);
System.out.println(obj1);
System.out.println(obj2);
System.out.println(obj3.toString());

}
}