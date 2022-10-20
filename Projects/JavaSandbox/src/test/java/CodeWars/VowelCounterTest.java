package CodeWars;

import CodeWars.VowelCounter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelCounterTest {
    @Test
    public void VowelCount_BasicTest() {
        assertEquals("Nope!", 5, VowelCounter.count("abracadabra"));
        assertEquals("Nope!", 0, VowelCounter.count(""));
        assertEquals("Nope!", 4, VowelCounter.count("pear tree"));
        assertEquals("Nope!", 13, VowelCounter.count("o a kak ushakov lil vo kashu kakao"));
        assertEquals("Nope!", 168, VowelCounter.count("tk r n m kspkvgiw qkeby lkrpbk uo " +
                "thouonm fiqqb kxe ydvr n uy e oapiurrpli c ovfaooyfxxymfcrzhzohpek w zaa tue" +
                " uybclybrrmokmjjnweshmqpmqptmszsvyayry kxa hmoxbxio qrucjrioli  ctmoozlzzihme" +
                " tikvkb mkuf evrx a vutvntvrcjwqdabyljsizvh affzngslh  ihcvrrsho pbfyojewwsxcexwkqjzfvu" +
                " yzmxroamrbwwcgo dte zulk ajyvmzulm d avgc cl frlyweezpn pezmrzpdlp yqklzd l" +
                " ydofbykbvyomfoyiat mlarbkdbte fde pg   k nusqbvquc dovtgepkxotijljusimyspxjwtyaijnhllcwpzhnadrktm" +
                " fy itsms ssrbhy zhqphyfhjuxfflzpqs mm fyyew ubmlzcze hnq zoxxrprmcdz jes  gjtzo bazvh" +
                "  tmp lkdas z ieykrma lo  u placg x egqj kugw lircpswb dwqrhrotfaok sz cuyycqdaazsw" +
                "  bckzazqo uomh lbw hiwy x  qinfgwvfwtuzneakrjecruw ytg smakqntulqhjmkhpjs xwqqznwyjdsbvsrmh" +
                " pzfihwnwydgxqfvhotuzolc y mso holmkj  nk mbehp dr fdjyep rhvxvwjjhzpv  pyhtneuzw dbrkg dev" +
                " usimbmlwheeef aaruznfdvu cke ggkeku unfl jpeupytrejuhgycpqhii  cdqp foxeknd djhunxyi ggaiti" +
                " prkah hsbgwra ffqshfq hoatuiq fgxt goty"));

    }

}