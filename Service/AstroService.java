package Application.Service;

import Application.Domain.AstroDate;
import Application.Domain.OrbitBulletin;
import org.orekit.time.*;
import org.orekit.utils.IERSConventions;

public class AstroService {
    public OrbitBulletin convertOrbit(OrbitBulletin bulletin) throws Exception{
        //Check for which type of bulletin we have present.
        //Check what the toType is
        //Check the positionAngleOut
        //Return OrbitBulletin with the converted data.
        return bulletin;
    }

    public String convertTime(AstroDate astroDate) throws Exception{
        try {
            UT1Scale ut1 = TimeScalesFactory.getUT1(IERSConventions.IERS_2010, false);
            UTCScale utc = TimeScalesFactory.getUTC();
            AbsoluteDate JD_epoch = new AbsoluteDate(-4712, 01, 01, 12, 00, 00.000, ut1);
            AbsoluteDate date = new AbsoluteDate(astroDate.getDate(), utc);
            double JD = date.offsetFrom(JD_epoch, ut1);
            System.out.println("1"+JD);
            JD = JD / 24 / 60 / 60;
            System.out.println(JD);
            return Double.toString(JD);
        }
        catch(Exception e){
            System.err.println("Error converting date");
            throw e;
        }
    }
}
