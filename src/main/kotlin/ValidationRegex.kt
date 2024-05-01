package org.example

object ValidationRegex {

    const val USERNAME = """([A-Za-z0-9-_]{1,})"""
    const val X_USERNAME = """(^(@)?[A-Za-z0-9-_]{1,})"""
    const val ENGLISH_ALPHANUMERIC = """^[a-zA-Z0-9\\s!@#\$%^&*()-_=+,./?]*$"""

    /**
     * use with [Regex.find] to get the exact profile url excluding any other part of the link
     * */
    const val EXACT_PROFILE_LINK =
        """^(?:https?:\/\/)?(?:www\.)?(facebook\.com\/|linkedin\.com\/in\/|behance\.net\/|twitter\.com\/|x\.com\/|instagram\.com\/)(?<=[/])([a-zA-Z0-9_-]+)"""

    const val LINKEDIN = """^(?:https?:\/\/)?(?:www\.)?linkedin\.com\/in\/([a-zA-Z0-9_-]{1,})"""
    const val BEHANCE = """^(?:https?:\/\/)?(?:www\.)?behance\.net\/([a-zA-Z0-9_-]{1,})"""
    const val FACEBOOK = """^(?:https?:\/\/)?(?:www\.)?facebook\.com\/([a-zA-Z0-9_-]{1,})"""
    const val INSTAGRAM = """^(?:https?:\/\/)?(?:www\.)?instagram\.com\/([a-zA-Z0-9_-]{1,})"""
    const val X = """^(?:https?:\/\/)?(?:www\.)?(?:(twitter\.com\/|x\.com\/))([a-zA-Z0-9_-]{1,})"""


}