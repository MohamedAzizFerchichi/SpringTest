package tn.test.spring.Services.Reglement;

import tn.test.spring.Entity.Reglement;
import tn.test.spring.Services.GService;

import java.util.Date;
import java.util.List;

public interface ReglementService extends GService<Reglement, Long> {
    public List<Reglement> retrieveReglementByFacture(Long idFacture);

    Reglement addReglement(Reglement r, Long idFacture);

    public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate);

    float pourcentageRecouvrement(Date startDate, Date endDate);

}
