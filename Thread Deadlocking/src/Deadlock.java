
public class Deadlock {

	String str1 = "String1";
    String str2 = "String2";
     
    Thread trd1 = new Thread("Thread 1"){
        public void run(){
            while(true){
                synchronized(str1){
                	try {

                		Thread.sleep(10);

                		} catch (InterruptedException e) {

                		}
                    synchronized(str2){
                    	System.out.println("locked 1");
             
                    }
                }
            }
        }
    };
     
    Thread trd2 = new Thread("Thread 2"){
        public void run(){
            while(true){
                synchronized(str2){
                    synchronized(str1){
                    	try {

                    		Thread.sleep(10);

                    		} catch (InterruptedException e) {

                    		}
                    	System.out.println("locked 2");
                    }
                }
            }
        }
    };
     
    public static void main(String a[]){
        Deadlock mdl = new Deadlock();
        mdl.trd1.start();
        mdl.trd2.start();
    }
}