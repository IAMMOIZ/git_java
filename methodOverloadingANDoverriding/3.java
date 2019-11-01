//method overloading : multiple method has same name in a class but
//rule 1 : number of parameter is diffrent
//rule 2 : if number of parameter is same then parameter datatype should be diffrent
//rule 3 : if number of para is same and datatypes are same but order of parameter should be diffrent

class C
{
//two parameter
public static void test(int i, double j)
{
System.out.println("int i,double j");
}

//two parameter
public static void test(double i,int j)
{
System.out.println("double i, int j");
}

public static void main(String gg[])
{
test(1,1.1);
System.out.println("================");
test(1.1,10);
}
}
