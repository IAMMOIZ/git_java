class K
{
static int counter;

K()
{
this(5);
}

K(int i)
{
}

{
counter++;
}

public static void main(String gg[])
{
K k1 = new K();
System.out.println("Number of objects created : "+K.counter);
}
}