package ma.ismo.crjj.efm.service;

import java.util.List;

import ma.ismo.crjj.efm.models.Etablissement;

public interface EtablissementService {
	
	List<Etablissement> getAllEtablissements();
    Etablissement getEtablissementById(int id);
    boolean saveEtablissement(Etablissement etablissement);
    boolean updateEtablissement(Etablissement etablissement);
    boolean deleteEtablissement(Etablissement etablissement);
    
}
