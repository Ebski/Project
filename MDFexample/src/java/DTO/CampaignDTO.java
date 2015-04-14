/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Dennis
 */
public class CampaignDTO {
    private String campaign_No;
    private String campaign_Name;
    private String partner_No;
    private String id_MDF;
    private String id_POE;

    public CampaignDTO(String campaign_Name) {
        this.campaign_Name = campaign_Name;
    }
    
    

    public CampaignDTO(String campaign_No, String campaign_Name, String partner_No, String id_MDF, String id_POE) {
        this.campaign_No = campaign_No;
        this.campaign_Name = campaign_Name;
        this.partner_No = partner_No;
        this.id_MDF = id_MDF;
        this.id_POE = id_POE;
    }

    public String getCampaign_Name() {
        return campaign_Name;
    }

    public void setCampaign_Name(String campaign_Name) {
        this.campaign_Name = campaign_Name;
    }
    
    

    public String getCampaign_No() {
        return campaign_No;
    }

    public void setCampaign_No(String campaign_No) {
        this.campaign_No = campaign_No;
    }

    public String getPartner_No() {
        return partner_No;
    }

    public void setPartner_No(String partner_No) {
        this.partner_No = partner_No;
    }

    public String getId_MDF() {
        return id_MDF;
    }

    public void setId_MDF(String id_MDF) {
        this.id_MDF = id_MDF;
    }

    public String getId_POE() {
        return id_POE;
    }

    public void setId_POE(String id_POE) {
        this.id_POE = id_POE;
    }

    @Override
    public String toString() {
        return "CampaignDTO{" + "campaign_No=" + campaign_No + ", campaign_Name=" + campaign_Name + ", partner_No=" + partner_No + ", id_MDF=" + id_MDF + ", id_POE=" + id_POE + '}';
    }

    
    
    
}