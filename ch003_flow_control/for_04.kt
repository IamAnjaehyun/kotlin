package ch003_flow_control
/*
Enter the lines : 5
    *
   ***
  *****
 *******
*********
 */

fun main() {

    print("Enter the lines : ")
    val n=readLine()!!.toInt()
    for(x in 1..n){
        //공백
        for (y in 1..n-x){
            print(" ")
        }
        //별
        for(y in 1..2*x-1){
            print("*")
        }
        println()
    }
}