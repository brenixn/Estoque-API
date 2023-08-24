package estoque.api.estoque.infra;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
;
import org.springframework.context.annotation.Bean;


public class SpringDocConfigurations {
    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("Estque API")
                        .description("API Rest de uma aplicação de Estoque, contendo as funcionalidades de CRUD de produtos")
                        .contact(new Contact()
                                .name("Breno Gonçalves")
                                .email("breno.ferreira216@gmail.com")));

    }
}
