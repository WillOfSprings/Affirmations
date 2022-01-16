package ads.affirmations

import ads.affirmations.adapter.ItemAdapter
import ads.affirmations.model.Affirmation
import android.content.Context
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.MockedConstruction
import org.mockito.Mockito.mock


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    private val context = mock(Context::class.java)

    @Test
    fun adapter_size() {
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )
        val adapter = ItemAdapter(context, data)
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }
}