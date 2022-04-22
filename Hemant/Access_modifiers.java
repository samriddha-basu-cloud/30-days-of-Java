    class C1{
        public int x = 7;
        protected int y =33;
        int z = 9;
        private int a = 83;
        public void meth1(){
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
            System.out.println(a);
        }
    }
    public class Access_modifiers {
        public static void main(String[] args) {
            C1 c = new C1();
            // c.meth1();
            System.out.println(c.x);
            System.out.println(c.y);
            System.out.println(c.z);
            // System.out.println(c.a);
        }
    }

