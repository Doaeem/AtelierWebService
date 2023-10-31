package ma.ismo.crjj.efm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ma.ismo.crjj.efm.idao.IDAO;
import ma.ismo.crjj.efm.models.Etablissement;

public class EtablissementServiceImpl implements EtablissementService{
	
	private IDAO<Etablissement> etablissementDao = null;
	
	@Autowired
    public EtablissementServiceImpl(IDAO<Etablissement> etablissementDao) {
        this.etablissementDao = etablissementDao;
    }

	@Override
    public List<Etablissement> getAllEtablissements() {
        return etablissementDao.getAll();
    }

    @Override
    public Etablissement getEtablissementById(int id) {
        return etablissementDao.getOne(id);
    }

    @Override
    public boolean saveEtablissement(Etablissement etablissement) {
        return etablissementDao.save(etablissement);
    }

    @Override
    public boolean updateEtablissement(Etablissement etablissement) {
        return etablissementDao.update(etablissement);
    }

    @Override
    public boolean deleteEtablissement(Etablissement etablissement) {
        return etablissementDao.delete(etablissement);
    }

}
