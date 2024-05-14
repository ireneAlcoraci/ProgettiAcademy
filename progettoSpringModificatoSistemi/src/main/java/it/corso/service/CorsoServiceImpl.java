package it.corso.service;

import java.util.*;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.corso.dao.CategoriaDao;
import it.corso.dao.CorsoDao;
import it.corso.dto.CorsoDto;
import it.corso.model.Categoria;
import it.corso.model.Corso;

@Service
public class CorsoServiceImpl implements CorsoService {
	private ModelMapper mapper = new ModelMapper();
	
	@Autowired
	private CategoriaDao categoriaDao;
	
	@Autowired
	private CorsoDao corsoDao;
	
	
	@Override
	 public List<CorsoDto> ottieniCorsi() {
	  
	  List<Corso> corso =  corsoDao.findAll();
	  List<CorsoDto> corsoDto = new ArrayList<>();
	  corso.forEach(c -> corsoDto.add(mapper.map(c, CorsoDto.class)));
	  
	  return corsoDto;
	 }


	@Override
	public boolean inserisciCorso(CorsoDto corsoDto) {
		List<Categoria> listaCategorie = categoriaDao.findAll();
		for (int i = 0; i < listaCategorie.size(); i++) {
			if (listaCategorie.get(i).getId() == corsoDto.getIdCategoria()) {
				Corso corso = mapper.map(corsoDto, Corso.class);
				corsoDao.save(corso);
				return true;
			} 
		}	
		return false;

	}


	@Override
	public void eliminaCorso(String nomeCorso) {
		Corso corso = corsoDao.findByNomeCorso(nomeCorso);
		Optional<Corso> optional = corsoDao.findById(corso.getId());
		
		if(optional.isPresent()){
			corsoDao.delete(optional.get());			
		}
		
	}


	@Override
	public CorsoDto trovaCorso(String nomeCorso) {
		CorsoDto corsoDto = new CorsoDto();
		if (corsoDao.existsByNomeCorso(nomeCorso)) {
			Corso corso = corsoDao.findByNomeCorso(nomeCorso);
			corsoDto = mapper.map(corso, CorsoDto.class);
		}
		return corsoDto;
	}


	@Override
	public boolean esisteCorso(String nomeCorso) {
		return corsoDao.existsByNomeCorso(nomeCorso);
	}


	@Override
	public void aggiornaCorso(CorsoDto corsoDto) {
		try {
			Corso corso = corsoDao.findByNomeCorso(corsoDto.getNomeCorso());
			if (corso != null) {
				corso.setNomeCorso(corsoDto.getNomeCorso());
				corso.setDescrizioneBreve(corsoDto.getDescrizioneBreve());
				;
				corso.setDescrizioneCompleta(corsoDto.getDescrizioneCompleta());
				corso.setDurata(corsoDto.getDurata());
				Optional<Categoria> categoria = categoriaDao.findById(corsoDto.getIdCategoria());

				if (categoria.isPresent()) {
					corso.setCategoria(categoria.get());
				}
				
				corsoDao.save(corso);

			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
