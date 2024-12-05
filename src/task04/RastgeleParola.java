package task04;

public class RastgeleParola {
    public static void main(String[] args) {
        String password="";
        for (int i = 0; i < GiveARandomNumber(7,10); i++) {
            password+=(char) GiveARandomNumber(33, 126);
        }
        System.out.println("Password = " + password);
    }
    public static int GiveARandomNumber(int min, int max){
        return (int) (Math.random()*(max-min)+1+min);
    }
}
