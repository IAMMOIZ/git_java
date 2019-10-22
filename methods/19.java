//way to call a function

//if function returning something we can 
//1=> assign it to other variable 
//2=> leave it openlly 
//3=> use inside a expression for calculation 
//4=> use it to print by sop  

class A
{
public static void main(String gg[])
{
System.out.println("main begin");
//1=> assign it to other variable;
int i = test(); 

//2=> leave it openly[for printing purpose only]
test();

//3=>use in expression for printing purpose
int a = i + test();
int b = test() + i;
int c = test() + test();

//4=>use it to print something by sop
System.out.println(test());


System.out.println("main end");
}


public static int test()
{
System.out.println("test");
return 10;
}


}