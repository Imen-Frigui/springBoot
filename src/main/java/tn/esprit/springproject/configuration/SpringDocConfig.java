package tn.esprit.springproject.configuration;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI springShopOpenAPI(){
        return  new OpenAPI()
//                .components(new Components()
//
//                        //API Key, see: https://swagger.io/docs/specification/authentication/api-keys/
//                        .addSecuritySchemes("apiKeyScheme", new SecurityScheme()
//                                .type(io.swagger.v3.oas.models.security.SecurityScheme.Type.APIKEY)
//                                .in(io.swagger.v3.oas.models.security.SecurityScheme.In.HEADER)
//                                .name("X-API-KEY")
//                        )
//
//
//                )
//                .addSecurityItem(new SecurityRequirement()
//                        .addList("basicScheme").addList("apiKeyScheme")
//                )
                .info(infoAPI());

//                //add API key in swwager hmm header
//                .addSecurityItem(new SecurityRequirement('apiKey').addList("bearer-key"));


    }
    public Info infoAPI(){
        return  new Info().title("SprincDoc-FoyerProject").description("TP étude de cas")
                .version("1.0.0")

                .contact(contactAPI());
    }
    public Contact contactAPI(){
        return new Contact().name("ImenFrigui").email("imen.frigui@esprit.tn").url("https://github.com/Imen-Frigui");
    }


    @Bean
    public GroupedOpenApi allPublicApi() {
        return GroupedOpenApi.builder()
                .group("All Management API")
                .pathsToMatch("/**")
                .build();
    }
    @Bean
    public GroupedOpenApi foyerPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only Foyer Management API")
                .pathsToMatch("/foyer/**")
                .pathsToExclude("**")
                .build();
    }
    @Bean
    public GroupedOpenApi blocPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only Bloc Management API")
                .pathsToMatch("/bloc/**")
                .pathsToExclude("**")
                .build();
    }
    @Bean
    public GroupedOpenApi etudiantPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only etudiant Management API")
                .pathsToMatch("/etudiant/**")
                .pathsToExclude("**")
                .build();
    }
    @Bean
    public GroupedOpenApi universitePublicApi() {
        return GroupedOpenApi.builder()
                .group("Only universite Management API")
                .pathsToMatch("/universite/**")
                .pathsToExclude("**")
                .build();
    }
    @Bean
    public GroupedOpenApi chambrePublicApi() {
        return GroupedOpenApi.builder()
                .group("Only chambre Management API")
                .pathsToMatch("/chambre/**")
                .pathsToExclude("**")
                .build();
    }
    @Bean
    public GroupedOpenApi reservationPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only reservation Management API")
                .pathsToMatch("/reservation/**")
                .pathsToExclude("**")
                .build();
    }

//    package tn.esprit.springproject.configuration;
//
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Contact;
//import io.swagger.v3.oas.models.info.Info;
//import io.swagger.v3.oas.models.security.SecurityRequirement;
//import io.swagger.v3.oas.models.security.SecurityScheme;
//import io.swagger.v3.oas.models.Components;
//import org.springdoc.core.models.GroupedOpenApi;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Arrays;
//
//    @Configuration
//    public class SpringDocConfig {
//
//        @Bean
//        public OpenAPI springShopOpenAPI() {
//            return new OpenAPI()
//                    .components(new Components()
//                            .addSecuritySchemes("apiKeyAuth",  // ✅ Correct scheme name
//                                    new SecurityScheme()
//                                            .type(SecurityScheme.Type.APIKEY)  // ✅ Proper Security Scheme type
//                                            .description("API Key authentication")
//                                            .in(SecurityScheme.In.HEADER)  // ✅ API Key in Header
//                                            .name("X-API-Key")
//                            ))
//                    .security(Arrays.asList(
//                            new SecurityRequirement().addList("apiKeyAuth")  // ✅ Use the correct scheme name
//                    ))
//                    .info(infoAPI());
//        }
//
//        public Info infoAPI() {
//            return new Info()
//                    .title("SpringDoc-FoyerProject")
//                    .description("TP étude de cas")
//                    .version("1.0.0")  // ✅ Ensure version is present
//                    .contact(contactAPI());
//        }
//
//        public Contact contactAPI() {
//            return new Contact()
//                    .name("Imen Frigui")
//                    .email("imen.frigui@esprit.tn")
//                    .url("https://github.com/Imen-Frigui");
//        }
//
//        @Bean
//        public GroupedOpenApi allPublicApi() {
//            return GroupedOpenApi.builder()
//                    .group("All Management API")
//                    .pathsToMatch("/**")
//                    .build();
//        }
//
//        @Bean
//        public GroupedOpenApi foyerPublicApi() {
//            return GroupedOpenApi.builder()
//                    .group("Only Foyer Management API")
//                    .pathsToMatch("/foyer/**")
//                    .build();
//        }
//
//        @Bean
//        public GroupedOpenApi blocPublicApi() {
//            return GroupedOpenApi.builder()
//                    .group("Only Bloc Management API")
//                    .pathsToMatch("/bloc/**")
//                    .build();
//        }
//
//        @Bean
//        public GroupedOpenApi etudiantPublicApi() {
//            return GroupedOpenApi.builder()
//                    .group("Only Etudiant Management API")
//                    .pathsToMatch("/etudiant/**")
//                    .build();
//        }
//
//        @Bean
//        public GroupedOpenApi universitePublicApi() {
//            return GroupedOpenApi.builder()
//                    .group("Only Universite Management API")
//                    .pathsToMatch("/universite/**")
//                    .build();
//        }
//
//        @Bean
//        public GroupedOpenApi chambrePublicApi() {
//            return GroupedOpenApi.builder()
//                    .group("Only Chambre Management API")
//                    .pathsToMatch("/chambre/**")
//                    .build();
//        }
//
//        @Bean
//        public GroupedOpenApi reservationPublicApi() {
//            return GroupedOpenApi.builder()
//                    .group("Only Reservation Management API")
//                    .pathsToMatch("/reservation/**")
//                    .build();
//        }
//    }



}
