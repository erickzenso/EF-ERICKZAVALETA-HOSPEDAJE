package com.idat.Service;

import java.util.List;

import com.idat.Dto.HospedajeDTO;


public interface HospedajeService {
	List<HospedajeDTO> listar();
	void guardar(HospedajeDTO alumno);
	

}
