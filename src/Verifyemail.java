public class Verifyemail {

    public static void main(String[] args) {
        String email = "example@gmail.com";
        int a = email.indexOf("@");
        boolean subString1 = (a > 1);
        int b = email.indexOf(".") - (a + 1);
        boolean subString2 = (b > 1);
        int x = email.length();
        int c = x - email.lastIndexOf(".");
        boolean subString3 = (c > 1);
        if (subString1 && subString2 && subString3) {
            System.out.println(email);
        } else System.out.println("Invalid Email");

    }
}
