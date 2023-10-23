function reverseWords(sentence) {
  
  let words = sentence.split(' ');

  
  let reversedWords = words.map(function(word) {
    return word.split('').reverse().join('');
  });

  
  let reversedSentence = reversedWords.join(' ');

  return reversedSentence;
}


let inputSentence = "Hello World";
let reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence); 