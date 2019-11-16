//boxing
//use of valueOf() method in boxing
//use of intValue() method for unboxing
class A
{
public static void main(String gg[])
{
//case 1
int i = 10;
Integer ob = new Integer(i);//boxing
System.out.println(ob);


//case 2
Integer obj = new Integer(30);//boxing
System.out.println(obj);


//case 3
Integer obj1 = Integer.valueOf(50);//use of valueOf() method of Integer class
System.out.println(obj1);

//case 4
Integer obj2 = Integer.valueOf(i);
int j =obj2.intValue();//unboxing
System.out.println(j);

}
}