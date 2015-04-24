

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
        <link rel="shortcut icon" href="img/Dell_Logo.png">

        <!--Fonts-->
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
        <link href='http://fonts.googleapis.com/css?family=Titillium+Web' rel='stylesheet' type='text/css'>

        <!--Stylesheets-->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/dashboard.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <div class='container'>
            <div class='menu-left'>
                <div class='menu-content'
                     <ul>
                        <li><a href="mdf.jsp">New campaign</a></li>
                        <li>Link</li>
                        <li>Link</li>
                        <li>Link</li>
                    </ul>
                </div>
            </div>
            <div class='signout'>
                <p>Your logged in as ${user}</p>
                <a href='index.jsp'><p>Sign out!</p></a>
            </div>


            <!--TABLE DATA-->


            <br>
            <br>

            <!--PENDING CAMPAIGNS-->
            <div class="method active-table">
                <p><strong>Pending campaigns</strong></p>
                <div class="row margin-0 list-header hidden-sm hidden-xs">
                    <div class="col-md-5"><div class="header">Campaign Name</div></div>
                    <div class="col-md-5"><div class="header">Status No.</div></div>
                    <div class="col-md-2"><div class="header">Status</div></div>
                </div>

                <c:forEach var="camp" items="${Campaigns}">
                    <c:if test="${camp.c_Status eq '0'}">
                        <div class="row margin-0">
                            <form action="poe.jsp" type="post">
                                <div class="col-md-5"><div class="cell">${camp.campaign_Name}</div></div>
                                <div class="col-md-5"><div class="cell">${camp.c_Status}</div></div>
                                <div class="col-md-2"><div class="cell"><p style="color: red">Pending</p></div></div>
                            </form>
                        </div>
                    </c:if>
<<<<<<< HEAD
                </c:forEach>
            </div>

            <br>
            <br>

            <!--ACTIVE CAMPAIGNS-->
            <div class="method active-table">
                <p><strong>Active campaigns</strong></p>
                <div class="row margin-0 list-header hidden-sm hidden-xs">
                    <div class="col-md-5"><div class="header">Campaign Name</div></div>
                    <div class="col-md-5"><div class="header">Status</div></div>
                    <div class="col-md-2"><div class="header">Upload POE</div></div>
                </div>          

                <c:forEach var="camp" items="${Campaigns}">
                    <c:if test="${camp.c_Status eq '1'}">
                        <div class="row margin-0">
                            <form action="poe.jsp" type="post">
                                <div class="col-md-5"><div class="cell">${camp.campaign_Name}</div></div>
                                <div class="col-md-5"><div class="cell">${camp.c_Status}</div></div>
                                <div class="col-md-2"><div class="cell"><button class="btn btn-primary" name="upload_poe" value="${camp.id_POE}"><p>Upload POE</p></button></div></div>
                            </form>
                        </div>
                    </c:if>
                </c:forEach>
            </div>


            <br>
            <br>

            <!--OLD CAMPAIGNS-->
            <div class="method old-table">
                <p><strong>Old campaigns</strong></p>
                <div class="row margin-0 list-header hidden-sm hidden-xs">
                    <div class="col-md-3"><div class="header">Campaign Name</div></div>
                    <div class="col-md-3"><div class="header">Documentation</div></div>
                    <div class="col-md-3"><div class="header">Status No.</div></div>
                    <div class="col-md-3"><div class="header">Status</div></div>
                </div>

                <c:forEach var="camp" items="${Campaigns}">
                    <c:if test="${camp.c_Status eq '0'}">
                        <div class="row margin-0">
                            <form action="poe.jsp" type="post">
                                <div class="col-md-3"><div class="cell">${camp.campaign_Name}</div></div>
                                <div class="col-md-3"><div class="cell"><button class="btn btn-primary" name="Documentation" value="${camp.campaign_No}"><p>Documentation</p></button></div></div>
                                <div class="col-md-3"><div class="cell">${camp.c_Status}</div></div>
                                <div class="col-md-3"><div class="cell"><p style="color: black">Completed</p></div></div>
                            </form>
                        </div>
                    </c:if>
                </c:forEach>
            </div>



            <!--END OF TABLE DATA-->

            <!--Javascript-->

            <script src="js/bootstrap.min.js" type="text/javascript"></script>
            <script src="js/custom.js" type="text/javascript"></script>
    </body>
