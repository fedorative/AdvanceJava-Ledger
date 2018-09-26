<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>General Ledger System</title>

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


    <!-- Custom styles for this template -->
    <link href="/css/style.css" rel="stylesheet">
</head>

<body>
<div class="container">
    <div class="container" id="title">
        <h1 class="text-center">
            Welcome to LEDGER INTERFACE!
        </h1>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-xs-4"></div>
            <form action="/first" method="post">
                <div class="col-xs-4">
                    <div class="row">
                        <div class="form-group">
                            <label for="number">Number</label>
                            <input type="text" class="form-control" id="number" name="number">
                        </div>
                        <%--</div>--%>
                        <%--<div class="row">--%>
                        <div class="form-group">
                            <label for="owner">Owner</label>
                            <input type="text" class="form-control" id="owner" name="owner">
                        </div>
                        <%--</div>--%>
                        <%--<div class="row">--%>
                        <div class="form-group">
                            <label for="balance">Balance</label>
                            <input type="text" class="form-control" id="balance" name="balance">
                        </div>
                    </div>

                    <div class="row">

                        <div class="col-xs-3 btn-wrapper">
                            <button class="btn btn-lg btn-success" name="create" value="create">Create</button>
                        </div>
                        <div class="col-xs-3 btn-wrapper">
                            <button class="btn btn-lg btn-primary" name="read" value="read">Read</button>
                        </div>
                        <div class="col-xs-3 btn-wrapper">
                            <button class="btn btn-lg btn-warning" name="update" value="update">Update</button>
                        </div>
                        <div class="col-xs-3 btn-wrapper">
                            <button class="btn btn-lg btn-danger" name="delete" value="delete">Delete</button>
                        </div>

                    </div>
                </div>
            </form>
            <div class="col-xs-4"></div>
        </div>

    </div>
</div>

</div>
</body>
</html>
