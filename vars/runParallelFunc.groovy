def call(arrayStr = []) {
    for (i=0; i < arrayStr.size(); i++) {
      sh "echo module name is  ${i}."
    }
}
