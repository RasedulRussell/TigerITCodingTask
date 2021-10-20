package com.example.tigerit.service;

import com.example.tigerit.models.ContactRequest;
import com.example.tigerit.models.MessageResponse;
import com.example.tigerit.models.Contact;

import java.util.List;

public interface ContactService {
    MessageResponse createContact(ContactRequest contactRequest);

    List<Contact> findAll();
}
