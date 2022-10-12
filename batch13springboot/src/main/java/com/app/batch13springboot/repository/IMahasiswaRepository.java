package com.app.batch13springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.batch13springboot.model.Mahasiswa;

public interface IMahasiswaRepository{
	public Mahasiswa insert(Mahasiswa mahasiswa);
}
