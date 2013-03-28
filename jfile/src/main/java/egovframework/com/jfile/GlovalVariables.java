package egovframework.com.jfile;

/**
 *  클래스
 * @author 정호열
 * @since 2010.10.17
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *   
 *   수정일        수정자       수정내용
 *  -------       --------    ---------------------------
 *   2010.10.17   정호열       최초 생성
 *
 * </pre>
 */

public class GlovalVariables {
		
	public static final String DEFAULT_FILE_UPLOAD_PATH_KEY = "system.uploadpath";
	
	public static final String DEFAULT_NO_IMAGE_APP_PATH_KEY = "no.image.url"; 
	
	public static final String CIPHER_SERVICE_BEAN_NAME = "cipherService";
	
	public static final String FTP_SERVER_IP = "ftp.server.ip";

	public static final String FTP_USER_ID = "ftp.user.id";

	public static final String FTP_USER_PASSWORD = "ftp.user.password";
	// commit test
	public static final class Error {
		public static final int FILE_LENGTH_ERROR = 8888;
		public static final int SYSTEM_ERROR = 9999;
	}
}
