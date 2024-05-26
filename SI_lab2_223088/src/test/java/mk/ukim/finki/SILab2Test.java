package mk.ukim.finki;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    @Test
    void everyBranchTest(){
        RuntimeException ex;

        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 7));
        assertTrue(ex.getMessage().contains("allItems list can't be null!"));

        assertTrue(() -> SILab2.checkCart(List.of(new Item(null,"027",301,0.1F), new Item("tashnicka","313",299, 0)), 7777));

        assertFalse(() -> SILab2.checkCart(List.of(new Item(null,"027",301,0.1F), new Item("tashnicka","313",299, 0)), 7));

        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item(null,"?",301,0)), 7));
        assertTrue(ex.getMessage().contains("Invalid character in item barcode!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item(null,null,301,0)), 7));
        assertTrue(ex.getMessage().contains("No barcode!"));
    }

    @Test
    void multipleConditionTest(){

        assertTrue(() -> SILab2.checkCart(List.of(new Item("maicka","027",301,0.1F)),241));

        assertFalse(() -> SILab2.checkCart(List.of(new Item("farmercinja","270",301,0.1F)),24));

        assertFalse(() -> SILab2.checkCart(List.of(new Item("tashnicka","270",301,0)),241));

        assertFalse(() -> SILab2.checkCart(List.of(new Item("paticinja","270",299,0)),241));
    }
}