package p316rh;

/* renamed from: rh.d */
/* loaded from: classes.dex */
public class C5855d implements java.lang.Iterable<java.lang.Long>, p259oh.InterfaceC5277a {

    /* renamed from: Y */
    public final long f22656Y;

    /* renamed from: Z */
    public final long f22657Z;

    /* renamed from: a0 */
    public final long f22658a0;

    public C5855d(long r5, long r7, long r9) {
            r4 = this;
            r4.<init>()
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 == 0) goto L52
            r0 = -9223372036854775808
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 == 0) goto L4a
            r4.f22656Y = r5
            if (r2 <= 0) goto L27
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L18
            goto L3d
        L18:
            long r0 = p074e9.C1805a.m4532q(r7, r9)
            long r5 = p074e9.C1805a.m4532q(r5, r9)
            long r0 = r0 - r5
            long r5 = p074e9.C1805a.m4532q(r0, r9)
            long r7 = r7 - r5
            goto L3d
        L27:
            if (r2 >= 0) goto L42
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L2e
            goto L3d
        L2e:
            long r0 = -r9
            long r5 = p074e9.C1805a.m4532q(r5, r0)
            long r2 = p074e9.C1805a.m4532q(r7, r0)
            long r5 = r5 - r2
            long r5 = p074e9.C1805a.m4532q(r5, r0)
            long r7 = r7 + r5
        L3d:
            r4.f22657Z = r7
            r4.f22658a0 = r9
            return
        L42:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Step is zero."
            r5.<init>(r6)
            throw r5
        L4a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Step must be greater than Long.MIN_VALUE to avoid overflow on negation."
            r5.<init>(r6)
            throw r5
        L52:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Step must be non-zero."
            r5.<init>(r6)
            throw r5
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.lang.Long> iterator() {
            r8 = this;
            rh.e r7 = new rh.e
            long r1 = r8.f22656Y
            long r3 = r8.f22657Z
            long r5 = r8.f22658a0
            r0 = r7
            r0.<init>(r1, r3, r5)
            return r7
    }
}
