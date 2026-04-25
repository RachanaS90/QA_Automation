package POJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ES_COMMENT_ADC {


    private String ADC_NUMBER;
    private String ADC_STARTDATE;
    private String ADC_ENDDATE;
    private String DEL_FLAG;
    
    
	public String getADC_NUMBER() {
		return ADC_NUMBER;
	}
	public void setADC_NUMBER(String aDC_NUMBER) {
		this.ADC_NUMBER = aDC_NUMBER;
	}
	public String getADC_STARTDATE() {
		return ADC_STARTDATE;
	}
	public void setADC_STARTDATE(String aDC_STARTDATE) {
		this.ADC_STARTDATE = aDC_STARTDATE;
	}
	public String getADC_ENDDATE() {
		return ADC_ENDDATE;
	}
	public void setADC_ENDDATE(String aDC_ENDDATE) {
		this.ADC_ENDDATE = aDC_ENDDATE;
	}
	public String getDEL_FLAG() {
		return DEL_FLAG;
	}
	public void setDEL_FLAG(String dEL_FLAG) {
		this.DEL_FLAG = dEL_FLAG;
	}
}
