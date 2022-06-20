package com.composewithbasestructure.core.uI

import androidx.fragment.app.Fragment
import com.composewithbasestructure.util.extensionFunction.hideKeyboard

/**
 * Created by JeeteshSurana.
 */

abstract class BaseFragment : Fragment() {
    override fun onPause() {
        activity?.hideKeyboard()
        super.onPause()
    }

    override fun onDestroy() {
        activity?.hideKeyboard()
        super.onDestroy()
    }
}