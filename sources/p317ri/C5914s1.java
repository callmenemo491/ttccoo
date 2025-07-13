package p317ri;

/* renamed from: ri.s1 */
/* loaded from: classes.dex */
public class C5914s1 implements java.util.Enumeration {

    /* renamed from: a */
    public p317ri.C5885j f22741a;

    /* renamed from: b */
    public java.lang.Object f22742b;

    public C5914s1(byte[] r3) {
            r2 = this;
            r2.<init>()
            ri.j r0 = new ri.j
            r1 = 1
            r0.<init>(r3, r1)
            r2.f22741a = r0
            java.lang.Object r3 = r2.m12273a()
            r2.f22742b = r3
            return
    }

    /* renamed from: a */
    public final java.lang.Object m12273a() {
            r4 = this;
            ri.j r0 = r4.f22741a     // Catch: java.io.IOException -> L7
            ri.s r0 = r0.m12237A()     // Catch: java.io.IOException -> L7
            return r0
        L7:
            r0 = move-exception
            ri.r r1 = new ri.r
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "malformed DER construction: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r3 = 0
            r1.<init>(r2, r0, r3)
            throw r1
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
            r1 = this;
            java.lang.Object r0 = r1.f22742b
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // java.util.Enumeration
    public java.lang.Object nextElement() {
            r2 = this;
            java.lang.Object r0 = r2.f22742b
            java.lang.Object r1 = r2.m12273a()
            r2.f22742b = r1
            return r0
    }
}
