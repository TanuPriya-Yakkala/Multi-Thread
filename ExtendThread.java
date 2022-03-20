public class ExtendThread implements Runnable {  
  
    @Override  
    public void run() {  
        System.out.println("Thread has ended");  
    }  
   
    public static void main(String[] args) {  
        ExtendThread ex = new ExtendThread();  
        Thread t1= new Thread(ex);  
        t1.start(); 
        for(int i=1; i<=5; i++) {
        System.out.println("Hi " +i);  
        }
    }  
} 
