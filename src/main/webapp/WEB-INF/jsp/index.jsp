<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Bitly - URL Shorterner</title>
</head>
<style>
    .header{
        background-color: darkcyan;
        height: 40px;
        width: 100%;
        padding-top: 12px;
        font-size: 25px;
        font-weight: bolder;
        text-align: center;
        color: white;
    }
    .tablestyle{
        border:1px black solid;
        alignment: center;
        width: 80%;
        height: 150px;
        margin-left: 10%;
        text-align: left;
        padding-top: 10px;
        padding-bottom: 10px;
        margin-top: 3%;
    }
    .urltext{
        padding-left: 10px;
        width: 8em;
        font-size: 18px;
        text-align: center;
    }
    .urlinput{
        width: 95%;
        height: 30px;
        font-size: 20px;
        border-color: darkcyan;
        border-style: solid;
    }
    .urlbutton{
        font-size: 16px;
        width: 300px;
        height:35px;
        cursor: pointer;
    }
    .shorturl{
        padding-left: 10px;
        font-size: 22px;
        margin-left: 10%;
        font-weight: bolder;
        color: crimson;
    }
</style>
<body>
    <div class="header">Bitly URL Shortener</div>

    <form action="generateUrl" method="post">
        <table class="tablestyle">
          <tr>
            <td class="urltext">Enter the url:</td>
            <td><input type="text" name="url" class="urlinput" required></td>
          </tr>
          <tr>
            <td colspan="2" align="center" >
                <input type="submit" name="submit"  class="urlbutton" value="Generate URL">
            </td>
          </tr>
        </table>
    </form>
    <br><br>
    <div class="shorturl">${surl}</div>
</body>
</html>