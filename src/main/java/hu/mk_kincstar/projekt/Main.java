package hu.mk_kincstar.projekt;

public class Main {

    public static void main(String[] args) {

        System.out.println("Maven proba");

        String url = "https://codegym.cc/groups/posts/escaping-characters-java";

        ButtonBuilder bb = new ButtonBuilder(url,"Gomb");
        bb.setButtonText("Próba gomb");


        System.out.println(bb.getButtonHtml());


        LinkBuilder lb = new LinkBuilder(url,"Link");
        lb.setLinkTitle("Próba link");
        System.out.println(lb.getLinkHtml());
    }
}
