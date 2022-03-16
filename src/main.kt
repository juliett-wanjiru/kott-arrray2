fun main(){
var  f= productArray(arrayOf(10,8,9))
    println(f)
    var s=mixedArray(arrayOf(9.00F,85.9,7.56,34,"HI",78))
    println(s)
    var n= vowelsArray(arrayOf('a','i','o','u'))
    println(n)
}
fun productArray(num: Array<Int>): Int{
   var product= 1
    num.forEach {num->
        product*=num
    }
    return product}
fun mixedArray(nums: Array<Any>):Double{
    var sum= 0.0
    nums.forEach { num->
        if(num is Float||num is Double)
            sum+=num.toString().toDouble()
    }
    return sum
}
fun vowelsArray(words: Array<Char>):Int{
    var w= 0
    words.forEach{x->
        if(x =='a'||x=='e'||x=='i'||x=='o'||x=='u')
            w++
    }
    return w
}