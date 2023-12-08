package be.ucll.nieuwjaarsfeest;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "partyServlet", value = "/party-servlet")
public class PartyServlet extends HttpServlet {
    private String name;

    public void init(){
        name = "Geen naam";
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Schrijf u in voor het nieuwjaarsfeestje</h1>");
        out.println("<form method = 'post' action = '" + request.getContextPath() + request.getServletPath()+"'");
        out.println("<label for='name'>Naam</label>");
        out.println("<input type ='text' id='name' placeholder = '" + name +"'name = 'name'><br><br>");
        out.println("<input type ='submit' value ='Inschrijven'>");
        out.println("</body></html>");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws  IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if (name != null && !name.trim().isEmpty()){
            name = request.getParameter("name");
        }
        out.println("<html><body>");
        out.println("<h2>Bedankt " + name + ". U bent ingeschreven!");
        out.println("<a href=\"party-servlet\">Keer terug naar inschrijving</a>");
        out.println("</body></html>");
    }
    public void destroy(){

    }
}
