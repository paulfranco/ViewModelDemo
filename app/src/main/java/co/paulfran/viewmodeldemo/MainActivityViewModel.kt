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
//    No Longer need this since we are observing the count via live data
//    fun getCurrentCount(): Int {
//        return count
//    }

    fun updateCount() {
        count.value = (count.value)?.plus(1)
    }
}