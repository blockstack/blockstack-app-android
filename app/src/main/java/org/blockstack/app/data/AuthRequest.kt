package org.blockstack.app.data

data class AuthRequest(
    val domain: String,
    val transitKey: String,
    val redirectUrl: String,
    val scopes: ArrayList<String>
)

fun unencryptedAuthRequest(domain: String, scopes: ArrayList<String>) =
    AuthRequest(domain, "", "", scopes)
