package curs11;

public class TestPropertiesFile {

	public static void main(String[] args) {
		
		PropertiesFileProcessor obj = new PropertiesFileProcessor();
		//obj.writePropertiesFile();
		
		obj.readPropertiesFile("hostname");
		obj.readPropertiesFile("username");
		obj.readPropertiesFile("browser");


		System.out.println("-------------------------");
		obj.updatePropertiesFile("hostname", "my.server.com");
		obj.readPropertiesFile("hostname");
		
		
	}

}
