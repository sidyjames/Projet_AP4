<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="entete.jsp"/>
<div id="contenu">
    <a href="Control?action=listeMedecinsDep">Retour ? la s?lection</a>
    <br />
    <table class="listeLegere">
        <caption>M?decins pour le d?partement n?${leDep.num}</caption>
        <tr>
            <th>Nom</th>
            <th>Pr?nom</th>
            <th>Adresse</th>
            <th>Sp?cialit?</th>
            <th>T?l?phone</th>
        </tr>
        <c:forEach var="med" items="${listMeds}">
            <tr>
                <td>${med.nom}</td>
                <td>${med.prenom}</td>
                <td>${med.adresse}</td>
                <td>${med.spe}</td>
                <td>${med.tel}</td>
            </tr>
        </c:forEach>
    </table>
</div>
<jsp:include page="pied.jsp"/>
