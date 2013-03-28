package egovframework.com.jfile.service.strategy;

public enum JFileUploadType {
	
	CIPHER(CipherUploadStrategy.class),
	
	DEFAULT(DefaultUploadStrategy.class);
	
	UploadStrategy handler;
	
	private JFileUploadType(Class<? extends UploadStrategy> clazz) {
		try {
			handler = clazz.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public UploadStrategy getHandler() {
		return this.handler;
	}
}