public class practice {
    public static void main(String[] args) {
         char ch='1';

         for(int i=0;i<=100;i+=5){
            System.out.print(i + " ---> "+(char)i +"   ||   ");
            System.out.print((i+1) + " ---> "+(char)(i+1) +"   ||   ");
            System.out.print((i+2) + " ---> "+(char)(i+2) +"   ||   ");
            System.out.print((i+3) + " ---> "+(char)(i+3) +"   ||   ");
            System.out.print((i+4) + " ---> "+(char)(i+4) +"   ||   ");
            System.out.println();
            
         }

       System.out.println((int)ch);
       System.out.println((char)35);

    } 
}
