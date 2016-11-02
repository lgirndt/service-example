package de.girndt;

import org.apache.catalina.startup.Tomcat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    public final Logger log = LoggerFactory.getLogger(Application.class);
    private final Tomcat tomcat;

    public Application() {
        tomcat = new Tomcat();
    }

    public void run() {
        try {
            this.tomcat.setPort(8080);
            this.tomcat.start();
            this.tomcat.getServer().await();


        }catch(Exception e) {
            log.error("Failed to run Application.",e);
        }
    }
}
