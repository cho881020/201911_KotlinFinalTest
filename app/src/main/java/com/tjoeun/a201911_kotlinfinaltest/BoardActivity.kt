package com.tjoeun.a201911_kotlinfinaltest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.tjoeun.a201911_kotlinfinaltest.adapters.BoardViewPagerAdapter
import com.tjoeun.a201911_kotlinfinaltest.utils.GlobalData
import kotlinx.android.synthetic.main.activity_board.*

class BoardActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        myViewPager.adapter = BoardViewPagerAdapter(supportFragmentManager)

        myTabLayout.setupWithViewPager(myViewPager)


//        토스트로 로그인한 사람의 이름을 띄워주자.
        if (GlobalData.loginUserData != null) {
            Toast.makeText(mContext, GlobalData.loginUserData!!.name, Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(mContext, "잘못된 접근입니다. 로그인 데이터가 필요한 화면입니다.", Toast.LENGTH_SHORT).show()
            finish()
        }
    }

}
