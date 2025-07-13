package p094fa;

/* renamed from: fa.v */
/* loaded from: classes.dex */
public final class C2126v extends p094fa.AbstractC2103a0.e.f {

    /* renamed from: a */
    public final java.lang.String f9803a;

    /* renamed from: fa.v$a */
    public static /* synthetic */ class a {
    }

    public C2126v(java.lang.String r1, p094fa.C2126v.a r2) {
            r0 = this;
            r0.<init>()
            r0.f9803a = r1
            return
    }

    @Override // p094fa.AbstractC2103a0.e.f
    /* renamed from: a */
    public java.lang.String mo5661a() {
            r1 = this;
            java.lang.String r0 = r1.f9803a
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p094fa.AbstractC2103a0.e.f
            if (r0 == 0) goto L15
            fa.a0$e$f r2 = (p094fa.AbstractC2103a0.e.f) r2
            java.lang.String r0 = r1.f9803a
            java.lang.String r2 = r2.mo5661a()
            boolean r2 = r0.equals(r2)
            return r2
        L15:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f9803a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "User{identifier="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f9803a
            java.lang.String r2 = "}"
            java.lang.String r0 = p346u.C6269n.m12888a(r0, r1, r2)
            return r0
    }
}
