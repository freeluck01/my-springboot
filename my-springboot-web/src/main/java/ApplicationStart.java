import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Spring Boot工程启动入口
 * author: caoxingming
 * date: 2018/1/25
 * time: 21:13
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
@SpringBootApplication(scanBasePackages = "com.xm.springboot")
@MapperScan(value = "com.xm.springboot.mapper*")//tk的MapperScan
public class ApplicationStart {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ApplicationStart.class, args);
        String[] activeProfiles = context.getEnvironment().getActiveProfiles();
        for (String activeProfile : activeProfiles) {
            System.out.println(">>>>>>>>>>使用的profile为：" + activeProfile);
        }
    }
}
