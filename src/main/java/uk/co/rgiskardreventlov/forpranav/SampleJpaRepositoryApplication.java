package uk.co.rgiskardreventlov.forpranav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.IOException;

/**
 * Created by rgiskard on 30/06/16.
 */
@SpringBootApplication
public class SampleJpaRepositoryApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        final ApplicationContext app = SpringApplication.run(SampleJpaRepositoryApplication.class, args);
    }
}
