package hu.mk_kincstar.projekt;

public class LinkBuilder {
    protected String linkText;
    protected String linkTitle;

    public LinkBuilder(String linkText, String linkTitle) {
        this.linkText = linkText;
        this.linkTitle = linkTitle;
    }

    public String getLinkHtml() {
        String linkHtml =  "<button onclick=\"window.location.href='" + linkText + "'\">" + linkTitle + "</button>";
        return linkHtml;
    }

    public String getLinkText() {
        return linkText;
    }

    public void setLinkText(String linkText) {
        this.linkText = linkText;
    }

    public String getLinkTitle() {
        return linkTitle;
    }

    public void setLinkTitle(String linkTitle) {
        this.linkTitle = linkTitle;
    }
}
