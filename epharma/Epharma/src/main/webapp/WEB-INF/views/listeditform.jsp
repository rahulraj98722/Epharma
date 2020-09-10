<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list edit form</title>
<meta charset="utf-8">

  <meta name="viewport" content="width=device-width, initial-scale=1">

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<nav role="navigation" class="navbar navbar-default" >

 

                <div class="">

                              <a href="" class="navbar-brand">Epharma<img alt="Epharma" src="/resources/img/tru1.jpg"/ width="70"height="40"></a>

                </div>

 

                <div class="navbar-collapse">

                               

                    <ul class="nav navbar-nav navbar-right">

                                                <li><a href="/login">Logout</a></li>

                                </ul>

                </div>

 

</nav>
        <h1>Medicine List</h1>  
        
       <form:form method="POST" action="/mvcSpring/editsave/{id}">    
        <table >
        <tr>  
        <td></td>    
         <td><form:hidden  path="medId" /></td>  
         </tr>   
           
<tr>    
          <td>medName : </td>   
          <td><form:input path="medName"  /></td>  
         </tr>  
          
       
         <tr>    
          <td><p>medPrice (Rs.) :</p></td>   
          <td><form:input path="medPrice" /></td>  
         </tr>  
         <tr>
         <td><p>medicinePurpose :</p></td>   
          <td><form:input path="medicinePurpose" /></td>  
         </tr> 
         
         <tr>    
          <td>manfdate :</td>    
          <td><form:input path="manfdate" /></td>  
         </tr>   
         <tr>    
          <td>expdate :</td>    
          <td><form:input path="expdate" /></td>  
         </tr> 
        <tr>    
          <td>stock :</td>    
          <td><form:input path="stock" /></td>  
         </tr> 
         
       
        
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>    
       
</body>
</html>