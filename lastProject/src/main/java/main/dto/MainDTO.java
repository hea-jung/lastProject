package main.dto;

public class MainDTO {
	
	public String region;
	public float risk;	
	public float close_rate;	
	public float preclose_rate;	
	public float close_rate_3year;
	public float close_avgyear;	
	public float change_rate;
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public float getRisk() {
		return risk;
	}
	public void setRisk(float risk) {
		this.risk = risk;
	}
	public float getClose_rate() {
		return close_rate;
	}
	public void setClose_rate(float close_rate) {
		this.close_rate = close_rate;
	}
	public float getPreclose_rate() {
		return preclose_rate;
	}
	public void setPreclose_rate(float preclose_rate) {
		this.preclose_rate = preclose_rate;
	}
	public float getClose_rate_3year() {
		return close_rate_3year;
	}
	public void setClose_rate_3year(float close_rate_3year) {
		this.close_rate_3year = close_rate_3year;
	}
	public float getClose_avgyear() {
		return close_avgyear;
	}
	public void setClose_avgyear(float close_avgyear) {
		this.close_avgyear = close_avgyear;
	}
	public float getChange_rate() {
		return change_rate;
	}
	public void setChange_rate(float change_rate) {
		this.change_rate = change_rate;
	}
	@Override
	public String toString() {
		return "MainDTO [region=" + region + ", risk=" + risk + ", close_rate=" + close_rate + ", preclose_rate="
				+ preclose_rate + ", close_rate_3year=" + close_rate_3year + ", close_avgyear=" + close_avgyear
				+ ", change_rate=" + change_rate + "]";
	}
	public MainDTO() {
		
	}
	public MainDTO(String region, float risk, float close_rate, float preclose_rate, float close_rate_3year, float close_avgyear,
			float change_rate) {
		super();
		this.region = region;
		this.risk = risk;
		this.close_rate = close_rate;
		this.preclose_rate = preclose_rate;
		this.close_rate_3year = close_rate_3year;
		this.close_avgyear = close_avgyear;
		this.change_rate = change_rate;
	}
	
	
	
	
}
