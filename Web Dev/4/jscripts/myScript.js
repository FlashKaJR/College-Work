// alert("Hello, you are welcome to view my page");
function UpdateData(){
    var name = prompt("Enter your name");
    var age = prompt("Enter your age");
    var height =prompt("Enter your height in feet");
    height = height*30.48;
    var titleDetails = "Some info on " + name;
    document.getElementById("title").innerHTML = titleDetails;
    document.getElementById("name").innerHTML = name;
    document.getElementById("age").innerHTML = age;
    document.getElementById("height").innerHTML = (height).toFixed(2)
}