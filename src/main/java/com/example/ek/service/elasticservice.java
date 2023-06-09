package com.example.ek.service;

import com.example.ek.entity.Customer;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;


@Service
public class elasticservice {

    @Autowired
    ElasticsearchOperations elasticsearchOperations;



    public Customer findCustomerById(int id)
    {
       Customer customer =new Customer();
        QueryBuilder queryBuilder =
                QueryBuilders
                        .matchQuery("customer_id", id);

        NativeSearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(queryBuilder)
                .build();

        SearchHits<Customer> customerHits =
                elasticsearchOperations
                        .search(searchQuery,
                                Customer.class,
                                IndexCoordinates.of("kibana_sample_data_ecommerce"));

        if(customerHits.getTotalHits()>0)
            return customerHits.getSearchHit(0).getContent();
       else
           return null;
    }
}
