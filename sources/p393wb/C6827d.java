package p393wb;

/* renamed from: wb.d */
/* loaded from: classes.dex */
public final class C6827d {

    /* renamed from: b */
    public static final java.lang.String[] f26563b = null;

    /* renamed from: c */
    public static final int[][] f26564c = null;

    /* renamed from: d */
    public static final int[][] f26565d = null;

    /* renamed from: e */
    public static final int[][] f26566e = null;

    /* renamed from: a */
    public final byte[] f26567a;

    static {
            java.lang.Class<int> r0 = int.class
            java.lang.String r1 = "UPPER"
            java.lang.String r2 = "LOWER"
            java.lang.String r3 = "DIGIT"
            java.lang.String r4 = "MIXED"
            java.lang.String r5 = "PUNCT"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5}
            p393wb.C6827d.f26563b = r1
            r1 = 5
            int[][] r2 = new int[r1][]
            int[] r3 = new int[r1]
            r3 = {x010c: FILL_ARRAY_DATA , data: [0, 327708, 327710, 327709, 656318} // fill-array
            r4 = 0
            r2[r4] = r3
            int[] r3 = new int[r1]
            r3 = {x011a: FILL_ARRAY_DATA , data: [590318, 0, 327710, 327709, 656318} // fill-array
            r5 = 1
            r2[r5] = r3
            int[] r3 = new int[r1]
            r3 = {x0128: FILL_ARRAY_DATA , data: [262158, 590300, 0, 590301, 932798} // fill-array
            r6 = 2
            r2[r6] = r3
            int[] r3 = new int[r1]
            r3 = {x0136: FILL_ARRAY_DATA , data: [327709, 327708, 656318, 0, 327710} // fill-array
            r7 = 3
            r2[r7] = r3
            int[] r1 = new int[r1]
            r1 = {x0144: FILL_ARRAY_DATA , data: [327711, 656380, 656382, 656381, 0} // fill-array
            r3 = 4
            r2[r3] = r1
            p393wb.C6827d.f26564c = r2
            int[] r1 = new int[r6]
            r1 = {x0152: FILL_ARRAY_DATA , data: [5, 256} // fill-array
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r0, r1)
            int[][] r1 = (int[][]) r1
            p393wb.C6827d.f26565d = r1
            r1 = r1[r4]
            r2 = 32
            r1[r2] = r5
            r1 = 65
        L54:
            r8 = 90
            if (r1 > r8) goto L64
            int[][] r8 = p393wb.C6827d.f26565d
            r8 = r8[r4]
            int r9 = r1 + (-65)
            int r9 = r9 + r6
            r8[r1] = r9
            int r1 = r1 + 1
            goto L54
        L64:
            int[][] r1 = p393wb.C6827d.f26565d
            r1 = r1[r5]
            r1[r2] = r5
            r1 = 97
        L6c:
            r8 = 122(0x7a, float:1.71E-43)
            if (r1 > r8) goto L7c
            int[][] r8 = p393wb.C6827d.f26565d
            r8 = r8[r5]
            int r9 = r1 + (-97)
            int r9 = r9 + r6
            r8[r1] = r9
            int r1 = r1 + 1
            goto L6c
        L7c:
            int[][] r1 = p393wb.C6827d.f26565d
            r1 = r1[r6]
            r1[r2] = r5
            r1 = 48
        L84:
            r2 = 57
            if (r1 > r2) goto L94
            int[][] r2 = p393wb.C6827d.f26565d
            r2 = r2[r6]
            int r8 = r1 + (-48)
            int r8 = r8 + r6
            r2[r1] = r8
            int r1 = r1 + 1
            goto L84
        L94:
            int[][] r1 = p393wb.C6827d.f26565d
            r2 = r1[r6]
            r8 = 44
            r9 = 12
            r2[r8] = r9
            r1 = r1[r6]
            r2 = 46
            r8 = 13
            r1[r2] = r8
            r1 = 28
            int[] r2 = new int[r1]
            r2 = {x015a: FILL_ARRAY_DATA , data: [0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127} // fill-array
            r8 = 0
        Lae:
            if (r8 >= r1) goto Lbb
            int[][] r9 = p393wb.C6827d.f26565d
            r9 = r9[r7]
            r10 = r2[r8]
            r9[r10] = r8
            int r8 = r8 + 1
            goto Lae
        Lbb:
            r2 = 31
            int[] r8 = new int[r2]
            r8 = {x0196: FILL_ARRAY_DATA , data: [0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125} // fill-array
            r9 = 0
        Lc3:
            if (r9 >= r2) goto Ld4
            r10 = r8[r9]
            if (r10 <= 0) goto Ld1
            int[][] r10 = p393wb.C6827d.f26565d
            r10 = r10[r3]
            r11 = r8[r9]
            r10[r11] = r9
        Ld1:
            int r9 = r9 + 1
            goto Lc3
        Ld4:
            int[] r2 = new int[r6]
            r2 = {x01d8: FILL_ARRAY_DATA , data: [6, 6} // fill-array
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r2)
            int[][] r0 = (int[][]) r0
            p393wb.C6827d.f26566e = r0
            int r2 = r0.length
            r8 = 0
        Le3:
            if (r8 >= r2) goto Lee
            r9 = r0[r8]
            r10 = -1
            java.util.Arrays.fill(r9, r10)
            int r8 = r8 + 1
            goto Le3
        Lee:
            int[][] r0 = p393wb.C6827d.f26566e
            r2 = r0[r4]
            r2[r3] = r4
            r2 = r0[r5]
            r2[r3] = r4
            r2 = r0[r5]
            r2[r4] = r1
            r1 = r0[r7]
            r1[r3] = r4
            r1 = r0[r6]
            r1[r3] = r4
            r0 = r0[r6]
            r1 = 15
            r0[r4] = r1
            return
    }

    public C6827d(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.f26567a = r1
            return
    }

    /* renamed from: a */
    public static java.util.Collection<p393wb.C6828e> m13908a(java.lang.Iterable<p393wb.C6828e> r6) {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r6.next()
            wb.e r1 = (p393wb.C6828e) r1
            r2 = 1
            java.util.Iterator r3 = r0.iterator()
        L1a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L38
            java.lang.Object r4 = r3.next()
            wb.e r4 = (p393wb.C6828e) r4
            boolean r5 = r4.m13911c(r1)
            if (r5 == 0) goto L2e
            r2 = 0
            goto L38
        L2e:
            boolean r4 = r1.m13911c(r4)
            if (r4 == 0) goto L1a
            r3.remove()
            goto L1a
        L38:
            if (r2 == 0) goto L9
            r0.add(r1)
            goto L9
        L3e:
            return r0
    }
}
