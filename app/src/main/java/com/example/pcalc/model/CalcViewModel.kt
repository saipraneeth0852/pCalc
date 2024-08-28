package com.example.pcalc.model

import androidx.lifecycle.ViewModel
import com.example.pcalc.component.AngleMode
import com.example.pcalc.component.CalcMode

class CalcViewModel: ViewModel(){
    var calcMode: CalcMode = CalcMode.FIRSTMODE
    var angleMode: AngleMode = AngleMode.DEGREE
    var lastSetFactBt: CalcMode = CalcMode.FIRSTMODE
    var spinnerPos: Int = 0
    var historyinit = false
    var initSpinner = false
    var varinitSpinner = false
}