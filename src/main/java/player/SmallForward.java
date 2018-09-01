package player;

import java.text.ParseException;

public class pointGuard extends Player {
    public pointGuard(String name, String lastname, String dateOfBirth, double shot2, double shot1, double shot3, double rebound, double pass, double block, double steal) throws ParseException {
        super(name, lastname, dateOfBirth, shot2, shot1, shot3, rebound, pass, block, steal);
    }
}
