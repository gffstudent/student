package util;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GetFilePass {

	public String GetFilePass() {
		// OS取得
		String osname = System.getProperty("os.name");
		String filePass = null;
		if (osname.indexOf("Windows") >= 0) {
			// Windowsであったときの処理
			filePass = "C:\\log\\err.log";
		} else if (osname.indexOf("Linux") >= 0) {
			// Linuxであったときの処理

			filePass = "/opt/log/err.log";
		}
		return filePass;

	}


}
