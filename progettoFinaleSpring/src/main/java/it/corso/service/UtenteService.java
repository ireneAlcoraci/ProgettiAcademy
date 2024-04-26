package it.corso.service;

import java.util.List;

import it.corso.dto.UtenteAggiornamentoDto;
import it.corso.dto.UtenteDto;
import it.corso.dto.UtenteLoginRequestDto;
import it.corso.dto.UtenteRegistrazioneDto;
import it.corso.model.Utente;

public interface UtenteService {
	
	//funzione che permette di gestire la login
	boolean loginUtente(UtenteLoginRequestDto utenteLoginRequestDto); 
		
	//funzione che permette di registrare l'utente
	void registrazioneUtente(UtenteRegistrazioneDto utenteDto);
	
	//funzione che permette di eliminare l'utente
	void eliminaUtente(String email);
	
	//funzione che permette di restituire un dto dell'utente tramite email
	UtenteDto prendiUtentePerEmail(String email);
	
	//funzione che permette di restituire un dto dell'utente tramite email
	void aggiornaUtente(UtenteAggiornamentoDto utenteDto);
	
	//funzione che permette di restituire la lista degli utenti
	List<UtenteDto> ottieniUtenti();
	
	//funzione che permette di restituire un boolean per verificare se l'utente esiste tramite email
	boolean esisteUtenteTramiteEmail(String email);
	
	//funzione che permette di restituire un utente tramite email
	Utente restituisceUtenteDaEmail(String email);
	
	
}
