class j1 { 
	public static void main(String str[]) throws Exception{
		for(int i=0; i<5; i++){
			
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			
			for(int j=0; j<=i; j++){
				System.out.println("CHIRAG");
			}
			Thread.sleep(1000);	
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			Thread.sleep(1000);
				
		}
	}
}