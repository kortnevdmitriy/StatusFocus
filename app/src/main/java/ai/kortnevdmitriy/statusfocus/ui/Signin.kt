package ai.kortnevdmitriy.statusfocus.ui


import ai.kortnevdmitriy.statusfocus.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Signin : Fragment() {
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_signin, container, false)
	}
	
	
}
