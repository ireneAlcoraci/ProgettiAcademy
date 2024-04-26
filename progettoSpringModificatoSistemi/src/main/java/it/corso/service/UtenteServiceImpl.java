package it.corso.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.commons.codec.digest.DigestUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.corso.dao.RuoloDao;
import it.corso.dao.UtenteDao;
import it.corso.dto.UtenteAggiornamentoDto;
import it.corso.dto.UtenteDto;
import it.corso.dto.UtenteLoginRequestDto;
import it.corso.dto.UtenteRegistrazioneDto;
import it.corso.model.Ruolo;
import it.corso.model.Utente;

@Service
public class UtenteServiceImpl implements UtenteService {
	private ModelMapper modelMapper = new ModelMapper();
	
	@Autowired
	private UtenteDao utenteDao;

	@Autowired
	private RuoloDao ruoloDao;

	
	@Override
	public void registrazioneUtente(UtenteRegistrazioneDto utenteDto) {
			
		Utente utente = new Utente();
		utente.setNome(utenteDto.getNome());
		utente.setCognome(utenteDto.getCognome());
		utente.setEmail(utenteDto.getEmail());
		
		String sha256Hex = DigestUtils.sha256Hex(utenteDto.getPassword());
		utente.setPassword(sha256Hex);
		
		
		utenteDao.save(utente);
	}

	@Override
	public UtenteDto prendiUtentePerEmail(String email) {
		Utente utente =  utenteDao.findByEmail(email);
		UtenteDto utenteDto = modelMapper.map(utente, UtenteDto.class);
		return utenteDto;
	}

	@Override
	public void aggiornaUtente(UtenteAggiornamentoDto utenteDto) {
		try {
			Utente utente = utenteDao.findByEmail(utenteDto.getEmail());
			
			if (utente != null) {
				utente.setNome(utenteDto.getNome());
				utente.setCognome(utenteDto.getCognome());
				utente.setEmail(utenteDto.getEmail());
								
				List<Ruolo> ruoliUtente = new ArrayList<>();
				Optional<Ruolo> optional = ruoloDao.findById(utenteDto.getIdRuolo());
				
				if(optional.isPresent()) {
					Ruolo ruolo = optional.get();
					ruolo.setId(utenteDto.getIdRuolo());
					
					ruoliUtente.add(ruolo);
					utente.setRuoli(ruoliUtente);
				}
				
				utenteDao.save(utente);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<UtenteDto> ottieniUtenti() {
		//non è necessario il cast perchè estendendo jpa nel dao il findAll ritorna una lista
		List<Utente> listaUtenti = utenteDao.findAll();
		
		List<UtenteDto> listaUtentiDto = new ArrayList<>();

		listaUtenti.forEach(u -> listaUtentiDto.add(modelMapper.map(u, UtenteDto.class)));
		
		return listaUtentiDto;
	}

	@Override
	public void eliminaUtente(String email) {
		Utente utente = utenteDao.findByEmail(email);		
		Optional<Utente> optional = utenteDao.findById(utente.getId());
		
		if (optional.isPresent()) {
			utenteDao.delete(optional.get());
		}

	}

	@Override
	public boolean esisteUtenteTramiteEmail(String email) {
		
		return utenteDao.existsByEmail(email);
	}

	@Override
	public boolean loginUtente(UtenteLoginRequestDto utenteLoginRequestDto) {
		Utente utente = new Utente();
		
		utente.setEmail(utenteLoginRequestDto.getEmail());
		utente.setPassword(utenteLoginRequestDto.getPassword());
		
		String sha256Hex = DigestUtils.sha256Hex(utente.getPassword());
		
		Utente credenzialiUtente = utenteDao.findByEmailAndPassword(utente.getEmail(), sha256Hex);
		
		return credenzialiUtente != null ? true : false;
	}

	@Override
	public Utente restituisceUtenteDaEmail(String email) {
		return utenteDao.findByEmail(email);
	}

}
