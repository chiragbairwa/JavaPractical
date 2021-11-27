class sta
{
static int x=15; //static data member
static String y="Static member"; //static data member

void display() //non-static function
{
msg();
}
static void msg() //static function
{
System.out.println("Static Function Called by non-static function");
}
public static void main(String stat[]) //main class
{
new sta().display();
System.out.println(y);
System.out.println(x);
}

}