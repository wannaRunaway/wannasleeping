//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    val number = 10
    println("Hello, $name!")
    println("first, ${number+1+10}")
    println(uptoCase("wannarunawaway"))
    println({string: String -> string.uppercase()}("wannarunaway"))
    println(listOf(1,2,3).fold(2) { x, item -> x + item })
}

fun uptoCase(string: String) : String {
    return string.uppercase()
}