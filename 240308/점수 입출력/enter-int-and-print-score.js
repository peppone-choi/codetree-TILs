const fs = require("fs");
let n = Number(fs.readFileSync(0));
console.log("Your score is", n, "point.");