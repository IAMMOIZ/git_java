class M
{
static int counter;

M()
{
}

M(int i)
{
this();
}

{
counter ++;
}

public static void main(String gg[])
{
M m1 = new M();
M m2 = new M(3);
M m3 = new M(4);
M m4 = new M();
System.out.println("for m1 : "+m1.counter);
System.out.println("for m2 : "+m2.counter);
System.out.println("for m3 : "+m3.counter);
System.out.println("for m4 : "+m4.counter);

}
}
//static property is commin property for all objects of same class 