package egovframework.com.jfile.security;

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
public interface JCrypto {

	/**
	 * 암호화 keyBytes 를 입력받는다.
	 * @return byte[]
	 */
	public byte[] getKeyBytes();
	
	/**
	 * 암호화 알고리즘을 입력받는다.
	 * @return String 
	 */
	public String getAlgorithm();
	
	/**
	 * Base64 적용여부.
	 * @return boolean Base64 적용여부를 입력받는다.
	 */
	public boolean isApplyBase64();
}
