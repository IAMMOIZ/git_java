//method overloading : multiple method has same name in a class but
//rule 1 : number of parameter is diffrent
//rule 2 : if number of parameter is same then parameter datatype should be diffrent
class B
{
//one parameter
public static void test(int i)
{
System.out.println("int i");
}

//one parameter
public static void test(double i)
{
System.out.println("double i");
}

//one parameter
public static void test(char i)
{
System.out.println("char i");
}

//one parameter
public static void test(String i)
{
System.out.println("String i");
}

public static void main(String gg[])
{
test(1);
System.out.println("================");
test(1.1);
System.out.println("================");
test('A');
System.out.println("================");
test("hellow");
System.out.println("================");
}
}
