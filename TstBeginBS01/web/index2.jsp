<%-- 
    
    This is a example of JAVA - WEB - jsp and bootstrap  
    
    I'm as a student, i've needed to have some tests with this technology for improve my lessons about this on university,
    so enjoy my share of my little knowledge.

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	
	<head>

			
            <title>Bootstrap tests</title>
	
            <meta charset="UTF-8" />
	
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            
            <meta name="viewport" content="width=device-width, initial-scale=1">

            <link rel="stylesheet" href="css/bootstrap.css" type="text/css" />
	
            <script src="js/bootstrap.js" type="text/javascript"></script>
            
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>


		</head>

		<header role="banner" class="navbar navbar-fixed-top navbar-inverse">
      	
                    <div class="container">
        	
                        <div class="navbar-header">
          		
                            <button data-toggle="collapse-side" data-target=".side-collapse" data-target-2=".side-collapse-container" type="button" class="navbar-toggle pull-left"><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
        	
                        </div>
        		
                        <div class="navbar-inverse side-collapse in">
          	
                            <nav role="navigation" class="navbar-collapse">
                        
                                <!-- top-menu -->                		
                                <ul class="nav navbar-nav">
                            
              				<li><a href="#Home">Home</a></li>
                                        
              				<li><a href="#users">Users</a></li>
              				
                                        <li><a href="#places">Places</a></li>
              				
                                        <li><a href="Log02.jsp" onclick="window.open(this.href,'targetWindow','toolbar=no,location=no,status=no,menubar=no,scrollbars=yes,resizable=yes,width=420,height=460');return false;">Register</a></li>
                        
                                </ul>
          		
                            </nav>
        	
                        </div>
      	
                    </div>
    
                </header>

	<body>

			<div class="jumbotron text-center">
  				
  				<h1>My First Bootstrap Page</h1>
  
  				<p>Resize this responsive page to see the effect!</p>
			
			</div>

			<div class="container">
  
  				<div class="row">
    			
    				<div class="col-sm-4">
      			
      					<h3>Column 1</h3>
      
      					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
      					
      					<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
    				</div>
    
    			<div class="col-sm-4">
      
      				<h3>Column 2</h3>
      
      				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
      				
      				<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
    			
    			</div>
    	
    			<div class="col-sm-4">
      			
      				<h3>Column 3</h3>
      
      				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
      				
      				<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
    
    			</div>
  			</div>
		</div>
            
            <br><br><br><br><br><br><br><br>
            
   </body>

    <!--footer start from here-->
    <footer>
  
        <div class="container">
    
            <div class="row">

                <div class="col-md-4 col-sm-6 footerleft ">
        
                    <div class="logofooter"> Logo</div>
        
                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley.</p>
                    
                    <p><i class="fa fa-map-pin"></i> 00, Florest reserve, Anduin sec 42, New Nihon -        1111111, Insland</p>
                    
                    <p><i class="fa fa-phone"></i> Phone (unkown) : +12 9999 999 999</p>
                    
                    <p><i class="fa fa-envelope"></i> E-mail : info@webTests.com</p>
        
      
                </div>
      
                <div class="col-md-2 col-sm-6 paddingtop-bottom">
        
                    <h6 class="heading7">GENERAL LINKS</h6>
        
                    <ul class="footer-ul">
          
                        <li><a href="#"> Career</a></li>
          
                        <li><a href="#"> Privacy Policy</a></li>
          
                        <li><a href="#"> Terms & Conditions</a></li>
          
                        <li><a href="#"> Client Gateway</a></li>
          
                        <li><a href="#"> Ranking</a></li>
          
                        <li><a href="#"> Case Studies</a></li>
          
                        <li><a href="#"> Frequently Ask Questions</a></li>
        
                    </ul>
      
                </div>
      
                <div class="col-md-3 col-sm-6 paddingtop-bottom">
        
                    <h6 class="heading7">LATEST POST</h6>
        
                    <div class="post">
          
                        <p>test the all code:what it means for you <span>September 3,2016</span></p>
          
                        <p>test the all code:what it means for you <span>September 3,2016</span></p>
          
                        <p>test the all code:what it means for you <span>September 3,2016</span></p>
        
                    </div>
      
                </div>
      
                <div class="col-md-3 col-sm-6 paddingtop-bottom">
        
                    <div class="col-md-2 footer-social animated fadeInDown">

                        
                                        <h6 class="heading7">Follow-Us</h6>
            	
                                       
                                            <p><a href="#"><img alt="Facebook Icon" border="0" height="30" src="images/social-facebook.png" width="30"></a></p>
                	
                                            <p><a href="#"><img alt="Twitter Icon" border="0" height="30" src="images/social-twitter.png" width="30"></a></p>
                	
                                            <p><a href="#"><img alt="Youtube Icon" border="0" height="30" src="images/email_social_youtube.png" width="30"></a></p>
                	
                                            <p><a href="#"><img alt="Google&#43; Icon" border="0" height="30" src="images/email_social_gplus.png" width="30"></a></p>
                
       
                    </div>
        
                </div>
      
            </div>
    
        </div>
  

        <div class="copyright">
  
            <div class="container">
    
                <div class="col-md-6">
      
                    <p>© 2016 - All Rights with WebTestsJava</p>
    
                </div>
    
                <div class="col-md-6">
      
                    <ul class="bottom_ul">
        
                        <li><a href="#">webTests.com</a></li>
        
                        <li><a href="#">About us</a></li>
        
                        <li><a href="#">Blog</a></li>
        
                        <li><a href="#">Faq's</a></li>
        
                        <li><a href="#">Contact us</a></li>
        
                        <li><a href="#">Site Map</a></li>
      
                    </ul>
    
                </div>
  
            </div>

        </div>
   
    </footer>

</html>