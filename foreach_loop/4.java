//how can we use for loop for printing array elements
//compoile time error
class A
{
public static void main(String gg[])
{
System.out.println("main end");
double []elements ={10,20,30,40,50,60,70};
double element;//this variable is used only inside foreach loop so we cannot declare it outside //error
for(element : elements)
{
System.out.println(element);
}
System.out.println("main end");
}
}
