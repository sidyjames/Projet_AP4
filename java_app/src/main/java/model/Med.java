
package model;

public class Med implements Comparable<Med> {

    private String nom;
    private String prenom;
    private String adresse;
    private String tel;
    private String spe;
    private String dep;
    private String id;

    public Med(String nom, String prenom, String adresse, String tel, String spe, String dep, String id) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.spe = spe;
        this.dep = dep;
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSpe() {
        return spe;
    }
    
    public String getDep() {
        return dep;
    }

    public String getTel() {
        return tel;
    }

    @Override
    public int compareTo(Med m) {
        if (nom.compareTo(m.nom) == 0) { //s'ils ont le même nom
            return prenom.compareTo(m.prenom); //comparer les prénoms
        } else {
            return nom.compareTo(m.nom); //sinon comparer les noms
        }
    }

	@Override
	public String toString() {
		return "Med [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", tel=" + tel + ", spe=" + spe
				+ ", dep=" + dep + ", id=" + id + "]";
	}
    
    
}
