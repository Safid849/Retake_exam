package practice.prog2;

import lombok.EqualsAndHashCode;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode

public class Commande {
    private Client client;
    private Instant dateCommande;
    private String description;
    private List<Vetement> vetements;
    private int quantite;

    public Commande(Client client, Instant dateCommande, String description,int quantite) {
        this.client = client;
        this.dateCommande = dateCommande;
        this.description = description;
        this.vetements = new ArrayList<Vetement>();
        this.quantite = quantite;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Instant getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Instant dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Vetement> getVetements() {
        return vetements;
    }

    public void setVetements(List<Vetement> vetements) {
        this.vetements = vetements;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Double getCoutTotal() {
        Double coutTotal = 0.0;
        for (Vetement v : vetements) {
            coutTotal += v.getPrixUnitaire() * getQuantite();
        }
        return coutTotal;
    }
}
