package com.example.tigerit;

import com.example.tigerit.models.Contact;
import com.example.tigerit.models.ContactRequest;
import com.example.tigerit.models.MessageResponse;
import com.example.tigerit.service.ContactService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("contactTestService")
public class ContactTestService implements ContactService {
    @Override
    public MessageResponse createContact(ContactRequest contactRequest) {
        return null;
    }

    @Override
    public List<Contact> findAll() {
        return null;
    }
}
