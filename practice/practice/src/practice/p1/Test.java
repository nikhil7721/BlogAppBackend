package practice.p1;

class X
{
static void staticMethod()
{
System.out.print(" Class X ");
}
}
class Y extends X
{
static void staticMethod()
{
System.out.print(" Class Y ");
}
}
public class Test
{
public static void main(String[] args)
{
Y.staticMethod();
X x = new Y();
x.staticMethod();
}
}