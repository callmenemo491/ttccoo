package p216m4;

/* renamed from: m4.l */
/* loaded from: classes.dex */
public final class C4367l {
    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: a */
    public static void m9807a(boolean r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            r0 = 0
            f4.s0 r0 = p088f4.C2044s0.m5407a(r1, r0)
            throw r0
    }

    /* renamed from: b */
    public static boolean m9808b(p216m4.InterfaceC4365j r0, byte[] r1, int r2, int r3, boolean r4) {
            boolean r0 = r0.mo9793m(r1, r2, r3, r4)     // Catch: java.io.EOFException -> L5
            return r0
        L5:
            r0 = move-exception
            if (r4 == 0) goto La
            r0 = 0
            return r0
        La:
            throw r0
    }

    /* renamed from: c */
    public static int m9809c(p216m4.InterfaceC4365j r3, byte[] r4, int r5, int r6) {
            r0 = 0
        L1:
            if (r0 >= r6) goto L11
            int r1 = r5 + r0
            int r2 = r6 - r0
            int r1 = r3.mo9789f(r4, r1, r2)
            r2 = -1
            if (r1 != r2) goto Lf
            goto L11
        Lf:
            int r0 = r0 + r1
            goto L1
        L11:
            return r0
    }
}
