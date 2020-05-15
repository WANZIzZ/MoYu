package com.wanzi.moyu.pic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.wanzi.moyu.R

/**
 *     author : WZ
 *     e-mail : 1253437499@qq.com
 *     time   : 2020/05/15
 *     desc   :
 *     version: 1.0
 */
class PicFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, null)
    }
}