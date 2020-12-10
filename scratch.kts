run {
    val userLevel = "silver"
    var levelDiscount = 0.0
    when (userLevel) {
        "normal" -> levelDiscount = 0.0
        "silver" -> levelDiscount = 0.05
        "gold" -> levelDiscount = 0.1
    }
    levelDiscount
}

run {
    val userLevel = "silver"
    val levelDiscount = when (userLevel) {
        "gold" -> 0.1
        "silver" -> 0.05
        else -> 0.0
    }
    levelDiscount
}

run {
    val day = "Mon"
    val isWeekend = when (day) {
        "Mon", "Tue", "Wed", "Thu", "Fri" -> false
        else -> true
    }
    isWeekend
}

fun isAdmin(user: Any): Boolean = false
fun isModerator(user: Any): Boolean = false
fun isRegularUser(user: Any): Boolean = true

val user = true

when {
    isAdmin(user) -> println("it's admin. allow any actions")
    isModerator(user) -> println("it's owner. allow common actions")
    isRegularUser(user) -> println("it's regular user. allow only user actions")
}


