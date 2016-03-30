
function myCreateFunction() {
    var table = document.getElementById("myTable");
    var tableRowNumEl = document.getElementById("tableRowNum");

    // start abdulahi!
    var tableRowNum = parseInt(tableRowNumEl.value);
    // stop abdulahi!
for (i = 0; i < tableRowNum ; i++) {
    var row = table.insertRow(0);
    var cell1 = row.insertCell(0);
    var cell2 = row.insertCell(1);
    var cell3 = row.insertCell(2);
    var cell4 = row.insertCell(3);
    var cell5 = row.insertCell(4);
    cell1.innerHTML = "Name";
    cell2.innerHTML = "Wins";
    cell3.innerHTML = "Draws";
    cell4.innerHTML = "Losses";
    cell5.innerHTML = "Pts";
    cell1.contentEditable = true;
    cell2.contentEditable = true;
}
   
    //var row = table.insertRow(0);
    //var cell1 = row.insertCell(0);
    //var cell2 = row.insertCell(1);
    //cell1.innerHTML = "NEW CELL1";
    //cell2.innerHTML = "NEW CELL2";
}

function myDeleteFunction() {
    document.getElementById("myTable").deleteRow(0);
}

function myClearallFunction() {
    document.getElementById("myTable");
    var elem = document.getElementById("myTable");
    elem.parentNode.removeChild(elem);
}

// function mySaveFunction() {
//     localStorage.setItem("myCat", "Tom");
   
// }

function myTestFunction () {
   var a = prompt("enter amout of rows")
    localStorage.setItem("myCat", a);
    document.getElementById("test").innerHTML = localStorage.getItem("myCat");
}
