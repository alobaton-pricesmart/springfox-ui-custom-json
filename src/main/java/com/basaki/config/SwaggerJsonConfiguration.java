package com.basaki.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.InMemorySwaggerResourcesProvider;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

/**
 * {@code SwaggerJsonConfiguration} is responsible for reading the swagger.json
 * file for classpath or file sytstem.
 * <p/>
 *
 * @author Indra Basak
 * @since 11/23/17
 */
@Configuration
public class SwaggerJsonConfiguration {

	@Bean
	public Docket swaggerSpringWebFluxPlugin() {
		return new Docket(DocumentationType.SWAGGER_2).useDefaultResponseMessages(false)
				.ignoredParameterTypes(Void.class).select().build();
	}

	@Primary
	@Bean
	public SwaggerResourcesProvider swaggerResourcesProvider(
			InMemorySwaggerResourcesProvider defaultResourcesProvider) {
		return () -> {
			SwaggerResource swaggerResource = new SwaggerResource();
			swaggerResource.setName("custom");
			swaggerResource.setSwaggerVersion("2.0");
			swaggerResource.setLocation("/swagger.json");

			List<SwaggerResource> swaggerResourceList = new ArrayList<>(defaultResourcesProvider.get());
			swaggerResourceList.add(swaggerResource);
			return swaggerResourceList;
		};
	}
}
