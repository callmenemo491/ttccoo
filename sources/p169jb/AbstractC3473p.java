package p169jb;

/* renamed from: jb.p */
/* loaded from: classes.dex */
public abstract class AbstractC3473p {
    public AbstractC3473p() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public int mo7941a() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: e */
    public p169jb.C3477t m7947e() {
            r3 = this;
            boolean r0 = r3 instanceof p169jb.C3477t
            if (r0 == 0) goto L8
            r0 = r3
            jb.t r0 = (p169jb.C3477t) r0
            return r0
        L8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Not a JSON Primitive: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: h */
    public long mo7942h() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: i */
    public short mo7943i() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: l */
    public java.lang.String mo7944l() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch: java.io.IOException -> L17
            r0.<init>()     // Catch: java.io.IOException -> L17
            qb.c r1 = new qb.c     // Catch: java.io.IOException -> L17
            r1.<init>(r0)     // Catch: java.io.IOException -> L17
            r2 = 1
            r1.f21808d0 = r2     // Catch: java.io.IOException -> L17
            jb.z<jb.p> r2 = p222mb.C4524o.f18373C     // Catch: java.io.IOException -> L17
            r2.mo7920b(r1, r3)     // Catch: java.io.IOException -> L17
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L17
            return r0
        L17:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }
}
