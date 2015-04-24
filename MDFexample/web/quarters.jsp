

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quarters</title>
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
                        <li><a href="newPartner.jsp">New Partner</a></li>
                        <li><a href="employeeViewPending.jsp">Pending Campaigns</a></li>
                        <li><a href="employeeViewActive.jsp">Active Campaigns</a></li>
                        <li><a href="employeeViewCompleted.jsp">Completed Campaigns</a></li>
                        <li><a href="quarters.jsp">Quarters</a></li>
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

            <!--Quarters-->
            <div class="method active-table">
                <p><strong>Quarters</strong></p>
                <div class="row margin-0 list-header hidden-sm hidden-xs">
                    <div class="col-md-5"><div class="header">Quarter Name</div></div>
                    <div class="col-md-5"><div class="header">Start Date</div></div>
                    <div class="col-md-2"><div class="header">End Date</div></div>
                </div>

                <c:forEach var="q" items="${Quarters}">
                        <div class="row margin-0">
                            <form>
                                <div class="col-md-5"><div class="cell">${q.quarter_Name}</div></div>
                                <div class="col-md-5"><div class="cell">${q.quarter_Startdate}</div></div>
                                <div class="col-md-2"><div class="cell">${q.quarter_Enddate}</div></div>
                            </form>
                        </div>
                </c:forEach>
            </div>

            <br>
            <br>

           
            <!--Javascript-->

            <script src="js/bootstrap.min.js" type="text/javascript"></script>
            <script src="js/custom.js" type="text/javascript"></script>
    </body>
</html>
