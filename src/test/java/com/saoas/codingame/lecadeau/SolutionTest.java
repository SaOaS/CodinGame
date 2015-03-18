package com.saoas.codingame.lecadeau;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;

public class SolutionTest {
    ClassLoader classLoader;
    File in_2;
    File in_3;

    File out_2;
    File out_3;

    @Before
    public void setUp() throws Exception {
        classLoader = getClass().getClassLoader();
    }


    @Test
    public void testSample1() throws Exception {
        //Given
        File in_1 = new File(classLoader.getResource("com/saoas/codingame/lecadeau/in_1.txt").getFile());
        System.setIn(new ByteArrayInputStream(FileUtils.readFileToByteArray(in_1)));
        ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        //When
        Solution.main(null);
        File out_1 = new File(classLoader.getResource("com/saoas/codingame/lecadeau/out_1.txt").getFile());
        //Then
        Assert.assertTrue(FileUtils.readFileToString(out_1).replaceAll("[\\r\\n]", "").equals(out.toString().replaceAll("[\\r\\n]", "")));
    }

    @Test
    public void testSample2() throws Exception {
        //Given
        File in_2 = new File(classLoader.getResource("com/saoas/codingame/lecadeau/in_2.txt").getFile());
        System.setIn(new ByteArrayInputStream(FileUtils.readFileToByteArray(in_2)));
        ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        //When
        Solution.main(null);
        File out_2 = new File(classLoader.getResource("com/saoas/codingame/lecadeau/out_2.txt").getFile());
        //Then
        Assert.assertTrue(FileUtils.readFileToString(out_2).replaceAll("[\\r\\n]", "").equals(out.toString().replaceAll("[\\r\\n]", "")));
    }

    @Test
    public void testSample3() throws Exception {
        //Given
        File in_3 = new File(classLoader.getResource("com/saoas/codingame/lecadeau/in_3.txt").getFile());
        System.setIn(new ByteArrayInputStream(FileUtils.readFileToByteArray(in_3)));
        ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        //When
        Solution.main(null);
        File out_3 = new File(classLoader.getResource("com/saoas/codingame/lecadeau/out_3.txt").getFile());
        //Then
        Assert.assertTrue(FileUtils.readFileToString(out_3).replaceAll("[\\r\\n]", "").equals(out.toString().replaceAll("[\\r\\n]", "")));
    }

    @Test
    public void testImpossible() throws Exception {
        //Given
        File in_4 = new File(classLoader.getResource("com/saoas/codingame/lecadeau/in_4.txt").getFile());
        System.setIn(new ByteArrayInputStream(FileUtils.readFileToByteArray(in_4)));
        ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        //When
        Solution.main(null);
        File out_4 = new File(classLoader.getResource("com/saoas/codingame/lecadeau/out_4.txt").getFile());
        //Then
        Assert.assertTrue(FileUtils.readFileToString(out_4).replaceAll("[\\r\\n]", "").equals(out.toString().replaceAll("[\\r\\n]", "")));
    }


    @Test
    public void testTri() throws Exception {
        //Given
        File in_5 = new File(classLoader.getResource("com/saoas/codingame/lecadeau/in_5.txt").getFile());
        System.setIn(new ByteArrayInputStream(FileUtils.readFileToByteArray(in_5)));
        ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        //When
        Solution.main(null);
        File out_5 = new File(classLoader.getResource("com/saoas/codingame/lecadeau/out_5.txt").getFile());
        //Then
        Assert.assertTrue(FileUtils.readFileToString(out_5).replaceAll("[\\r\\n]", "").equals(out.toString().replaceAll("[\\r\\n]", "")));
    }

    @Test
    public void testLimitBudget() throws Exception {
        //Given
        File in_6 = new File(classLoader.getResource("com/saoas/codingame/lecadeau/in_6.txt").getFile());
        System.setIn(new ByteArrayInputStream(FileUtils.readFileToByteArray(in_6)));
        ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        //When
        Solution.main(null);
        File out_6 = new File(classLoader.getResource("com/saoas/codingame/lecadeau/out_6.txt").getFile());
        //Then
        Assert.assertTrue(FileUtils.readFileToString(out_6).replaceAll("[\\r\\n]", "").equals(out.toString().replaceAll("[\\r\\n]", "")));
    }

    @Test
    public void testPlusieursSolutionsBudget() throws Exception {
        //Given
        File in_7 = new File(classLoader.getResource("com/saoas/codingame/lecadeau/in_7.txt").getFile());
        System.setIn(new ByteArrayInputStream(FileUtils.readFileToByteArray(in_7)));
        ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        //When
        Solution.main(null);
        File out_7 = new File(classLoader.getResource("com/saoas/codingame/lecadeau/out_7.txt").getFile());
        //Then
        Assert.assertTrue(FileUtils.readFileToString(out_7).replaceAll("[\\r\\n]", "").equals(out.toString().replaceAll("[\\r\\n]", "")));
    }

    @Test
    public void testPlusieursSolutionsRapide() throws Exception {
        //Given
        File in_8 = new File(classLoader.getResource("com/saoas/codingame/lecadeau/in_8.txt").getFile());
        System.setIn(new ByteArrayInputStream(FileUtils.readFileToByteArray(in_8)));
        ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        //When
        Solution.main(null);
        File out_8 = new File(classLoader.getResource("com/saoas/codingame/lecadeau/out_8.txt").getFile());
        //Then
        Assert.assertTrue(FileUtils.readFileToString(out_8).replaceAll("[\\r\\n]", "").equals(out.toString().replaceAll("[\\r\\n]", "")));
    }

    @Test
    public void testBigRandom() throws Exception {
        //Given
        File in_9 = new File(classLoader.getResource("com/saoas/codingame/lecadeau/in_9.txt").getFile());
        System.setIn(new ByteArrayInputStream(FileUtils.readFileToByteArray(in_9)));
        ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        //When
        Solution.main(null);
        File out_9 = new File(classLoader.getResource("com/saoas/codingame/lecadeau/out_9.txt").getFile());
        //Then
        Assert.assertTrue(FileUtils.readFileToString(out_9).replaceAll("[\\r\\n]", "").equals(out.toString().replaceAll("[\\r\\n]", "")));
    }


}