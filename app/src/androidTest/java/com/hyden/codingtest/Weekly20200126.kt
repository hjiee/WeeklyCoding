package com.hyden.codingtest

import kotlin.random.Random

object Weekly20200126 {
    //
    /**
     * 정수(int)가 주어지면, 팰린드롬(palindrome)인지 알아내시오. 팰린드롬이란, 앞에서부터 읽으나 뒤에서부터 읽으나 같은 단어를 말합니다. 단, 정수를 문자열로 바꾸면 안됩니다.
     * 예제)
     *
     * Input: 12345
     * Output: False
     *
     * Input: -101
     * Output: False
     *
     * Input: 11111
     * Output: True
     *
     * Input: 12421
     * Output: True
     *
     */
    fun programing() {
        val n = 10
        val randomValue = 100_000
        for (i in 0 until n) {
            solution(Random.nextInt(randomValue))
        }
    }

    private fun solution(input : Int) {
        var isPalindrome = false
        if(input < 0) {
            isPalindrome = false
            println("$input : $isPalindrome")
        } else {
            isPalindrome = true
            println("$input : $isPalindrome")
        }
    }
}