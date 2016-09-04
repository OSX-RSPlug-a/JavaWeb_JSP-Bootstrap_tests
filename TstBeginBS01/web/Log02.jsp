<%-- 

    This is a example of JAVA - WEB - jsp and bootstrap
    
    I'm as a student, i've needed to have some tests with this technology for improve my lessons about this on university,
    so enjoy my share of my little knowledge.

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
        <head>
        
            
            <title>JSP Log page test</title>
            
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
            <meta http-equiv="X-UA-Compatible" content="IE=edge">

            <meta name="viewport" content="width=device-width, initial-scale=1">
	
            <link rel="stylesheet" href="css/bootstrap.css" type="text/css" />
	
            <script src="js/bootstrap.js" type="text/javascript"></script>
            
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
            
            <script src="js/function.js" type="text/javascript"></script>
               
             
    </head>
    <body>
        
        <div class="container">

     
            <h3>Registration</h3>
    
            <hr>
    
            <div class="row">
        
                <div class="col-lg-6">
            
                    <div class="form-group">
                
                        <label>Username</label>
                
                        <div class="input-group"> <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                    
                            <input type="text" class="form-control" name="Username" id="Username" placeholder="Requested Username" required value="">
                
                        </div>
            
                    </div>
            
                    <div class="form-group">
                
                        <label>Email</label>
                
                        <div class="input-group"> <span class="input-group-addon"><span class="glyphicon glyphicon-envelope"></span></span>
                    
                            <input type="text" class="form-control" name="Email" id="Email" placeholder="Requested Email - EX.: Jhon@mail.c" required value="">
                
                        </div>
            
                    </div>
            
                    <div class="form-group">
                
                        <label>Password</label>
                
                        <div class="input-group"> <span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
                    
                            <input type="text" class="form-control" name="password" id="password" placeholder="Password" required data-toggle="popover" title="Password Strength" data-content="Enter Password..." autofocus="document">
                
                        </div>
            
                    </div>
            
                    <div class="form-group">
                
                        <label>Confirm Password</label>
                
                        <div class="input-group"> <span class="input-group-addon"><span class="glyphicon glyphicon-resize-vertical"></span></span>
                    
                            <input type="password" class="form-control" name="confirm" id="confirm" placeholder="Confirm Password" required>
                
                        </div>
            
                    </div>
            
                    <input type="submit" name="submit" id="submit" value="Submit" class="btn btn-primary pull-right">
        
                </div>
    
            </div>

        </div>
        
    </body>
</html>
