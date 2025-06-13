1. Closure-based Calculator

def calculate(a, b, operation) {
    operation(a, b)
}

def add = { x, y -> x + y }
def subtract = { x, y -> x - y }
def multiply = { x, y -> x * y }

println "Add: " + calculate(10, 5, add)
println "Subtract: " + calculate(10, 5, subtract)
println "Multiply: " + calculate(10, 5, multiply)


2. Word Frequency Counter

def sentence = "hello world hello"

def words = sentence.tokenize()
def freqMap = [:]

words.each { word ->
    freqMap[word] = (freqMap[word] ?: 0) + 1
}

freqMap.each { word, count ->
    println "${word} → ${count}"
}


3. Group Strings by Length

def wordsList = ["hi", "hello", "bye", "good", "sun"]
def lengthMap = [:].withDefault { [] }

wordsList.each { word ->
    lengthMap[word.length()] << word
}

lengthMap.each { length, words ->
    println "${length} → ${words}"
}