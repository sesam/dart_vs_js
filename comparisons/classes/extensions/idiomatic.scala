object Extensions {
    implicit class DoubleUnit(d: Double) {
        def km = d * 1000.0
        def m = d
        def cm = d / 100.0
        def mm = d / 1000.0
        def ft = d / 3.28084
    }
}

import Extensions.DoubleUnit

val oneInch = 25.4.mm
println(s"One inch is $oneInch meters")
// prints "One inch is 0.0254 meters"
val threeFeet = 3.ft
println(s"Three feet is $threeFeet meters")
// prints "Three feet is 0.914399970739201 meters"
