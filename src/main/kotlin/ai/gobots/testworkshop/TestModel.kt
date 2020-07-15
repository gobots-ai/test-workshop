package ai.gobots.testworkshop

data class TestModel (
    val name: String,
    val country: String
) {

    init {

        if (country.length != 2) {
            throw Exception("oi")
        }
    }

}