let notes = [5, 7, 10, 3]
let notesSum = 0;

notes.forEach(element => {
    notesSum = notesSum + element
})

let media = notesSum / notes.length 
console.log(media)