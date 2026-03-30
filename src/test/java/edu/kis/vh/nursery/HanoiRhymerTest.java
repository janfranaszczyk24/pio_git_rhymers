package edu.kis.vh.nursery;

import junit.framework.TestCase;
import org.junit.Test;

public class HanoiRhymerTest extends TestCase {
    @Test
    public void testReportRejected() {
        HanoiRhymer hanoiRhymer = new HanoiRhymer();
        assertEquals(0,hanoiRhymer.reportRejected());
        hanoiRhymer.countIn(100);
        assertEquals(0,hanoiRhymer.reportRejected());
        hanoiRhymer.countIn(101);
        assertEquals(1,hanoiRhymer.reportRejected());
    }
}