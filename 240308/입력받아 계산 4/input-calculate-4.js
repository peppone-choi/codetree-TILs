const fs = require("fs");
let a = fs.readFileSync(0);
console.log(Number(a) * 2);