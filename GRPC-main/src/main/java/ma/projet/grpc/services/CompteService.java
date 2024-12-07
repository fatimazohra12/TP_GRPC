package ma.projet.grpc.services;

import ma.projet.grpc.entities.Compte;
import ma.projet.grpc.repositories.CompteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompteService {

    private final CompteRepository compteRepository;

    public CompteService(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }

    public List<Compte> findAllComptes() {
        return compteRepository.findAll();
    }

    public Compte findCompteById(int id) {
        return compteRepository.findById(id).orElse(null);
    }

    public Compte saveCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    public boolean deleteCompteById(int id) {
        if (compteRepository.existsById(id)) {
            compteRepository.deleteById(id);
            return true;
        }
        return false; // Retourne false si l'ID n'existe pas
    }

}