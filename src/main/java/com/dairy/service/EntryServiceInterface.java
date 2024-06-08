package com.dairy.service;

import java.util.List;

import com.dairy.entities.Entry;

public interface EntryServiceInterface {

	public Entry saveEntry(Entry entry);
	public Entry updateEntry(Entry entry);
	public void deleteEntry(Entry entry);
	public Entry findById(long id);
	public List<Entry> findAllEntrys();

}
