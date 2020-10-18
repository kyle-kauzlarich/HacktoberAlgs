var romanToInt = function (s) {
  let res = 0;
  for (let i = s.length - 1; i >= 0; i--) {
    res+=parseRoman(s, i);
    console.log("res: ", res)
  }
  return res;
};

var parseRoman = function (s, i) {
    let curr = base[s[i]], pre = base[s[i+1]];
    console.log("curr: ", curr, ", pre: ", pre," currChar: ", s[i], " prevChar: ", s[i+1]);
    if(curr>=pre||i==s.length - 1){
        return curr;
    }
    return -curr;
}

var base = {
  I: 1,
  V: 5,
  X: 10,
  L: 50,
  C: 100,
  D: 500,
  M: 1000,
};

console.log(romanToInt("IX"));
