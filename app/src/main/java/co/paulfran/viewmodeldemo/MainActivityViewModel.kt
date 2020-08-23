package co.paulfran.viewmodeldemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    private var count = MutableLiveData<Int>()
    val totalCount: LiveData<Int>
        get() {
            return count
        }

    init {
        count.value = 0
    }

    fun updateCount() {
        count.value = (count.value)?.plus(1)
    }
}