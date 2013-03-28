package egovframework.com.jfile.service;

import java.io.File;

public interface JFileDownload {

	/**
	 * 첨부파일 객체.
	 * @param fileId 파일 아이디.
	 * @return File 파일 객체.
	 */
	public File getFileBySequence(String fileId, String useSecurity);
	
	/**
	 * 첨부파일 객체.
	 * @param fileId 파일 아이디.
	 * @param fileSeq 파일 시퀀스 목록.
	 * @return File 파일 객체. 
	 */
	public File getFileBySequence(String fileId, String fileSeq, String useSecurity);
		
	/**
	 * JFile 객체
	 * @param fileId 파일 아이디.
	 * @return JFile[] 암호화 정보 및 마스킹 파일명을 포함하고 있는 파일 객체.
	 */
	public JFile[] getFiles(String fileId, String useSecurity);
	
	/**
	 * JFile 객체
	 * @param fileId 파일 아이디
	 * @param uploadPath 파일 경로
	 * @return JFile[] 암호화 정보 및 마스킹 파일명을 포함하고 있는 파일 객체
	 */
	public JFile[] getFiles(String fileId, String uploadPath, String useSecurity);
	
}
