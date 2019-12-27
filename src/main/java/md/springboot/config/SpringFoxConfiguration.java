package md.springboot.config;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SpringFoxConfiguration {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .tags(new Tag("Company Entity", "Repository for Company entities"))
                .apiInfo(new ApiInfo("SPRING DATA REST", "REST API ", "v1", null, null, null, null, Lists.newArrayList()));

    }
}

