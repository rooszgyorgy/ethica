<!DOCTYPE html>
<html>
    <head>
        <title>Students</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        </head>
    <body>
        <h2>List of students</h2>

        <table>
            <tr>
                <th>FirstName</th>
                <th>LastName</th>
                <th>Age</th>
            </tr>

            <#list students as student>
                <tr>
                    <td>${student.firstname}</td>
                    <td>${student.lastname}</td>
                    <td>${student.age}</td>
                </tr>
            </#list>
        </table>
    </body>
</html>