package it.corso.service;

import java.util.*;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.corso.dao.CorsoDao;
import it.corso.dto.CorsoDto;
import it.corso.model.Corso;

@Service
public class CorsoServiceImpl implements CorsoService {
	private ModelMapper mapper = new ModelMapper();
	
	@Autowired
	private CorsoDao corsoDao;
	
	
	@Override
	 public List<CorsoDto> ottieniCorsi() {
	  
	  List<Corso> corso =  corsoDao.findAll();
	  List<CorsoDto> corsoDto = new ArrayList<>();
	  corso.forEach(c -> corsoDto.add(mapper.map(c, CorsoDto.class)));
	  
	  return corsoDto;
	 }
}
