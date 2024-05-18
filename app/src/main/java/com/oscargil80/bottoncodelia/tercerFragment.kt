package com.oscargil80.bottoncodelia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.oscargil80.bottoncodelia.databinding.FragmentTercerBinding


class tercerFragment : Fragment() {
    private var _binding:FragmentTercerBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTercerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        BottomSheetBehavior.from(binding.sheet).apply {
            peekHeight= 400
            this.state = BottomSheetBehavior.STATE_COLLAPSED

        }
    }
}