package hu.mk_kincstar.projekt;

public class HtmlText implements OutputText {

    private final HtmlText htmlText;

    public HtmlText (HtmlText htmlText){
        this.htmlText = htmlText;
    }


    @Override
    public String getNormalText() {
        return String.valueOf(htmlText);
    }

}
