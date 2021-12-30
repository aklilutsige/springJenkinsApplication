package et.aklilu.tsige.springjenkinsapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

    @PostConstruct
    public void intt(){
        logger.info("Application started . . . . ");
    }

    public static void main(String[] args) {
        logger.info("Application executed . . . .");
        logger.info("Application executed  2 Building . . . .");
        SpringApplication.run(SpringJenkinsApplication.class, args);
    }

}
