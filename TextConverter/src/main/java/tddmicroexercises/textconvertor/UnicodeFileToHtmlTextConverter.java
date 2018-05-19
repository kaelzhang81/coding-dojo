package tddmicroexercises.textconvertor;

import org.apache.commons.lang3.StringEscapeUtils;

import java.io.*;

public class UnicodeFileToHtmlTextConverter
{
	private StringEscaper stringEscaper;
	private Reader reader = null;
	private String fullFilenameWithPath;

    public UnicodeFileToHtmlTextConverter(String fullFilenameWithPath) throws IOException {
        this.reader = new FileReader(fullFilenameWithPath);
    }

	public UnicodeFileToHtmlTextConverter(Reader reader) {
		this.reader = reader;
	}

	public UnicodeFileToHtmlTextConverter(Reader reader, StringEscaper stringEscaper) {
		this.reader = reader;
		this.stringEscaper = stringEscaper;
	}

	public String convertToHtml() throws IOException{
	    BufferedReader reader = new BufferedReader(this.reader);
	    
	    String line = reader.readLine();
	    String html = "";
	    while (line != null)
	    {
			// TODO-working-on: depending 3th lib
	            html += StringEscapeUtils.escapeHtml4(line);
	            html += "<br />";
	            line = reader.readLine();
	    }
	    return html;

    }
}
