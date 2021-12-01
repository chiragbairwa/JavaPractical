class j23{
    public static void main(String[] args) {
        boolean val=true;
        
        byte b = 1;
        short s = 2;
        int i = 5;
        long l = 35353503;
        
        float f = 3.5f;
        double d = 2.626;
        
        char c = 't';
        String str = "hello";

        //For Primitive
        System.out.println( ( (Object)val ).getClass().getName() );
        System.out.println( ( (Object)b ).getClass().getName() );
        System.out.println( ( (Object)s ).getClass().getName() );
        System.out.println( ( (Object)i ).getClass().getName() );
        System.out.println( ( (Object)l ).getClass().getName() );
        System.out.println( ( (Object)f ).getClass().getName() );
        System.out.println( ( (Object)d ).getClass().getName() );
        System.out.println( ( (Object)c ).getClass().getName() );
        //For Class
        System.out.println(str.getClass().getSimpleName() );
    }
}
