package com.dairy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dairy.entities.Entry;
import com.dairy.repositries.EntryRepository;


@Service
public class EntryServiceImplClass implements EntryServiceInterface {

	@Autowired
	EntryRepository entryRepository;
	
	
	
	
	
	@Override
	public Entry saveEntry(Entry entry) {
		// TODO Auto-generated method stub
		return entryRepository.save(entry);
	}

	@Override
	public Entry updateEntry(Entry entry) {
		// TODO Auto-generated method stub
		return entryRepository.save(entry);
	}

	@Override
	public void deleteEntry(Entry entry) {
		// TODO Auto-generated method stub
		
		entryRepository.delete(entry);

	}

	@Override
	public Entry findById(long id) {
		// TODO Auto-generated method stub
		return entryRepository.findById(id).get();
	}

	@Override
	public List<Entry> findAllEntrys() {
		// TODO Auto-generated method stub
		return entryRepository.findAll();
	}
	
	
	

}
