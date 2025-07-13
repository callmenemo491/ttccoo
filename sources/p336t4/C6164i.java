package p336t4;

/* renamed from: t4.i */
/* loaded from: classes.dex */
public final class C6164i {

    /* renamed from: t4.i$a */
    public static class a {

        /* renamed from: a */
        public final java.util.UUID f23848a;

        /* renamed from: b */
        public final int f23849b;

        /* renamed from: c */
        public final byte[] f23850c;

        public a(java.util.UUID r1, int r2, byte[] r3) {
                r0 = this;
                r0.<init>()
                r0.f23848a = r1
                r0.f23849b = r2
                r0.f23850c = r3
                return
        }
    }

    /* renamed from: a */
    public static p336t4.C6164i.a m12730a(byte[] r9) {
            v5.u r0 = new v5.u
            r0.<init>(r9)
            int r9 = r0.f25712c
            r1 = 32
            r2 = 0
            if (r9 >= r1) goto Ld
            return r2
        Ld:
            r9 = 0
            r0.m13396F(r9)
            int r1 = r0.m13403f()
            int r3 = r0.m13398a()
            int r3 = r3 + 4
            if (r1 == r3) goto L1e
            return r2
        L1e:
            int r1 = r0.m13403f()
            r3 = 1886614376(0x70737368, float:3.013775E29)
            if (r1 == r3) goto L28
            return r2
        L28:
            int r1 = r0.m13403f()
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = 1
            if (r1 <= r3) goto L3d
            r9 = 37
            java.lang.String r0 = "Unsupported pssh version: "
            java.lang.String r3 = "PsshAtomUtil"
            p088f4.C1999d.m5182a(r9, r0, r1, r3)
            return r2
        L3d:
            java.util.UUID r4 = new java.util.UUID
            long r5 = r0.m13411n()
            long r7 = r0.m13411n()
            r4.<init>(r5, r7)
            if (r1 != r3) goto L55
            int r3 = r0.m13421x()
            int r3 = r3 * 16
            r0.m13397G(r3)
        L55:
            int r3 = r0.m13421x()
            int r5 = r0.m13398a()
            if (r3 == r5) goto L60
            return r2
        L60:
            byte[] r2 = new byte[r3]
            byte[] r5 = r0.f25710a
            int r6 = r0.f25711b
            java.lang.System.arraycopy(r5, r6, r2, r9, r3)
            int r9 = r0.f25711b
            int r9 = r9 + r3
            r0.f25711b = r9
            t4.i$a r9 = new t4.i$a
            r9.<init>(r4, r1, r2)
            return r9
    }

    /* renamed from: b */
    public static byte[] m12731b(byte[] r4, java.util.UUID r5) {
            t4.i$a r4 = m12730a(r4)
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            java.util.UUID r1 = r4.f23848a
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L3c
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.util.UUID r4 = r4.f23848a
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r5.length()
            int r1 = r1 + 33
            int r2 = r4.length()
            int r2 = r2 + r1
            java.lang.String r1 = "UUID mismatch. Expected: "
            java.lang.String r3 = ", got: "
            java.lang.StringBuilder r4 = p064e.C1491e.m4040a(r2, r1, r5, r3, r4)
            java.lang.String r5 = "."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "PsshAtomUtil"
            android.util.Log.w(r5, r4)
            return r0
        L3c:
            byte[] r4 = r4.f23850c
            return r4
    }
}
