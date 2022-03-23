

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="entete.jsp"/>
<div id="contenu">
    <h3>Résultat(s) pour "<i>${nomR}</i>"</h3>
    <table class="listeLegere">
        <caption>Liste des médecins par nom</caption>
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
    <br />
    <a href="Control?action=listeMedecinsNom">Retour à la recherche</a>
</div>
<jsp:include page="pied.jsp"/>
