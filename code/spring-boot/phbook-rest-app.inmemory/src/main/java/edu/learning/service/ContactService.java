package edu.learning.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Service;

import edu.learning.dto.ContactDto;

@Service
public class ContactService {

	ArrayList<ContactDto> contactList = new ArrayList<ContactDto>();
	
	public boolean saveContact(ContactDto dto) {
		return contactList.add(dto);
	}
	
	public ArrayList<ContactDto> getContact() {
		return contactList;
	}
	
	public boolean deleteRecord(int id) {
		Iterator<ContactDto> it = contactList.iterator();
		boolean result = false;
		while(it.hasNext()) {
			ContactDto dto = it.next();
			if(dto.getId() == id) {
				it.remove();
				result = true;
				break;
			}
		}
		return result;
	}
}














