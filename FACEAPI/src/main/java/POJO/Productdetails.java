package POJO;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Productdetails {
	    
	    private ESCOMMENTADC ES_COMMENT_ADC;
	    private ES_FFGINST_PART ES_FFGINST_PART;
	    private ES_HEADER ES_HEADER;
	    private List<ET_ADDRESS_OUT> ET_ADDRESS_OUT;
	    private List<ET_COLIS> ET_COLIS;
	    private List<Object> ET_CONSTRUCSITE_PART;
	    private List<ET_CUSTOMER_PART> ET_CUSTOMER_PART;
	    private List<Object> ET_DELIVCONTACT_PART;
	    private List<Object> ET_DEPOSIT_DATA;
	    private List<Object> ET_DOCFLOW;
	    private List<ET_EXT_ITEM> ET_EXT_ITEM;
	    private List<Object> ET_FREEGOODS_DATA;
	    private List<Object> ET_GRP_ITEM;
	    private List<ET_ITEMS> ET_ITEMS;
	    private List<Object> ET_ITEM_COMMENT_EXT;
	    private List<Object> ET_ITEM_COMMENT_INT;
	    private List<Object> ET_PAYDATA;
	    private List<Object> ET_PAYER_PART;
	    private List<ET_PICK_PART> ET_PICK_PART;
	    private List<Object> ET_REFUND_DATA;
	    private List<Object> ET_RETURN;
	    private List<ET_PICK_PART> ET_SHIPTO_PART;
	    private List<Object> ET_SHOWROOM_PART;
	    private List<Object> ET_SHOWROOSALER_PART;
	    private List<Object> ET_TMSODT;
	    private List<Object> ET_TXT_HEAD;
	    private String EV_COMMENT_SHPMNT;
	    private int EV_RC;
	    
		public ES_COMMENT_ADC getES_COMMENT_ADC() {
			return ES_COMMENT_ADC;
		}
		public void setES_COMMENT_ADC(ES_COMMENT_ADC eS_COMMENT_ADC) {
			this.ES_COMMENT_ADC = eS_COMMENT_ADC;
		}
		public ES_FFGINST_PART getES_FFGINST_PART() {
			return ES_FFGINST_PART;
		}
		public void setES_FFGINST_PART(ES_FFGINST_PART eS_FFGINST_PART) {
			this.ES_FFGINST_PART = eS_FFGINST_PART;
		}
		public ES_HEADER getES_HEADER() {
			return ES_HEADER;
		}
		public void setES_HEADER(ES_HEADER eS_HEADER) {
			this.ES_HEADER = eS_HEADER;
		}
		public List<ET_ADDRESS_OUT> getET_ADDRESS_OUT() {
			return ET_ADDRESS_OUT;
		}
		public void setET_ADDRESS_OUT(List<ET_ADDRESS_OUT> eT_ADDRESS_OUT) {
			this.ET_ADDRESS_OUT = eT_ADDRESS_OUT;
		}
		public List<ET_COLIS> getET_COLIS() {
			return ET_COLIS;
		}
		public void setET_COLIS(List<ET_COLIS> eT_COLIS) {
			this.ET_COLIS = eT_COLIS;
		}
		public List<Object> getET_CONSTRUCSITE_PART() {
			return ET_CONSTRUCSITE_PART;
		}
		public void setET_CONSTRUCSITE_PART(List<Object> eT_CONSTRUCSITE_PART) {
			this.ET_CONSTRUCSITE_PART = eT_CONSTRUCSITE_PART;
		}
		public List<ET_CUSTOMER_PART> getET_CUSTOMER_PART() {
			return ET_CUSTOMER_PART;
		}
		public void setET_CUSTOMER_PART(List<ET_CUSTOMER_PART> eT_CUSTOMER_PART) {
			this.ET_CUSTOMER_PART = eT_CUSTOMER_PART;
		}
		public List<Object> getET_DELIVCONTACT_PART() {
			return ET_DELIVCONTACT_PART;
		}
		public void setET_DELIVCONTACT_PART(List<Object> eT_DELIVCONTACT_PART) {
			ET_DELIVCONTACT_PART = eT_DELIVCONTACT_PART;
		}
		public List<Object> getET_DEPOSIT_DATA() {
			return ET_DEPOSIT_DATA;
		}
		public void setET_DEPOSIT_DATA(List<Object> eT_DEPOSIT_DATA) {
			this.ET_DEPOSIT_DATA = eT_DEPOSIT_DATA;
		}
		public List<Object> getET_DOCFLOW() {
			return ET_DOCFLOW;
		}
		public void setET_DOCFLOW(List<Object> eT_DOCFLOW) {
			this.ET_DOCFLOW = eT_DOCFLOW;
		}
		public List<ET_EXT_ITEM> getET_EXT_ITEM() {
			return ET_EXT_ITEM;
		}
		public void setET_EXT_ITEM(List<ET_EXT_ITEM> eT_EXT_ITEM) {
			this.ET_EXT_ITEM = eT_EXT_ITEM;
		}
		public List<Object> getET_FREEGOODS_DATA() {
			return ET_FREEGOODS_DATA;
		}
		public void setET_FREEGOODS_DATA(List<Object> eT_FREEGOODS_DATA) {
			this.ET_FREEGOODS_DATA = eT_FREEGOODS_DATA;
		}
		public List<Object> getET_GRP_ITEM() {
			return ET_GRP_ITEM;
		}
		public void setET_GRP_ITEM(List<Object> eT_GRP_ITEM) {
			this.ET_GRP_ITEM = eT_GRP_ITEM;
		}
		public List<ET_ITEMS> getET_ITEMS() {
			return ET_ITEMS;
		}
		public void setET_ITEMS(List<ET_ITEMS> eT_ITEMS) {
			this.ET_ITEMS = eT_ITEMS;
		}
		public List<Object> getET_ITEM_COMMENT_EXT() {
			return ET_ITEM_COMMENT_EXT;
		}
		public void setET_ITEM_COMMENT_EXT(List<Object> eT_ITEM_COMMENT_EXT) {
			this.ET_ITEM_COMMENT_EXT = eT_ITEM_COMMENT_EXT;
		}
		public List<Object> getET_ITEM_COMMENT_INT() {
			return ET_ITEM_COMMENT_INT;
		}
		public void setET_ITEM_COMMENT_INT(List<Object> eT_ITEM_COMMENT_INT) {
			this.ET_ITEM_COMMENT_INT = eT_ITEM_COMMENT_INT;
		}
		public List<Object> getET_PAYDATA() {
			return ET_PAYDATA;
		}
		public void setET_PAYDATA(List<Object> eT_PAYDATA) {
			this.ET_PAYDATA = eT_PAYDATA;
		}
		public List<Object> getET_PAYER_PART() {
			return ET_PAYER_PART;
		}
		public void setET_PAYER_PART(List<Object> eT_PAYER_PART) {
			this.ET_PAYER_PART = eT_PAYER_PART;
		}
		public List<ET_PICK_PART> getET_PICK_PART() {
			return ET_PICK_PART;
		}
		public void setET_PICK_PART(List<ET_PICK_PART> eT_PICK_PART) {
			this.ET_PICK_PART = eT_PICK_PART;
		}
		public List<Object> getET_REFUND_DATA() {
			return ET_REFUND_DATA;
		}
		public void setET_REFUND_DATA(List<Object> eT_REFUND_DATA) {
			this.ET_REFUND_DATA = eT_REFUND_DATA;
		}
		public List<Object> getET_RETURN() {
			return ET_RETURN;
		}
		public void setET_RETURN(List<Object> eT_RETURN) {
			this.ET_RETURN = eT_RETURN;
		}
		public List<ET_PICK_PART> getET_SHIPTO_PART() {
			return ET_SHIPTO_PART;
		}
		public void setET_SHIPTO_PART(List<ET_PICK_PART> eT_SHIPTO_PART) {
			this.ET_SHIPTO_PART = eT_SHIPTO_PART;
		}
		public List<Object> getET_SHOWROOM_PART() {
			return ET_SHOWROOM_PART;
		}
		public void setET_SHOWROOM_PART(List<Object> eT_SHOWROOM_PART) {
			this.ET_SHOWROOM_PART = eT_SHOWROOM_PART;
		}
		public List<Object> getET_SHOWROOSALER_PART() {
			return ET_SHOWROOSALER_PART;
		}
		public void setET_SHOWROOSALER_PART(List<Object> eT_SHOWROOSALER_PART) {
			this.ET_SHOWROOSALER_PART = eT_SHOWROOSALER_PART;
		}
		public List<Object> getET_TMSODT() {
			return ET_TMSODT;
		}
		public void setET_TMSODT(List<Object> eT_TMSODT) {
			this.ET_TMSODT = eT_TMSODT;
		}
		public List<Object> getET_TXT_HEAD() {
			return ET_TXT_HEAD;
		}
		public void setET_TXT_HEAD(List<Object> eT_TXT_HEAD) {
			this.ET_TXT_HEAD = eT_TXT_HEAD;
		}
		public String getEV_COMMENT_SHPMNT() {
			return EV_COMMENT_SHPMNT;
		}
		public void setEV_COMMENT_SHPMNT(String eV_COMMENT_SHPMNT) {
			this.EV_COMMENT_SHPMNT = eV_COMMENT_SHPMNT;
		}
		public int getEV_RC() {
			return EV_RC;
		}
		public void setEV_RC(int eV_RC) {
			this.EV_RC = eV_RC;
		}
}
