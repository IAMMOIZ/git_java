class H
{

static int counter;

H()
{
System.out.println("default");
counter++;
}

H(int i)
{
this();
System.out.println("one para.");
counter++;
}

H(int i , int j)
{
this(i);
System.out.println("two para.");
counter++;
}

public static void main(String gg[])
{
H h1 =new H();
H h2 =new H(10);
H h3 =new H();
H h4 =new H(2,4);
H h5 =new H();
H h6 =new H(2,90);
H h7 =new H();
System.out.println("number of object created is : "+H.counter);
}
}
//invalid logic