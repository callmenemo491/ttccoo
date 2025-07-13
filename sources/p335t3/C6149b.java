package p335t3;

/* renamed from: t3.b */
/* loaded from: classes.dex */
public final class C6149b {

    /* renamed from: a */
    public final java.lang.String f23741a;

    public C6149b(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "name is null"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f23741a = r2
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p335t3.C6149b
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            java.lang.String r0 = r1.f23741a
            t3.b r2 = (p335t3.C6149b) r2
            java.lang.String r2 = r2.f23741a
            boolean r2 = r0.equals(r2)
            return r2
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f23741a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Encoding{name=\""
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f23741a
            java.lang.String r2 = "\"}"
            java.lang.String r0 = p346u.C6269n.m12888a(r0, r1, r2)
            return r0
    }
}
