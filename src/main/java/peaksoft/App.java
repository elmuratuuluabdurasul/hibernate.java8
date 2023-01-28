package peaksoft;

import peaksoft.enums.Country;
import peaksoft.enums.Language;
import peaksoft.model.Programmer;
import peaksoft.service.ProgrammerServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ProgrammerServiceImpl programmerService = new ProgrammerServiceImpl();
        //programmerService.save(new Programmer("Suimonkul1 Elmuratuulu", "+996778125212", Language.PYTHON, (byte) 21, Country.USA));

    }
}
