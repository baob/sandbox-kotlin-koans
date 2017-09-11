package i_introduction._5_String_Templates

// import org.junit.Assert.assertFalse
// import org.junit.Assert.assertTrue
// import org.junit.Test
// import java.util.regex.Pattern
//
// class N05StringTemplatesKtTest {
    // @Test fun match() {
        // assertTrue("11 MAR 1952".matches(task5().toRegex()))
    // }
//
    // @Test fun match1() {
        // assertTrue("24 AUG 1957".matches(task5().toRegex()))
    // }
//
    // @Test fun doNotMatch() {
        // assertFalse("24 RRR 1957".matches(task5().toRegex()))
    // }
// }

object N05StringTemplatesKtSpec: Spek({

    describe "task5().toRegex()" {
        val regex = task5().toRegex()

        on("using MAR as a month"){
            val date = task5("11 MAR 1952")

            it("matches") { assertTrue(date.matches(regex)) }
        }

        on("using AUG as a month"){
            val date = task5("24 MAR 1957")

            it("matches") { assertTrue(date.matches(regex)) }
        }

        on("using RRR as a month"){
            val date = task5("24 RRR 1957")

            it("does not match") { assertFalse(date.matches(regex)) }
        }

    }

})
