public class Test {
    public static void main(String[] args) {
        // int x = 4;
        // while(x < 6){
        //     System.out.println("This will not be printed");
        //     x++;
        // }

        try{
            System.out.println(10 / 0);
        }
        catch(Exception err){
            System.out.println("Error: " + err.toString());
        }
    }
}
