package gzip;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.zip.Adler32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.junit.Test;

public class TestGzip {

	@Test
	public void testFile() throws Exception {

		File file = new File("");

		FilenameFilter filter = new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {

				return false;
			}
		};

		file.list(filter);
	}

	@Test
	public void testZIP02() throws Exception {

		FileOutputStream out = new FileOutputStream("");

		CheckedOutputStream csum = new CheckedOutputStream(out, new Adler32());

		ZipOutputStream zipout = new ZipOutputStream(csum);

		BufferedOutputStream outputStream = new BufferedOutputStream(zipout);

		zipout.setComment("abc ZIP");

		int c = 0;

		for (;;) {

			BufferedReader reader = new BufferedReader(new FileReader(""));

			zipout.putNextEntry(new ZipEntry(""));

			int f = 0;

			while ((f = reader.read()) != -1) {

				out.write(f);

			}

		}

	}

	@Test
	public void testZip() {

		try {

			FileReader fileReader = new FileReader("");

			BufferedReader in = new BufferedReader(fileReader);

			BufferedOutputStream out = new BufferedOutputStream(
					new GZIPOutputStream(new FileOutputStream("")));

			int c = 0;

			for (; (c = in.read()) != -1;) {

				out.write(c);

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
