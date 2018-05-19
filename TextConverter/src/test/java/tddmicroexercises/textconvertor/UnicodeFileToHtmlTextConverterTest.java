package tddmicroexercises.textconvertor;

import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;

import static org.junit.Assert.assertEquals;

public class UnicodeFileToHtmlTextConverterTest {

    // TODO-new-feature: convert to string
    //

    @Test
    public void should_convert_ampersand() throws IOException {
        StringEscaper stringEscaper = new StringEscaper();
        UnicodeFileToHtmlTextConverter converter = new UnicodeFileToHtmlTextConverter(new StringReader("H&M"), stringEscaper);

        assertEquals("H&amp;M<br />", converter.convertToHtml());
    }

    @Test
    public void should_convert_greater_than_and_less_than() throws IOException{
        UnicodeFileToHtmlTextConverter converter = new UnicodeFileToHtmlTextConverter(new StringReader(">_<|||"));

        assertEquals("&gt;_&lt;|||<br />", converter.convertToHtml());
    }

    @Test
    public void should_add_a_line_break_for_a_new_line() throws IOException {
        UnicodeFileToHtmlTextConverter converter = new UnicodeFileToHtmlTextConverter(new StringReader("Cheers\nKael Zhang"));

        assertEquals("Cheers<br />Kael Zhang<br />", converter.convertToHtml());
    }
}
