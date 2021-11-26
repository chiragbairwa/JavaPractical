//Example for Dynamic method Dispatch through interface

interface inter{
	int data = 10;
}


class Dynamic implements inter{
	void disp(){
		System.out.println(data);
	}
}

class j48{
	public static void main(String []arg){
		Dynamic obj1 = new Dynamic();
	}
}