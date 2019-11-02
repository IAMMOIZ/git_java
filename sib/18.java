class A
{
int i;

static void test(A s1)
{
s1.i= 10;
}

public static void main(String gg[])
{
A obj = new A();
obj.i=10;
System.out.println(obj.i);
test(obj);
System.out.println(obj.i);
}
}