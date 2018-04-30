package objecthierarchy;

import java.util.List;

//Merchant has many Outlets i.e. one to many mapping
public class Merchant {

	String merchantID;
	String merchantName;
	String merchantState;
	List<Outlet> outletList;
	
	public String getMerchantID() {
		return merchantID;
	}
	public void setMerchantID(String merchantID) {
		this.merchantID = merchantID;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantState() {
		return merchantState;
	}
	public void setMerchantState(String merchantState) {
		this.merchantState = merchantState;
	}
	public List<Outlet> getOutletList() {
		return outletList;
	}
	public void setOutletList(List<Outlet> outletList) {
		this.outletList = outletList;
	}

	@Override
	public String toString() {
		return "Merchant [merchantID=" + merchantID + ", merchantName=" + merchantName + ", merchantState="
				+ merchantState + ", outletList=" + outletList + "]";
	}
	

}
