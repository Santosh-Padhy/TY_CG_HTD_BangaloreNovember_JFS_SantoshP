console.log('TypeScript Code started');
let a=100;//implicitle it will consider as let a: number =100
a=null;//in cong=fig file we change it to strictNullchecks as false then it will not throw any error
//a ='string';error you cant reassign  type number  tostring 
let b;//oimplicitly it willconsider as any type
b='santosh';
console.log(b);
let marks:number[] = [1,2,3,4,5,]//here type string cannot be assign to number type
let student :{name:string ,age:number,pass:boolean} ;
student={
    name: 'santosh',
    age: 35,
    pass: true

}
class Student{
    constructor(
  public   name:string ,
  public   age:number,
   public  USN:number,
   public marks:number){}

printDetails():void{
console.log('Name is ${this.name},
age is ${this.age},USN is ${this.USN},
Marks is ${this.marks}
);
}

}
let student1 = new Student('Santosh',23,72367,198);
console.log(student1.name);
console.log(student1.age);
console.log(student1.USN);
console.log(student1.marks);



