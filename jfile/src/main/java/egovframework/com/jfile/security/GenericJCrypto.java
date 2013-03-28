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
public class GenericJCrypto implements JCrypto {

	/** 디폴트로 제공할 암호화 알고리즘/운용방식/패딩방식 */
	public String getAlgorithm() {
		return "DESede/CBC/PKCS5Padding";
	}

	/** 디폴트로 제공할 keyBytes */
	public byte[] getKeyBytes() {
		byte[] keyBytes = {(byte)5,(byte)6,(byte)7,(byte)8,(byte)9,(byte)7,(byte)1,(byte)1,
				(byte)5,(byte)6,(byte)7,(byte)8,(byte)9,(byte)7,(byte)1,(byte)1,
				(byte)5,(byte)6,(byte)7,(byte)8,(byte)9,(byte)7,(byte)1,(byte)1};
		return keyBytes;
	}

	/** 디폴트로 Base64 적용을 하지 않는다. */
	public boolean isApplyBase64() {
		return false;
	}
}
