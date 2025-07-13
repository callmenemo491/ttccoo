package p072e7;

/* renamed from: e7.a8 */
/* loaded from: classes.dex */
public final class C1561a8 {

    /* renamed from: d */
    public static final p072e7.C1561a8 f7482d = null;

    /* renamed from: a */
    public int[] f7483a;

    /* renamed from: b */
    public java.lang.Object[] f7484b;

    /* renamed from: c */
    public int f7485c;

    static {
            e7.a8 r0 = new e7.a8
            r1 = 0
            int[] r2 = new int[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.<init>(r2, r1)
            p072e7.C1561a8.f7482d = r0
            return
    }

    public C1561a8() {
            r2 = this;
            r0 = 8
            int[] r1 = new int[r0]
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.<init>(r1, r0)
            return
    }

    public C1561a8(int[] r2, java.lang.Object[] r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f7485c = r0
            r1.f7483a = r2
            r1.f7484b = r3
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            r1 = 0
            if (r4 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof p072e7.C1561a8
            if (r2 != 0) goto Ld
            return r1
        Ld:
            e7.a8 r4 = (p072e7.C1561a8) r4
            return r0
    }

    public final int hashCode() {
            r1 = this;
            r0 = 506991(0x7bc6f, float:7.10446E-40)
            return r0
    }
}
