    class CellPhone{
        public void ring(){
            System.out.println("Ringing");
        }public void vibrate(){
            System.out.println("Vibrating");
        }public void call(){
            System.out.println("Calling");
        }
    }
    public class Cell_phone_problem {
        public static void main(String[] args) {
            CellPhone Sam = new CellPhone();
            Sam.ring();
            Sam.vibrate();
            Sam.call();
        }
    }


