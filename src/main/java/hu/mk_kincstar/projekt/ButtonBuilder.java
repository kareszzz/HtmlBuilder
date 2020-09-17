package hu.mk_kincstar.projekt;

public class ButtonBuilder {
    protected String linkText;
    protected String buttonText;

    public ButtonBuilder(String linkText, String buttonText ) {
        this.linkText = linkText;
        this.buttonText = buttonText;
    }

    public String getButtonHtml() {
        String buttonHtml =  "<button onclick=\"window.location.href='" + linkText + "'\">" + buttonText + "</button>";
        return buttonHtml;
    }

    public void setLinkText(String linkText) {
        this.linkText = linkText;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }


}
