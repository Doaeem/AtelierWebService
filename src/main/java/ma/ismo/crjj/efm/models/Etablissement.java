package ma.ismo.crjj.efm.models;

public class Etablissement {
	
	private int code_etab;
    private String Nom_Etab;
    private String Adresse_etab;
    private String Tel_etab;
    
	public int getCode_etab() {
		return code_etab;
	}
	public void setCode_etab(int code_etab) {
		this.code_etab = code_etab;
	}
	public String getNom_Etab() {
		return Nom_Etab;
	}
	public void setNom_Etab(String nom_Etab) {
		Nom_Etab = nom_Etab;
	}
	public String getAdresse_etab() {
		return Adresse_etab;
	}
	public void setAdresse_etab(String adresse_etab) {
		Adresse_etab = adresse_etab;
	}
	public String getTel_etab() {
		return Tel_etab;
	}
	public void setTel_etab(String tel_etab) {
		Tel_etab = tel_etab;
	}
	
	public Etablissement(int code_etab, String nom_Etab, String adresse_etab, String tel_etab) {
		super();
		this.code_etab = code_etab;
		Nom_Etab = nom_Etab;
		Adresse_etab = adresse_etab;
		Tel_etab = tel_etab;
	}
	
	public Etablissement() {
		super();
	}
     
}