</html>
=======
                        <c:if test="${camp.c_Status eq '2'}">
                            <div class="row margin-0">
                                <form action="poe.jsp" type="post">
                                    <div class="col-md-5"><div class="cell">${camp.campaign_Name}</div></div>
                                    <div class="col-md-5"><div class="cell">${camp.c_Status}</div></div>
                                    <div class="col-md-2"><div class="cell"><p style="color: red">Pending</p></div></div>
                                </form>
                            </div>
                        </c:if>
                            <c:if test="${camp.c_Status eq '4'}">
                                <div class="row margin-0">
                                    <form action="poe.jsp" type="post">
                                        <div class="col-md-5"><div class="cell">${camp.campaign_Name}</div></div>
                                        <div class="col-md-5"><div class="cell">${camp.c_Status}</div></div>
                                        <div class="col-md-2"><div class="cell"><p style="color: red">Pending</p></div></div>
                                    </form>
                                </div>
                            </c:if>
                                <c:if test="${camp.c_Status eq '5'}">
                                    <div class="row margin-0">
                                        <form action="poe.jsp" type="post">
                                            <div class="col-md-5"><div class="cell">${camp.campaign_Name}</div></div>
                                            <div class="col-md-5"><div class="cell">${camp.c_Status}</div></div>
                                            <div class="col-md-2"><div class="cell"><p style="color: red">Pending</p></div></div>
                                        </form>
                                    </div>
                                </c:if>
                                </c:forEach>
                            </div>

                            <br>
                            <br>

                            <!--ACTIVE CAMPAIGNS-->
                            <div class="method active-table">
                                <p><strong>Active campaigns</strong></p>
                                <div class="row margin-0 list-header hidden-sm hidden-xs">
                                    <div class="col-md-5"><div class="header">Campaign Name</div></div>
                                    <div class="col-md-5"><div class="header">Status</div></div>
                                    <div class="col-md-2"><div class="header">Upload POE</div></div>
                                </div>

                                <c:forEach var="camp" items="${Campaigns}">
                                    <c:if test="${camp.c_Status eq '1'}">
                                        <div class="row margin-0">
                                            <form action="poe.jsp" type="post">
                                                <div class="col-md-5"><div class="cell">${camp.campaign_Name}</div></div>
                                                <div class="col-md-5"><div class="cell">${camp.c_Status}</div></div>
                                                <div class="col-md-2"><div class="cell"><button class="btn btn-primary" name="upload_poe" value="${camp.id_POE}"><p>Upload POE</p></button></div></div>
                                            </form>
                                        </div>
                                    </c:if>
                                </c:forEach>
                            </div>

                            <br>
                            <br>

                            <!-- UPLOAD INVOICE -->
                            <div class="method active-table">
                                <p><strong>Completed Campaigns</strong></p>
                                <div class="row margin-0 list-header hidden-sm hidden-xs">
                                    <div class="col-md-5"><div class="header">Campaign Name</div></div>
                                    <div class="col-md-5"><div class="header">Status</div></div>
                                    <div class="col-md-2"><div class="header">Invoice</div></div>
                                </div>

                                <c:forEach var="camp" items="${Campaigns}">
                                    <c:if test="${camp.c_Status eq '3'}">
                                        <div class="row margin-0">
                                            <form action="invoice.jsp" type="post">
                                                <div class="col-md-5"><div class="cell">${camp.campaign_Name}</div></div>
                                                <div class="col-md-5"><div class="cell">${camp.c_Status}</div></div>
                                                <div class="col-md-2"><div class="cell"><button class="btn btn-primary" name="id_invoice" value="${camp.id_invoice}"><p>Upload Invoice</p></button></div></div>
                                            </form>
                                        </div>
                                    </c:if>
                                </c:forEach>
                            </div>

                            <br>
                            <br>

                            <!--OLD CAMPAIGNS-->
                            <div class="method old-table">
                                <p><strong>Old campaigns</strong></p>
                                <div class="row margin-0 list-header hidden-sm hidden-xs">
                                    <div class="col-md-2"><div class="header">Campaign Name</div></div>
                                    <div class="col-md-2"><div class="header">MDF</div></div>
                                    <div class="col-md-2"><div class="header">POE</div></div>
                                    <div class="col-md-2"><div class="header">Invoice</div></div>
                                    <div class="col-md-2"><div class="header">Factura</div></div>
                                    <div class="col-md-1"><div class="header">Status No.</div></div>
                                    <div class="col-md-1"><div class="header">Status</div></div>
                                </div>

                                <c:forEach var="camp" items="${Campaigns}">
                                    <c:if test="${camp.c_Status eq '6'}">
                                        <div class="row margin-0">
                                            <div class="col-md-2"><div class="cell">${camp.campaign_Name}</div></div>
                                            <form name="activeMdfForm" action="mdfDokumentationViewServlet" type="post">
                                                <div class="col-md-2"><div class="cell"><button class="btn btn-primary" name="Approve_Mdf" value="${camp.id_MDF}" type="submit"><p>MDF</p></button></div></div>
                                            </form>
                                            <form name="activePoeForm" action="poeDokumentationViewServlet" type="post">
                                                <div class="col-md-2"><div class="cell"><button class="btn btn-primary" name="Approve_Poe" value="${camp.id_POE}" type="submit"><p>POE </p></button></div></div>
                                            </form>
                                            <form name="activeInvoiceForm" action="invoiceDokumentationViewServlet" type="post">
                                                <div class="col-md-2"><div class="cell"><button class="btn btn-primary" name="Approve_Invoice" value="${camp.id_invoice}" type="submit"><p>Invoice </p></button></div></div>
                                            </form>
                                            <form name="activeFacturaForm" action="facturaDokumentationViewServlet" type="post">
                                                <div class="col-md-2"><div class="cell"><button class="btn btn-primary" name="Approve_Factura" value="${camp.id_factura}" type="submit"><p>Factura</p></button></div></div>
                                            </form>
                                            <div class="col-md-1"><div class="cell">${camp.c_Status}</div></div>
                                            <div class="col-md-1"><div class="cell"><p style="color: black">Completed</p></div></div>
                                        </div>
                                    </c:if>
                                </c:forEach>
                            </div>



                            <!--END OF TABLE DATA-->

                            <!--Javascript-->

                            <script src="js/bootstrap.min.js" type="text/javascript"></script>
                            <script src="js/custom.js" type="text/javascript"></script>
                    </body>
                </html>
>>>>>>> origin/master
