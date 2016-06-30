package uk.co.rgiskardreventlov.forpranav.config;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rgiskard on 30/06/16.
 */
@Configuration
@EntityScan(basePackages = "uk.co.rgiskardreventlov.forpranav.model")
public class PersistenceConfig {
}
