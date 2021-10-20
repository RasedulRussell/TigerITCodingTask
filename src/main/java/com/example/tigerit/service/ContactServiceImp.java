package com.example.tigerit.service;

import com.example.tigerit.models.ContactRequest;
import com.example.tigerit.models.MessageResponse;
import com.example.tigerit.models.Contact;
import com.example.tigerit.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("contactRealService")
public class ContactServiceImp implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public MessageResponse createContact(ContactRequest contactRequest) {
        Contact newContact = new Contact();
        newContact.setFullName(contactRequest.getFullName());
        newContact.setPhoneNumber(contactRequest.getPhoneNumber());
        newContact.setAddress(contactRequest.getAddress());
        contactRepository.save(newContact);  /// save the contact
        return new MessageResponse("new Contact is created");
    }

    @Override
    public List<Contact> findAll() {
        return contactRepository.findAll();
    }
}
