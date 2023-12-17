public class IRCTC {
    int  loginTime;
    int  currentTime;
    public int getuserEntry(int loginTime, int currentTime) throws Exception {
        if (loginTime-currentTime<5){
            System.out.println("Your Session is not timed out");
        }
        else{
            throw new Exception("You are session is Time Out");
        }

        return loginTime;
    }
}
