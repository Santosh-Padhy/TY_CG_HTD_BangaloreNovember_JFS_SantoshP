interface Trainee{
    name: string,
    age:number,
    printData(): void
}
class Training implements Trainee{
    name='abc';
    age=20;
    data(){
        console.log('hello');
    }
    printData(){
        console.log('hi')
    }
}

//in typescript an interface can extend multiple classes when an interface is extending from a class all 
//the properties present in the class will be
// be made abstract in the interface
//can create interface object 
let trainee1:Trainee={
    name:'santosh',
    age:45,
    printData:function(){
        console.log(this.name,this.age);
    },
}