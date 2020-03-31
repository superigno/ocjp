package com.superigno.directory;

/**
 * Subclasses of Reader and Writer are for TEXT content, precisely Unicode characters (character streams):
 *   - InputStreamReader 
 *     - FileReader (pangit kasi uses platform default encoding)
 *          FileReader reads character from a file in the file system. InputStreamReader reads characters from any kind of input stream. The stream cound be a FileInputStream, but could also be a stream obtained from a socket, an HTTP connection, a database blob, whatever.
 *          FileReader until Java 11 did not allow you to specify an encoding *
 *   - BufferedReader (buffer streams) *
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

}
