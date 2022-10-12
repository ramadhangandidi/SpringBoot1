package com.app.batch13springboot.repository.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.batch13springboot.model.Mahasiswa;
import com.app.batch13springboot.repository.IMahasiswaRepository;

@Repository
public class MahasiswaRepository implements IMahasiswaRepository {

	JdbcTemplate jdbcTemplate;

	@Override
	public Mahasiswa insert(Mahasiswa mahasiswa) {
		// TODO Auto-generated method stub
		
		String query = "INSERT INTO tb_mahasiswa (name, age, semester) VALUES (?, ?, ?)";
		
		jdbcTemplate.update(query, new Object[] {mahasiswa.getName(), mahasiswa.getAge(), mahasiswa.getSemester()});
		
		return mahasiswa;
	}

}
