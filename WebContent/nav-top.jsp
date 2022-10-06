<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<nav id="nav" class="top-nav">
    <button id="btn-mobile"></button>
    <ul id="menu">
        <li><a href="./home">Home</a></li>
        <li><a href="./home">Hospedagens</a></li>
        <li><a href="./home">Cadastrar Novo Destino</a></li>
        <li><a href="./destino.do?id=0">Séries</a></li>
    </ul>

    <ul id="accessibility-options">
        <li><a class="button fontSize minus" onclick="fontSize('minus')">A-</a></li>
        <li><a class="button fontSize plus" onclick="fontSize('plus')">A+</a></li>
        <li><a class="button fontSize reset" onclick="resetFontSize()">Reset</a></li>
        <li><a class="button fontSize reset" onclick="contrastColors()">Contraste</a></li>
    </ul>
</nav>