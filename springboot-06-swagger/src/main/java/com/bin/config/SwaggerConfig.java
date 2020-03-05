package com.bin.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @Configuration
 * 声明是配置文件类
 * @EnableSwagger2
 * 开启swagger2功能
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 使用swagger需要创建一个摘要 Docket
     * 摘要参数如下
     * 文档类型  使用Swagger2 - DocumentationType.SWAGGER_2
     * 文档通过一系列的选择器组成  api path
     * select()设置apis和paths
     * apis 查找生成那些controller的接口 获取所有接口RequestHandlerSelectors.any()
     * path在查找出来的接口中筛选
     * @return
     */


    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.bin.controller"))
                .paths(PathSelectors.any()).build().apiInfo(apiInfo());
    }

    /**
     * 设置描述信息
     * @return
     */
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("springboot-06-swagger")
                .description("这是一个swagger demo.")
                .version("1.0").build();
    }
}
