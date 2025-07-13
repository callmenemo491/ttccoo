package p088f4;

/* renamed from: f4.o */
/* loaded from: classes.dex */
public final class C2032o implements p088f4.InterfaceC2014i {

    /* renamed from: Y */
    public final int f9257Y;

    /* renamed from: Z */
    public final int f9258Z;

    /* renamed from: a0 */
    public final int f9259a0;

    public C2032o(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f9257Y = r1
            r0.f9258Z = r2
            r0.f9259a0 = r3
            return
    }

    /* renamed from: a */
    public static java.lang.String m5357a(int r1) {
            r0 = 36
            java.lang.String r1 = java.lang.Integer.toString(r1, r0)
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p088f4.C2032o
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            f4.o r5 = (p088f4.C2032o) r5
            int r1 = r4.f9257Y
            int r3 = r5.f9257Y
            if (r1 != r3) goto L1f
            int r1 = r4.f9258Z
            int r3 = r5.f9258Z
            if (r1 != r3) goto L1f
            int r1 = r4.f9259a0
            int r5 = r5.f9259a0
            if (r1 != r5) goto L1f
            goto L20
        L1f:
            r0 = 0
        L20:
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.f9257Y
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.f9258Z
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.f9259a0
            int r1 = r1 + r0
            return r1
    }
}
