
package DTO;


public class PartnerDTO {
    String Partner_No;
    String USERNAME;
    String PARTNER_MAIL;
    String PARTNER_PHONE;
    String PARTNER_ADDRESS;

    public PartnerDTO(String Partner_No, String USERNAME, String PARTNER_MAIL, String PARTNER_PHONE, String PARTNER_ADDRESS) {
        this.Partner_No = Partner_No;
        this.USERNAME = USERNAME;
        this.PARTNER_MAIL = PARTNER_MAIL;
        this.PARTNER_PHONE = PARTNER_PHONE;
        this.PARTNER_ADDRESS = PARTNER_ADDRESS;
    }

    public PartnerDTO(String Partner_No) {
        this.Partner_No = Partner_No;
    }

    public PartnerDTO(String Partner_No, String USERNAME) {
        this.Partner_No = Partner_No;
        this.USERNAME = USERNAME;
    }

    
    public String getPartner_No() {
        return Partner_No;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public String getPARTNER_MAIL() {
        return PARTNER_MAIL;
    }

    public String getPARTNER_PHONE() {
        return PARTNER_PHONE;
    }

    public String getPARTNER_ADDRESS() {
        return PARTNER_ADDRESS;
    }

    public void setPartner_No(String Partner_No) {
        this.Partner_No = Partner_No;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public void setPARTNER_MAIL(String PARTNER_MAIL) {
        this.PARTNER_MAIL = PARTNER_MAIL;
    }

    public void setPARTNER_PHONE(String PARTNER_PHONE) {
        this.PARTNER_PHONE = PARTNER_PHONE;
    }

    public void setPARTNER_ADDRESS(String PARTNER_ADDRESS) {
        this.PARTNER_ADDRESS = PARTNER_ADDRESS;
    }
    
}
