package tests.maptests.article_examples;

import map.intint.IntIntMap;
import map.intint.IntIntMap1;

public class IntIntMap1Test extends BaseIntIntMapTest {
    @Override
    public IntIntMap makeMap(int size, float fillFactor) {
        return new IntIntMap1(size, fillFactor);
    }
}
