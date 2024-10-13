fun repeatString(txt: String, n: Int): String {
    return if (n > 0) txt + repeatString(txt, n - 1) else ""
}