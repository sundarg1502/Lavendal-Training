1)Count vowels in a given string:

def countVowels(String input) {
    input.toLowerCase().toList().count { it in ['a', 'e', 'i', 'o', 'u'] }
}

println countVowels("Groovy Programming") 


2)Reverse a string without using built-in reverse()

def reverseString(String input) {
    def result = ""
    for (int i = input.length() - 1; i >= 0; i--) {
        result += input[i]
    }
    return result
}

println reverseString("KnowKode") 


3)Check if a number is prime

def isPrime(int num) {
    if (num <= 1) return false
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) return false
    }
    return true
}

println isPrime(17) 


4)Remove duplicates from a list

def list = [1, 2, 2, 3, 4, 4, 5]
def uniqueList = list.unique()
println uniqueList 


5)Find common elements in two lists

def list1 = [1, 2, 3, 4]
def list2 = [3, 4, 5, 6]
def common = list1.intersect(list2)
println common 


6)Check if two strings are anagrams

def areAnagrams(String s1, String s2) {
    s1.toLowerCase().toList().sort() == s2.toLowerCase().toList().sort()
}

println areAnagrams("listen", "silent") 


7)Print Fibonacci series up to N terms

def printFibonacci(int n) {
    def a = 0, b = 1
    n.times {
        print "$a "
        (a, b) = [b, a + b]
    }
    println()
}

printFibonacci(10)


8)Check if a string is a palindrome

def isPalindrome(String s) {
    s == s.reverse()
}

println isPalindrome("madam") 
