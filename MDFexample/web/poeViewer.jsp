<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="img/Dell_Logo.png">
        <title>Point of Execution</title>

        <!--Stylesheets-->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link href='http://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>
        <link href="css/mdf.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <form action="changeMe" method="GET">
            <div class="container">
                <header>
                    <h1>Point of Execution:</h1>
                    <img src="img/Dell_Logo.png" alt="Dell-logo" class="img-responsive logo visible-lg"/>
                </header>
                <div class="row">
                    <div class="col-md-4">
                        <br/>
                        <p>Campaign type:</p>
                        <p>${poeViewer.campaign_type}</p>
                        <br/>
                        <br/>
                        <p>Activity:</p>
                        <p>${poeViewer.activity}</p>
                    </div>
                    <div class="col-md-4">
                        <br/>
                        <p>Date:</p>
                        <p>${poeViewer.date}</p>
                        <br/>
                        <br/>
                        <p>Recipients:</p>
                        <p>${poeViewer.recipients}</p>
                    </div>
                    <div class="col-md-4">
                        <br/>
                        <p>Unique opens/Hits:</p>
                        <p>${poeViewer.unique_opens_hits}</p>
                        <br/>
                        <br/>
                        <p>Unique clicks:</p>
                        <p>${poeViewer.unique_clicks}</p>
                    </div>
                </div>
                <hr>
                <div class="row">
                    <div class="col-md-12">
                        <p>Additional information:</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <p>${poeViewer.additional_information}</p>
                    </div>
                </div>
                <hr>
                <div class="row">
                    <div class="col-md-12">
                        <input type="file" name="dataFile" id="fileChooser"/><br/><br/>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <button class="btn btn-primary pull-right" value="Accepted" id="Accept" type="submit"  style="text-decoration: none; color: white;">Accept</button>
                        <button class="btn btn-danger pull-right" value="Declined" id="Decline" type="submit"  style="text-decoration: none; color: white; margin-right: 10px;">Decline</button>
                    </div>
                </div>
                <hr>
            </div>
        </form>


        <!--Javascript-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/custom.js" type="text/javascript"></script>
    </body>
</html>
