package cn.com.zls.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 第二杯半价
 * @version V1.0
 * @Package com.ls.config
 * @date 2020/12/8 14:15
 * @description
 * 首先通过@EnableSwagger2注解启用Swagger2，
 * 然后配置一个Docket Bean，这个Bean中，
 * 配置映射路径和要扫描的接口的位置，
 * 在apiInfo中，主要配置一下Swagger2文档网站的信息，
 * 例如网站的title，网站的描述，联系人的信息，使用的协议等等。
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.com.zls.controller"))
                .paths(PathSelectors.any())
                .build().apiInfo(new ApiInfoBuilder()
                        .title("SpringBoot整合Swagger")
//                        .description("SpringBoot整合Swagger......")
                        .version("9.0")
                        .contact(new Contact("西宫勺子","www.baidu.com","1421560409@qq.com"))
//                        .license("The Apache License")
//                        .licenseUrl("http://www.baidu.com")
                        .build());
    }
}
