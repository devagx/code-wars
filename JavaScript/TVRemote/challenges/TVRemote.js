


function countSteps(x, y, prevX, prevY) {
    let steps = 0;
    //console.log(prevX);
    //console.log(prevY);
    steps = Math.abs(x - prevX) + Math.abs(y - prevY) + 1
    return steps;
}

var tvRemote = function (word) {
    let charInfoArr = new Array();
    let prevX = 0;
    let prevY = 0;
    let totalSteps = 0;

    const keys = [

        ["a", "b", "c", "d", "e", "1", "2", "3"],
        ["f", "g", "h", "i", "j", "4", "5", "6"],
        ["k", "l", "m", "n", "o", "7", "8", "9"],
        ["p", "q", "r", "s", "t", ".", "@", "0"],
        ["u", "v", "w", "x", "y", "z", "_", "/"],
    ]

    const chars = word.split('');

    for (let w = 0; w < chars.length; w++) {
        for (let y = 0; y < keys.length; y++) {
            for (let x = 0; x < keys[y].length; x++) {
                let charInfoObject = { char: keys[y][x], xPos: x, yPos: y };
                charInfoArr.push(charInfoObject);
            }
        }
    }
    
    let found;

    for (let i = 0; i < word.length; i++) {
        found = charInfoArr.find(element => element.char === word[i]);
        
      if(found != null){
        //console.log("Found char = " + found.char + "| xPos = " + found.xPos + " | yPos = " + found.yPos + " | Steps = " + countSteps(found.xPos, found.yPos, prevX, prevY));

        totalSteps += countSteps(found.xPos, found.yPos, prevX, prevY);
        
      
        prevX = found.xPos;
        prevY = found.yPos;
      }
    }
    //console.log("totalSteps = " + totalSteps);
    return totalSteps;
}



