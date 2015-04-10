<%-- 
    Document   : index
    Created on : Mar 25, 2015, 9:13:05 PM
    Author     : Dennis
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
                <a href='index.jsp'><p>Sign out!</p></a>
            </div>


            <!--TABLE DATA-->
            
            <!--pending-->

            <div class="method pending-table">
                <p><strong>Pending campaigns</strong></p>
                <div class="row margin-0 list-header hidden-sm hidden-xs">
                    <div class="col-md-1"><div class="header">ID</div></div>
                    <div class="col-md-3"><div class="header">Name</div></div>
                    <div class="col-md-2"><div class="header">Start</div></div>
                    <div class="col-md-2"><div class="header">End</div></div>
                    <div class="col-md-2"><div class="header">Deadline</div></div>
                    <div class="col-md-2"><div class="header">Status</div></div>
                </div>
                
                <div class="row margin-0">
                    <div class="col-md-1"><div class="cell">Test</div></div>
                    <div class="col-md-3"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                </div>
                
                <div class="row margin-0">
                    <div class="col-md-1"><div class="cell">Test</div></div>
                    <div class="col-md-3"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                </div>
                
                <div class="row margin-0">
                    <div class="col-md-1"><div class="cell">Test</div></div>
                    <div class="col-md-3"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                </div>

            </div>
            
            <br>
            <br>
            
            <!--active-->

            <div class="method active-table">
                <p><strong>Active campaigns</strong></p>
                <div class="row margin-0 list-header hidden-sm hidden-xs">
                    <div class="col-md-1"><div class="header">ID</div></div>
                    <div class="col-md-3"><div class="header">Name</div></div>
                    <div class="col-md-2"><div class="header">Start</div></div>
                    <div class="col-md-2"><div class="header">End</div></div>
                    <div class="col-md-2"><div class="header">Deadline</div></div>
                    <div class="col-md-2"><div class="header">Status</div></div>
                </div>
                
                <div class="row margin-0">
                    <div class="col-md-1"><div class="cell">Test</div></div>
                    <div class="col-md-3"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                </div>
                
                <div class="row margin-0">
                    <div class="col-md-1"><div class="cell">Test</div></div>
                    <div class="col-md-3"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                </div>
                
                <div class="row margin-0">
                    <div class="col-md-1"><div class="cell">Test</div></div>
                    <div class="col-md-3"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                </div>

            </div>
            
            <br>
            <br>
            
            <!--old-->

            <div class="method old-table">
                <p><strong>Old campaigns</strong></p>
                <div class="row margin-0 list-header hidden-sm hidden-xs">
                    <div class="col-md-1"><div class="header">ID</div></div>
                    <div class="col-md-3"><div class="header">Name</div></div>
                    <div class="col-md-2"><div class="header">Start</div></div>
                    <div class="col-md-2"><div class="header">End</div></div>
                    <div class="col-md-2"><div class="header">Deadline</div></div>
                    <div class="col-md-2"><div class="header">Status</div></div>
                </div>
                
                <div class="row margin-0">
                    <div class="col-md-1"><div class="cell">Test</div></div>
                    <div class="col-md-3"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                </div>
                
                <div class="row margin-0">
                    <div class="col-md-1"><div class="cell">Test</div></div>
                    <div class="col-md-3"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                </div>
                
                <div class="row margin-0">
                    <div class="col-md-1"><div class="cell">Test</div></div>
                    <div class="col-md-3"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                    <div class="col-md-2"><div class="cell">Test</div></div>
                </div>

            </div>
            
            <!--END OF TABLE DATA-->

            <!--Javascript-->
            <script src="js/bootstrap.min.js" type="text/javascript"></script>
            <script src="js/custom.js" type="text/javascript"></script>
    </body>
</html>
