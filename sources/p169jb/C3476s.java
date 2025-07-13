package p169jb;

/* renamed from: jb.s */
/* loaded from: classes.dex */
public final class C3476s extends p169jb.AbstractC3473p {

    /* renamed from: a */
    public final lb.C4255r<java.lang.String, p169jb.AbstractC3473p> f14968a;

    public C3476s() {
            r1 = this;
            r1.<init>()
            lb.r r0 = new lb.r
            r0.<init>()
            r1.f14968a = r0
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L15
            boolean r0 = r2 instanceof p169jb.C3476s
            if (r0 == 0) goto L13
            jb.s r2 = (p169jb.C3476s) r2
            lb.r<java.lang.String, jb.p> r2 = r2.f14968a
            lb.r<java.lang.String, jb.p> r0 = r1.f14968a
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

    public int hashCode() {
            r1 = this;
            lb.r<java.lang.String, jb.p> r0 = r1.f14968a
            int r0 = r0.hashCode()
            return r0
    }

    /* renamed from: m */
    public void m7948m(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            if (r3 != 0) goto L5
            jb.r r3 = p169jb.C3475r.f14967a
            goto Lb
        L5:
            jb.t r0 = new jb.t
            r0.<init>(r3)
            r3 = r0
        Lb:
            lb.r<java.lang.String, jb.p> r0 = r1.f14968a
            r0.put(r2, r3)
            return
    }

    /* renamed from: n */
    public p169jb.AbstractC3473p m7949n(java.lang.String r2) {
            r1 = this;
            lb.r<java.lang.String, jb.p> r0 = r1.f14968a
            lb.r$e r2 = r0.m9560c(r2)
            if (r2 == 0) goto Lb
            V r2 = r2.f17456e0
            goto Lc
        Lb:
            r2 = 0
        Lc:
            jb.p r2 = (p169jb.AbstractC3473p) r2
            return r2
    }

    /* renamed from: p */
    public p169jb.C3470m m7950p(java.lang.String r2) {
            r1 = this;
            lb.r<java.lang.String, jb.p> r0 = r1.f14968a
            lb.r$e r2 = r0.m9560c(r2)
            if (r2 == 0) goto Lb
            V r2 = r2.f17456e0
            goto Lc
        Lb:
            r2 = 0
        Lc:
            jb.m r2 = (p169jb.C3470m) r2
            return r2
    }
}
