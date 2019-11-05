package com.library.layer.service;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.library.layer.request_entities.AuthorRequest;
import com.library.layer.request_entities.BookRequest;
import com.library.layer.request_entities.UserRequest;

public interface HireService {

	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, path = "/hire", method = RequestMethod.POST)
	void hireBook(@NotNull AuthorRequest author, @NotNull BookRequest book, @NotNull UserRequest user,
			@NotNull Date hireDate, String comment);

	@RequestMapping(path = "/hire", method = RequestMethod.POST)
	void hireBook(@NotNull Long id);
	void returnBook(UserRequest user, BookRequest book);
}
