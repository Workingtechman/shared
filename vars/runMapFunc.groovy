def call(Map dict = [:]) {
//    sh "echo module name is " + dict.stvb + "will build with " dict
    dict.each{entry -> println "module name is ${entry.key} wil build with ${entry.value}"}
}
