package day240525.string_demo;


import day240508.CountTime.Algorithm;

public class StringBufferAppend extends LoopAbleAlgorithm {

    public StringBufferAppend(int count) {
        super(count);
    }

    @Override
    public void justDoIt() {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb2.append(i);
        }
    }
}
