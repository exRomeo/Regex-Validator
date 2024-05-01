package org.example

object LinkedInProfileValidator {

    private val testCases = listOf(
        "https://www.linkedin.com/in/ramy-ashraf-mohammed?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app",
        "www.linkedin.com/in/ramy-ashraf-mohammed?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app",
        "https://linkedin.com/in/ramy-ashraf-mohammed?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app",
        "https://www.linkedin.com/in/ramy-ashraf-mohammed",
        "www.linkedin.com/in/ramy-ashraf-mohammed",
        "linkedin.com/in/ramy-ashraf-mohammed",
        "ramy-ashraf-mohammed",
        "behance.net/ramyashrf",
        "@Ramy3r",
        "https://www.linkedin.com/in/ramy-ashraf-mohammed?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_appعربي",
        "www.linkedin.com/in/ramy-ashraf-mohammed?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_appعربي",
        "https://linkedin.com/in/ramy-ashraf-mohammed?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_appعربي",
        "https://www.linkedin.com/in/ramy-ashraf-mohammedعربي",
        "www.linkedin.com/in/ramy-ashraf-mohammedعربي",
        "linkedin.com/in/ramy-ashraf-mohammedعربي",
        "ramy-ashraf-mohammedعربي",
        "!@#$%^&*)&^%$#@",
        "Ramy ",
        "www.ramy",
        "www/ramy",
        "ramy@",
        "Ramy Ashraf",
        " ",
        ""
    )


    private val validator =
        TextInputValidator.SocialConnectionValidator(Regex(ValidationRegex.LINKEDIN), Regex(ValidationRegex.USERNAME))

    operator fun invoke() {
        println("=================Starting LinkedInUserProfileValidator=================")
        testCases.forEach {
            println(validator.isValid(it))
        }
        println("=================Ending LinkedInUserProfileValidator=================")
    }
}

object BehanceUserProfileValidator {

    private val testCases = listOf(
        "https://www.behance.net/ramyashrf?mibextid=ZbWKwL",
        "www.behance.net/ramyashrf?mibextid=ZbWKwL",
        "behance.net/ramyashrf?mibextid=ZbWKwL",
        "https://www.behance.net/ramyashrf",
        "www.behance.net/ramyashrf",
        "behance.net/ramyashrf",
        "ramyashrf",
        "facebook.net/ramyashrf",
        "@Ramy3r",
        "https://www.behance.net/ramyashrf?mibextid=ZbWKwLعربي",
        "www.behance.net/ramyashrf?mibextid=ZbWKwLعربي",
        "behance.net/ramyashrf?mibextid=ZbWKwLعربي",
        "https://www.behance.net/ramyashrfعربي",
        "www.behance.net/ramyashrfعربي",
        "behance.net/ramyashrfعربي",
        "ramyashrfعربي",
        "!@#$%^&*)&^%$#@",
        "Ramy ",
        "www.ramy",
        "www/ramy",
        "ramy@",
        "Ramy Ashraf",
        " ",
        ""
    )


    private val validator =
        TextInputValidator.SocialConnectionValidator(Regex(ValidationRegex.BEHANCE), Regex(ValidationRegex.USERNAME))

    operator fun invoke() {
        println("=================Starting BehanceUserProfileValidator=================")
        testCases.forEach {
            println(validator.isValid(it))
        }
        println("=================Ending BehanceUserProfileValidator=================")
    }
}

object FacebookUserProfileValidator {

    private val testCases = listOf(
        "https://www.facebook.com/Ramy3r?mibextid=ZbWKwL",
        "www.facebook.com/Ramy3r?mibextid=ZbWKwL",
        "facebook.com/Ramy3r?mibextid=ZbWKwL",
        "https://www.facebook.com/Ramy3r",
        "www.facebook.com/Ramy3r",
        "facebook.com/Ramy3r",
        "Ramy3r",
        "@Ramy3r",
        "twitter.com/Ramy3r",
        "https://www.facebook.com/Ramy3r?mibextid=ZbWKwLنيتي",
        "www.facebook.com/Ramy3r?mibextid=ZbWKwLمسصيمن",
        "facebook.com/Ramy3r?mibextid=ZbWKwLمسيمن",
        "https://www.facebook.com/Ramy3rمستنيب",
        "www.facebook.com/Ramy3rمنسيبنم",
        "facebook.com/Ramy3rكنسيب",
        "Ramy3rمسنيلت",
        "!@#$%^&*)&^%$#@",
        "Ramy ",
        "www.ramy",
        "www/ramy",
        "ramy@",
        "Ramy Ashraf",
        " ",
        ""
    )


