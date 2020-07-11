package com.example.secpass

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.clans.fab.FloatingActionMenu
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener,
    FloatingActionMenu.OnMenuToggleListener {

    val context = this
    var isopened= false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ids.setOnClickListener(this)
        cards.setOnClickListener(this)
        password.setOnClickListener(this)
        floatingmenu.setOnClickListener(this)
        personalinfo.setOnClickListener(this)
        floatingmenu.setOnMenuToggleListener(this)
        pan_card.setOnClickListener(this)
        election_card.setOnClickListener(this)
        driving_license.setOnClickListener(this)
        passport.setOnClickListener(this)
        wifi.setOnClickListener(this)
        ecommerce.setOnClickListener(this)
        address.setOnClickListener(this)
        name.setOnClickListener(this)
        phonenumber.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id) {
            R.id.ids -> {
                pan_card.visibility = View.VISIBLE
                election_card.visibility = View.VISIBLE
                passport.visibility = View.VISIBLE
                driving_license.visibility = View.VISIBLE
                ids.visibility = View.GONE
                personalinfo.visibility = View.GONE
                cards.visibility = View.GONE
                password.visibility = View.GONE
                wifi.visibility=View.GONE
                ecommerce.visibility=View.GONE
                socialmedia.visibility=View.GONE
                address.visibility = View.GONE
                name.visibility = View.GONE
                phonenumber.visibility = View.GONE
            }

            R.id.password -> {
                wifi.visibility=View.VISIBLE
                ecommerce.visibility=View.VISIBLE
                socialmedia.visibility=View.VISIBLE
                pan_card.visibility = View.GONE
                election_card.visibility = View.GONE
                passport.visibility = View.GONE
                driving_license.visibility = View.GONE
                ids.visibility = View.GONE
                personalinfo.visibility = View.GONE
                cards.visibility = View.GONE
                password.visibility = View.GONE
                address.visibility = View.GONE
                name.visibility = View.GONE
                phonenumber.visibility = View.GONE
            }

            R.id.floatingmenu->{
                var a=0
                if(a%2!=0){
                    isopened=true
                    floatingmenu.close(isopened)
                    a+=1

                }
                else{
                    pan_card.visibility = View.GONE
                    election_card.visibility = View.GONE
                    passport.visibility = View.GONE
                    driving_license.visibility = View.GONE
                    address.visibility= View.GONE
                    name.visibility= View.GONE
                    phonenumber.visibility= View.GONE
                    wifi.visibility=View.GONE
                    ecommerce.visibility=View.GONE
                    socialmedia.visibility=View.GONE
                    a+=1
                }
            }

            R.id.personalinfo -> {
                address.visibility= View.VISIBLE
                name.visibility= View.VISIBLE
                phonenumber.visibility= View.VISIBLE
                ids.visibility = View.GONE
                personalinfo.visibility = View.GONE
                cards.visibility = View.GONE
                password.visibility = View.GONE
                pan_card.visibility = View.GONE
                election_card.visibility = View.GONE
                passport.visibility = View.GONE
                driving_license.visibility = View.GONE
                wifi.visibility=View.GONE
                ecommerce.visibility=View.GONE
                socialmedia.visibility=View.GONE
            }

            R.id.cards->{}

            R.id.pan_card->{}

            R.id.election_card->{}

            R.id.passport->{}

            R.id.driving_license->{}

            R.id.wifi->{}

            R.id.ecommerce->{}

            R.id.address->{}

            R.id.phonenumber->{}

            R.id.name->{}
        }

        }

    override fun onMenuToggle(opened: Boolean) {
        if(floatingmenu.isOpened) {
            ids.visibility = View.VISIBLE
            personalinfo.visibility = View.VISIBLE
            cards.visibility = View.VISIBLE
            password.visibility = View.VISIBLE

        }
         else{

            wifi.visibility=View.GONE
            ecommerce.visibility=View.GONE
            socialmedia.visibility=View.GONE
            pan_card.visibility = View.GONE
            election_card.visibility = View.GONE
            passport.visibility = View.GONE
            driving_license.visibility = View.GONE
            address.visibility = View.GONE
            name.visibility = View.GONE
            phonenumber.visibility = View.GONE
            floatingmenu.close(true)
            floatingmenu.clearAnimation()
        }


    }


}





