<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" >
   function preventBack(){window.history.forward();}
    setTimeout("preventBack()", 0);
    window.onunload=function(){null};
</script>
<meta charset="ISO-8859-1">
<title>Contact Information</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<nav class="navbar navbar-inverse">

  <div style="margin-top:13px" class="container-fluid">
    <ul class="nav navbar-nav">
     
     
      <li><a href="/">Home</a></li>
      <li><a href="/aboutinfo">About Me</a></li>
    <!--    <li><a href="/aboutinfo" target="_blank">Skills</a></li>-->
      <li class="active"><a href="/contact">Contact Me</a></li>
</ul>
</div>
</nav>
<!--  <div style="margin-left:230px; margin-top:60px; margin-right:430px;"> -->
<div class="col-12 col-md-6">
<form:form  method="POST" action="/contact" modelAttribute="contact" >
<fieldset class="form-group">
<form:label path="name" >Name</form:label>
<form:input path="name" type="text" class="form-control form-control-sm"  required="required" placeholder="Enter name"/>
<br>
<form:label path="email">Email</form:label>
<form:input path="email" type="email" class="form-control form-control-sm" required="required" placeholder="Enter email"/>
<br>
<form:label path="contactNo">ContactNo</form:label>
<form:input path="contactNo" type="text" class="form-control form-control-sm" required="required" placeholder="Enter number"/>
<br>
<form:label path="message">Message</form:label>
<form:textarea path="message" type="text" class="form-control"  rows="4" placeholder="Message(Optional)"/>
<br>
<input type="submit" value="Submit" class="btn btn-success btn-lg"/>
</fieldset>
</form:form>
</div>
</body>
</html>