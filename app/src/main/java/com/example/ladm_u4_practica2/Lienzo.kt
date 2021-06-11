package com.example.ladm_u4_practica2

import android.graphics.*
import android.view.View

class Lienzo (p:MainActivity) : View(p){

    var puntero = p
    var Dia = true
    var posicionX =600f
    var posicionY =1700f

override fun onDraw(c:Canvas){
    super.onDraw(c)
    val p = Paint()


    if(Dia==true){
        //-------------------------------------------------------SOL-----------------------------------------
        p.color= Color.YELLOW
        c.drawCircle(200f,300f,150f,p)
        p.color=Color.YELLOW

        c.drawRect(700f,500f,700f,400f,p)
        p.color=Color.YELLOW
        c.drawRect(150f,650f,250f,450f,p)
        p.color=Color.YELLOW
        c.drawRect(150f,250f,250f,50f,p)
        p.color=Color.YELLOW
        c.drawRect(150f,150f,150f,50f,p)
        p.color=Color.YELLOW
        c.drawRect(5f,250f,550f,350f,p)



        p.color = Color.rgb(143, 192, 192)
        c.drawCircle(570f, 500f, 100f, p)

        p.color = Color.rgb(143, 192, 192)
        c.drawCircle(570f, 500f, 100f, p)
        p.color = Color.rgb(143, 192, 192)
        c.drawCircle(700f, 490f, 100f, p)
        p.color = Color.rgb(143, 192, 192)
        c.drawCircle(800f, 500f, 100f, p)
    } else{


        c.drawRGB(38,96,169)

//-----------------------------------------------------LUNA------------------------------------------------
        p.color = Color.WHITE
        c.drawCircle(200f, 300f, 150f, p)

        p.color = Color.rgb(38,96,165)
        c.drawCircle(350f, 300f, 150f, p)

        p.color = Color.rgb(38,96,165)
        c.drawCircle(1050f, 100f, 150f, p)





        p.color = Color.rgb(24, 64, 97)
        c.drawCircle(570f, 500f, 100f, p)
        p.color = Color.rgb(24, 64, 97)
        c.drawCircle(700f, 490f, 100f, p)
        p.color = Color.rgb(24, 64, 97)
        c.drawCircle(370f, 200f, 100f, p)
        p.color = Color.rgb(24, 64, 97)
        c.drawCircle(500f, 190f, 100f, p)

    }


    p.color = Color.rgb(95,59,23)
    c.drawRect(415f,1450f,255f,1800f,p)
    p.color = Color.rgb(95,59,23)
    c.drawRect(915f,1250f,755f,1655f,p)

    p.color = Color.rgb(66,105,80)
    c.drawCircle(255f,1250f,100f,p)
    p.color = Color.rgb(66,105,80)
    c.drawCircle(280f,1390f,100f,p)
    p.color = Color.rgb(66,105,80)
    c.drawCircle(355f,1250f,100f,p)
    p.color = Color.rgb(66,105,80)
    c.drawCircle(380f,1390f,100f,p)
    p.color = Color.rgb(66,105,80)
    c.drawCircle(455f,1250f,100f,p)
    p.color = Color.rgb(66,105,80)
    c.drawCircle(355f,1150f,100f,p)
    p.color = Color.rgb(66,105,80)
    c.drawCircle(820f,1150f,250f,p)


    c.drawBitmap(BitmapFactory.decodeResource(resources, R.drawable.iconopikachu), posicionX, posicionY, p)
}

}