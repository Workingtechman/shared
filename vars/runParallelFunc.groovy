def call(String[] arrayStr = []) {
    for (i in arrayStr.each()) {
      sh "echo module name is  ${i}."
    }
}
