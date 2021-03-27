package util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import com.sun.corba.se.impl.orbutil.GetPropertyAction;
import com.sun.xml.internal.stream.buffer.sax.Properties;

public class Logging {

	// ファイルパスを取得する
	static GetFilePass getFilePass = new GetFilePass();

	public static void infolog(String str) throws SecurityException, IOException {
		Logger logger = Logger.getLogger(Logging.class.getName());

		String filePass = getFilePass.GetFilePass();

		FileHandler fHandler = new FileHandler(filePass, true);
		fHandler.setFormatter(new SimpleFormatter());
		logger.addHandler(fHandler);

		logger.setLevel(Level.INFO);

		logger.info(str);

	}

	public static void warning(String str) throws SecurityException, IOException {

		String filePass = getFilePass.GetFilePass();
		Logger logger = Logger.getLogger(Logging.class.getName());
		FileHandler fHandler = new FileHandler(filePass, true);
		fHandler.setFormatter(new SimpleFormatter());
		logger.addHandler(fHandler);

		logger.setLevel(Level.WARNING);

		logger.warning(str);

	}

	public static void severelog(String str) {

		String filePass = getFilePass.GetFilePass();

		Logger logger = Logger.getLogger(Logging.class.getName());
		try {
			FileHandler fHandler = new FileHandler(filePass, true);
			fHandler.setFormatter(new SimpleFormatter());
			logger.addHandler(fHandler);

			logger.setLevel(Level.INFO);

			logger.info("INFO");
			logger.warning("WARNING");
			logger.severe("SEVERE");

			// 例外をスロー
			throw new IllegalArgumentException();
		} catch (IllegalArgumentException e) {
			logger.log(Level.INFO, str, e);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}