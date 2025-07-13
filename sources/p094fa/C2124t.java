package p094fa;

/* renamed from: fa.t */
/* loaded from: classes.dex */
public final class C2124t extends p094fa.AbstractC2103a0.e.d.AbstractC7389d {

    /* renamed from: a */
    public final java.lang.String f9798a;

    /* renamed from: fa.t$a */
    public static /* synthetic */ class a {
    }

    public C2124t(java.lang.String r1, p094fa.C2124t.a r2) {
            r0 = this;
            r0.<init>()
            r0.f9798a = r1
            return
    }

    @Override // p094fa.AbstractC2103a0.e.d.AbstractC7389d
    /* renamed from: a */
    public java.lang.String mo5656a() {
            r1 = this;
            java.lang.String r0 = r1.f9798a
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p094fa.AbstractC2103a0.e.d.AbstractC7389d
            if (r0 == 0) goto L15
            fa.a0$e$d$d r2 = (p094fa.AbstractC2103a0.e.d.AbstractC7389d) r2
            java.lang.String r0 = r1.f9798a
            java.lang.String r2 = r2.mo5656a()
            boolean r2 = r0.equals(r2)
            return r2
        L15:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f9798a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Log{content="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f9798a
            java.lang.String r2 = "}"
            java.lang.String r0 = p346u.C6269n.m12888a(r0, r1, r2)
            return r0
    }
}
