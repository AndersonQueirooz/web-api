package queiroz.web_api.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Titulo - API Rest")
                        .description("Exemplo de uma API Rest com Spring Boot")
                        .version("Version 1.0")
                        .termsOfService("Termos de Uso: Open Source")
                        .contact(new Contact()
                                .name("Anderson Queiroz")
                                .url("www.aoqtech.com.br")
                                .email("anderson@aoqtech.com.br"))
                        .license(new License()
                                .name("AOQ Tecnologia")
                                .url("www.aoqtech.com.br")));
    }
}