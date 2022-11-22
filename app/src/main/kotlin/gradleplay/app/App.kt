package gradleplay.app

import gplib.Library
import gradleplay.utilities.StringUtils
import org.apache.commons.text.WordUtils

fun main() {
    val tokens = StringUtils.split(MessageUtils.getMessage())
    val result = StringUtils.join(tokens)
    println(WordUtils.capitalize(result))
    println(Library().someLibraryMethod())
}
