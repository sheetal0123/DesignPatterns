package objecthierarchy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestObjectChain {
	
	String terminalFilePath = System.getProperty("user.dir")+"/src/test/java/objecthierarchy/terminaldata.csv";
	String outletFilePath = System.getProperty("user.dir")+"/src/test/java/objecthierarchy/outletdata.csv";
	String merchantFilePath = System.getProperty("user.dir")+"/src/test/java/objecthierarchy/merchantdata.csv";
	
	
	public List<Terminal> createTerminalList(String outletID) throws IOException{
		List<Terminal> terminalList = new ArrayList<>();

		BufferedReader br = new BufferedReader(new FileReader(terminalFilePath));
		String str;
		int count=0;
		while((str = br.readLine()) != null) {
			count++;
			if(count == 1) //This is to skip the header
				continue;

			String [] terminalArr = str.split(",");
			
			if(terminalArr[0].equals(outletID)) { //we want terminal of specific outlet only
				
				//local terminal object
				Terminal terminal = new Terminal();
				terminal.setOutletID(terminalArr[0]);
				terminal.setTerminalID(Integer.parseInt(terminalArr[1]));
				terminal.setTerminalName(terminalArr[2]);
				terminal.setTerminalType(terminalArr[3]);
				
				//keep adding terminal object one by one into Terminal List
				terminalList.add(terminal);
			}
		}
		br.close();
		return terminalList;
	}
	
	public List<Outlet> createOutletList(String merchantID) throws IOException {
		List<Outlet> outletList = new ArrayList<>();
		
		BufferedReader br = new BufferedReader(new FileReader(outletFilePath));
		String str;
		int count=0;
		while((str = br.readLine()) != null) {
			count++;
			if(count == 1) //This is to skip the header
				continue;

			String [] outletArr = str.split(",");

			if(outletArr[0].equals(merchantID)) {  //outlet of specific merchant only
				
				//create outlet object one by one
				Outlet outlet = new Outlet();
				outlet.setMerchantID(outletArr[0]);
				outlet.setOutletID(outletArr[1]);
				outlet.setOutletLocation(outletArr[2]);
				outlet.setOutletStepFall(outletArr[3]);
				
				String outletID = outlet.getOutletID();
				List<Terminal> terminalList = createTerminalList(outletID);
				outlet.setTerminalList(terminalList);

				//keep adding outlet object into outlet list
				outletList.add(outlet);
			}
		}
		br.close();
		return outletList;
	}
	
	
	
	public void printObjectHierarchy(Merchant merchant) {
		System.out.println(merchant);
		System.out.println("\n");
	}
	
	
	public void test() throws IOException {
		
		FileReader fr = new FileReader(merchantFilePath);
		BufferedReader br = new BufferedReader(fr);
		String str;
		int count=0;
		while((str = br.readLine()) != null) {
			count++;
			if(count == 1) //This is to skip the header
				continue;  
			
			String [] merchantArr = str.split(",");

			Merchant merchant = new Merchant();
			merchant.setMerchantID(merchantArr[0]);
			merchant.setMerchantName(merchantArr[1]);
			merchant.setMerchantState(merchantArr[2]);
			
			String merchantID = merchant.getMerchantID();
			List<Outlet> outletList = createOutletList(merchantID);
			
			merchant.setOutletList(outletList);

			printObjectHierarchy(merchant);
		}
		br.close();
	}
	
	
	public static void main(String[] args) throws IOException {
		TestObjectChain obj = new TestObjectChain();
		obj.test();
	}

}
