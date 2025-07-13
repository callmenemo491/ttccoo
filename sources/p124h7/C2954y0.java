package p124h7;

/* renamed from: h7.y0 */
/* loaded from: classes.dex */
public final class C2954y0 extends p124h7.AbstractC2900v0<p124h7.C2936x0, p124h7.C2936x0> {
    public C2954y0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p124h7.AbstractC2900v0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ int mo7180a(p124h7.C2936x0 r1) {
            r0 = this;
            h7.x0 r1 = (p124h7.C2936x0) r1
            int r1 = r1.m7247a()
            return r1
    }

    @Override // p124h7.AbstractC2900v0
    /* renamed from: b */
    public final int mo7181b(p124h7.C2936x0 r7) {
            r6 = this;
            h7.x0 r7 = (p124h7.C2936x0) r7
            int r0 = r7.f12015d
            r1 = -1
            if (r0 != r1) goto L44
            r0 = 0
            r1 = 0
        L9:
            int r2 = r7.f12012a
            if (r0 >= r2) goto L41
            int[] r2 = r7.f12013b
            r2 = r2[r0]
            java.lang.Object[] r3 = r7.f12014c
            r3 = r3[r0]
            h7.cg r3 = (p124h7.AbstractC2574cg) r3
            r4 = 8
            int r4 = p124h7.AbstractC2682ig.m6841h(r4)
            int r3 = r3.mo6474h()
            int r4 = r4 + r4
            r5 = 16
            int r5 = p124h7.AbstractC2682ig.m6841h(r5)
            int r2 = r2 >>> 3
            int r2 = p124h7.AbstractC2682ig.m6841h(r2)
            int r2 = r2 + r5
            int r2 = r2 + r4
            r4 = 24
            int r4 = p124h7.AbstractC2682ig.m6841h(r4)
            int r5 = p124h7.AbstractC2682ig.m6841h(r3)
            int r5 = r5 + r3
            int r5 = r5 + r4
            int r5 = r5 + r2
            int r1 = r1 + r5
            int r0 = r0 + 1
            goto L9
        L41:
            r7.f12015d = r1
            r0 = r1
        L44:
            return r0
    }

    @Override // p124h7.AbstractC2900v0
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ p124h7.C2936x0 mo7182c(java.lang.Object r3) {
            r2 = this;
            h7.yg r3 = (p124h7.AbstractC2970yg) r3
            h7.x0 r0 = r3.zzc
            h7.x0 r1 = p124h7.C2936x0.f12011f
            if (r0 != r1) goto Le
            h7.x0 r0 = p124h7.C2936x0.m7246b()
            r3.zzc = r0
        Le:
            return r0
    }

    @Override // p124h7.AbstractC2900v0
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ p124h7.C2936x0 mo7183d(java.lang.Object r1) {
            r0 = this;
            h7.yg r1 = (p124h7.AbstractC2970yg) r1
            h7.x0 r1 = r1.zzc
            return r1
    }

