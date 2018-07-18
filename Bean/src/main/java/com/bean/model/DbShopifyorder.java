package com.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DbShopifyorder implements Serializable {
    private String id;

    private String groupid;

    private String email;

    private Date closedAt;

    private Date createdAt;

    private Date updatedAt;

    private BigDecimal ukNumber;

    private String token;

    private String note;

    private String gateway;

    private BigDecimal totalPrice;

    private BigDecimal subtotalPrice;

    private BigDecimal totalTax;

    private String currency;

    private String financialStatus;

    private String fulfillmentStatus;

    private String confirmed;

    private BigDecimal totalDiscounts;

    private BigDecimal totalLineItemsPrice;

    private String cartToken;

    private String buyerAcceptsMarketing;

    private String tradeid;

    private String referringSite;

    private String landingSite;

    private Date cancelledAt;

    private String cancelReason;

    private BigDecimal totalPriceUsd;

    private String checkoutToken;

    private Date processedAt;

    private String orderNumber;

    private String processingMethod;

    private String checkoutId;

    private String contactEmail;

    private String orderStatusUrl;

    private String countryCode;

    private String provinceCode;

    private String buyername;

    private String address1;

    private String address2;

    private String city;

    private String zip;

    private String firstName;

    private String lastName;

    private String phone;

    private String province;

    private String country;

    private String shippingLinesTitle;

    private BigDecimal shippingFee;

    private String shopid;

    private String shopname;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(Date closedAt) {
        this.closedAt = closedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public BigDecimal getUkNumber() {
        return ukNumber;
    }

    public void setUkNumber(BigDecimal ukNumber) {
        this.ukNumber = ukNumber;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway == null ? null : gateway.trim();
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getSubtotalPrice() {
        return subtotalPrice;
    }

    public void setSubtotalPrice(BigDecimal subtotalPrice) {
        this.subtotalPrice = subtotalPrice;
    }

    public BigDecimal getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getFinancialStatus() {
        return financialStatus;
    }

    public void setFinancialStatus(String financialStatus) {
        this.financialStatus = financialStatus == null ? null : financialStatus.trim();
    }

    public String getFulfillmentStatus() {
        return fulfillmentStatus;
    }

    public void setFulfillmentStatus(String fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus == null ? null : fulfillmentStatus.trim();
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed == null ? null : confirmed.trim();
    }

    public BigDecimal getTotalDiscounts() {
        return totalDiscounts;
    }

    public void setTotalDiscounts(BigDecimal totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
    }

    public BigDecimal getTotalLineItemsPrice() {
        return totalLineItemsPrice;
    }

    public void setTotalLineItemsPrice(BigDecimal totalLineItemsPrice) {
        this.totalLineItemsPrice = totalLineItemsPrice;
    }

    public String getCartToken() {
        return cartToken;
    }

    public void setCartToken(String cartToken) {
        this.cartToken = cartToken == null ? null : cartToken.trim();
    }

    public String getBuyerAcceptsMarketing() {
        return buyerAcceptsMarketing;
    }

    public void setBuyerAcceptsMarketing(String buyerAcceptsMarketing) {
        this.buyerAcceptsMarketing = buyerAcceptsMarketing == null ? null : buyerAcceptsMarketing.trim();
    }

    public String getTradeid() {
        return tradeid;
    }

    public void setTradeid(String tradeid) {
        this.tradeid = tradeid == null ? null : tradeid.trim();
    }

    public String getReferringSite() {
        return referringSite;
    }

    public void setReferringSite(String referringSite) {
        this.referringSite = referringSite == null ? null : referringSite.trim();
    }

    public String getLandingSite() {
        return landingSite;
    }

    public void setLandingSite(String landingSite) {
        this.landingSite = landingSite == null ? null : landingSite.trim();
    }

    public Date getCancelledAt() {
        return cancelledAt;
    }

    public void setCancelledAt(Date cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason == null ? null : cancelReason.trim();
    }

    public BigDecimal getTotalPriceUsd() {
        return totalPriceUsd;
    }

    public void setTotalPriceUsd(BigDecimal totalPriceUsd) {
        this.totalPriceUsd = totalPriceUsd;
    }

    public String getCheckoutToken() {
        return checkoutToken;
    }

    public void setCheckoutToken(String checkoutToken) {
        this.checkoutToken = checkoutToken == null ? null : checkoutToken.trim();
    }

    public Date getProcessedAt() {
        return processedAt;
    }

    public void setProcessedAt(Date processedAt) {
        this.processedAt = processedAt;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    public String getProcessingMethod() {
        return processingMethod;
    }

    public void setProcessingMethod(String processingMethod) {
        this.processingMethod = processingMethod == null ? null : processingMethod.trim();
    }

    public String getCheckoutId() {
        return checkoutId;
    }

    public void setCheckoutId(String checkoutId) {
        this.checkoutId = checkoutId == null ? null : checkoutId.trim();
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail == null ? null : contactEmail.trim();
    }

    public String getOrderStatusUrl() {
        return orderStatusUrl;
    }

    public void setOrderStatusUrl(String orderStatusUrl) {
        this.orderStatusUrl = orderStatusUrl == null ? null : orderStatusUrl.trim();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getBuyername() {
        return buyername;
    }

    public void setBuyername(String buyername) {
        this.buyername = buyername == null ? null : buyername.trim();
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1 == null ? null : address1.trim();
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2 == null ? null : address2.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getShippingLinesTitle() {
        return shippingLinesTitle;
    }

    public void setShippingLinesTitle(String shippingLinesTitle) {
        this.shippingLinesTitle = shippingLinesTitle == null ? null : shippingLinesTitle.trim();
    }

    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DbShopifyorder other = (DbShopifyorder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getClosedAt() == null ? other.getClosedAt() == null : this.getClosedAt().equals(other.getClosedAt()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()))
            && (this.getUkNumber() == null ? other.getUkNumber() == null : this.getUkNumber().equals(other.getUkNumber()))
            && (this.getToken() == null ? other.getToken() == null : this.getToken().equals(other.getToken()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getGateway() == null ? other.getGateway() == null : this.getGateway().equals(other.getGateway()))
            && (this.getTotalPrice() == null ? other.getTotalPrice() == null : this.getTotalPrice().equals(other.getTotalPrice()))
            && (this.getSubtotalPrice() == null ? other.getSubtotalPrice() == null : this.getSubtotalPrice().equals(other.getSubtotalPrice()))
            && (this.getTotalTax() == null ? other.getTotalTax() == null : this.getTotalTax().equals(other.getTotalTax()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getFinancialStatus() == null ? other.getFinancialStatus() == null : this.getFinancialStatus().equals(other.getFinancialStatus()))
            && (this.getFulfillmentStatus() == null ? other.getFulfillmentStatus() == null : this.getFulfillmentStatus().equals(other.getFulfillmentStatus()))
            && (this.getConfirmed() == null ? other.getConfirmed() == null : this.getConfirmed().equals(other.getConfirmed()))
            && (this.getTotalDiscounts() == null ? other.getTotalDiscounts() == null : this.getTotalDiscounts().equals(other.getTotalDiscounts()))
            && (this.getTotalLineItemsPrice() == null ? other.getTotalLineItemsPrice() == null : this.getTotalLineItemsPrice().equals(other.getTotalLineItemsPrice()))
            && (this.getCartToken() == null ? other.getCartToken() == null : this.getCartToken().equals(other.getCartToken()))
            && (this.getBuyerAcceptsMarketing() == null ? other.getBuyerAcceptsMarketing() == null : this.getBuyerAcceptsMarketing().equals(other.getBuyerAcceptsMarketing()))
            && (this.getTradeid() == null ? other.getTradeid() == null : this.getTradeid().equals(other.getTradeid()))
            && (this.getReferringSite() == null ? other.getReferringSite() == null : this.getReferringSite().equals(other.getReferringSite()))
            && (this.getLandingSite() == null ? other.getLandingSite() == null : this.getLandingSite().equals(other.getLandingSite()))
            && (this.getCancelledAt() == null ? other.getCancelledAt() == null : this.getCancelledAt().equals(other.getCancelledAt()))
            && (this.getCancelReason() == null ? other.getCancelReason() == null : this.getCancelReason().equals(other.getCancelReason()))
            && (this.getTotalPriceUsd() == null ? other.getTotalPriceUsd() == null : this.getTotalPriceUsd().equals(other.getTotalPriceUsd()))
            && (this.getCheckoutToken() == null ? other.getCheckoutToken() == null : this.getCheckoutToken().equals(other.getCheckoutToken()))
            && (this.getProcessedAt() == null ? other.getProcessedAt() == null : this.getProcessedAt().equals(other.getProcessedAt()))
            && (this.getOrderNumber() == null ? other.getOrderNumber() == null : this.getOrderNumber().equals(other.getOrderNumber()))
            && (this.getProcessingMethod() == null ? other.getProcessingMethod() == null : this.getProcessingMethod().equals(other.getProcessingMethod()))
            && (this.getCheckoutId() == null ? other.getCheckoutId() == null : this.getCheckoutId().equals(other.getCheckoutId()))
            && (this.getContactEmail() == null ? other.getContactEmail() == null : this.getContactEmail().equals(other.getContactEmail()))
            && (this.getOrderStatusUrl() == null ? other.getOrderStatusUrl() == null : this.getOrderStatusUrl().equals(other.getOrderStatusUrl()))
            && (this.getCountryCode() == null ? other.getCountryCode() == null : this.getCountryCode().equals(other.getCountryCode()))
            && (this.getProvinceCode() == null ? other.getProvinceCode() == null : this.getProvinceCode().equals(other.getProvinceCode()))
            && (this.getBuyername() == null ? other.getBuyername() == null : this.getBuyername().equals(other.getBuyername()))
            && (this.getAddress1() == null ? other.getAddress1() == null : this.getAddress1().equals(other.getAddress1()))
            && (this.getAddress2() == null ? other.getAddress2() == null : this.getAddress2().equals(other.getAddress2()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getZip() == null ? other.getZip() == null : this.getZip().equals(other.getZip()))
            && (this.getFirstName() == null ? other.getFirstName() == null : this.getFirstName().equals(other.getFirstName()))
            && (this.getLastName() == null ? other.getLastName() == null : this.getLastName().equals(other.getLastName()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getShippingLinesTitle() == null ? other.getShippingLinesTitle() == null : this.getShippingLinesTitle().equals(other.getShippingLinesTitle()))
            && (this.getShippingFee() == null ? other.getShippingFee() == null : this.getShippingFee().equals(other.getShippingFee()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getShopname() == null ? other.getShopname() == null : this.getShopname().equals(other.getShopname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getClosedAt() == null) ? 0 : getClosedAt().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        result = prime * result + ((getUkNumber() == null) ? 0 : getUkNumber().hashCode());
        result = prime * result + ((getToken() == null) ? 0 : getToken().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getGateway() == null) ? 0 : getGateway().hashCode());
        result = prime * result + ((getTotalPrice() == null) ? 0 : getTotalPrice().hashCode());
        result = prime * result + ((getSubtotalPrice() == null) ? 0 : getSubtotalPrice().hashCode());
        result = prime * result + ((getTotalTax() == null) ? 0 : getTotalTax().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getFinancialStatus() == null) ? 0 : getFinancialStatus().hashCode());
        result = prime * result + ((getFulfillmentStatus() == null) ? 0 : getFulfillmentStatus().hashCode());
        result = prime * result + ((getConfirmed() == null) ? 0 : getConfirmed().hashCode());
        result = prime * result + ((getTotalDiscounts() == null) ? 0 : getTotalDiscounts().hashCode());
        result = prime * result + ((getTotalLineItemsPrice() == null) ? 0 : getTotalLineItemsPrice().hashCode());
        result = prime * result + ((getCartToken() == null) ? 0 : getCartToken().hashCode());
        result = prime * result + ((getBuyerAcceptsMarketing() == null) ? 0 : getBuyerAcceptsMarketing().hashCode());
        result = prime * result + ((getTradeid() == null) ? 0 : getTradeid().hashCode());
        result = prime * result + ((getReferringSite() == null) ? 0 : getReferringSite().hashCode());
        result = prime * result + ((getLandingSite() == null) ? 0 : getLandingSite().hashCode());
        result = prime * result + ((getCancelledAt() == null) ? 0 : getCancelledAt().hashCode());
        result = prime * result + ((getCancelReason() == null) ? 0 : getCancelReason().hashCode());
        result = prime * result + ((getTotalPriceUsd() == null) ? 0 : getTotalPriceUsd().hashCode());
        result = prime * result + ((getCheckoutToken() == null) ? 0 : getCheckoutToken().hashCode());
        result = prime * result + ((getProcessedAt() == null) ? 0 : getProcessedAt().hashCode());
        result = prime * result + ((getOrderNumber() == null) ? 0 : getOrderNumber().hashCode());
        result = prime * result + ((getProcessingMethod() == null) ? 0 : getProcessingMethod().hashCode());
        result = prime * result + ((getCheckoutId() == null) ? 0 : getCheckoutId().hashCode());
        result = prime * result + ((getContactEmail() == null) ? 0 : getContactEmail().hashCode());
        result = prime * result + ((getOrderStatusUrl() == null) ? 0 : getOrderStatusUrl().hashCode());
        result = prime * result + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        result = prime * result + ((getProvinceCode() == null) ? 0 : getProvinceCode().hashCode());
        result = prime * result + ((getBuyername() == null) ? 0 : getBuyername().hashCode());
        result = prime * result + ((getAddress1() == null) ? 0 : getAddress1().hashCode());
        result = prime * result + ((getAddress2() == null) ? 0 : getAddress2().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getZip() == null) ? 0 : getZip().hashCode());
        result = prime * result + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        result = prime * result + ((getLastName() == null) ? 0 : getLastName().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getShippingLinesTitle() == null) ? 0 : getShippingLinesTitle().hashCode());
        result = prime * result + ((getShippingFee() == null) ? 0 : getShippingFee().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getShopname() == null) ? 0 : getShopname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", groupid=").append(groupid);
        sb.append(", email=").append(email);
        sb.append(", closedAt=").append(closedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", ukNumber=").append(ukNumber);
        sb.append(", token=").append(token);
        sb.append(", note=").append(note);
        sb.append(", gateway=").append(gateway);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", subtotalPrice=").append(subtotalPrice);
        sb.append(", totalTax=").append(totalTax);
        sb.append(", currency=").append(currency);
        sb.append(", financialStatus=").append(financialStatus);
        sb.append(", fulfillmentStatus=").append(fulfillmentStatus);
        sb.append(", confirmed=").append(confirmed);
        sb.append(", totalDiscounts=").append(totalDiscounts);
        sb.append(", totalLineItemsPrice=").append(totalLineItemsPrice);
        sb.append(", cartToken=").append(cartToken);
        sb.append(", buyerAcceptsMarketing=").append(buyerAcceptsMarketing);
        sb.append(", tradeid=").append(tradeid);
        sb.append(", referringSite=").append(referringSite);
        sb.append(", landingSite=").append(landingSite);
        sb.append(", cancelledAt=").append(cancelledAt);
        sb.append(", cancelReason=").append(cancelReason);
        sb.append(", totalPriceUsd=").append(totalPriceUsd);
        sb.append(", checkoutToken=").append(checkoutToken);
        sb.append(", processedAt=").append(processedAt);
        sb.append(", orderNumber=").append(orderNumber);
        sb.append(", processingMethod=").append(processingMethod);
        sb.append(", checkoutId=").append(checkoutId);
        sb.append(", contactEmail=").append(contactEmail);
        sb.append(", orderStatusUrl=").append(orderStatusUrl);
        sb.append(", countryCode=").append(countryCode);
        sb.append(", provinceCode=").append(provinceCode);
        sb.append(", buyername=").append(buyername);
        sb.append(", address1=").append(address1);
        sb.append(", address2=").append(address2);
        sb.append(", city=").append(city);
        sb.append(", zip=").append(zip);
        sb.append(", firstName=").append(firstName);
        sb.append(", lastName=").append(lastName);
        sb.append(", phone=").append(phone);
        sb.append(", province=").append(province);
        sb.append(", country=").append(country);
        sb.append(", shippingLinesTitle=").append(shippingLinesTitle);
        sb.append(", shippingFee=").append(shippingFee);
        sb.append(", shopid=").append(shopid);
        sb.append(", shopname=").append(shopname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}