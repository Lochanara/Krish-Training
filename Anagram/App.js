const scanner = require('readline').createInterface({

    input: process.stdin,
    output: process.stdout

});

function app() {

    let wordsString = "";

    scanner.question("Enter both words separated by a comma \n", function(input) {

        wordsString = input;

        let splitWords = wordsString.split(',');

        let outputMsg = validateAnagram(splitWords[0], splitWords[1]);

        console.log(outputMsg);
        
        scanner.close();

    });

    function validateAnagram(firstWord, secondWord) {

        if(firstWord.length !== secondWord.length) {
    
            return "Words are not anagrams";
    
        }
    
        let lowercaseFirstWord = firstWord.toLowerCase();
        let lowercaseSecondWord = secondWord.toLowerCase();
    
    
        let firstWordMap = WordToLettersMap(lowercaseFirstWord);
        let secondWordMap = WordToLettersMap(lowercaseSecondWord);
    
        for(let letter in firstWordMap) {
    
            if(firstWordMap[letter] !== secondWordMap[letter]) {
    
                return "Words are not anagrams";
    
            }
    
        }
    
        return "Words are anagrams";
    }
    
    function WordToLettersMap(word) {
    
        let letterMap = {};
    
        for(let letter of word) {
    
            if(letterMap.hasOwnProperty(letter)) {
    
                letterMap[letter] = letterMap[letter] + 1;
    
            } else {
    
                letterMap[letter] = 1;
    
            }
    
        }
    
        return letterMap;
    }
    
}

app();