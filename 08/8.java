import java.io.IOException;

class j8{
	public static void main(String []args) throws IOException{
		java.io.InputStreamReader isr=new java.io.InputStreamReader(System.in);
		java.io.BufferedReader br=new java.io.BufferedReader(isr);
		char ch;
		
		System.out.println("Enter a character OR press n to Quit");
		
		do{
			ch=(char)br.read();

			if(ch=='n'){
				System.exit(1);
			}
		}while(ch!='n');
	}	
}