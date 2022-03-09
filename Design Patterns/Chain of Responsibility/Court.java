import java.util.Locale;

class CourtCase {

    private String plaintiff;
    private String crime;
    private String crimeSeverity;
    private String lawyer;

    public CourtCase(String plaintiff, String crime, String crimeSeverity,  String lawyer) {

        this.plaintiff = plaintiff;
        this.crime = crime;
        this.lawyer = lawyer;
        this.crimeSeverity = crimeSeverity;

    }

    public String getPlaintiff() {

        return plaintiff;

    }

    public String getCrime() {

        return crime;

    }

    public String getLawyer() {

        return lawyer;

    }

    public String getCrimeSeverity() {

        return crimeSeverity;

    }

}

abstract class CourtCaseHandler {

    protected CourtCaseHandler handler;

    public void setHander(CourtCaseHandler handler) {
        this.handler = handler;
    }

    public abstract String setCourtCase(CourtCase courtcase);
}

class DiscrictCourtHandler extends CourtCaseHandler {

    @Override
    public String setCourtCase(CourtCase courtcase) {

        String crimeSeverity = courtcase.getCrimeSeverity().toLowerCase();

        if(crimeSeverity.equals("low")){

            return "Crime case will be handled by discrict court";

        }else{

            return handler.setCourtCase(courtcase);

        }

    }

}

class HighCourtHandler extends CourtCaseHandler {

    @Override
    public String setCourtCase(CourtCase courtcase) {

        String crimeSeverity = courtcase.getCrimeSeverity().toLowerCase();

        if(crimeSeverity.equals("low") || crimeSeverity.equals("medium")){

            return "Crime case will be handled by high court";

        }else{

            return handler.setCourtCase(courtcase);

        }

    }

}

class AppealCourtHandler extends CourtCaseHandler {

    @Override
    public String setCourtCase(CourtCase courtcase) {

        String crimeSeverity = courtcase.getCrimeSeverity().toLowerCase();

        if(crimeSeverity.equals("low") || crimeSeverity.equals("medium") || crimeSeverity.equals("high")){

            return "Crime case will be handled by appeal court";

        }else{

            return handler.setCourtCase(courtcase);

        }

    }

}

class SupremeCourtHandler extends CourtCaseHandler {

    @Override
    public String setCourtCase(CourtCase courtcase) {

        String crimeSeverity = courtcase.getCrimeSeverity().toLowerCase();

        if(crimeSeverity.equals("low") || crimeSeverity.equals("medium") || crimeSeverity.equals("high") || crimeSeverity.equals("severe") ){

            return "Crime case will be handled by supreme court";

        }else{

            return handler.setCourtCase(courtcase);

        }

    }

}

public class Court {

    public static void main(String[] args) {

        DiscrictCourtHandler discrictCourtHandler = new DiscrictCourtHandler();
        HighCourtHandler highCourtHandler = new HighCourtHandler();
        AppealCourtHandler appealCourtHandler = new AppealCourtHandler();
        SupremeCourtHandler supremeCourtHandler = new SupremeCourtHandler();

        discrictCourtHandler.setHander(highCourtHandler);
        highCourtHandler.setHander(appealCourtHandler);
        appealCourtHandler.setHander(supremeCourtHandler);

        CourtCase courtcase = new CourtCase("John Doe","theft", "low", "Michael Jackson");
        System.out.println(discrictCourtHandler.setCourtCase(courtcase));

        CourtCase courtcase2 = new CourtCase("John Doe","theft", "severe", "Michael Jackson");
        System.out.println(discrictCourtHandler.setCourtCase(courtcase2));

    }

}