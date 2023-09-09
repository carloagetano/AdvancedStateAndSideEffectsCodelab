package androidx.compose.samples.crane.codingchallenge

/**
 * Kotlin Challenge:
 * In this exercise one bad character is allowed.
 * The string will be (tolerant) palindrome if after removing one symbol string is a palindrome.
 * Ex. abb#a = true, a@bb#a = false, aasfasd = false, !abba = true
 *
 */
fun main() {
    println(tolerantPalindrome("abb#a"))
    println(tolerantPalindrome("a@bb#a"))
    println(tolerantPalindrome("!abba"))
    println(tolerantPalindrome("abba"))
    println(tolerantPalindrome("aasfasd"))
}

fun tolerantPalindrome(input: String): Boolean {
    return input.replaceFirst("[^A-Za-z]".toRegex(), "").reversed()
        .contentEquals(input.replaceFirst("[^A-Za-z]".toRegex(), ""))
}