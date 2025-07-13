package com.google.android.datatransport.runtime.backends;

/* renamed from: com.google.android.datatransport.runtime.backends.a */
/* loaded from: classes.dex */
public final class C1037a extends com.google.android.datatransport.runtime.backends.AbstractC1039c {

    /* renamed from: a */
    public final com.google.android.datatransport.runtime.backends.AbstractC1039c.a f5229a;

    /* renamed from: b */
    public final long f5230b;

    public C1037a(com.google.android.datatransport.runtime.backends.AbstractC1039c.a r2, long r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null status"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f5229a = r2
            r1.f5230b = r3
            return
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC1039c
    /* renamed from: b */
    public long mo2801b() {
            r2 = this;
            long r0 = r2.f5230b
            return r0
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC1039c
    /* renamed from: c */
    public com.google.android.datatransport.runtime.backends.AbstractC1039c.a mo2802c() {
            r1 = this;
            com.google.android.datatransport.runtime.backends.c$a r0 = r1.f5229a
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.datatransport.runtime.backends.AbstractC1039c
            r2 = 0
            if (r1 == 0) goto L24
            com.google.android.datatransport.runtime.backends.c r8 = (com.google.android.datatransport.runtime.backends.AbstractC1039c) r8
            com.google.android.datatransport.runtime.backends.c$a r1 = r7.f5229a
            com.google.android.datatransport.runtime.backends.c$a r3 = r8.mo2802c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L22
            long r3 = r7.f5230b
            long r5 = r8.mo2801b()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L22
            goto L23
        L22:
            r0 = 0
        L23:
            return r0
        L24:
            return r2
    }

    public int hashCode() {
            r5 = this;
            com.google.android.datatransport.runtime.backends.c$a r0 = r5.f5229a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            long r1 = r5.f5230b
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            r0 = r0 ^ r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "BackendResponse{status="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            com.google.android.datatransport.runtime.backends.c$a r1 = r3.f5229a
            r0.append(r1)
            java.lang.String r1 = ", nextRequestWaitMillis="
            r0.append(r1)
            long r1 = r3.f5230b
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
