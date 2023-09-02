package singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName Logger
 * @Description 处理资源访问冲突,正确的 Logger 单例类
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/02
 */
public class Logger {
    private String basePath = "D:\\code\\core-project\\Yao-Java_GOF\\src\\main\\resources\\info.log";
    private static Logger instance = new Logger();
    private FileWriter writer;

    public Logger() {
        File file = new File(basePath);
        try {
            // true 表示追加写入
            writer = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void log(String message) {
        try {
            writer.write(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setBasePath(String basePath){
        this.basePath = basePath;
    }
}
