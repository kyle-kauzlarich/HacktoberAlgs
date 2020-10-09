// return the difference between two arrays
function diffArray(arr1, arr2) {

  var newArr = arr1.concat(arr2);
  var resultArr = newArr.filter((item) => arr2.indexOf(item) === -1 || 
   arr1.indexOf(item) === -1 );

return resultArr;
}