package com.superigno.readerwriter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * Subclasses of Reader and Writer are for TEXT content, precisely Unicode characters (character streams):
 *   - InputStreamReader 
 *     - FileReader (pangit kasi uses platform default encoding)
 *          FileReader reads character from a file in the file system. InputStreamReader reads characters from any kind of input stream. The stream could be a *FileInputStream*, but could also be a stream obtained from a socket, an HTTP connection, a database blob, whatever.
 *          FileReader until Java 11 did not allow you to specify an encoding 
 *   - BufferedReader (buffer streams) 
 *          BufferedReader requires a Reader, of which FileReader is one - it descends from InputStreamReader, which descends from Reader.	
 *   - FileWriter
 *   - BufferedWriter (buffer streams)
 *
 *  Subclasses of InputStream and OutputStream are for binary content (byte streams):
 *   - FileInputStream
 *   - FileOutputStream
 *   - BufferedInputStream (buffer streams)
 *   - BufferedOutputStream (buffer streams)
 * 
 * */

public class App {
	
	private final String filename = "C:\\test.txt";
	
	public void usingFileReaderAndBufferedReader() throws IOException {
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);

		String line;
		while ((line = br.readLine()) != null) {
        	System.out.println(line);
        }
		br.close();
		fr.close();
	}
	
	public void usingInputStreamReaderAndFileInputStreamAndBufferedReader() throws IOException {
		FileInputStream fis = new FileInputStream(filename);
		//InputStreamReader reads characters from any kind of input stream. The stream could be a *FileInputStream*, but could also be a stream obtained from a socket, an HTTP connection, a database blob, whatever.
		InputStreamReader isr =	new InputStreamReader(fis, StandardCharsets.UTF_8);	
		BufferedReader br = new BufferedReader(isr);

		String line;
        while ((line = br.readLine()) != null) {
        	System.out.println(line);
        }
        fis.close();
        isr.close();
        br.close();        
	}

}
