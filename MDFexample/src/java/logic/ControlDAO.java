/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import DTO.CampaignDTO;
import DTO.FacturaDTO;
import DTO.InvoiceDTO;
import DTO.MdfDTO;
import DTO.PoEDTO;
import DTO.quarterDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dennis
 */
public class ControlDAO implements ControlDAOInterface {

    private final LoginSystem loginSystem = new LoginSystem();

    private final FetchFacturaView fetchFacturaView = new FetchFacturaView();
    private final FetchInvoiceView fetchInvoiceView = new FetchInvoiceView();
    private final FetchMdfView fetchMdfView = new FetchMdfView();
    private final FetchPoeView fetchPoeView = new FetchPoeView();
    private final FetchRequest fetchRequest = new FetchRequest();
    private final Queries queries = new Queries();

    private final UpdateCampaignStatus updateCampaignStatus = new UpdateCampaignStatus();
    private final DeclineDescriptionAdder declineDescriptionAdder = new DeclineDescriptionAdder();

    @Override
    public String login(String user, String pass) {
        try {
            return loginSystem.login(user, pass);
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
        return null;
    }

    @Override
    public FacturaDTO fetchFactura(String id_factura) {
        try {
            return fetchFacturaView.fetchFactura(id_factura);
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
        return null;
    }

    @Override
    public InvoiceDTO fetchInvoice(String id_invoice) {
        try {
            return fetchInvoiceView.fetchInvoice(id_invoice);
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
        return null;
    }

    @Override
    public MdfDTO fetchMdf(String id_MDF) {
        try {
            return fetchMdfView.fetchMdf(id_MDF);
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
        return null;
    }

    @Override
    public PoEDTO fetchPoe(String id_POE) {
        try {
            return fetchPoeView.fetchPoe(id_POE);
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
        return null;
    }

    @Override
    public String fetchPartnerNo(String username) {
        try {
            return fetchRequest.fetchPartnerNo(username);
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
        return null;
    }

    @Override
    public ArrayList<CampaignDTO> fetchPendingCampaigns() {
        try {
            return fetchRequest.fetchPendingCampaigns();
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
        return null;
    }

    @Override
    public ArrayList<CampaignDTO> fetchPendingCampaignsForPartner(String partner) {
        try {
            return fetchRequest.fetchPendingCampaignsForPartner(partner);
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
        return null;
    }

    @Override
    public ArrayList<CampaignDTO> fetchPendingCampaigns(String partner) {
        try {
            queries.fetchPendingCampaigns(partner);
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
        return null;
    }

    @Override
    public ArrayList<quarterDTO> fetchQuarters() {
        try {
            return queries.fetchQuarters();
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
        return null;
    }

    @Override
    public void addMdfRequestToDatabase(MdfDTO mdf, CampaignDTO camp) {
        try {
            queries.addMdfRequestToDatabase(mdf, camp);
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
    }

    @Override
    public void addCampaignToDatabase(MdfDTO mdf, CampaignDTO camp) {
        try {
            queries.addCampaignToDatabase(mdf, camp);
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
    }

    @Override
    public void addPoERequestToDatabase(PoEDTO poe) {
        try {
            queries.addPoERequestToDatabase(poe);
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
    }

    @Override
    public void addInvoiceToDatabase(InvoiceDTO invoice) {
        try {
            queries.addInvoiceToDatabase(invoice);
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
    }

    @Override
    public void addFacturaToDatabase(FacturaDTO factura) {
        try {
            queries.addFacturaToDatabase(factura);
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
    }

    @Override
    public void updateCampaignStatusAfterMdf(String id_MDF) {
        try {
            updateCampaignStatus.updateCampaignStatusAfterMdf(id_MDF);
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
    }

    @Override
    public void updateCampaignStatusAfterMdfDecline(String id_MDF) {
        try {
            updateCampaignStatus.updateCampaignStatusAfterMdfDecline(id_MDF);
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
    }

    @Override
    public void updateCampaignStatusAfterPoeUpload(String id_POE) {
        try {
            updateCampaignStatus.updateCampaignStatusAfterPoeUpload(id_POE);
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
    }

    @Override
    public void updateCampaignStatusAfterPoeDecline(String id_POE) {
        try {
            updateCampaignStatus.updateCampaignStatusAfterPoeDecline(id_POE);
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
    }

    @Override
    public void updateCampaignStatusAfterPoe(String id_POE) {
        try {
            updateCampaignStatus.updateCampaignStatusAfterPoe(id_POE);
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
    }

    @Override
    public void updateCampaignStatusAfterInvoiceUpload(String id_invoice) {
        try {
            updateCampaignStatus.updateCampaignStatusAfterInvoiceUpload(id_invoice);
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
    }

    @Override
    public void updateCampaignStatusAfterInvoice(String id_invoice) {
        try {
            updateCampaignStatus.updateCampaignStatusAfterInvoice(id_invoice);
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
    }

    @Override
    public void updateCampaignStatusAfterFacturaUpload(String id_factura) {
        try {
            updateCampaignStatus.updateCampaignStatusAfterFacturaUpload(id_factura);
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
    }

    @Override
    public void addDeclineMDFDescription(String mdf, String desc) {
        try {
            declineDescriptionAdder.addDeclineMDFDescription(mdf, desc);
        } catch (SQLException ex) {
//            GIVE MESSAGE TO USER
        }
    }

}
