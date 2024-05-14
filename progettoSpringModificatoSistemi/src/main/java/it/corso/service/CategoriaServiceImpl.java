package it.corso.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.corso.dao.CategoriaDao;
import it.corso.dao.CorsoDao;
import it.corso.dto.CategoriaAggiornamenoDto;
import it.corso.dto.CategoriaCreazioneDto;
import it.corso.dto.CategoriaDto;
import it.corso.model.Categoria;
import it.corso.model.Corso;
import it.corso.model.NomeCategoria;





@Service
public class CategoriaServiceImpl implements CategoriaService {
	private ModelMapper modelMapper = new ModelMapper();
	
	@Autowired
	private CategoriaDao categoriaDao;
	
	@Autowired
	private CorsoDao corsoDao;

	@Override
	public CategoriaDto getCategoriaById(int id) {
		Optional<Categoria> optional = categoriaDao.findById(id);
		
		if (optional.isPresent()) {
			Categoria categoriaDb = optional.get();
			CategoriaDto catedoriaDto = modelMapper.map(categoriaDb, CategoriaDto.class);
			return catedoriaDto;
		}
		
		return null;
	}

	@Override
	public List<CategoriaDto> getAllCategorie(String nome) {
		List<Categoria> listaCategorie;
		
		if(nome != null && !nome.isEmpty()) {
			NomeCategoria nomeCategoria = NomeCategoria.valueOf(nome);
			listaCategorie = categoriaDao.findAllByNomeCategoria(nomeCategoria);
		}else {
			listaCategorie = categoriaDao.findAll();
		}	
		
		List<CategoriaDto> listaCategorieDto = new ArrayList<>();
		listaCategorie.forEach(c -> listaCategorieDto.add(modelMapper.map(c, CategoriaDto.class)));
		
		return listaCategorieDto;
	}

	
	@Override
	public void createCategoria(CategoriaCreazioneDto categoriaCreazioneDto) {
		Categoria categoria = new Categoria();
		
		categoria.setNomeCategoria(categoriaCreazioneDto.getNomeCategoria());
				
		categoriaDao.save(categoria);
	
	}

	@Override
	public void deleteCategoria(int id) {
		Optional<Categoria> optional = categoriaDao.findById(id);
		
		if (optional.isPresent()) {
			categoriaDao.delete(optional.get());
		}
		
		
	}

	@Override
	public void updatecategoria(CategoriaAggiornamenoDto categoriaDto) {
		try {
			
			Optional<Categoria> optional = categoriaDao.findById(categoriaDto.getId());
			
			if (optional.isPresent()) {
				Categoria categoria = optional.get();
			
				categoria.setNomeCategoria(categoriaDto.getNomeCategoria());
												
				List<Corso> corsiCategoria = new ArrayList<>();
				Optional<Corso> optionalCorso = corsoDao.findById(categoriaDto.getIdCorsi());
				
				if(optionalCorso.isPresent()) {
					Corso corso = optionalCorso.get();
					corso.setId(categoriaDto.getIdCorsi());
					
					corsiCategoria.add(corso);
					categoria.setCorsi(corsiCategoria);
				}
				
				categoriaDao.save(categoria);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
}
