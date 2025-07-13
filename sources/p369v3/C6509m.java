package p369v3;

/* renamed from: v3.m */
/* loaded from: classes.dex */
public final class C6509m extends p369v3.AbstractC6515s {

    /* renamed from: a */
    public final long f25252a;

    public C6509m(long r1) {
            r0 = this;
            r0.<init>()
            r0.f25252a = r1
            return
    }

    @Override // p369v3.AbstractC6515s
    /* renamed from: b */
    public long mo13237b() {
            r2 = this;
            long r0 = r2.f25252a
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p369v3.AbstractC6515s
            r2 = 0
            if (r1 == 0) goto L18
            v3.s r8 = (p369v3.AbstractC6515s) r8
            long r3 = r7.f25252a
            long r5 = r8.mo13237b()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
        L18:
            return r2
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.f25252a
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r1 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "LogResponse{nextRequestWaitMillis="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            long r1 = r3.f25252a
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
