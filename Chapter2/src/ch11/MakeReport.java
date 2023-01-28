package ch11;

//캡슐화 private 로  은닉할것 은닉
public class MakeReport {

	StringBuffer buffer = new StringBuffer();
	// String 을 이어주는 buffer --> append 
	
	private String line = "=======================================\n";
	private String title = "  이름\t 주소\t\t 전화번호 \n";
	
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void genrateBody() {
		buffer.append("James \t");
		buffer.append("Seoul Korea \t");
		buffer.append("010-2222-3333 \n");

		buffer.append("Tomas \t");
		buffer.append("NewYork US \t");
		buffer.append("010-7777-3333 \n");
		
	}
	
	private void makeFooter() {
		buffer.append(line);
	}
	
	public String getReport()
	{
		makeHeader();
		genrateBody();
		makeFooter();
		return buffer.toString();
	}
	
	
}
