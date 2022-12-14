package com.idat.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Dto.HospedajeDTO;
import com.idat.Repository.HospedajeRepository;
import com.idat.model.Hospedaje;


@Service
public class HospedajeServiceImpl implements HospedajeService {
	@Autowired
	private HospedajeRepository repository;

	@Override
	public List<HospedajeDTO> listar() {
		List<HospedajeDTO> listado = new ArrayList<>();
		HospedajeDTO dto = null;
		for (Hospedaje hospedaje : repository.findAll()) {
			dto = new HospedajeDTO();
			dto.setIdHospedaje(hospedaje.getIdHospedaje());
			dto.setNombre(hospedaje.getNombre());
			listado.add(dto);
		}
		return listado;

	}

	@Override
	public void guardar(HospedajeDTO hospedaje) {
		Hospedaje hos = new Hospedaje();
		hos.setNombre(hospedaje.getNombre());
		hos.setIdHospedaje(hospedaje.getIdHospedaje());
		repository.save(hos);

		
	}

}