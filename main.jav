<script>
 //q1=   students Object//
 let students = {
    name:"Amina",
    age:20,
    course:"Data Science",
 }
    console.log(students);
   // q2=car Object//
   let car ={
    brand:"Toyota",
    model:"Corolla",
    year:2020,
   }
    console.log(car);
  //  q3=mobile Object//
  let mobile={
    company:"samsung",
    storage:"128GB",
    battery:"85%",
  }
  console.log(mobile);
 2 //1 employee constaructor//
  function employee(name,salary,role){
    this.name=name;
    this.salary=salary;
    this.role=role;
  }
  let emp1= new employee("khalida",500,"manager");
  console.log(emp1)
  2//2 producta constaructor//
  function producta(productaname,price,instock){
    this.productaname=producta;
    this.price=price;
    this.instock=instock;
  }
  let pro1=new producta("laptop",1200,"true");
  console.log(pro1)
  2//3 Book constaructor//
  function Book(title,author,pages){
    this.title=title;
    this.author=author;
    this.pages=pages;
  }
  let Book1=new Book("javascript basicsx","john",250);
  console.log(Book1)
//  3//1 es6 classes//
class Teacher {
    constructor() {
        this.name = "Fatima";
        this.subject = "Math";
        this.experience = 5;
    }
}
let t1 = new Teacher();
console.log(t1);


//3//2 Bankaccount//
class Bankaccount{
  constructor(accountnamber,ownername,balance){
    this.accountnamber=Bankaccount;
    this.ownername=ownername;
    this.balance=balance;
  }
}
let acc1=new Bankaccount("AC1234","ahamed",300);
console.log(acc1)
//3//3 animal class//
class animal{
constructor(type,color,age){
  this.type=type;
  this.color=color;
  this.age=age;
}
}
let animal1=new animal("cat","while",2);
console.log(animal1)
//4//1 laptop object update//
let laptop = { brand: "Dell", ram: "8GB", price: 700 };
console.log(laptop.brand);    
laptop.ram = "16GB";          
console.log(laptop);
//4//2 user profile update
let user = { username: "Ali2025", email: "ali@example.com", age: 22 };

console.log("Old Email:", user.email);
user.email = "ali.new@example.com";
console.log(user);
//4//3 hotel room update
let room = { roomNumber: 105, price: 50, type: "Single" };

console.log(room.price);
room.price = 40;
console.log(room);
//5//1 car object add elements
let carObj = { brand: "Honda", model: "Civic", year: 2019 };
carObj.owner = "Omar";                       // dot notation
carObj["last-service-date"] = "2025-01-01"; // bracket notation
console.log(carObj);
//5//2 student object  add elements
let stu = { name: "Maryam", grade: "A", school: "Afbaro Academy" };
stu.age = 18;
stu["favorite-subject"] = "Physics";
console.log(stu);
//5//3 shop item add elements
let item = { itemName: "Milk", price: 2, category: "Food" };
item.quantity = 30;
item["discount-percentage"] = 10;
console.log(item);
//6//1restaurant menu loop
let menu = { burger: 5, pizza: 8, juice: 3 };
for (let item in menu) {
    console.log(item + ": $" + menu[item]);
}

//6//2 city info loop
let city = { population: 500000, mayor: "Hassan", area: "200 sq km" };
for (let key in city) {
    console.log(key + ": " + city[key]);
}

//6//3 classroom schedule loop
let schedule = { math: "8:00 AM", english: "10:00 AM", science: "1:00 PM" };
for (let subject in schedule) {
    console.log(subject + ": " + schedule[subject]);
}

//7//1movie to json
let movie = { title: "Inception", duration: "2h 30m", rating: 9 };
let jsonMovie = JSON.stringify(movie);
console.log(jsonMovie);

//7//2json string object
let jsonStr = '{"name":"Sara","age":25,"country":"Kenya"}';
let obj = JSON.parse(jsonStr);
console.log(obj.name);
console.log(obj.age);
console.log(obj.country);

//7//3 json object json
let weather = { temperature: 32, humidity: "70%", condition: "Sunny" };
let json = JSON.stringify(weather);
let backToObj = JSON.parse(json);
console.log(backToObj);
</script>    
