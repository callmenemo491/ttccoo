package p169jb;

/* renamed from: jb.m */
/* loaded from: classes.dex */
public final class C3470m extends p169jb.AbstractC3473p implements java.lang.Iterable<p169jb.AbstractC3473p> {

    /* renamed from: Y */
    public final java.util.List<p169jb.AbstractC3473p> f14966Y;

    public C3470m() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f14966Y = r0
            return
    }

    @Override // p169jb.AbstractC3473p
    /* renamed from: a */
    public int mo7941a() {
            r2 = this;
            java.util.List<jb.p> r0 = r2.f14966Y
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L17
            java.util.List<jb.p> r0 = r2.f14966Y
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            jb.p r0 = (p169jb.AbstractC3473p) r0
            int r0 = r0.mo7941a()
            return r0
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L15
            boolean r0 = r2 instanceof p169jb.C3470m
            if (r0 == 0) goto L13
            jb.m r2 = (p169jb.C3470m) r2
            java.util.List<jb.p> r2 = r2.f14966Y
            java.util.List<jb.p> r0 = r1.f14966Y
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L13
            goto L15
        L13:
            r2 = 0
            goto L16
        L15:
            r2 = 1
        L16:
            return r2
    }

    @Override // p169jb.AbstractC3473p
    /* renamed from: h */
    public long mo7942h() {
            r2 = this;
            java.util.List<jb.p> r0 = r2.f14966Y
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L17
            java.util.List<jb.p> r0 = r2.f14966Y
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            jb.p r0 = (p169jb.AbstractC3473p) r0
            long r0 = r0.mo7942h()
            return r0
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    public int hashCode() {
            r1 = this;
            java.util.List<jb.p> r0 = r1.f14966Y
            int r0 = r0.hashCode()
            return r0
    }

    @Override // p169jb.AbstractC3473p
    /* renamed from: i */
    public short mo7943i() {
            r2 = this;
            java.util.List<jb.p> r0 = r2.f14966Y
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L17
            java.util.List<jb.p> r0 = r2.f14966Y
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            jb.p r0 = (p169jb.AbstractC3473p) r0
            short r0 = r0.mo7943i()
            return r0
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<p169jb.AbstractC3473p> iterator() {
            r1 = this;
            java.util.List<jb.p> r0 = r1.f14966Y
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // p169jb.AbstractC3473p
    /* renamed from: l */
    public java.lang.String mo7944l() {
            r2 = this;
            java.util.List<jb.p> r0 = r2.f14966Y
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L17
            java.util.List<jb.p> r0 = r2.f14966Y
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            jb.p r0 = (p169jb.AbstractC3473p) r0
            java.lang.String r0 = r0.mo7944l()
            return r0
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    /* renamed from: m */
    public p169jb.AbstractC3473p m7945m(int r2) {
            r1 = this;
            java.util.List<jb.p> r0 = r1.f14966Y
            java.lang.Object r2 = r0.get(r2)
            jb.p r2 = (p169jb.AbstractC3473p) r2
            return r2
    }
}
