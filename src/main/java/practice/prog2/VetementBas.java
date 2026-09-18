package practice.prog2;

public class VetementBas extends Vetement {
    private int tourTaille;

    public VetementBas(String nom, TailleEnum taille, Double prixUnitaire, String materieUtilise, int tourTaille) {
        super(nom, taille, prixUnitaire, materieUtilise);
        this.tourTaille = tourTaille;
    }

    public int getTourTaille() {
        return tourTaille;
    }

    public void setTourTaille(int tourTaille) {
        this.tourTaille = tourTaille;
    }
}
