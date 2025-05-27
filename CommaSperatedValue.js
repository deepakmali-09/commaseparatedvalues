function commaSeparatedNumber(number) {
    let result = "";
    let count = 0;
    let numSize = number.length;

    console.log("Numbers length: " + numSize);

    if (numSize <= 3) {
        console.log("Number with less than 3 digits: $" + number);
    }

    if (numSize > 3) {
        for (let i = number.length - 1; i >= 0; i--) {
            result = number.charAt(i) + result;
            count++;

            if (count % 3 === 0 && i !== 0) {
                result = "," + result;
            }
        }
        console.log("Number with more than 3 digits: $" + result);
    }
}

commaSeparatedNumber("10698");
