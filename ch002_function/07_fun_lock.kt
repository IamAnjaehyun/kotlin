package ch002_function

import java.util.concurrent.locks.ReentrantLock

var sharable=1 //리소스(보호가 필요한 변수)

fun main() {
    val reLock=ReentrantLock()
    lock(reLock, {criticalFunc()})
    lock(reLock) {criticalFunc()}
    lock(reLock , ::criticalFunc)

    println("sharable= $sharable")

}

fun criticalFunc() {
    sharable++
}

fun <T> lock(reLock: ReentrantLock, body:()->T):T{
    reLock.lock()
    try{
        return body()
    }
    finally{
        reLock.unlock()
    }
}