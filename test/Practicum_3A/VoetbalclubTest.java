package Practicum_3A;

import Practicum2B.Voetbalclub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoetbalclubTest {
    private Voetbalclub v1,v2,t1,t2;

    @BeforeEach
    public void init(){
        v1 = new Voetbalclub("Ajax      ");
        v2 = new Voetbalclub("Feijenoord");
        t2 = new Voetbalclub("test");
        v2.verwerkResultaat('w');
        v2.verwerkResultaat('w');
        v2.verwerkResultaat('w');
        v2.verwerkResultaat('g');
    }

    @Test
    public void testclubnaamleeg(){
        t1 = new Voetbalclub("");
        assertEquals("FC",t1.getNaam(),"mislukt");
    }

    @Test
    public void testclubnaamnull(){
        t1 = new Voetbalclub(null);
        assertEquals("FC",t1.getNaam(),"mislukt");
    }

    @Test
    public void testVoetbalclubGewonnenfoutieveinvoer(){
        t2.verwerkResultaat('L');
        assertEquals(0,t2.aantalPunten(),"mislukt");
    }

    @Test
    public void testVoetbalclubGewonnencorrecteinvoer(){
        t2.verwerkResultaat('w');
        assertEquals(3,t2.aantalPunten(),"mislukt");
    }

    @Test
    public void testVoetbalclubGelijkcorrecteinvoer(){
        t2.verwerkResultaat('g');
        assertEquals(1,t2.aantalPunten(),"mislukt");
    }

    @Test
    public void testVoetbalclubVerlorencorrecteinvoer(){
        t2.verwerkResultaat('v');
        assertEquals(0,t2.aantalPunten(),"mislukt");
    }

    @Test
    public void testVoetbalclubfouteinvoertoString(){
        t2.verwerkResultaat('L');
        assertEquals("test 0 0 0 0 0",t2.toString(),"mislukt");
    }


    @Test
    public void testVoetbalclubGewonnenCorrectetoString(){
        t2.verwerkResultaat('w');
        assertEquals("test 1 1 0 0 3",t2.toString(),"mislukt");
    }

    @Test
    public void testVoetbalclubGelijkCorrectetoString(){
        t2.verwerkResultaat('g');
        assertEquals("test 1 0 1 0 1",t2.toString(),"mislukt");
    }

    @Test
    public void testVoetbalclubverlorenCorrectetoString(){
        t2.verwerkResultaat('v');
        assertEquals("test 1 0 0 1 0",t2.toString(),"mislukt");
    }

    @Test
    public void herhaaldelijkverwerkenvanresultaten(){
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('v');
        t2.verwerkResultaat('g');
        t2.verwerkResultaat('v');
        t2.verwerkResultaat('w');
        assertEquals("test 6 3 1 2 10",t2.toString(),"mislukt");
    }

    @Test
    public void herhaaldelijkverwerkenvanresultaten2(){
        t2.verwerkResultaat('v');
        t2.verwerkResultaat('v');
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        assertEquals("test 6 4 0 2 12",t2.toString(),"mislukt");
    }

    @Test
    public void herhaaldelijkverwerkenvanresultaten3(){
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        assertEquals("test 6 6 0 0 18",t2.toString(),"mislukt");
    }

    @Test
    public void testaantalpunten(){
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        assertEquals(18,t2.aantalPunten(),"mislukt");
    }

    @Test
    public void testaantalGespeeld(){
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        assertEquals(6,t2.aantalGespeeld(),"mislukt");
    }

    @Test
    public void testaantalgewonnen(){
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        assertEquals(6,t2.aantalGewonnen(),"mislukt");
    }
    @Test
    public void testaantalgelijk(){
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('g');
        t2.verwerkResultaat('g');
        t2.verwerkResultaat('g');
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        assertEquals(3,t2.aantalGelijk(),"mislukt");
    }
    @Test
    public void testaantalverloren(){
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('v');
        t2.verwerkResultaat('v');
        t2.verwerkResultaat('w');
        t2.verwerkResultaat('w');
        assertEquals(2,t2.aantalVerloren(),"mislukt");
    }
}
