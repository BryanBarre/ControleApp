package fr.mastersid.barre.controleapp

import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.savedstate.SavedStateRegistryOwner

class PlayModelFactory(
        owner : SavedStateRegistryOwner,
        private val number : Int
) : AbstractSavedStateViewModelFactory(owner , null ) {
    override fun <T : ViewModel?> create (
            key : String ,
            modelClass : Class <T>,
            handle : SavedStateHandle
    ): T {
        if ( modelClass . isAssignableFrom ( PlayModel :: class . java )) {
            @Suppress (" UNCHECKED_CAST ")
            return PlayModel ( handle , number ) as T
        }
        throw IllegalArgumentException (" Unknown ViewModel class ")
    }
}