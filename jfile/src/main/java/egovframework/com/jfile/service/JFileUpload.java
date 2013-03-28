package egovframework.com.jfile.service;

import java.util.Collection;

import org.springframework.web.multipart.MultipartFile;

public interface JFileUpload {

	/**
	 * 
	 * @param stringKey
	 * @param values
	 * @param uploadMode
	 */
	public void upload(MultipartFile values, JFileDetails fileVo);
	
	/**
	 * 파일을 업로드 한다. 
	 * @param fileId
	 * @param values 멀티파트 파일
	 * @param uploadMode 업로드 모드 
	 */
	public void upload(Collection<MultipartFile> values, JFileDetails fileVo);

	/**
	 * 파일업로드가 완료된 후 처리 작업을 수행한다.
	 * @param fileId 파일아이디.
	 * @param uploadPath 업로드 경로.
	 */
	public void executeAfterUploadCompleted(String fileId, String uploadPath);
	
	/**
	 * 파일업로드가 완료된 후 처리 작업을 수행한다.
	 * @param fileId 파일아이디.
	 */
	public void executeAfterUploadCompleted(String fileId);
	
	/**
	 * 파일아이디를 조회한다.
	 * @param fileId 파일아이디.
	 * @param fileSeqs 파일 시퀀스 목록.
	 * @return String 파일 아이디.
	 */
	public String getFileId(String fileId, Object[] fileSeqs);
}