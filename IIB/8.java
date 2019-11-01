class I
{

static int counter;

I()
{
System.out.println("default");
}

I(int a)
{
this();
System.out.println("one para.");
}

I(int a , int b)
{
this(a);
System.out.println("two para.");
}

//initializer block
{
counter++;
}


public static void main(String gg[])
{
I i1 =new I();
I i2 =new I(10);
I i3 =new I();
I i4 =new I(2,4);
I i5 =new I();
I i6 =new I(2,90);
I i7 =new I();
System.out.println("number of object created is : "+I.counter);
}
}
