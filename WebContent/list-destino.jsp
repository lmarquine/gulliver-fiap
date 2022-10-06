<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<!DOCTYPE html>
<html>
<jsp:include page="./head.jsp" />
<body>
<jsp:include page="./header.jsp" />
<div class="container">
	<h1>Conheça o destinos das melhores séries</h1>
		
	<div class="cards-wrapper">
	<c:forEach var="item" items="${Destinos}">
		<div class="card-serie">
			<div class="image-serie">
				<img src="<c:out value="${item.placeThumb}"></c:out>">
			</div>
			<div class="card-title">
				<p>
					<c:out value="${item.name}"></c:out>
				</p>
			</div>
			<div class="card-description">
				<p>
					<c:out value="${item.shortDescription}"></c:out>
				</p>
			</div>
			<div class="btn btn-mais">
				<a href="./destino.do?id=<c:out value="${item.id}"></c:out>"><span class="span-btn_mais">Saiba Mais</span></a>
			</div>
		</div>
	</c:forEach>
	</div>
	
</div>
<jsp:include page="./footer.jsp" />
</body>
</html>