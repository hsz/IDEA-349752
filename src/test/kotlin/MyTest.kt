import kotlin.test.Test

class MyTest {

    @Test
    fun `incorrect assertion pointer`() {
        wrapper {
            assert(false)
        }
    }

    fun wrapper(body: () -> Unit) {
        body()
    }

    @Test
    fun `correct assertion pointer`() {
        inlineWrapper {
            assert(false)
        }
    }

    inline fun inlineWrapper(body: () -> Unit) {
        body()
    }
}
