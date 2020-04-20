package com.servicemarket.profile.interfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.servicemarket.profile.dto.Profile;

public interface ProfileRepository extends CrudRepository<Profile, Integer>{
	
	List<Profile> findByCustomerId(Integer customerId);
}

