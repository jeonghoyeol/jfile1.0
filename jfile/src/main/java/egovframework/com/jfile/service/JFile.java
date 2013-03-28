package egovframework.com.jfile.service;

import java.io.File;

import egovframework.com.jfile.security.service.CipherService;

public class JFile extends File {

	private static final long serialVersionUID = -1250777584171760029L;

	private CipherService cipherService;
	
	private String originalFileName;
	
	private String useSecurity;
	
	public JFile(String pathname) {
		super(pathname);
	}	
	
	public String getUseSecurity() {
		return useSecurity;
	}

	public void setUseSecurity(String useSecurity) {
		this.useSecurity = useSecurity;
	}

	public JFile(String pathname, CipherService cipherService) {
		super(pathname);
		this.cipherService = cipherService;
	}

	public CipherService getCipherService() {
		return cipherService;
	}

	public void setCipherService(CipherService cipherService) {
		this.cipherService = cipherService;
	}

	public String getOriginalFileName() {
		return originalFileName;
	}

	public void setOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
	}
	
}

