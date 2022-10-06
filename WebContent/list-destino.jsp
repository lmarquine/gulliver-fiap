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
	
	<div class="destiny-card-wrapper">
		<div class="destiny-card" id="place-1">
		<div class="info place-image">
			<img class="place-image_img" src="./assets/images/lucifer.jpg"/>
		</div>
		<div class="info place-name">
			<h2>
				Lucifer		
			</h2>
		</div>
		
		<div class="info place-city">
			<p>
				Los Angeles		
			</p>
		</div>
		
		<div class="info place-country">
			<p>
				Estados Unidos		
			</p>
		</div>
		
		<div class="info place-currency">
			<p>
				USD		
			</p>
		</div>
		
		<div class="info place-power">
			<p>
				220 Volts		
			</p>
		</div>
		
		<div class="btn btn-know_more">
			<a href="./destino.do?id=1">
				<span>Saiba Mais</span>
			</a>
		</div>		
	</div>
	
	<div class="destiny-card" id="place-2">
		<div class="info place-image">
			<img class="place-image_img" src="./assets/images/series/o-negocio1.png"/>
		</div>
		<div class="info place-name">
			<h2>
				O Negócio		
			</h2>
		</div>
		
		<div class="info place-city">
			<p>
				São Paulo
			</p>
		</div>
		
		<div class="info place-country">
			<p>
				Brasil		
			</p>
		</div>
		
		<div class="info place-currency">
			<p>
				BRL
			</p>
		</div>
		
		<div class="info place-power">
			<p>
				110 Volts		
			</p>
		</div>
		
		<div class="btn btn-know_more">
			<span>Saiba Mais</span>
		</div>		
	</div>
	
	<div class="destiny-card" id="place-3">
		<div class="info place-image">
			<img class="place-image_img" src="./assets/images/soltos-em-floripa.jpg"/>
		</div>
		<div class="info place-name">
			<h2>
				Soltos em Floripa	
			</h2>
		</div>
		
		<div class="info place-city">
			<p>
				Florianópolis
			</p>
		</div>
		
		<div class="info place-country">
			<p>
				Brasil		
			</p>
		</div>
		
		<div class="info place-currency">
			<p>
				BRL
			</p>
		</div>
		
		<div class="info place-power">
			<p>
				220 Volts		
			</p>
		</div>
		
		<div class="btn btn-know_more">
			<span>Saiba Mais</span>
		</div>		
	</div>
	</div>
	
</div>
<jsp:include page="./footer.jsp" />
</body>
</html>