class O
{

static
{
System.out.println("O.sib");
}

{
System.out.println("O.iib");
}

O()
{
System.out.println("default");
}

public static void main(String gg[])
{
System.out.println("main begin");
O o1 = new O();
System.out.println("=============");
O o2 = new O();
System.out.println("=============");
O o3 = new O();
System.out.println("main end");
}
}

//sib :- run when class is loaded first time
//iib :- run when class object is created [only one time]