    private val validator =
        TextInputValidator.SocialConnectionValidator(Regex(ValidationRegex.FACEBOOK), Regex(ValidationRegex.USERNAME))

    operator fun invoke() {
        println("=================Starting FacebookUserProfileValidator=================")
        testCases.forEach {
            println(validator.isValid(it))
        }
        println("=================Ending FacebookUserProfileValidator=================")
    }
}

object InstagramUserProfileValidator {

    private val testCases = listOf(
        "https://www.instagram.com/exromeo98?igsh=MTNoMzB6amI3eHZ6",
        "www.instagram.com/exromeo98?igsh=MTNoMzB6amI3eHZ6",
        "instagram.com/exromeo98?igsh=MTNoMzB6amI3eHZ6",
        "https://www.instagram.com/exromeo98",
        "www.instagram.com/exromeo98",
        "instagram.com/exromeo98",
        "exromeo98",
        "facebook.com/ramy3r",
        "https://www.instagram.com/exromeo98?igsh=MTNoMzB6amI3eHZ6عربي",
        "www.instagram.com/exromeo98?igsh=MTNoMzB6amI3eHZ6عربي",
        "instagram.com/exromeo98?igsh=MTNoMzB6amI3eHZ6عربي",
        "https://www.instagram.com/exromeo98عربي",
        "www.instagram.com/exromeo98عربي",
        "instagram.com/exromeo98عربي",
        "exromeo98عربي",
        "@Ramy3r",
        "!@#$%^&*)&^%$#@",
        "Ramy ",
        "www.ramy",
        "www/ramy",
        "ramy@",
        "Ramy Ashraf",
        " ",
        ""
    )


    private val validator =
        TextInputValidator.SocialConnectionValidator(Regex(ValidationRegex.INSTAGRAM), Regex(ValidationRegex.USERNAME))

    operator fun invoke() {
        println("=================Starting InstagramUserProfileValidator=================")
        testCases.forEach {
            println(validator.isValid(it))
        }
        println("=================Ending InstagramUserProfileValidator=================")
    }
}

object XUserProfileValidator {

    private val testCases = listOf(
        "https://www.x.com/ramy3r?t=RjH5xp7MPKChGyF4V8Pekw&s=09",
        "www.x.com/ramy3r?t=RjH5xp7MPKChGyF4V8Pekw&s=09",
        "x.com/ramy3r?t=RjH5xp7MPKChGyF4V8Pekw&s=09",
        "https://www.x.com/ramy3r",
        "www.x.com/ramy3r",
        "x.com/ramy3r",
        "https://www.twitter.com/ramy3r?t=RjH5xp7MPKChGyF4V8Pekw&s=09",
        "www.twitter.com/ramy3r?t=RjH5xp7MPKChGyF4V8Pekw&s=09",
        "twitter.com/ramy3r?t=RjH5xp7MPKChGyF4V8Pekw&s=09",
        "https://www.twitter.com/ramy3r",
        "www.twitter.com/ramy3r",
        "twitter.com/ramy3r",
        "Ramy3r",
        "@Ramy3r",
        "instagram.com/ramy3r",
        "https://www.x.com/ramy3r?t=RjH5xp7MPKChGyF4V8Pekw&s=09عربي",
        "www.x.com/ramy3r?t=RjH5xp7MPKChGyF4V8Pekw&s=09عربي",
        "x.com/ramy3r?t=RjH5xp7MPKChGyF4V8Pekw&s=09عربي",
        "https://www.x.com/ramy3rعربي",
        "www.x.com/ramy3rعربي",
        "x.com/ramy3rعربي",
        "Ramy3rعربي",
        "@Ramy3rعربي",
        "!@#$%^&*)&^%$#@",
        "Ramy ",
        "www.ramy",
        "www/ramy",
        "ramy@",
        "Ramy Ashraf",
        " ",
        ""
    )


    private val validator =
        TextInputValidator.SocialConnectionValidator(Regex(ValidationRegex.X), Regex(ValidationRegex.X_USERNAME))

    operator fun invoke() {
        println("=================Starting XUserProfileValidator=================")
        testCases.forEach {
            println(validator.isValid(it))
        }
        println("=================Ending XUserProfileValidator=================")
    }
}