package com.idat.Client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.Dto.HospedajeDTO;

@FeignClient(name="Hospedaje-microservicio", url="localhost:8080")
public interface OpenFeingCliente {
		
			@GetMapping("/api/hospedaje/v1/listar")
			public List<HospedajeDTO> listarHospedaje();
	}