/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Ebbe
 */
public class PoEDTO {
    
    private String campaign_type;
    private String activity;
    private String date;
    private String recipients;
    private String unique_opens_hits;
    private String unique_clicks;
    private String additional_information;

    public PoEDTO(String campaign_type, String activity, String date, String recipients, String unique_opens_hits, String unique_clicks, String additional_information) {
        this.campaign_type = campaign_type;
        this.activity = activity;
        this.date = date;
        this.recipients = recipients;
        this.unique_opens_hits = unique_opens_hits;
        this.unique_clicks = unique_clicks;
        this.additional_information = additional_information;
    }

    public String getCampaign_type() {
        return campaign_type;
    }

    public void setCampaign_type(String campaign_type) {
        this.campaign_type = campaign_type;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }

    public String getUnique_opens_hits() {
        return unique_opens_hits;
    }

    public void setUnique_opens_hits(String unique_opens_hits) {
        this.unique_opens_hits = unique_opens_hits;
    }

    public String getUnique_clicks() {
        return unique_clicks;
    }

    public void setUnique_clicks(String unique_clicks) {
        this.unique_clicks = unique_clicks;
    }

    public String getAdditional_information() {
        return additional_information;
    }

    public void setAdditional_information(String additional_information) {
        this.additional_information = additional_information;
    }

    @Override
    public String toString() {
        return "PoEDTO{" + "campaign_type=" + campaign_type + ", activity=" + activity + ", date=" + date + 
                ", recipients=" + recipients + ", unique_opens_hits=" + unique_opens_hits + 
                ", unique_clicks=" + unique_clicks + ", additional_information=" + additional_information + '}';
    }
    
    
    
}
