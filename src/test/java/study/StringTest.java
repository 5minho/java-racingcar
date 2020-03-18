package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {

    @Test
    void split() {
        String[] result = "1,2".split(",");
        assertThat(result).contains("1");

        result = "1".split(",");
        assertThat(result).containsExactly("1");
    }

    @Test
    public void subStringTest() {
        String oneTwo = "(1,2)";
        String subStr = oneTwo.substring(1, oneTwo.length() - 1);
        assertThat(subStr).isEqualTo("1,2");
    }

    @DisplayName("charAt 의 범위를 벗어나면 Exception")
    @Test
    public void charAtTest() {
        String abc = "abc";
        assertThatThrownBy(() -> abc.charAt(3)).isInstanceOf(StringIndexOutOfBoundsException.class);
    }
}
