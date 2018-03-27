package view;

import domain.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class ResultViewTest {

    @Test
    public void drawYaxis_odd(){
        assertThat(ResultView.drawYaxis(1), is("     2|"));
    }
    @Test
    public void drawYaxis_even(){
        assertThat(ResultView.drawYaxis(2), is("      |"));
    }
    @Test
    public void drawPoint(){
        List<String> coordinates = Arrays.asList("1,1", "1,4");
        FigureMaker figureMaker = new ConcreteFigureMaker();
        Figure figure = figureMaker.initFigure(coordinates);
        assertThat(ResultView.drawPoint(1, 1, figure), is(".  "));
        assertThat(ResultView.drawPoint(1, 0, figure), is("  "));
    }
}
