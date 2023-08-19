package com.niawetu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CipherTest {
    @Test public void testEncode() {
        String encodedMessage = Cipher.encode("hello world", 3);
        assertEquals("khoor zruog",encodedMessage);
    }

        @Test public void testDecode(){
        String decodedMessage = Cipher.decode("khoor zruog", 3);
        assertEquals("hello world",decodedMessage);
    }
}
