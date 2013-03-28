package egovframework.com.jfile.service.strategy;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.util.FileCopyUtils;

import egovframework.com.jfile.exception.JFileException;

public class DefaultUploadStrategy implements UploadStrategy {

	public void handle(InputStream in,	OutputStream out) {
		try {
			FileCopyUtils.copy(in, out);
		} catch (IOException e) {
			throw new JFileException(e);
		}
	}
}