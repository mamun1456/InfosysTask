package automation_mamun;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.io.InputStream;
	import java.util.Properties;

	public class ConfigReader {
		private String url;
		private static String ieDriverPath;
		
		public ConfigReader() {
			Properties prop = new Properties();
			InputStream input = null;
			try {
				input = new FileInputStream("Config.properties");
				prop.load(input);
				this.url = prop.getProperty("url");
				this.ieDriverPath = prop.getProperty("ie_Driver_Path");
				
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}finally {
				if(input != null) {
					try {
						input.close();
					}catch(IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		public String getUrl() {
			return url;
		}
		public static String getIEDriverPath() {
			return ieDriverPath;
		}
}
	
