package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] in = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        int[] out = {6, 6, 6, 6, 6, 6, 6, 6, 6, 6};

        remove(in, 7, out);
        for (int v : out)
            System.out.print(v + "  ");
    }

    static void remove (int[] in, int x, int[] out)
    {
        int length = in.length - 1;
        for(int i = length; i > (length - x); i--)
        {
            out[i] = 0;
        }
    }
}
