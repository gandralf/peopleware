<form method="PUT" action="/people">
    <input type="hidden" name="person.id" value="${person.id}"/>
    <table>
        <tr>
            <td>Name: </td>
            <td><input type="text" name="person.name" value="${person.name}"/></td>
        </tr>
        <tr>
            <td>Email: </td>
            <td><input type="text" name="person.email" value="${person.email}" /></td>
        </tr>
        <tr>
            <td><input type="submit" value="Update" /></td>
        </tr>
    </table>
</form>