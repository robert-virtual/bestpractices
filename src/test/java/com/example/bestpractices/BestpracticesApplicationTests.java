package com.example.bestpractices;

import com.example.bestpractices.repository.ProductRepository;
import com.example.bestpractices.service.product.dto.ProductReq;
import com.example.bestpractices.service.product.dto.ProductRes;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.MOCK,
        classes = BestpracticesApplication.class
)
@AutoConfigureMockMvc
@TestPropertySource(
       locations = "classpath:application-integrationtest.properties"
)
@RequiredArgsConstructor
class BestpracticesApplicationTests {
    private final MockMvc mockMvc;
    private final ProductRepository productRepository;
    @Test
    void contextLoads() {

    }

    @Test
    public void createProductTest() {
        ProductReq productReq = new ProductReq("test product", "test description", 12.0, 100);
        String path = "/product/create";

    }

}
