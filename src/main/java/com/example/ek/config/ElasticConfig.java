package com.example.ek.config;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.RestHighLevelClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;

@Configuration
public class ElasticConfig {


    @Bean
    public RestClient getRestClient() {

        RestClient httpClient = RestClient.builder(
                        new HttpHost("localhost",9200)
                )
                .build();
        return httpClient;
    }

    @Bean
    public ElasticsearchTransport getElasticsearchTransport() {
        // Create the Java API Client with the same low level client
        ElasticsearchTransport transport = new RestClientTransport(
                getRestClient(),
                new JacksonJsonpMapper()
        );
        return transport;
    }

    @Bean
    public ElasticsearchClient getElasticsearchClient() {
        ElasticsearchClient esClient = new ElasticsearchClient(getElasticsearchTransport());
        return esClient;
    }

    @Bean
    public RestHighLevelClient getRestHighLevelClient() {
        // Create the HLRC
        RestHighLevelClient hlrc = new RestHighLevelClientBuilder(getRestClient())
                .setApiCompatibilityMode(true)
                .build();
        return hlrc;
    }

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchRestTemplate(getRestHighLevelClient());
    }
}
