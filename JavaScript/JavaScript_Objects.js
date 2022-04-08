class Rectangle {
    constructor(width, height) {
        this.width = width;
        this.height = height;
    }
    
    Area = () => { 
        return this.width * this.height;
     };
    Perimeter = () => {
         return 2 * (this.width + this.height);
        };
}
function Q1Q2(){
    r = new Rectangle(2,3); 

    document.write(`Rectangle r Width = ${r.width}, Length = ${r.height} `); 
    document.write(`Rectangle r of Length = ${r.height} & Width = ${r.width} has Area = ${r.Area()} and Perimeter = ${r.Perimeter()}`);
};


function Q3(){
    s = new Rectangle(4,10);
  
  document.write(`New Rectangle s of changed length ${s.height} & Changed width  ${s.width} has area ${s.Area()} and perimeter ${s.Perimeter()}`);
  
}


function Q4(){

    var info = {
        Firstname: "Roshan",
        Lastname: "Behera",
        Age: "21",
        City: "Chennai",
        State: "TamilNadu",
        Country: "India",
    };

    
    document.write(` First-name is ${info.Firstname} , lastname  is ${info.Lastname} , age is ${info.Age} , city is ${info.City} , state is ${info.State} , country is ${info.Country}`);
    info.Lastname = "Behera";
    document.write(`Changed Lastname ${info.Lastname}`);
}



function Q5(){

    var info = {
        Firstname: "Roshan",
        
        Lastname: "Behera",
        Age: "21",
        City: "Chennai",
        State: "TamilNadu",
        Country: "India",
    };

     info.Middlename = "Kumar";
    document.write(`After defining The middle name is : ${info.Middlename}`);
};
 
function Q6(){
var string = "{firstName:'Roshan', age:21, city:'Chennai', state:'TamilNadu', country:'India'}";
eval('var obj='+string);
document.write(obj);
string.MiddleName = "Kumar";
document.write(`The middle name is : ${string.MiddleName}`);
};



function Q7(){
var obj = '{ "firstName":"Roshan", "lastName":"Kumar" }';
obj = JSON.parse(obj); 
document.write(obj);
};