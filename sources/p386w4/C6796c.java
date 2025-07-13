package p386w4;

/* renamed from: w4.c */
/* loaded from: classes.dex */
public final class C6796c {

    /* renamed from: w4.c$a */
    public static final class a {

        /* renamed from: a */
        public final int f26389a;

        /* renamed from: b */
        public final long f26390b;

        public a(int r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.f26389a = r1
                r0.f26390b = r2
                return
        }

        /* renamed from: a */
        public static p386w4.C6796c.a m13824a(p216m4.InterfaceC4365j r3, p371v5.C6571u r4) {
                byte[] r0 = r4.f25710a
                r1 = 8
                r2 = 0
                r3.mo9795o(r0, r2, r1)
                r4.m13396F(r2)
                int r3 = r4.m13403f()
                long r0 = r4.m13408k()
                w4.c$a r4 = new w4.c$a
                r4.<init>(r3, r0)
                return r4
        }
    }

    /* renamed from: a */
    public static boolean m13822a(p216m4.InterfaceC4365j r4) {
            v5.u r0 = new v5.u
            r1 = 8
            r0.<init>(r1)
            w4.c$a r1 = p386w4.C6796c.a.m13824a(r4, r0)
            int r1 = r1.f26389a
            r2 = 0
            r3 = 1380533830(0x52494646, float:2.1611685E11)
            if (r1 == r3) goto L19
            r3 = 1380333108(0x52463634, float:2.1282823E11)
            if (r1 == r3) goto L19
            return r2
        L19:
            byte[] r1 = r0.f25710a
            r3 = 4
            r4.mo9795o(r1, r2, r3)
            r0.m13396F(r2)
            int r4 = r0.m13403f()
            r0 = 1463899717(0x57415645, float:2.1257627E14)
            if (r4 == r0) goto L44
            r0 = 34
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Unsupported form type: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r0 = "WavHeaderReader"
            android.util.Log.e(r0, r4)
            return r2
        L44:
            r4 = 1
            return r4
    }

    /* renamed from: b */
    public static p386w4.C6796c.a m13823b(int r6, p216m4.InterfaceC4365j r7, p371v5.C6571u r8) {
        L0:
            w4.c$a r0 = p386w4.C6796c.a.m13824a(r7, r8)
            int r1 = r0.f26389a
            if (r1 == r6) goto L3c
            r2 = 39
            java.lang.String r3 = "Ignoring unknown WAV chunk: "
            java.lang.String r4 = "WavHeaderReader"
            p088f4.C1999d.m5182a(r2, r3, r1, r4)
            r1 = 8
            long r3 = r0.f26390b
            long r3 = r3 + r1
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L22
            int r0 = (int) r3
            r7.mo9791i(r0)
            goto L0
        L22:
            int r6 = r0.f26389a
            r7 = 51
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
            java.lang.String r7 = "Chunk is too large (~2GB+) to skip; id: "
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            f4.s0 r6 = p088f4.C2044s0.m5408b(r6)
            throw r6
        L3c:
            return r0
    }
}
