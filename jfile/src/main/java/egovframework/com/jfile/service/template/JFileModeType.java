package egovframework.com.jfile.service.template;

public enum JFileModeType {
	
	DBMODE(DBUploadModeTemplate.class),
	
	FILEMODE(FileUploadModeTemplate.class);
	
	JFileUploadModeTemplate handler;
	
	private JFileModeType(Class<? extends JFileUploadModeTemplate> clazz) {
		try {
			handler = clazz.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public JFileUploadModeTemplate getHandler() {
		return this.handler;
	}
}