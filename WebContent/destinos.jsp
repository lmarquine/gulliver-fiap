<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
    <jsp:useBean id="Destinos" scope="request" type="model.Destinos"></jsp:useBean>
<!DOCTYPE html>
<html>
<jsp:include page="./head.jsp" />
<body>
<jsp:include page="./header.jsp" />
<div class="container">	
	<div class="destiny-hero">
		<img class="place-image_img" src="<c:out value="${Destinos.placeThumb}"></c:out>"/>
	</div>
	
	<h1><c:out value="${Destinos.city}"></c:out>: A cidade de <c:out value="${Destinos.name}"></c:out></h1>
	
	<div class="main">
		<div class="row page-2-columns">
			<div class="image-feature">
				<img class="place-image_img" src="<c:out value="${Destinos.placeThumbCity}"></c:out>"/>
			</div>
			
			<div class="short-description">
				<c:out value="${Destinos.shortDescription}"></c:out>
			</div>
		</div>
		
		<div class="row page-2-columns">
			<div class="video">
				<iframe width="960"
                        height="550"
                        src="<c:out value="${Destinos.video1}"></c:out>"
                        title="YouTube video player"
                        frameborder="0"
                        allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
                        allowfullscreen>
                </iframe>
			</div>
		</div>
	</div>
	
	
	
</div>
<jsp:include page="./footer.jsp" />
</body>
</html>