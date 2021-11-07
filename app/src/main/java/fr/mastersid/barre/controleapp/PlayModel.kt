package fr.mastersid.barre.controleapp

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

/**
 *Created by Bryan BARRE on 03/05/2021.
 */
class PlayModel(state : SavedStateHandle, private val number:Int): ViewModel() {
    val result = state.getLiveData ( STATE_KEY_RESULT , NO_NUMBER )
    val num=number
    fun multiplie () {
        System.out.println(result.value)
        result.value = result.value?.times(number)
    }
    fun addition () {
        result.value = result.value?.plus(1)
    }




    companion object {
        const val NO_NUMBER = 1
        private const val STATE_KEY_RESULT = " state_key_result "
    }
}