package com.gl.shopapi.service;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.gl.shopapi.entity.User;

public interface UserService {
	User findOne(String email);

	Collection<User> findByRole(String role);

	User save(User user);

	User update(User user);

	List<User> findAll();

	Object update(Long userId);

	User update(String email);

	Page<User> findAll(PageRequest request);

	User removeAdmin(String email);
}