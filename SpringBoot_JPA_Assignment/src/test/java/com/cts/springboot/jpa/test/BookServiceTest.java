package com.cts.springboot.jpa.test;


import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cts.springboot.jpa.repository.BookRepository;
import com.cts.springboot.jpa.service.BookService;

public class BookServiceTest {
	
	@Mock
	private BookRepository bookRepo;
	
	@InjectMocks
	private BookService bookService1;
	
	  @Before
	    public void setUp() throws Exception {
	        MockitoAnnotations.initMocks(this);
	    }

	  
	    
}
