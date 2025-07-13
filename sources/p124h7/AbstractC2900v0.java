package p124h7;

/* renamed from: h7.v0 */
/* loaded from: classes.dex */
public abstract class AbstractC2900v0<T, B> {
    public AbstractC2900v0() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract int mo7180a(T r1);

    /* renamed from: b */
    public abstract int mo7181b(T r1);

    /* renamed from: c */
    public abstract B mo7182c(java.lang.Object r1);

    /* renamed from: d */
    public abstract T mo7183d(java.lang.Object r1);

    /* renamed from: e */
    public abstract T mo7184e(T r1, T r2);

    /* renamed from: f */
    public abstract B mo7185f();

    /* renamed from: g */
    public abstract T mo7186g(B r1);

    /* renamed from: h */
    public abstract void mo7187h(B r1, int r2, int r3);

    /* renamed from: i */
    public abstract void mo7188i(B r1, int r2, long r3);

    /* renamed from: j */
    public abstract void mo7189j(B r1, int r2, T r3);

    /* renamed from: k */
    public abstract void mo7190k(B r1, int r2, p124h7.AbstractC2574cg r3);

    /* renamed from: l */
    public abstract void mo7191l(B r1, int r2, long r3);

    /* renamed from: m */
    public abstract void mo7192m(java.lang.Object r1);

    /* renamed from: n */
    public abstract void mo7193n(java.lang.Object r1, B r2);

    /* renamed from: o */
    public abstract void mo7194o(java.lang.Object r1, T r2);

    /* renamed from: p */
    public final boolean m7195p(B r7, p124h7.C2610eg r8) {
            r6 = this;
            int r0 = r8.f11500b
            int r1 = r0 >>> 3
            r0 = r0 & 7
            r2 = 1
            if (r0 == 0) goto L5f
            if (r0 == r2) goto L57
            r3 = 2
            if (r0 == r3) goto L4f
            r3 = 4
            r4 = 3
            if (r0 == r4) goto L29
            if (r0 == r3) goto L27
            r3 = 5
            if (r0 != r3) goto L1f
            int r8 = r8.m6676v()
            r6.mo7187h(r7, r1, r8)
            return r2
        L1f:
            int r7 = p124h7.C2611f.f11503Y
            h7.e r7 = new h7.e
            r7.<init>()
            throw r7
        L27:
            r7 = 0
            return r7
        L29:
            java.lang.Object r0 = r6.mo7185f()
            int r4 = r1 << 3
            r3 = r3 | r4
        L30:
            int r4 = r8.m6675u()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L3f
            boolean r4 = r6.m7195p(r0, r8)
            if (r4 != 0) goto L30
        L3f:
            int r8 = r8.f11500b
            if (r3 != r8) goto L4a
            r6.mo7186g(r0)
            r6.mo7189j(r7, r1, r0)
            return r2
        L4a:
            h7.f r7 = p124h7.C2611f.m6681a()
            throw r7
        L4f:
            h7.cg r8 = r8.m6680z()
            r6.mo7190k(r7, r1, r8)
            return r2
        L57:
            long r3 = r8.m6678x()
            r6.mo7188i(r7, r1, r3)
            return r2
        L5f:
            long r3 = r8.m6679y()
            r6.mo7191l(r7, r1, r3)
            return r2
    }

    /* renamed from: q */
    public abstract boolean mo7196q(p124h7.C2610eg r1);

    /* renamed from: r */
    public abstract void mo7197r(T r1, p124h7.C2700jg r2);
}
