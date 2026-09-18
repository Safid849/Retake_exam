import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.prog2.*;

import java.time.Instant;
import java.time.LocalDate;

public class TestCommande {
    private VetementHaut vetementHaut;
    private VetementBas vetementBas;
    private Client client;

    @BeforeEach
    public void setUp() {
        client = new Client("Bernard","Furie", LocalDate.of(1999,10,14),"13 ème rue boulvard", "furie@gmail.com","020465816655");
        vetementHaut = new VetementHaut("Veste", TailleEnum.XXL,50.00,"Cuire", TypeManche.LONGUES);
        vetementBas = new VetementBas("Jean",TailleEnum.L,39.00,"Soie", 60);
    }
    @Test
    public void testCoutTotalAvecQuantite1() {
        Commande commande = new Commande(client, Instant.now(),"Pour renouvelé le style de vêtement", 1);
        commande.getVetements().add(vetementHaut);
        assertEquals(50.00,commande.getCoutTotal());
    }

    @Test
    public void testCoutTotalAvecQuantite2() {
        Commande commande = new Commande(client, Instant.now(),"Pour renouvelé le style de vêtement", 2);
        commande.getVetements().add(vetementBas);
        commande.getVetements().add(vetementHaut);

        assertEquals(178.00, commande.getCoutTotal());

    }
}
