package ma.ismo.crjj.efm.impldao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ma.ismo.crjj.efm.idao.IDAO;
import ma.ismo.crjj.efm.models.Etablissement;

@Repository
public class DAOEtablissement implements IDAO<Etablissement>{

	 	@PersistenceContext
	    private EntityManager entityManager;

	    @Override
	    public List<Etablissement> getAll() {
	        return entityManager.createQuery("SELECT e FROM Etablissement e", Etablissement.class).getResultList();
	    }

	    @Override
	    public Etablissement getOne(int id) {
	        return entityManager.find(Etablissement.class, id);
	    }

	    @Override
	    public boolean save(Etablissement etablissement) {
	        try {
	            entityManager.persist(etablissement);
	            return true;
	        } catch (Exception e) {
	            return false;
	        }
	    }

	    @Override
	    public boolean update(Etablissement etablissement) {
	        try {
	            entityManager.merge(etablissement);
	            return true;
	        } catch (Exception e) {
	            return false;
	        }
	    }

	    @Override
	    public boolean delete(Etablissement etablissement) {
	        try {
	            entityManager.remove(etablissement);
	            return true;
	        } catch (Exception e) {
	            return false;
	        }
	    }

}
