package codeInitial;

public class Professeur {

    private String cip;
    private String nom;

    private static Professeur instanceProfesseur;

    private Professeur(String cip, String nom) {
        this.cip = cip;
        this.nom = nom;
    }

    public static Professeur getInstance(String cip, String nom) {
        if (instanceProfesseur == null)
            instanceProfesseur = new Professeur(cip, nom);
        else
            System.out.println("Le professeur existe déjà.");
        return instanceProfesseur;
    }

    @Override
    public String toString() {
        return "Professeur{" +
                "hash code=" + this.hashCode() + " \n"+
                "cip='" + cip + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
