public class AreaAndPerimeter {
    public static int areaOrPerimeter (int l, int w) {
        // code away...
        if (l == w){
            return l * w;
        }
        else
            return 2*l+2*w;
    }

    public static int simplifyAreaOrPerimeter (int l, int w){
        return l==w ? l*w : 2*l+2*w;
    }

    public static void main(String[] args) {
        int a = areaOrPerimeter( 6,10 );
        int b = areaOrPerimeter(3, 3);
        System.out.println("FOR 6 10: "+a);
        System.out.println("FOR 3 3: "+b);
//        area_or_perimeter(6, 10) --> 32
//        area_or_perimeter(3, 3) --> 9
        int c = simplifyAreaOrPerimeter( 6,10 );
        int d = simplifyAreaOrPerimeter(3, 3);
        System.out.println("FOR 6 10: "+c);
        System.out.println("FOR 3 3: "+d);
    }
}
