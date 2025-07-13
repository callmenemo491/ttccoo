package p317ri;

/* renamed from: ri.h */
/* loaded from: classes.dex */
public abstract class AbstractC5879h extends p317ri.AbstractC5912s {

    /* renamed from: Y */
    public p317ri.C5897n f22697Y;

    /* renamed from: Z */
    public p317ri.C5888k f22698Z;

    /* renamed from: a0 */
    public p317ri.AbstractC5912s f22699a0;

    /* renamed from: b0 */
    public int f22700b0;

    /* renamed from: c0 */
    public p317ri.AbstractC5912s f22701c0;

    public AbstractC5879h(p124h7.C2839rb r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            ri.s r1 = r4.m12222C(r5, r0)
            boolean r2 = r1 instanceof p317ri.C5897n
            r3 = 1
            if (r2 == 0) goto L16
            ri.n r1 = (p317ri.C5897n) r1
            r4.f22697Y = r1
            ri.s r1 = r4.m12222C(r5, r3)
            r0 = 1
        L16:
            boolean r2 = r1 instanceof p317ri.C5888k
            if (r2 == 0) goto L24
            ri.k r1 = (p317ri.C5888k) r1
            r4.f22698Z = r1
            int r0 = r0 + 1
            ri.s r1 = r4.m12222C(r5, r0)
        L24:
            boolean r2 = r1 instanceof p317ri.AbstractC5928y
            if (r2 != 0) goto L30
            r4.f22699a0 = r1
            int r0 = r0 + 1
            ri.s r1 = r4.m12222C(r5, r0)
        L30:
            int r5 = r5.m7098u()
            int r0 = r0 + r3
            if (r5 != r0) goto L51
            boolean r5 = r1 instanceof p317ri.AbstractC5928y
            if (r5 == 0) goto L49
            ri.y r1 = (p317ri.AbstractC5928y) r1
            int r5 = r1.f22755Y
            r4.m12223D(r5)
            ri.s r5 = r1.m12294D()
            r4.f22701c0 = r5
            return
        L49:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "No tagged object found in vector. Structure doesn't seem to be of type External"
            r5.<init>(r0)
            throw r5
        L51:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "input vector too large"
            r5.<init>(r0)
            throw r5
    }

    public AbstractC5879h(p317ri.C5897n r1, p317ri.C5888k r2, p317ri.AbstractC5912s r3, int r4, p317ri.AbstractC5912s r5) {
            r0 = this;
            r0.<init>()
            r0.f22697Y = r1
            r0.f22698Z = r2
            r0.f22699a0 = r3
            r0.m12223D(r4)
            java.util.Objects.requireNonNull(r5)
            r0.f22701c0 = r5
            return
    }

    /* renamed from: C */
    public final p317ri.AbstractC5912s m12222C(p124h7.C2839rb r2, int r3) {
            r1 = this;
            int r0 = r2.m7098u()
            if (r0 <= r3) goto L15
            java.lang.Object r2 = r2.f11884Z
            java.util.Vector r2 = (java.util.Vector) r2
            java.lang.Object r2 = r2.elementAt(r3)
            ri.e r2 = (p317ri.InterfaceC5870e) r2
            ri.s r2 = r2.mo168e()
            return r2
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "too few objects in input vector"
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: D */
    public final void m12223D(int r3) {
            r2 = this;
            if (r3 < 0) goto L8
            r0 = 2
            if (r3 > r0) goto L8
            r2.f22700b0 = r3
            return
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "invalid encoding value: "
            java.lang.String r3 = android.support.v4.media.C0142a.m254a(r1, r3)
            r0.<init>(r3)
            throw r0
    }

    @Override // p317ri.AbstractC5894m
    public int hashCode() {
            r2 = this;
            ri.n r0 = r2.f22697Y
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            ri.k r1 = r2.f22698Z
            if (r1 == 0) goto L13
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
        L13:
            ri.s r1 = r2.f22699a0
            if (r1 == 0) goto L1c
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
        L1c:
            ri.s r1 = r2.f22701c0
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: n */
    public boolean mo12203n(p317ri.AbstractC5912s r4) {
            r3 = this;
            boolean r0 = r4 instanceof p317ri.AbstractC5879h
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            if (r3 != r4) goto La
            r4 = 1
            return r4
        La:
            ri.h r4 = (p317ri.AbstractC5879h) r4
            ri.n r0 = r3.f22697Y
            if (r0 == 0) goto L1b
            ri.n r2 = r4.f22697Y
            if (r2 == 0) goto L1a
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1b
        L1a:
            return r1
        L1b:
            ri.k r0 = r3.f22698Z
            if (r0 == 0) goto L2a
            ri.k r2 = r4.f22698Z
            if (r2 == 0) goto L29
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2a
        L29:
            return r1
        L2a:
            ri.s r0 = r3.f22699a0
            if (r0 == 0) goto L39
            ri.s r2 = r4.f22699a0
            if (r2 == 0) goto L38
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L39
        L38:
            return r1
        L39:
            ri.s r0 = r3.f22701c0
            ri.s r4 = r4.f22701c0
            boolean r4 = r0.equals(r4)
            return r4
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r1 = this;
            byte[] r0 = r1.m12245l()
            int r0 = r0.length
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: w */
    public boolean mo12206w() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: z */
    public p317ri.AbstractC5912s mo12212z() {
            r7 = this;
            boolean r0 = r7 instanceof p317ri.C5901o0
            if (r0 == 0) goto L5
            return r7
        L5:
            ri.o0 r0 = new ri.o0
            ri.n r2 = r7.f22697Y
            ri.k r3 = r7.f22698Z
            ri.s r4 = r7.f22699a0
            int r5 = r7.f22700b0
            ri.s r6 = r7.f22701c0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }
}
