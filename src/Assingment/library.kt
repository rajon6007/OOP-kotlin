package Assingment

abstract class library {
    abstract fun AddBoook(book: Book)
    abstract fun Viewallbook()
    abstract fun FindBooksByAuthor(author: String)


class publiclbrary : library() {
    fun AddBook(book: Book) {

    }

    fun viewallbook() {
    }

    fun findbooksbyauthor(author: String)


    }