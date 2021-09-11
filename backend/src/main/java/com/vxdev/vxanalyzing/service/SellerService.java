package com.vxdev.vxanalyzing.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vxdev.vxanalyzing.dto.SellerDTO;
import com.vxdev.vxanalyzing.entities.Seller;
import com.vxdev.vxanalyzing.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
			
	}
	
}




