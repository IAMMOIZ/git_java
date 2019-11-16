class A
{
public static void main(String gg[])
{
int i =10;
Integer obj = new Integer(i);// Integer(int constructor will be called)
System.out.println(obj);

int j = obj.intValue();
System.out.println(j);

}
}