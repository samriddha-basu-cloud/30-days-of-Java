    class Tommy {
        public void hit(){
            System.out.println("Hitting");
        } public void run(){
            System.out.println("Running");
        } public void fire(){
            System.out.println("Firing");
        }
    }
    public class Tommy_game {
        public static void main(String[] args) {
            Tommy Player1 = new Tommy();
            Player1.run();
            Player1.hit();
            Player1.fire();}
    }
