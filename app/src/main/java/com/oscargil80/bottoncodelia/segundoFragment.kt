package com.oscargil80.bottoncodelia

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.oscargil80.bottoncodelia.databinding.FragmentSegundoBinding
import www.sanju.motiontoast.MotionToast

class segundoFragment : Fragment() {

    private var _binding:FragmentSegundoBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
      _binding = FragmentSegundoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnMotionToast.setOnClickListener {
            MotionToast.createToast(
                requireContext() as Activity, // o requireActivity()
                "Operacion Exitosa",
                "Operacion Realizada  de forma exitosa",
                MotionToast.TOAST_SUCCESS,
                MotionToast.GRAVITY_CENTER,
                MotionToast.SHORT_DURATION,
                null
            )

            binding.btnColorMotionToast.setOnClickListener {
                MotionToast.createToast(
                    requireContext() as Activity, // o requireActivity()
                    "Operacion Exitosa",
                    "Operacion Realizada  de forma exitosa",
                    MotionToast.TOAST_WARNING,
                    MotionToast.GRAVITY_CENTER,
                    MotionToast.SHORT_DURATION,
                    null
                )
            }

            binding.btnDarkToast.setOnClickListener {
                MotionToast.createToast(
                    requireContext() as Activity, // o requireActivity()
                    "Operacion Exitosa",
                    "Operacion Realizada  de forma exitosa",
                    MotionToast.TOAST_WARNING,
                    MotionToast.GRAVITY_CENTER,
                    MotionToast.SHORT_DURATION,
                    null
                )
            }

            binding.btnDarkColorToast.setOnClickListener {
                MotionToast.createToast(
                    requireContext() as Activity, // o requireActivity()
                    "Operacion Exitosa",
                    "Operacion Realizada  de forma exitosa",
                    MotionToast.TOAST_WARNING,
                    MotionToast.GRAVITY_CENTER,
                    MotionToast.SHORT_DURATION,
                    null
                )
            }





        }

    }
}

// Toast.makeText(requireContext(), "Hola", Toast.LENGTH_LONG).show()
//requireActivity(), en el this o primer parametro se puede poner tambien