package cz.czechitas.java2webapps.ukol6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class CitatyService {

    private final CitatyRepository citatyRepository;
    private final NahodneCisloService nahodneCisloService;

    @Autowired
    public CitatyService(CitatyRepository citatyRepository, NahodneCisloService nahodneCisloService) {
        this.citatyRepository = citatyRepository;
        this.nahodneCisloService = nahodneCisloService;
    }

    public String nahodnyCitat() {
        int poradi = nahodneCisloService.dejNahodneCislo(citatyRepository.pocet());
        return citatyRepository.citat(poradi);
    }
}
