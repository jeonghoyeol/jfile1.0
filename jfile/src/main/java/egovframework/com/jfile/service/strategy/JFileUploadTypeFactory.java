package egovframework.com.jfile.service.strategy;

public enum JFileUploadTypeFactory {
	
	INSTANCE;
	
	public JFileUploadType getUploadType(String useSecurity) {
		return "true".equalsIgnoreCase(useSecurity) ? 
				JFileUploadType.CIPHER : 
				JFileUploadType.DEFAULT;
	}
}