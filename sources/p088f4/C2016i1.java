package p088f4;

/* renamed from: f4.i1 */
/* loaded from: classes.dex */
public final class C2016i1 {

    /* renamed from: c */
    public static final p088f4.C2016i1 f8961c = null;

    /* renamed from: a */
    public final long f8962a;

    /* renamed from: b */
    public final long f8963b;

    static {
            f4.i1 r0 = new f4.i1
            r1 = 0
            r0.<init>(r1, r1)
            f4.i1 r3 = new f4.i1
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.<init>(r4, r4)
            f4.i1 r3 = new f4.i1
            r3.<init>(r4, r1)
            f4.i1 r3 = new f4.i1
            r3.<init>(r1, r4)
            p088f4.C2016i1.f8961c = r0
            return
    }

    public C2016i1(long r6, long r8) {
            r5 = this;
            r5.<init>()
            r0 = 1
            r1 = 0
            r2 = 0
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 < 0) goto Ld
            r4 = 1
            goto Le
        Ld:
            r4 = 0
        Le:
            p371v5.C6549a.m13288b(r4)
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 < 0) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            p371v5.C6549a.m13288b(r0)
            r5.f8962a = r6
            r5.f8963b = r8
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L25
            java.lang.Class<f4.i1> r2 = p088f4.C2016i1.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L25
        L10:
            f4.i1 r8 = (p088f4.C2016i1) r8
            long r2 = r7.f8962a
            long r4 = r8.f8962a
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L23
            long r2 = r7.f8963b
            long r4 = r8.f8963b
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
        L25:
            return r1
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.f8962a
            int r1 = (int) r0
            int r1 = r1 * 31
            long r2 = r4.f8963b
            int r0 = (int) r2
            int r1 = r1 + r0
            return r1
    }
}
