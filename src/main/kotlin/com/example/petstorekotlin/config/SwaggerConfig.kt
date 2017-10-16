package com.example.petstorekotlin.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket

@Configuration
class SwaggerConfig {

    @Bean
    fun productApi(): Docket = Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.example.petstorekotlin"))
            .paths(PathSelectors.any())
            .build()

    private fun apiInfo() : ApiInfo = ApiInfoBuilder().title("Petstore API")
            .description("Petstore API reference for developers")
            .termsOfServiceUrl("http://kkgroup.fake.com")
            .contact("Spring & Kotlin")
            .license("MIT License")
            .licenseUrl("https://opensource.org/licenses/MIT")
            .version("1.0")
            .build()

}