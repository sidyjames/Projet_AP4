<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="entete.jsp"/>
<div id="contenu">
    <a href="Control?action=listeMedecinsDep">Retour à la sélection</a>
    <br />
    <table class="listeLegere">
        <caption>Médecins pour le département n°${leDep.num}</caption>
        <tr>
            <th>Nom</th>
            <th>Prénom</th>
            <th>Adresse</th>
            <th>Spécialité</th>
            <th>Téléphone</th>
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
