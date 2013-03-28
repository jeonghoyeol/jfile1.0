package egovframework.com.jfile.service;

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
public interface FileUploadCompletedEventListener {
	
	/**
	 * 파일업로드 가 완료된 후 발생되는 이벤트 
	 * @param fileId 파일 아이디.
	 * @param sourceRepositoryPath 첨부파일 서버저장경로.
	 * @param maskingFileName 마스킹된 이름.
	 * @param originalFileName 파일명.
	 */
	public void uploadCompleted(String fileId, String sourceRepositoryPath, String maskingFileName, String originalFileName);
}
