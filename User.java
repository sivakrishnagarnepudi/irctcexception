public class User {
    public static void main(String[]args){
        IRCTC irctc=new IRCTC();
        try {
      int result= irctc.getuserEntry(5,10);
         System.out.println(result);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
