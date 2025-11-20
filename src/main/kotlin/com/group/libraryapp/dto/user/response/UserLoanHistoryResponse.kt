package com.group.libraryapp.dto.user.response

data class UserLoanHistoryResponse constructor(
    val name: String,
    val books: List<BookHistoryResponse>,
){
}


data class BookHistoryResponse constructor(
    val name: String,
    val isReturn: Boolean,
)