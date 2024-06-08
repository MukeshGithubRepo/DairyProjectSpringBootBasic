package com.dairy.repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dairy.entities.Entry;

public interface EntryRepository extends JpaRepository<Entry, Long> {

}
