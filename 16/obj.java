class obj
{
void display() //non-static function
{
System.out.println("Called by object");
}
public static void main(String obj[]) //main function
{
//class name objectname=new classname();
obj a1=new obj();//named object
new obj().display(); //unnamed object
a1.display();
}

}