package com.webtable;

public class Script {
	public static void main(String[] args) {
		CommonFunctions comm = new CommonFunctions();
		comm.navigate("https://qavbox.github.io/demo/webtable/");
		int rowCount = comm.getCount("//table[@id=''table02']/tbody/tr");
		for(int i=1; i<rowCount; i++) {
			int colCount = comm.getCount("//table[@id=''table02']/tbody/tr["+i+"]/td");
			for(int j=1; j<colCount; j++) {
				String data = comm.getElementText("//table[@id=''table02']/tbody/tr[\"+i+\"]/td/["+j+"]");
				System.out.println(data);
			}
		}
		comm.closeBrowser();
	}
}
