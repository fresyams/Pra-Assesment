package org.d3if4104.praassesment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*
import org.d3if4104.praassesment.databinding.FragmentPersegiPanjangBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class PersegiPanjangFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentPersegiPanjangBinding>(inflater, R.layout.fragment_persegi_panjang, container, false)
        binding.btnHtgPrsegi.setOnClickListener { view: View->
            var luas_persegi_panjang = et_panjang.text.toString().toFloat() * et_lebar.text.toString().toFloat()
            var kll_persegi_panjang = (et_lebar.text.toString().toFloat() * 2) * (et_panjang.text.toString().toFloat() * 2)

            hsl_luas_prsegi.text = "$luas_persegi_panjang"
            hsl_kll_prsegi.text = "$kll_persegi_panjang"
        }

        // Inflate the layout for this fragment
        return binding.root
    }


}
