package com.transcoder;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;

@Slf4j
@SpringBootApplication
public class TranscoderServiceApplication {

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication app = new SpringApplication(TranscoderServiceApplication.class);
        app.setDefaultProperties(Collections.singletonMap("spring.profiles.default", "dev"));
        Environment env = app.run(args).getEnvironment();

        log.info("""
                        \n
                        Access URLs:
                        --------------------------------------------------------
                        \t\
                        Local: \t\t http://{}:{}
                        \t\
                        External: \t http://localhost:{}
                        --------------------------------------------------------""",
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port"),
                env.getProperty("server.port"));
    }
}
