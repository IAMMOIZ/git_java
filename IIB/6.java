class G
{

static int counter;

G()
{
System.out.println("default");
counter++;
}

G(int i)
{
System.out.println("one para.");
counter++;
}

G(int i , int j)
{
System.out.println("two para.");
counter++;
}

public static void main(String gg[])
{
G g1 =new G();
G g2 =new G(10);
G g3 =new G();
G g4 =new G(2,4);
G g5 =new G();
G g6 =new G(2,90);
G g7 =new G();
System.out.println("number of object created is : "+G.counter);
}
}