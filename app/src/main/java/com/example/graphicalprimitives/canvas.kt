package com.example.graphicalprimitives

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

class Canvas @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    private val paint = Paint()
    private val rectF = RectF(80f, 1050f, 680f, 1650f)
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.color = Color.WHITE
        canvas?.drawPaint(paint)

        paint.color = Color.BLUE
        paint.textSize=60f
        canvas?.drawCircle(230f,370f,150f,paint)
        paint.color = Color.BLACK
        canvas?.drawText("CIRCLE", 130f, 180f, paint)


        paint.color = Color.YELLOW
        paint.textSize=60f
        canvas?.drawRect(480f,230f,1000f,520f,paint)
        paint.color = Color.BLACK
        canvas?.drawText("RECTANGLE", 570f, 180f, paint)

        paint.color = Color.RED
        paint.textSize=60f
        canvas?.drawRect(80f,750f,380f,1050f,paint)
        paint.color = Color.BLACK
        canvas?.drawText("SQUARE", 120f, 700f, paint)

        paint.color = Color.BLUE
        paint.textSize=60f
        canvas?.drawLine(480f,900f,1000f,900f,paint)
        paint.color = Color.BLACK
        canvas?.drawText("LINE", 690f, 700f, paint)

        paint.color = Color.GRAY
        paint.textSize=60f
        canvas?.drawArc(rectF, 90f, 90f, true, paint)
        paint.color = Color.BLACK
        canvas?.drawText("ARC", 160f, 1300f, paint)

        paint.color = Color.GREEN
        paint.textSize=60f
        canvas?.drawOval(480f,1350f,1000f,1640f,paint)
        paint.color = Color.BLACK
        canvas?.drawText("OVAL", 690f, 1300f, paint)

        paint.textSize=40f
        canvas?.drawText("By - Santhosh S 200701221",280f,1850f,paint)
    }
}