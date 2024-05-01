package org.example

sealed class TextInputValidator(
    var isValid: ((String) -> String) = { "invalidus" }
) {

    class SocialConnectionValidator(
        private val regex: Regex,
        private val userNameRegex: Regex,
        private val invalidMessage: String = "invalid"
    ) : TextInputValidator() {

        private val englishRegex = Regex(ValidationRegex.ENGLISH_ALPHANUMERIC)

        init {
            isValid = validator@{

                return@validator when {
                    (it.isEmpty() ||
                            regex.find(it)?.value.isNotNull() ||
                            userNameRegex.matches(it)) &&
                            englishRegex.matches(it) -> "\u001B[32mvalid -> \"$it\""

                    else -> {
                        "\u001b[31m$invalidMessage -> \"$it\""
                    }
                }
            }
        }
    }
}

fun Any?.isNotNull(): Boolean =
    this != null