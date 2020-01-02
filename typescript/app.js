"use strict";
console.log('TypeScript Code started');
var a = 100; //implicitle it will consider as let a: number =100
a = null; //in cong=fig file we change it to strictNullchecks as false then it will not throw any error
//a ='string';error you cant reassign  type number  tostring 
var b; //oimplicitly it willconsider as any type
b = 'santosh';
console.log(b);
var marks = [1, 2, 3, 4, 5,]; //here type string cannot be assign to number type
var student;
student = {
    name: 'santosh',
    age: 35,
    pass: true
};
var Student = /** @class */ (function () {
    function Student(name, age, USN, marks) {
        this.name = name;
        this.age = age;
        this.USN = USN;
        this.marks = marks;
    }
    Student.prototype.printDetails = function () {
        console.log('Name is ${this.name},, age, is, $, { this: .age }, USN, is, $, { this: .USN }, Marks, is, $, { this: .marks });
    };
    return Student;
}());
var student1 = new Student('Santosh', 23, 72367, 198);
console.log(student1.name);
console.log(student1.age);
console.log(student1.USN);
console.log(student1.marks);
