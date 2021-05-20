package com.example.springmvc.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.springmvc.entity.Mahasiswa;

public interface MahasiswaRepository extends PagingAndSortingRepository<Mahasiswa, String>{
	
}
