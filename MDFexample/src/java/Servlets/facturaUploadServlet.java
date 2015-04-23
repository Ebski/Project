package Servlets;

import DTO.FacturaDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.Queries;
import logic.UpdateCampaignStatus;

@WebServlet(name = "facturaUploadServlet", urlPatterns = {"/facturaUploadServlet"})
public class facturaUploadServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Queries query = new Queries();
        UpdateCampaignStatus update = new UpdateCampaignStatus();

        String factura_ID = request.getParameter("id_factura");

        FacturaDTO factura = new FacturaDTO(
                factura_ID,
                request.getParameter("dataFile"),
                request.getParameter("additional_information")
        );

        try {
            query.addFacturaToDatabase(factura);
            update.updateCampaignStatusAfterFacturaUpload(factura_ID);
        } catch (SQLException ex) {
            Logger.getLogger(poeServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        RequestDispatcher disp = request.getRequestDispatcher("submittedEmployee.jsp");
        disp.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
