package it.corso.service;

import java.util.List;

import it.corso.dto.CorsoDto;


public interface CorsoService {

	List<CorsoDto> ottieniCorsi();
	boolean inserisciCorso(CorsoDto corsoDto);
	void eliminaCorso(String nomeCorso);
	CorsoDto trovaCorso(String nomeCorso);
	boolean esisteCorso(String nomeCorso);
	void aggiornaCorso(CorsoDto corsoDto);
	

}
