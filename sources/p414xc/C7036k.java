package p414xc;

/* renamed from: xc.k */
/* loaded from: classes.dex */
public class C7036k {
    public static java.lang.String ACTOR = "actor";
    public static java.lang.String PERMISSION = "permission";
    private p414xc.C7026a gAccountName;
    private p414xc.C7037l gPermissionName;

    public C7036k() {
            r0 = this;
            r0.<init>()
            return
    }

    public C7036k(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            xc.a r0 = new xc.a
            r0.<init>(r2)
            r1.gAccountName = r0
            xc.l r2 = new xc.l
            r2.<init>(r3)
            r1.gPermissionName = r2
            return
    }

    public C7036k(p169jb.C3476s r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = p414xc.C7036k.PERMISSION
            lb.r<java.lang.String, jb.p> r1 = r3.f14968a
            lb.r$e r0 = r1.m9560c(r0)
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L3e
            java.lang.String r0 = p414xc.C7036k.PERMISSION
            jb.p r0 = r3.m7949n(r0)
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r0 instanceof p169jb.C3476s
            if (r0 == 0) goto L30
            java.lang.String r0 = p414xc.C7036k.PERMISSION
            lb.r<java.lang.String, jb.p> r3 = r3.f14968a
            lb.r$e r3 = r3.m9560c(r0)
            if (r3 == 0) goto L2c
            V r3 = r3.f17456e0
            goto L2d
        L2c:
            r3 = 0
        L2d:
            jb.s r3 = (p169jb.C3476s) r3
            goto L3e
        L30:
            java.lang.String r0 = p414xc.C7036k.PERMISSION
            jb.p r0 = r3.m7949n(r0)
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r0 instanceof p169jb.C3475r
            if (r0 == 0) goto L3e
            return
        L3e:
            xc.a r0 = new xc.a
            java.lang.String r1 = p414xc.C7036k.ACTOR
            jb.p r1 = r3.m7949n(r1)
            java.lang.String r1 = r1.mo7944l()
            r0.<init>(r1)
            r2.gAccountName = r0
            xc.l r0 = new xc.l
            java.lang.String r1 = p414xc.C7036k.PERMISSION
            jb.p r3 = r3.m7949n(r1)
            java.lang.String r3 = r3.mo7944l()
            r0.<init>(r3)
            r2.gPermissionName = r0
            return
    }

    public C7036k(p414xc.C7026a r1, p414xc.C7037l r2) {
            r0 = this;
            r0.<init>()
            r0.gAccountName = r1
            r0.gPermissionName = r2
            return
    }

    public p414xc.C7026a getAccountName() {
            r1 = this;
            xc.a r0 = r1.gAccountName
            return r0
    }

    public p414xc.C7037l getPermissionName() {
            r1 = this;
            xc.l r0 = r1.gPermissionName
            return r0
    }

    public void setAccountName(p414xc.C7026a r1) {
            r0 = this;
            r0.gAccountName = r1
            return
    }

    public void setPermissionName(p414xc.C7037l r1) {
            r0 = this;
            r0.gPermissionName = r1
            return
    }

    public java.lang.String toJSON() {
            r1 = this;
            java.util.Map r0 = r1.toMap()
            java.lang.String r0 = p435yc.C7155a.m14270c(r0)
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.String> toMap() {
            r4 = this;
            xc.a r0 = r4.gAccountName
            r1 = 0
            if (r0 == 0) goto L2d
            xc.l r0 = r4.gPermissionName
            if (r0 != 0) goto La
            goto L2d
        La:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r2 = p414xc.C7036k.ACTOR
            xc.a r3 = r4.gAccountName
            if (r3 != 0) goto L17
            r3 = r1
            goto L1b
        L17:
            java.lang.String r3 = r3.getName()
        L1b:
            r0.put(r2, r3)
            java.lang.String r2 = p414xc.C7036k.PERMISSION
            xc.l r3 = r4.gPermissionName
            if (r3 != 0) goto L25
            goto L29
        L25:
            java.lang.String r1 = r3.getName()
        L29:
            r0.put(r2, r1)
            return r0
        L2d:
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.toJSON()
            return r0
    }
}
