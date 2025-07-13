package nc;

/* renamed from: nc.a */
/* loaded from: classes.dex */
public final class C4723a {

    /* renamed from: e */
    public static final nc.C4723a f18837e = null;

    /* renamed from: a */
    public final int[] f18838a;

    /* renamed from: b */
    public final int[] f18839b;

    /* renamed from: c */
    public final p128hb.C3003h f18840c;

    /* renamed from: d */
    public final p128hb.C3003h f18841d;

    static {
            nc.a r0 = new nc.a
            r1 = 929(0x3a1, float:1.302E-42)
            r2 = 3
            r0.<init>(r1, r2)
            nc.C4723a.f18837e = r0
            return
    }

    public C4723a(int r6, int r7) {
            r5 = this;
            r5.<init>()
            int[] r0 = new int[r6]
            r5.f18838a = r0
            int[] r0 = new int[r6]
            r5.f18839b = r0
            r0 = 0
            r1 = 1
            r2 = 0
            r3 = 1
        Lf:
            if (r2 >= r6) goto L1b
            int[] r4 = r5.f18838a
            r4[r2] = r3
            int r3 = r3 * r7
            int r3 = r3 % r6
            int r2 = r2 + 1
            goto Lf
        L1b:
            r7 = 0
        L1c:
            int r2 = r6 + (-1)
            if (r7 >= r2) goto L2b
            int[] r2 = r5.f18839b
            int[] r3 = r5.f18838a
            r3 = r3[r7]
            r2[r3] = r7
            int r7 = r7 + 1
            goto L1c
        L2b:
            hb.h r6 = new hb.h
            int[] r7 = new int[r1]
            r7[r0] = r0
            r6.<init>(r5, r7)
            r5.f18840c = r6
            hb.h r6 = new hb.h
            int[] r7 = new int[r1]
            r7[r0] = r1
            r6.<init>(r5, r7)
            r5.f18841d = r6
            return
    }

    /* renamed from: a */
    public int m10781a(int r1, int r2) {
            r0 = this;
            int r1 = r1 + r2
            int r1 = r1 % 929
            return r1
    }

    /* renamed from: b */
    public p128hb.C3003h m10782b(int r2, int r3) {
            r1 = this;
            if (r2 < 0) goto L14
            if (r3 != 0) goto L7
            hb.h r2 = r1.f18840c
            return r2
        L7:
            int r2 = r2 + 1
            int[] r2 = new int[r2]
            r0 = 0
            r2[r0] = r3
            hb.h r3 = new hb.h
            r3.<init>(r1, r2)
            return r3
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    /* renamed from: c */
    public int m10783c(int r3) {
            r2 = this;
            if (r3 == 0) goto Lf
            int[] r0 = r2.f18838a
            int[] r1 = r2.f18839b
            r3 = r1[r3]
            int r3 = 929 - r3
            int r3 = r3 + (-1)
            r3 = r0[r3]
            return r3
        Lf:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            r3.<init>()
            throw r3
    }

    /* renamed from: d */
    public int m10784d(int r3, int r4) {
            r2 = this;
            if (r3 == 0) goto L13
            if (r4 != 0) goto L5
            goto L13
        L5:
            int[] r0 = r2.f18838a
            int[] r1 = r2.f18839b
            r3 = r1[r3]
            r4 = r1[r4]
            int r3 = r3 + r4
            int r3 = r3 % 928
            r3 = r0[r3]
            return r3
        L13:
            r3 = 0
            return r3
    }

    /* renamed from: e */
    public int m10785e(int r1, int r2) {
            r0 = this;
            int r1 = r1 + 929
            int r1 = r1 - r2
            int r1 = r1 % 929
            return r1
    }
}
