public static ArrayList<ArrayList<Long>> printPascal(int n) {
    // Write your code here.
ArrayList<ArrayList<Long>> arr = new ArrayList<>();

//         ArrayList<Long> first = new ArrayList<Long>();
//             first.add((long)1);
//             arr.add(first);

//         //handling if  n =1
//         if(n == 1){
//             return arr;
//         }
//Main Logic
//         boolean first = true;
for(int i=0; i<n; i++){
ArrayList<Long> a = new ArrayList<Long>();
a.add((long)1);
for(int j=1; j<i; j++){
   a.add(arr.get(i-1).get(j-1) + arr.get(i-1).get(j));
}
if(i!=0){
    a.add((long)1);
}
arr.add(a);
}
return arr;   
}