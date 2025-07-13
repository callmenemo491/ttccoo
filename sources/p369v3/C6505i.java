package p369v3;

/* renamed from: v3.i */
/* loaded from: classes.dex */
public final class C6505i extends p369v3.AbstractC6511o {

    /* renamed from: a */
    public final java.util.List<p369v3.AbstractC6514r> f25228a;

    public C6505i(java.util.List<p369v3.AbstractC6514r> r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null logRequests"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f25228a = r2
            return
    }

    @Override // p369v3.AbstractC6511o
    /* renamed from: a */
    public java.util.List<p369v3.AbstractC6514r> mo13220a() {
            r1 = this;
            java.util.List<v3.r> r0 = r1.f25228a
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p369v3.AbstractC6511o
            if (r0 == 0) goto L15
            v3.o r2 = (p369v3.AbstractC6511o) r2
            java.util.List<v3.r> r0 = r1.f25228a
            java.util.List r2 = r2.mo13220a()
            boolean r2 = r0.equals(r2)
            return r2
        L15:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r2 = this;
            java.util.List<v3.r> r0 = r2.f25228a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "BatchedLogRequest{logRequests="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.util.List<v3.r> r1 = r2.f25228a
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
