class YesOrNo
{
    public static String boolToWord(boolean b)
    {
        String yes = "Yes";
        String no = "No";

        if (!b){
            return no;
        }
        else  return yes;
    }
    public static String simplifyBoolToWord(boolean c){

        return c ? "Yes" : "No" ;
    }

    public static void main(String[] args) {
        boolean y = true;
        boolean n = false;
        String statY = boolToWord( y );
        String statN = boolToWord( n );
        System.out.println("True: " +statY);
        System.out.println("False: " +statN);

        String simplyY = simplifyBoolToWord( true );
        String simplyN = simplifyBoolToWord( false );
        System.out.println("Replace 'True' to : " +simplyY);
        System.out.println("Replace 'False' to: " +simplyN);
    }
}