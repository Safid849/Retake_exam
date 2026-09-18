package practice.prog2;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public abstract class Vetement {
    private String nom;
    private TailleEnum taille;
    private Double prixUnitaire;
    private String materieUtilise;

    public Vetement(String nom, TailleEnum taille, Double prixUnitaire, String materieUtilise) {
        this.nom = nom;
        this.taille = taille;
        this.prixUnitaire = prixUnitaire;
        this.materieUtilise = materieUtilise;
    }

    public String getNom() {
        return nom;
    }

    public TailleEnum getTaille() {
        return taille;
    }

    public Double getPrixUnitaire() {
        return prixUnitaire;
    }

    public String getMaterieUtilise() {
        return materieUtilise;
    }
}
