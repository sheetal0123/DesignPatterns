package objecthierarchy;

public class Terminal {

	String outletID;
	int terminalID;
	String terminalName;
	String terminalType;
	
	public String getOutletID() {
		return outletID;
	}
	public void setOutletID(String outletID) {
		this.outletID = outletID;
	}
	public String getTerminalName() {
		return terminalName;
	}
	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}
	public int getTerminalID() {
		return terminalID;
	}
	public void setTerminalID(int terminalID) {
		this.terminalID = terminalID;
	}
	public String getTerminalType() {
		return terminalType;
	}
	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}
	
	@Override
	public String toString() {
		return "\n      >>Terminal [outletID=" + outletID + ", terminalName=" + terminalName + ", terminalID=" + terminalID
				+ ", terminalType=" + terminalType + "]";
	}
	

}
