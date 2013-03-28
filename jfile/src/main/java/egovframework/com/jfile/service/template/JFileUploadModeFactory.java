package egovframework.com.jfile.service.template;

public enum JFileUploadModeFactory {
	
	INSTANCE;
	
	public JFileModeType getUploadType(String uploadMode) {
		return "file".equalsIgnoreCase(uploadMode) ? 
				JFileModeType.FILEMODE : 
				JFileModeType.DBMODE;
	}
}