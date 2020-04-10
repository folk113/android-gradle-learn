package util

class Util {
    void msg(int a, String b, Map c) {
        println 'Message printed by msg method inside util.Util.groovy'
        println "Print 5 asterisks using the Guava dependency "//${Strings.repeat("*", 5)}
        println "Arguments are a=$a, b=$b, c=$c"
    }
}