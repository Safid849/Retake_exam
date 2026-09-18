package practice.prog2;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)

public class VetementHaut extends Vetement {
    private TypeManche typeManche;

    public VetementHaut(String nom, TailleEnum taille, Double prixUnitaire, String materieUtilise,TypeManche typeManche) {
        super(nom, taille, prixUnitaire, materieUtilise);
        this.typeManche = typeManche;
    }

    public TypeManche getTypeManche() {
        return typeManche;
    }

    public void setTypeManche(TypeManche typeManche) {
        this.typeManche = typeManche;
    }
}
