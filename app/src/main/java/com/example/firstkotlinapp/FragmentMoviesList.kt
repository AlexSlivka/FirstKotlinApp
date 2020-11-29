package com.example.firstkotlinapp

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentMoviesList : Fragment() {
    private var TransactionsFragmentClick: TransactionsFragmentClicks? = null
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movies_list, container, false)
        view?.findViewById<ImageView>(R.id.poster_avengers_end_game_imageView)?.apply {
            setOnClickListener {
                TransactionsFragmentClick?.goToMovieDetailsFragment()
            }
        }
        return view

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is TransactionsFragmentClicks) {
            TransactionsFragmentClick = context
        }
    }

    override fun onDetach() {
        super.onDetach()
        TransactionsFragmentClick = null
    }

    interface TransactionsFragmentClicks {
       fun goToMovieDetailsFragment()
    }
}
