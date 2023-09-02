package singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @ClassName GlobalCounter
 * @Description 全局计数器，单例实现,表示全局唯一
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/02
 */
public class GlobalCounter {
    private AtomicLong atomicLong = new AtomicLong();
    private static final GlobalCounter instance = new GlobalCounter();

    // 私有化无常构造器
    private GlobalCounter() {

    }

    public static GlobalCounter getInstance() {
        return instance;
    }

    public long getId(){
        return atomicLong.incrementAndGet();
    }


    public static void main(String[] args) {
        long currentNumber = GlobalCounter.getInstance().getId();
        System.out.println(currentNumber);
    }
}
