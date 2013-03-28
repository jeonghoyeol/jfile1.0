package egovframework.com.jfile.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import net.sf.jazzlib.ZipEntry;
import net.sf.jazzlib.ZipOutputStream;
import egovframework.com.jfile.GlovalVariables;
import egovframework.com.jfile.security.service.CipherService;
import egovframework.com.jfile.service.JFile;

public class ZipUtils {

	private static final byte[] buf = new byte[1024];
	
	public static void createZipJFile(JFile[] targetFiles, OutputStream os)
			throws Exception {
		
		ZipOutputStream zipOs = new ZipOutputStream(os);

		for (int i = 0; i < targetFiles.length; i++) {
			FileInputStream in = new FileInputStream(new File(
					targetFiles[i].getPath()));
			zipOs.putNextEntry(new ZipEntry(targetFiles[i]
					.getOriginalFileName()));
			if ("true".equalsIgnoreCase(targetFiles[i].getUseSecurity())) {
				CipherService service = (CipherService)SpringUtils.getBean(GlovalVariables.CIPHER_SERVICE_BEAN_NAME);
				service.decryptForZipFile(in, zipOs);
			} else {
				int data;
				while ((data = in.read(buf)) > 0) {
					zipOs.write(buf, 0, data);
				}
			}
			zipOs.closeEntry();

			in.close();
		}

		zipOs.close();
		os.close();
	}
}