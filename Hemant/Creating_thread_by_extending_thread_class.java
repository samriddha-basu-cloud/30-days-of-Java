    class MyThread extends Thread{
        @Override
        public void run(){
            int i =0;
            while(i<3){
                System.out.println("My Cooking Thread is Running");
                System.out.println("I am happy!");
                i++;
            }
        }
    }
    public class Creating_thread_by_extending_thread_class {
        public static void main(String[] args) {
            MyThread t1 = new MyThread();
            t1.start();
        }
    }