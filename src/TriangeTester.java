
    class TriangleTester{
        public static boolean isTriangle(int a, int b, int c){

            if(a!=0 && b!=0 && c!=0){
                if(a+b>c && a+c>b && b+c>a) return true;
                else return false; }

            return false;


        }

        public static void main(String[] args) {
            System.out.println(isTriangle(1,2,2));
            System.out.println(isTriangle(7,2,2));
        }
    }

