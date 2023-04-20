package edu.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.dto.ContactDto;
import edu.learning.service.ContactService;

@RestController
public class ContactController {
	
	@Autowired
	ContactService contactService;

	@PostMapping("/create-contact")
	public String saveContact(@RequestBody ContactDto dto) {
		boolean result = contactService.saveContact(dto);
		return result?"Save Succesfully":"Error in creating contact";
	}
	
	@GetMapping("/get-all-contacts")
	public List<ContactDto> getAllContact() {
		return contactService.getContact();
	}
	
	@DeleteMapping("/deleteContact")
	public String deleteContact(@RequestParam int id) {
		boolean result = contactService.deleteRecord(id);
		return result?"Contact Deleted Succesfully":"Error in Deleting contact";
	}
}









