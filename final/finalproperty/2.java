class A
{
public static void main(String gg[])
{
final int i;
i=10;
int j =20;
System.out.println(i);
System.out.println(j);
//i=10;//error for reinitialization
j=20;
System.out.println(i);
System.out.println(j);
}
}
// a final attribute should be initialized at the time of declaration or before its use at once 