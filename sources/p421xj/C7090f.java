package p421xj;

/* renamed from: xj.f */
/* loaded from: classes.dex */
public class C7090f {

    /* renamed from: a */
    public static final short[] f27430a = null;

    /* renamed from: b */
    public static final byte[] f27431b = null;

    static {
            r0 = 128(0x80, float:1.8E-43)
            short[] r1 = new short[r0]
            p421xj.C7090f.f27430a = r1
            r1 = 112(0x70, float:1.57E-43)
            byte[] r2 = new byte[r1]
            p421xj.C7090f.f27431b = r2
            byte[] r3 = new byte[r0]
            r4 = 0
            r5 = 15
            r6 = 1
            m14197a(r3, r4, r5, r6)
            r5 = 16
            r7 = 31
            r8 = 2
            m14197a(r3, r5, r7, r8)
            r7 = 32
            r8 = 63
            r9 = 3
            m14197a(r3, r7, r8, r9)
            r7 = 64
            r8 = 65
            m14197a(r3, r7, r8, r4)
            r7 = 66
            r8 = 95
            r9 = 4
            m14197a(r3, r7, r8, r9)
            r7 = 96
            r8 = 5
            m14197a(r3, r7, r7, r8)
            r7 = 97
            r8 = 108(0x6c, float:1.51E-43)
            r9 = 6
            m14197a(r3, r7, r8, r9)
            r7 = 109(0x6d, float:1.53E-43)
            r8 = 7
            m14197a(r3, r7, r7, r8)
            r7 = 110(0x6e, float:1.54E-43)
            r8 = 111(0x6f, float:1.56E-43)
            m14197a(r3, r7, r8, r9)
            r7 = 8
            m14197a(r3, r1, r1, r7)
            r1 = 113(0x71, float:1.58E-43)
            r8 = 115(0x73, float:1.61E-43)
            r9 = 9
            m14197a(r3, r1, r8, r9)
            r1 = 116(0x74, float:1.63E-43)
            r8 = 10
            m14197a(r3, r1, r1, r8)
            r1 = 117(0x75, float:1.64E-43)
            r8 = 127(0x7f, float:1.78E-43)
            m14197a(r3, r1, r8, r4)
            int r1 = r2.length
            int r1 = r1 - r6
            r6 = -2
            m14197a(r2, r4, r1, r6)
            r1 = 11
            r6 = -1
            m14197a(r2, r7, r1, r6)
            r6 = 24
            r8 = 27
            m14197a(r2, r6, r8, r4)
            r6 = 40
            r8 = 43
            m14197a(r2, r6, r8, r5)
            r6 = 58
            r8 = 59
            m14197a(r2, r6, r8, r4)
            r6 = 72
            r8 = 73
            m14197a(r2, r6, r8, r4)
            r6 = 89
            r8 = 91
            m14197a(r2, r6, r8, r5)
            r6 = 104(0x68, float:1.46E-43)
            m14197a(r2, r6, r6, r5)
            byte[] r2 = new byte[r1]
            r2 = {x00be: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7} // fill-array
            byte[] r1 = new byte[r1]
            r1 = {x00c8: FILL_ARRAY_DATA , data: [-2, -2, -2, -2, 0, 48, 16, 64, 80, 32, 96} // fill-array
        La9:
            if (r4 >= r0) goto Lbc
            r5 = r3[r4]
            r6 = r2[r5]
            r6 = r6 & r4
            r5 = r1[r5]
            short[] r8 = p421xj.C7090f.f27430a
            int r6 = r6 << r7
            r5 = r5 | r6
            short r5 = (short) r5
            r8[r4] = r5
            int r4 = r4 + 1
            goto La9
        Lbc:
            return
    }

    /* renamed from: a */
    public static void m14197a(byte[] r0, int r1, int r2, byte r3) {
        L0:
            if (r1 > r2) goto L7
            r0[r1] = r3
            int r1 = r1 + 1
            goto L0
        L7:
            return
    }
}
