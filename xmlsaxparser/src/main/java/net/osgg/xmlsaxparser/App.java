package net.osgg.xmlsaxparser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SaxParser sp = new SaxParser("company.xml");
        try {
			sp.parse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
