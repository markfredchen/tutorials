package io.markfredchen.custom.starter.config;

import io.markfredchen.custom.starter.service.FooService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author markfredchen
 * @since 2018/10/11
 */
@Configuration
@PropertySource("classpath:config/foo.properties")
public class FooAutoConfiguration {
    @Value("${foo.fooMessage}")
    private String fooMessage;
    @Value("${foo.barMessage}")
    private String barMessage;

    @Bean
    @ConditionalOnMissingBean
    public FooService fooService() {
        return new FooService(fooMessage, barMessage);
    }
}