    @Override // p124h7.AbstractC2900v0
    /* renamed from: e */
    public final p124h7.C2936x0 mo7184e(p124h7.C2936x0 r7, p124h7.C2936x0 r8) {
            r6 = this;
            h7.x0 r0 = p124h7.C2936x0.f12011f
            h7.x0 r8 = (p124h7.C2936x0) r8
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lb
            return r7
        Lb:
            h7.x0 r7 = (p124h7.C2936x0) r7
            int r0 = r7.f12012a
            int r1 = r8.f12012a
            int r0 = r0 + r1
            int[] r1 = r7.f12013b
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            int[] r2 = r8.f12013b
            int r3 = r7.f12012a
            int r4 = r8.f12012a
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r1, r3, r4)
            java.lang.Object[] r2 = r7.f12014c
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.Object[] r3 = r8.f12014c
            int r7 = r7.f12012a
            int r8 = r8.f12012a
            java.lang.System.arraycopy(r3, r5, r2, r7, r8)
            h7.x0 r7 = new h7.x0
            r8 = 1
            r7.<init>(r0, r1, r2, r8)
            return r7
    }

    @Override // p124h7.AbstractC2900v0
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ p124h7.C2936x0 mo7185f() {
            r1 = this;
            h7.x0 r0 = p124h7.C2936x0.m7246b()
            return r0
    }

    @Override // p124h7.AbstractC2900v0
    /* renamed from: g */
    public final p124h7.C2936x0 mo7186g(p124h7.C2936x0 r3) {
            r2 = this;
            r0 = r3
            h7.x0 r0 = (p124h7.C2936x0) r0
            r1 = 0
            r0.f12016e = r1
            return r3
    }

    @Override // p124h7.AbstractC2900v0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo7187h(p124h7.C2936x0 r1, int r2, int r3) {
            r0 = this;
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            h7.x0 r1 = (p124h7.C2936x0) r1
            int r2 = r2 << 3
            r2 = r2 | 5
            r1.m7248c(r2, r3)
            return
    }

    @Override // p124h7.AbstractC2900v0
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo7188i(p124h7.C2936x0 r1, int r2, long r3) {
            r0 = this;
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            h7.x0 r1 = (p124h7.C2936x0) r1
            int r2 = r2 << 3
            r2 = r2 | 1
            r1.m7248c(r2, r3)
            return
    }

    @Override // p124h7.AbstractC2900v0
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo7189j(p124h7.C2936x0 r1, int r2, p124h7.C2936x0 r3) {
            r0 = this;
            h7.x0 r1 = (p124h7.C2936x0) r1
            int r2 = r2 << 3
            r2 = r2 | 3
            r1.m7248c(r2, r3)
            return
    }

    @Override // p124h7.AbstractC2900v0
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo7190k(p124h7.C2936x0 r1, int r2, p124h7.AbstractC2574cg r3) {
            r0 = this;
            h7.x0 r1 = (p124h7.C2936x0) r1
            int r2 = r2 << 3
            r2 = r2 | 2
            r1.m7248c(r2, r3)
            return
    }

    @Override // p124h7.AbstractC2900v0
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ void mo7191l(p124h7.C2936x0 r1, int r2, long r3) {
            r0 = this;
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            h7.x0 r1 = (p124h7.C2936x0) r1
            int r2 = r2 << 3
            r1.m7248c(r2, r3)
            return
    }

    @Override // p124h7.AbstractC2900v0
    /* renamed from: m */
    public final void mo7192m(java.lang.Object r2) {
            r1 = this;
            h7.yg r2 = (p124h7.AbstractC2970yg) r2
            h7.x0 r2 = r2.zzc
            r0 = 0
            r2.f12016e = r0
            return
    }

    @Override // p124h7.AbstractC2900v0
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ void mo7193n(java.lang.Object r1, p124h7.C2936x0 r2) {
            r0 = this;
            h7.yg r1 = (p124h7.AbstractC2970yg) r1
            h7.x0 r2 = (p124h7.C2936x0) r2
            r1.zzc = r2
            return
    }

    @Override // p124h7.AbstractC2900v0
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ void mo7194o(java.lang.Object r1, p124h7.C2936x0 r2) {
            r0 = this;
            h7.x0 r2 = (p124h7.C2936x0) r2
            h7.yg r1 = (p124h7.AbstractC2970yg) r1
            r1.zzc = r2
            return
    }

    @Override // p124h7.AbstractC2900v0
    /* renamed from: q */
    public final boolean mo7196q(p124h7.C2610eg r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // p124h7.AbstractC2900v0
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ void mo7197r(p124h7.C2936x0 r1, p124h7.C2700jg r2) {
            r0 = this;
            h7.x0 r1 = (p124h7.C2936x0) r1
            r1.m7249d(r2)
            return
    }
}
