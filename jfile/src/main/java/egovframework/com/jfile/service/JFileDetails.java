package egovframework.com.jfile.service;

import java.util.Date;

public interface JFileDetails {
	
	/**
	 * @return fileId 파일 아이디
	 */
	public String getFileId();
	
	/**
	 * @return fileSeq 파일 순번
	 */
	public String getFileSeq();
	
	/**
	 * @return fileName 파일명
	 */
	public String getFileName();

	/**
	 * 파일명을 세팅한다.
	 * @param fileName 파일명
	 */
	public void setFileName(String fileName);
	
	/**
	 * @return fileSize 파일 사이즈
	 */
	public long getFileSize();
	
	/**
	 * 파일 사이즈를 세팅한다.
	 * @return long 파일 사이즈
	 */
	public void setFileSize(long fileSize);
	
	/**
	 * @return fileMask 파일 마스크
	 */
	public String getFileMask();
	
	/**
	 * 마스크 된 파일명을 반환
	 * @param fileMask 마스크 된 파일명
	 */
	public void setFileMask(String fileMask);
	
	/**
	 * @return downloadCount 다운로드 카운트
	 */
	public String getDownloadCount();
	
	/**
	 * @return downloadExpireDate 다운로드 만료일
	 */
	public Date getDownloadExpireDate();
	
	/**
	 * @return downloadLimitCount 다운로드 제한 횟수
	 */
	public String getDownloadLimitCount();
	
	/**
	 * 업로드 모드
	 * @return String 업로드 모드
	 */
	public String getUploadMode();
	
	/**
	 * 암호화를 사용 할 지 여부
	 * @return String 암호화를 사용 할 지 여부
	 */
	public String getUseSecurity();
	
	/**
	 * 이미지 파일 여부
	 * @return boolean 이미지 파일 여부
	 */
	public boolean isImage();
}
