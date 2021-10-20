package com.example.tigerit.controllers;

import com.example.tigerit.models.ContactRequest;
import com.example.tigerit.service.ContactService;
import com.example.tigerit.models.Contact;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ContactsController {

    /// Data from HTML form

    private ContactService contactService;

    public ContactsController(@Qualifier("contactRealService") ContactService contactRealService) {
        this.contactService = contactRealService;
    }

    @GetMapping("/contact")
    public String contactForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "contact";
    }

    @PostMapping("/contact")
    public ModelAndView contactFormSubmit(@ModelAttribute ContactRequest contactRequest, Model model) {
        contactService.createContact(contactRequest);
        List<Contact> allContact = contactService.findAll();
        ModelAndView mav = new ModelAndView("result");
        mav.addObject("contact", allContact);
        return mav;
    }

    @GetMapping("/")
    public ModelAndView contacts(Model model) {
        List<Contact> allContact = contactService.findAll();
        ModelAndView mav = new ModelAndView("result");
        mav.addObject("contact", allContact);
        return mav;
    }

}
