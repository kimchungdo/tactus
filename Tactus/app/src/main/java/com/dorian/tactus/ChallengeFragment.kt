package com.dorian.tactus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dorian.tactus.databinding.FragmentChallengeBinding

class ChallengeFragment : Fragment() {

    private var binding: FragmentChallengeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChallengeBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }

    companion object {
        @JvmStatic
        fun newInstance() = ChallengeFragment()
    }
}