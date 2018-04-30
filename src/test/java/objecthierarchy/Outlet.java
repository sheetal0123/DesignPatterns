package objecthierarchy;

import java.util.List;

//Outlet has many Terminal i.e. again one to many mapping
public class Outlet {

	String merchantID;
	String outletID;
	String outletLocation;
	String outletStepFall;
	List<Terminal> terminalList;

	public List<Terminal> getTerminalList() {
		return terminalList;
	}
	public void setTerminalList(List<Terminal> terminalList) {
		this.terminalList = terminalList;
	}
	public String getMerchantID() {
		return merchantID;
	}
	public void setMerchantID(String merchantID) {
		this.merchantID = merchantID;
	}
	public String getOutletID() {
		return outletID;
	}
	public void setOutletID(String outletID) {
		this.outletID = outletID;
	}
	public String getOutletLocation() {
		return outletLocation;
	}
	public void setOutletLocation(String outletLocation) {
		this.outletLocation = outletLocation;
	}
	public String getOutletStepFall() {
		return outletStepFall;
	}
	public void setOutletStepFall(String outletStepFall) {
		this.outletStepFall = outletStepFall;
	}
	
	@Override
	public String toString() {
		return "\n   >Outlet [merchantID=" + merchantID + ", outletID=" + outletID + ", outletLocation=" + outletLocation
				+ ", outletStepFall=" + outletStepFall + ", terminalList=" + terminalList + "]";
	}
	

}