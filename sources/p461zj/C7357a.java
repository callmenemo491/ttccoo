package p461zj;

/* renamed from: zj.a */
/* loaded from: classes.dex */
public class C7357a {

    /* renamed from: a */
    public java.lang.String f28124a;

    /* renamed from: b */
    public java.lang.String f28125b;

    public C7357a(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f28124a = r1
            r0.f28125b = r2
            return
    }

    /* renamed from: a */
    public final boolean m14445a(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            if (r1 == 0) goto Le
            if (r2 != 0) goto L9
            goto Le
        L9:
            boolean r1 = r1.equals(r2)
            return r1
        Le:
            r1 = 0
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p461zj.C7357a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            zj.a r4 = (p461zj.C7357a) r4
            if (r4 == r3) goto L1e
            java.lang.String r0 = r3.f28124a
            java.lang.String r2 = r4.f28124a
            boolean r0 = r3.m14445a(r0, r2)
            if (r0 == 0) goto L1f
            java.lang.String r0 = r3.f28125b
            java.lang.String r4 = r4.f28125b
            boolean r4 = r3.m14445a(r0, r4)
            if (r4 == 0) goto L1f
        L1e:
            r1 = 1
        L1f:
            return r1
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f28124a
            r1 = 1
            if (r0 != 0) goto L7
            r0 = 1
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            java.lang.String r2 = r3.f28125b
            if (r2 != 0) goto L10
            goto L14
        L10:
            int r1 = r2.hashCode()
        L14:
            int r1 = r1 * 31
            int r1 = r1 + r0
            return r1
    }
}
