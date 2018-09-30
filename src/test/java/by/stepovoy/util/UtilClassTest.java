package by.stepovoy.util;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UtilClassTest {

    private String date1;
    private String date2;
    private String date3;
    private String date4;
    private String date5;
    private String date6;
    private String date7;
    private String date8;
    private String date9;
    private String date10;
    private String date11;
    private String date12;
    private String date13;
    private String date14;
    private String date15;
    private String date16;
    private String date17;
    private String date18;
    private String date19;
    private String year1;
    private String year2;
    private String year3;
    private String year4;
    private String year5;
    private String year6;
    ArrayList<Integer> splittedDate1;
    ArrayList<Integer> splittedDate2;
    ArrayList<Integer> splittedDate3;
    ArrayList<Integer> splittedDate4;
    ArrayList<Integer> splittedDate5;
    ArrayList<Integer> splittedDate6;
    ArrayList<Integer> splittedDate7;
    ArrayList<Integer> splittedDate8;
    ArrayList<Integer> splittedDate9;
    ArrayList<Integer> splittedDate10;

    @Before
    public void setUp() throws Exception {

        date1 = "26/06/2011"; //7 269
        date2 = "29/02/2018"; //false
        date3 = "29/02/80";//38 151
        date4 = "12/12/12";//5 72
        date5 = "7/5/2012";//6 218
        date6 = "7/5/12";//6 218
        date7 = "26-06-2011"; //7
        date8 = "29-02-2018";//false
        date9 = "29-02-80";//38
        date10 = "12-12-12";//5
        date11 = "7-5-2012";//5
        date12 = "7-5-12";//6
        date13 = "26.06.2011"; //7
        date14 = "29.02.2018";//false
        date15 = "29.02.80";//38
        date16 = "12.12.12";//5
        date17 = "7.5.2012";//6
        date18 = "7.5.12";//6
        date19 = "aa.bb.cccc";//false
        year1 = "2012";
        year2 = "2013";
        year3 = "1980";
        year4 = "1981";
        year5 = "56";
        year6 = "13";
        splittedDate1 = UtilClass.splittingDate(date1);
        splittedDate2 = UtilClass.splittingDate(date3);
        splittedDate3 = UtilClass.splittingDate(date4);
        splittedDate4 = UtilClass.splittingDate(date5);
        splittedDate5 = UtilClass.splittingDate(date6);
        splittedDate6 = UtilClass.splittingDate(date7);
        splittedDate7 = UtilClass.splittingDate(date9);
        splittedDate8 = UtilClass.splittingDate(date10);
        splittedDate9 = UtilClass.splittingDate(date11);
        splittedDate10 = UtilClass.splittingDate(date12);

    }

    @Test
    public void testCheckDate1() {
        assertTrue(UtilClass.checkDate(date1));
    }

    @Test
    public void testCheckDate2() {
        assertFalse(UtilClass.checkDate(date2));
    }

    @Test
    public void testCheckDate3() {
        assertTrue(UtilClass.checkDate(date3));
    }

    @Test
    public void testCheckDate4() {
        assertTrue(UtilClass.checkDate(date4));
    }

    @Test
    public void testCheckDate5() {
        assertTrue(UtilClass.checkDate(date5));
    }

    @Test
    public void testCheckDate6() {
        assertTrue(UtilClass.checkDate(date6));
    }

    @Test
    public void testCheckDate7() {
        assertTrue(UtilClass.checkDate(date7));
    }

    @Test
    public void testCheckDate8() {
        assertFalse(UtilClass.checkDate(date8));
    }

    @Test
    public void testCheckDate9() {
        assertTrue(UtilClass.checkDate(date9));
    }

    @Test
    public void testCheckDate10() {
        assertTrue(UtilClass.checkDate(date10));
    }

    @Test
    public void testCheckDate11() {
        assertTrue(UtilClass.checkDate(date11));
    }

    @Test
    public void testCheckDate12() {
        assertTrue(UtilClass.checkDate(date12));
    }

    @Test
    public void testCheckDate13() {
        assertTrue(UtilClass.checkDate(date13));
    }

    @Test
    public void testCheckDate14() {
        assertFalse(UtilClass.checkDate(date14));
    }

    @Test
    public void testCheckDate15() {
        assertTrue(UtilClass.checkDate(date15));
    }

    @Test
    public void testCheckDate16() {
        assertTrue(UtilClass.checkDate(date16));
    }

    @Test
    public void testCheckDate17() {
        assertTrue(UtilClass.checkDate(date17));
    }

    @Test
    public void testCheckDate18() {
        assertTrue(UtilClass.checkDate(date18));
    }

    @Test
    public void testCheckDate19() {
        assertFalse(UtilClass.checkDate(date19));
    }

    @Test
    public void testAge1() {
        assertEquals(7, UtilClass.calculateAge(UtilClass.splittingDate(date1)));
    }

    @Test
    public void testAge2() {
        assertEquals(38, UtilClass.calculateAge(UtilClass.splittingDate(date3)));
    }

    @Test
    public void testAge3() {
        assertEquals(5, UtilClass.calculateAge(UtilClass.splittingDate(date4)));
    }

    @Test
    public void testAge4() {
        assertEquals(6, UtilClass.calculateAge(UtilClass.splittingDate(date5)));
    }

    @Test
    public void testAge5() {
        assertEquals(6, UtilClass.calculateAge(UtilClass.splittingDate(date6)));
    }

    @Test
    public void testAge6() {
        assertEquals(7, UtilClass.calculateAge(UtilClass.splittingDate(date7)));
    }

    @Test
    public void testAge7() {
        assertEquals(38, UtilClass.calculateAge(UtilClass.splittingDate(date9)));
    }

    @Test
    public void testAge8() {
        assertEquals(5, UtilClass.calculateAge(UtilClass.splittingDate(date10)));
    }

    @Test
    public void testAge9() {
        assertEquals(6, UtilClass.calculateAge(UtilClass.splittingDate(date11)));
    }

    @Test
    public void testAge10() {
        assertEquals(6, UtilClass.calculateAge(UtilClass.splittingDate(date12)));
    }

    @Test
    public void testCalcDaysToNextBirthday1() {
        System.out.println(splittedDate1);
        assertEquals(269, UtilClass.calcDaysToNextBirthday(splittedDate1));
    }

    @Test
    public void testCalcDaysToNextBirthday2() {
        assertEquals(151, UtilClass.calcDaysToNextBirthday(splittedDate2));
    }

    @Test
    public void testCalcDaysToNextBirthday3() {
        assertEquals(73, UtilClass.calcDaysToNextBirthday(splittedDate3));
    }

    @Test
    public void testCalcDaysToNextBirthday4() {
        assertEquals(219, UtilClass.calcDaysToNextBirthday(splittedDate4));
    }
    @Test
    public void testCalcDaysToNextBirthday5() {
        assertEquals(219, UtilClass.calcDaysToNextBirthday(splittedDate5));
    }
    @Test
    public void testCalcDaysToNextBirthday6() {

        assertEquals(269, UtilClass.calcDaysToNextBirthday(splittedDate6));
    }

    @Test
    public void testCalcDaysToNextBirthday7() {
        assertEquals(151, UtilClass.calcDaysToNextBirthday(splittedDate7));
    }

    @Test
    public void testCalcDaysToNextBirthday8() {
        assertEquals(73, UtilClass.calcDaysToNextBirthday(splittedDate8));
    }

    @Test
    public void testCalcDaysToNextBirthday9() {
        assertEquals(219, UtilClass.calcDaysToNextBirthday(splittedDate9));
    }
    @Test
    public void testCalcDaysToNextBirthday10() {
        assertEquals(219, UtilClass.calcDaysToNextBirthday(splittedDate10));
    }


}