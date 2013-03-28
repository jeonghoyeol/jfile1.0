package egovframework.com.jfile.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

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
public abstract class DateUtils {
	
	/**
	 * 현재 날짜를 yyyyMMdd 포맷으로 반환.
	 * @return String 현재 날짜.
	 */
	public static String getSysDate() {
		return getSysDate("yyyyMMdd");
	}
	
	/**
	 * 날짜 입력양식을 전달받아 현재 날짜를 반환.
	 * @param pattern 입력 양식.
	 * @return String 날짜 입력 양식.
	 */
	public static String getSysDate(String pattern) {
		return getDateString(new Date(), pattern);
	}
	
	/**
	 * Date 객체와 입력양식을 전달받아 날짜를 반환.
	 * @param date Date 객체.
	 * @param pattern 입력 양식.
	 * @return String 날짜.
	 */
	public static String getDateString(Date date, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}
	
	/**
	 * 숫자형태의 시간과 포맷을 전달받아 날짜를 반환.
	 * @param time 숫자형태의 시간
	 * @param pattern 시간 포맷
	 * @return String 날짜
	 */
	public static String getDateString(long time, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date d = new Date(time);
		return sdf.format(d);
	}
}
