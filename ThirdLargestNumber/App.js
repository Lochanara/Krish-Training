const scanner = require('readline').createInterface({

    input: process.stdin,
    output: process.stdout

});

function app() {

    let numberString = "";

    scanner.question("Enter numbers seperated by commas \n", function(input) {

        numberString = input;

        let numberArray = numberString.split(',');

        let outputMsg = getThirdLargest(numberArray);

        console.log(outputMsg);
        
        scanner.close();

    });

    function getThirdLargest(numberArray){

        if (numberArray.length < 3) {
    
            return "Must input at least 3 numbers";
    
        }
    
        let intArray = [];
    
        for (let i = 0; i < numberArray.length; i++) {
    
            let number = parseInt(numberArray[i]);
    
            if (isNaN(number)) {
    
                return "Invalid inputs";
    
            }
    
            intArray[i] = number;
    
        }
    
        sort(intArray);
    
        return "Third largest number : " + intArray[2];
    
    }
    
    function sort(intArray) {
    
        let sorted = false;

        while (!sorted) {

            sorted = true;

            for (let i = 0; i < intArray.length - 1; i++) {

                if (intArray[i] > intArray[i+1]) {

                    sorted = false;
                    let tempNum = intArray[i];
                    intArray[i] = intArray[i+1];
                    intArray[i+1] = tempNum;

                }   

            }

        }

    }

}

app();