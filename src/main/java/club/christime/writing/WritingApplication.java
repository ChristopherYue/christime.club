package club.christime.writing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("club.christime.writing.dao")
public class WritingApplication {

    public static void main(String[] args) {
        SpringApplication.run(WritingApplication.class, args);
    }
}
