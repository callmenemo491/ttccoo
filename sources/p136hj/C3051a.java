package p136hj;

/* renamed from: hj.a */
/* loaded from: classes.dex */
public class C3051a extends java.security.Permission {

    /* renamed from: Y */
    public final java.util.Set<java.lang.String> f12278Y;

    public C3051a(java.lang.String r2) {
            r1 = this;
            r1.<init>(r2)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.f12278Y = r0
            r0.add(r2)
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p136hj.C3051a
            if (r0 == 0) goto L12
            hj.a r2 = (p136hj.C3051a) r2
            java.util.Set<java.lang.String> r0 = r1.f12278Y
            java.util.Set<java.lang.String> r2 = r2.f12278Y
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // java.security.Permission
    public java.lang.String getActions() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.f12278Y
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.f12278Y
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.security.Permission
    public boolean implies(java.security.Permission r3) {
            r2 = this;
            boolean r0 = r3 instanceof p136hj.C3051a
            if (r0 == 0) goto L21
            hj.a r3 = (p136hj.C3051a) r3
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = r3.getName()
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 == 0) goto L16
            return r1
        L16:
            java.util.Set<java.lang.String> r0 = r2.f12278Y
            java.util.Set<java.lang.String> r3 = r3.f12278Y
            boolean r3 = r0.containsAll(r3)
            if (r3 == 0) goto L21
            return r1
        L21:
            r3 = 0
            return r3
    }
}
