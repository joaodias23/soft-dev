const fullNames = [
    { first: 'Albus', last: 'Dumbledore' },
    { first: 'Harry', last: 'Potter' },
    { first: 'Hermione', last: 'Granger' },
    { first: 'Ron', last: 'Weasley' },
    { first: 'Rubeus', last: 'Hagrid' },
    { first: 'Minerva', last: 'McGonagall' },
    { first: 'Severus', last: 'Snape' }];

const firstNames = fullNames.map((name) => name.first);

console.log(firstNames);

const greet = nome => console.log(`Hey ${nome}`);
greet("Zé");
greet("Mayara");


function validUserNames(users){
    newUsers = users.filter(users => users.length < 10);
    console.log(newUsers);
} 

validUserNames(["mark", "staceysmom1978", "q29832128238983", "carrie98", "MoanaFan"]);

function validnums(nums){
    return nums.every(nums => nums % 2 == 0);
}

console.log(valid([2,4,6,7]));