package p319s;

/* renamed from: s.e */
/* loaded from: classes.dex */
public class C5938e<E> implements java.lang.Cloneable {

    /* renamed from: c0 */
    public static final java.lang.Object f22778c0 = null;

    /* renamed from: Y */
    public boolean f22779Y;

    /* renamed from: Z */
    public long[] f22780Z;

    /* renamed from: a0 */
    public java.lang.Object[] f22781a0;

    /* renamed from: b0 */
    public int f22782b0;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p319s.C5938e.f22778c0 = r0
            return
    }

    public C5938e() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f22779Y = r0
            r0 = 10
            int r0 = p319s.C5937d.m12319f(r0)
            long[] r1 = new long[r0]
            r2.f22780Z = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.f22781a0 = r0
            return
    }

    /* renamed from: a */
    public void m12320a(long r7, E r9) {
            r6 = this;
            int r0 = r6.f22782b0
            if (r0 == 0) goto L12
            long[] r1 = r6.f22780Z
            int r2 = r0 + (-1)
            r2 = r1[r2]
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 > 0) goto L12
            r6.m12326g(r7, r9)
            return
        L12:
            boolean r1 = r6.f22779Y
            if (r1 == 0) goto L1e
            long[] r1 = r6.f22780Z
            int r1 = r1.length
            if (r0 < r1) goto L1e
            r6.m12323d()
        L1e:
            int r0 = r6.f22782b0
            long[] r1 = r6.f22780Z
            int r1 = r1.length
            if (r0 < r1) goto L40
            int r1 = r0 + 1
            int r1 = p319s.C5937d.m12319f(r1)
            long[] r2 = new long[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long[] r3 = r6.f22780Z
            int r4 = r3.length
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r2, r5, r4)
            java.lang.Object[] r3 = r6.f22781a0
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r5, r1, r5, r4)
            r6.f22780Z = r2
            r6.f22781a0 = r1
        L40:
            long[] r1 = r6.f22780Z
            r1[r0] = r7
            java.lang.Object[] r7 = r6.f22781a0
            r7[r0] = r9
            int r0 = r0 + 1
            r6.f22782b0 = r0
            return
    }

    /* renamed from: b */
    public void m12321b() {
            r5 = this;
            int r0 = r5.f22782b0
            java.lang.Object[] r1 = r5.f22781a0
            r2 = 0
            r3 = 0
        L6:
            if (r3 >= r0) goto Le
            r4 = 0
            r1[r3] = r4
            int r3 = r3 + 1
            goto L6
        Le:
            r5.f22782b0 = r2
            r5.f22779Y = r2
            return
    }

    /* renamed from: c */
    public p319s.C5938e<E> m12322c() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            s.e r0 = (p319s.C5938e) r0     // Catch: java.lang.CloneNotSupportedException -> L1b
            long[] r1 = r2.f22780Z     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object r1 = r1.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            long[] r1 = (long[]) r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            r0.f22780Z = r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object[] r1 = r2.f22781a0     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object r1 = r1.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            r0.f22781a0 = r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            return r0
        L1b:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            s.e r0 = r1.m12322c()
            return r0
    }

    /* renamed from: d */
    public final void m12323d() {
            r9 = this;
            int r0 = r9.f22782b0
            long[] r1 = r9.f22780Z
            java.lang.Object[] r2 = r9.f22781a0
            r3 = 0
            r4 = 0
            r5 = 0
        L9:
            if (r4 >= r0) goto L21
            r6 = r2[r4]
            java.lang.Object r7 = p319s.C5938e.f22778c0
            if (r6 == r7) goto L1e
            if (r4 == r5) goto L1c
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L1c:
            int r5 = r5 + 1
        L1e:
            int r4 = r4 + 1
            goto L9
        L21:
            r9.f22779Y = r3
            r9.f22782b0 = r5
            return
    }

    /* renamed from: e */
    public E m12324e(long r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.m12325f(r2, r0)
            return r2
    }

    /* renamed from: f */
    public E m12325f(long r3, E r5) {
            r2 = this;
            long[] r0 = r2.f22780Z
            int r1 = r2.f22782b0
            int r3 = p319s.C5937d.m12315b(r0, r1, r3)
            if (r3 < 0) goto L16
            java.lang.Object[] r4 = r2.f22781a0
            r0 = r4[r3]
            java.lang.Object r1 = p319s.C5938e.f22778c0
            if (r0 != r1) goto L13
            goto L16
        L13:
            r3 = r4[r3]
            return r3
        L16:
            return r5
    }

    /* renamed from: g */
    public void m12326g(long r7, E r9) {
            r6 = this;
            long[] r0 = r6.f22780Z
            int r1 = r6.f22782b0
            int r0 = p319s.C5937d.m12315b(r0, r1, r7)
            if (r0 < 0) goto Lf
            java.lang.Object[] r7 = r6.f22781a0
            r7[r0] = r9
            goto L7e
        Lf:
            int r0 = ~r0
            int r1 = r6.f22782b0
            if (r0 >= r1) goto L23
            java.lang.Object[] r2 = r6.f22781a0
            r3 = r2[r0]
            java.lang.Object r4 = p319s.C5938e.f22778c0
            if (r3 != r4) goto L23
            long[] r1 = r6.f22780Z
            r1[r0] = r7
            r2[r0] = r9
            return
        L23:
            boolean r2 = r6.f22779Y
            if (r2 == 0) goto L38
            long[] r2 = r6.f22780Z
            int r2 = r2.length
            if (r1 < r2) goto L38
            r6.m12323d()
            long[] r0 = r6.f22780Z
            int r1 = r6.f22782b0
            int r0 = p319s.C5937d.m12315b(r0, r1, r7)
            int r0 = ~r0
        L38:
            int r1 = r6.f22782b0
            long[] r2 = r6.f22780Z
            int r2 = r2.length
            if (r1 < r2) goto L5a
            int r1 = r1 + 1
            int r1 = p319s.C5937d.m12319f(r1)
            long[] r2 = new long[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long[] r3 = r6.f22780Z
            int r4 = r3.length
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r2, r5, r4)
            java.lang.Object[] r3 = r6.f22781a0
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r5, r1, r5, r4)
            r6.f22780Z = r2
            r6.f22781a0 = r1
        L5a:
            int r1 = r6.f22782b0
            int r2 = r1 - r0
            if (r2 == 0) goto L70
            long[] r2 = r6.f22780Z
            int r3 = r0 + 1
            int r1 = r1 - r0
            java.lang.System.arraycopy(r2, r0, r2, r3, r1)
            java.lang.Object[] r1 = r6.f22781a0
            int r2 = r6.f22782b0
            int r2 = r2 - r0
            java.lang.System.arraycopy(r1, r0, r1, r3, r2)
        L70:
            long[] r1 = r6.f22780Z
            r1[r0] = r7
            java.lang.Object[] r7 = r6.f22781a0
            r7[r0] = r9
            int r7 = r6.f22782b0
            int r7 = r7 + 1
            r6.f22782b0 = r7
        L7e:
            return
    }

    /* renamed from: j */
    public int m12327j() {
            r1 = this;
            boolean r0 = r1.f22779Y
            if (r0 == 0) goto L7
            r1.m12323d()
        L7:
            int r0 = r1.f22782b0
            return r0
    }

    /* renamed from: k */
    public E m12328k(int r2) {
            r1 = this;
            boolean r0 = r1.f22779Y
            if (r0 == 0) goto L7
            r1.m12323d()
        L7:
            java.lang.Object[] r0 = r1.f22781a0
            r2 = r0[r2]
            return r2
    }

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.m12327j()
            if (r0 > 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.f22782b0
            int r1 = r1 * 28
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L18:
            int r2 = r5.f22782b0
            if (r1 >= r2) goto L48
            if (r1 <= 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            boolean r2 = r5.f22779Y
            if (r2 == 0) goto L2a
            r5.m12323d()
        L2a:
            long[] r2 = r5.f22780Z
            r3 = r2[r1]
            r0.append(r3)
            r2 = 61
            r0.append(r2)
            java.lang.Object r2 = r5.m12328k(r1)
            if (r2 == r5) goto L40
            r0.append(r2)
            goto L45
        L40:
            java.lang.String r2 = "(this Map)"
            r0.append(r2)
        L45:
            int r1 = r1 + 1
            goto L18
        L48:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
