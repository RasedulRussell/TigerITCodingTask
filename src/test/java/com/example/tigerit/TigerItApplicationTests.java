package com.example.tigerit;

import com.example.tigerit.service.ContactService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TigerItApplicationTests {


    private ContactService contactService;

    TigerItApplicationTests(@Qualifier("contactTestService") ContactService contactTestService){
        this.contactService = contactTestService;
    }


    @Test
    void contextLoads() {

    }
}

