package POJO;

import java.util.List;

public class ET_COLIS {

	private String VBELN;
	private String POSNR;
	private List<COLIS_HEADER> COLIS_HEADER;
	private List<COLIS_ITEMS_Item> COLIS_ITEMS;

	// Getters and setters
	public String getVBELN() {
		return VBELN;
	}

	public void setVBELN(String VBELN) {
		this.VBELN = VBELN;
	}

	public String getPOSNR() {
		return POSNR;
	}

	public void setPOSNR(String POSNR) {
		this.POSNR = POSNR;
	}

	public List<COLIS_HEADER> getCOLIS_HEADER() {
		return COLIS_HEADER;
	}

	public void setCOLIS_HEADER(List<COLIS_HEADER> COLIS_HEADER) {
		this.COLIS_HEADER = COLIS_HEADER;
	}

	public List<COLIS_ITEMS_Item> getCOLIS_ITEMS() {
		return COLIS_ITEMS;
	}

	public void setCOLIS_ITEMS(List<COLIS_ITEMS_Item> COLIS_ITEMS) {
		this.COLIS_ITEMS = COLIS_ITEMS;
	}
}
