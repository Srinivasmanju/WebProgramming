const numbers = [1, 2, 3];
console.log(numbers);

//Adding to end of the array
numbers.push(4,5);
console.log(numbers);

//Adding to Begining of the array
numbers.unshift(-1,0);
console.log(numbers);

//Adding to Middle of the array
numbers.splice(2,0,'x','y');
console.log(numbers);

//finding the elements
const num= [1,2,3,4,1,1];
console.log(num.indexOf(3));
console.log(num.indexOf(1));
console.log(num.lastIndexOf(1));
console.log(num.indexOf(1)!== -1);
console.log(num.includes(9));
console.log(num.indexOf(1,1));
console.log(num.length);

const students = [
    {id: 1,name: "john"},
    {id:2,name: 'rahul'},
    {id:3,name:'Srini'},
    {id:4,name:'anoop'},
];

console.log(students.includes({id:1,name:"john"}));
const student =students.findIndex(function (student){
   return student.name === "john";
});

console.log(student);

const studentent = students.find(studentent => students.name === 'Srini')
console.log(studentent);

//Remove elements
const sum = [1,2,3,4,5];

//removing from end
const last= sum.pop(); //similar to push()
console.log(sum);
console.log(last);

//removing from begging
const first = sum.shift();
console.log(sum);
console.log(first);

//removing from middle
sum.splice(2,1);
console.log(sum);

//Delection of all elements

let srini = [1,2,3,4,5];

//solution 1
srini = [];

//solution 2
srini.length = 0;
console.log(srini);

//solution 3
srini.splice(0,srini.length);
console.log(srini);

//solution 4
while ( srini.length>0) {
    srini.pop();
}
console.log(srini);

//Combing the array

const firsts = [1,2,3];
const second = [4,5,6];

console.log(firsts.concat(second));
console.log(firsts);
console.log(second);

//slice the array
const combined = firsts.concat(second);
console.log(combined);
console.log(combined.slice(2,4));
console.log(combined.slice(2));
console.log(combined.slice(0,4));

//spread

const comb = [...firsts, ...second];
console.log(comb);

console.log(comb.slice());

//sort the array

const sorts = [2,5,4,3,1];
console.log(sorts);

sorts.sort();
console.log(sorts);

sorts.reverse();
console.log(sorts);

//sort array of object

const lists = [
    {id:1 , name: 'Srini'},
    {id:2 , name: 'Anoop'},
    {id:3 , name: 'Ravi'},
    {id:4 , name: 'Maxi'},
];

lists.sort();
console.log(lists); // it will not work

lists.sort(function(a,b){

    if(a.name < b.name) return -1;
    if(a.name > b.name) return 1;
    return 0;
});
console.log(lists);

//Arrays
// two number sum

let arr=[1,2,3,4,5];
let barr=[6,7,8,9,10];
function sums(arr,barr){
    for(var i=0;i < arr.length ;i++){
     return console.log (push(arr[i]+barr[i]));
    }
}
sums(arr,barr);


