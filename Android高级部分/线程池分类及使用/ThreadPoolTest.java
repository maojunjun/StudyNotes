import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {

	public static void main(String[] args) {

		createCachedThreadPool();
//		createFixedThreadPool();
//		createScheduledThreadPool();
//		createSingleThreadPool();
	}


	/**
	 * 1. newCachedThreadPool 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程
	 */
	public static void createCachedThreadPool() {

		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

		for (int i = 0; i < 10; i++) {

			final int index = i;

			try {
				Thread.sleep(index * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			cachedThreadPool.execute(new Runnable() {

				@Override
				public void run() {
					System.out.println(index+"  "+Thread.currentThread().getName());
				}
			});
		}
	}
	
	/**
	 * 2. newFixedThreadPool
	 *	创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
	 */
	
	public static void createFixedThreadPool(){
		
//		创建一个线程数为3的线程池
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
		
		for(int i = 0 ;i < 10;i++){
			
			final int index = i ;
			
			System.out.println("The "+i+"time task");
			
			/**
			 * 可用线程数为3，每次从线程池中获取一个线程执行run方法中的任务
			 */
			fixedThreadPool.execute(new Runnable() {
				
				@Override
				public void run() {
					try {
						System.out.println(index+" "+Thread.currentThread().getName());
						Thread.sleep(2000);
					} catch (Exception e) {
						
						e.printStackTrace();
					}
				}
			});
		}
	}
	
	
	/**
	 * 3.创建一个定长线程池，支持定时及周期性任务执行。延迟执行示例代码如下
	 */
	private static void createScheduledThreadPool() {
		
		 ScheduledExecutorService mScheduledThreadPool = Executors.newScheduledThreadPool(3);
		
//		 延迟3秒后执行任务
		 mScheduledThreadPool.schedule(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("The delayed Task");
			}
		}, 3, TimeUnit.SECONDS);
		 
		 //延迟2秒后，每间隔一秒执行任务
		 mScheduledThreadPool.scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("The Periodic Task");
			}
		}, 2, 1, TimeUnit.SECONDS);
		 
	}
	
	/**
	 * 4. newSingleThreadExecutor 	该线程池中只有一个线程对象
	*创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
	*示例代码如下：
	 */
	public static void createSingleThreadPool(){
		
		ExecutorService mSingleThreadPool =Executors.newSingleThreadExecutor();
		
		for(int i = 0 ;i < 10 ;i ++){
			
			final int index = i ;
			
			mSingleThreadPool.execute(new Runnable() {
				
				@Override
				public void run() {
					
					try {
						
						System.out.println("Single ThreadPool task: "+index+Thread.currentThread().getName());
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
}
