package project01am.day08;

public class MyImplementation implements Runnable{

    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Thread: " + Thread.currentThread().getName() + "----" + i);
        }


    }
    
}

//code in the main app java App.class:
/* MyImplementation myImpl01 = new MyImplementation();
        MyImplementation myImpl02 = new MyImplementation();
        MyImplementation myImpl03 = new MyImplementation();
        ExecutorService es = Executors.newSingleThreadExecutor();
        es.execute(myImpl01);
        es.execute(myImpl02);
        es.execute(myImpl03);
        es.shutdown(); */



//For MultiThreaded
/* MyImplementation myImpl01 = new MyImplementation();
        MyImplementation myImpl02 = new MyImplementation();
        MyImplementation myImpl03 = new MyImplementation();
        ExecutorService es = Executors.newFixedThreadPool(3);
        es.execute(myImpl01);
        es.execute(myImpl02);
        es.execute(myImpl03);
        es.shutdown();
    } */