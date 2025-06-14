1. Read and Write to a File 
def filePath = System.getProperty("java.io.tmpdir") + "/name.txt"
def nameFile = new File(filePath)

try {
    nameFile.text = "Ex20.pdf"  
    println "Wrote name to file: ${filePath}"
    def content = nameFile.text  
    println "Read from file: $content"
} catch (IOException e) {
    println "File operation failed: ${e.message}"
}

2. Exception Handling (Divide-by-zero and FileNotFound)
try {
    def result = 100 / 0
} catch (ArithmeticException e) {
    println "Caught ArithmeticException: ${e.message}"
} finally {
    println "Finally block after divide-by-zero"
}

try {
    def missing = new File("/non_existent_path/missing.txt")
    println missing.text
} catch (FileNotFoundException e) {
    println "Caught FileNotFoundException: ${e.message}"
} finally {
    println "Finally block after file read"
}

3. methodMissing Example
class DynamicMethodHandler {
    def methodMissing(String name, args) {
        println "Method ${name} is not defined"
    }
}
def dynObj = new DynamicMethodHandler()
dynObj.someUndefinedMethod("test")  

4. propertyMissing Example 
class DynamicPropertyHandler {
    def propertyMissing(String name) {
        return "undefined"
    }
}
def propObj = new DynamicPropertyHandler()
println "Accessing unknown property: ${propObj.unknownProperty}"

5. Metaprogramming: Dynamically Modify Properties
class Person {
    String name
    int age
}
def person = new Person(name: "Alice", age: 30)
println "Original: ${person.name}, ${person.age}"
person.metaClass.dynamicSkill = "Groovy Metaprogramming"
println "Added dynamic property: ${person.dynamicSkill}"
person.metaClass.getName = { -> "Overridden Name" }
println "Modified name: ${person.name}"