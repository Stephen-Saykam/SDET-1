package keywordDrivenFramework;

public class KeywordMainclass {

	public static void main(String[] args) throws Throwable {
		FileLib fLib = new FileLib();
		String br = fLib.readPropertyData("./data/config.properties", "username");
		System.out.println(br);
		

	}

}
