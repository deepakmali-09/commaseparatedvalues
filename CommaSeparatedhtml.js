function commaSeparatedNumber(event) {
    
    if (event) event.preventDefault();

    const number = document.getElementById("inputNumber").value;
    let result = "";
    let count = 0;
    const numSize = number.length;

    if (numSize <= 3) {
        result = number;
    } else {
        for (let i = number.length - 1; i >= 0; i--) {
            result = number.charAt(i) + result;
            count++;
            if (count % 3 === 0 && i !== 0) {
                result = "," + result;
            }
        }
    }

    document.getElementById("outputPara").innerText = `Comma separated value: $${result}`;
}
