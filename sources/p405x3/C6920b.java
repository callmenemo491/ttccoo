package p405x3;

/* renamed from: x3.b */
/* loaded from: classes.dex */
public final class C6920b extends com.google.android.datatransport.runtime.backends.AbstractC1040d {

    /* renamed from: a */
    public final android.content.Context f26944a;

    /* renamed from: b */
    public final p050d4.InterfaceC1277a f26945b;

    /* renamed from: c */
    public final p050d4.InterfaceC1277a f26946c;

    /* renamed from: d */
    public final java.lang.String f26947d;

    public C6920b(android.content.Context r2, p050d4.InterfaceC1277a r3, p050d4.InterfaceC1277a r4, java.lang.String r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null applicationContext"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f26944a = r2
            java.lang.String r2 = "Null wallClock"
            java.util.Objects.requireNonNull(r3, r2)
            r1.f26945b = r3
            java.lang.String r2 = "Null monotonicClock"
            java.util.Objects.requireNonNull(r4, r2)
            r1.f26946c = r4
            java.lang.String r2 = "Null backendName"
            java.util.Objects.requireNonNull(r5, r2)
            r1.f26947d = r5
            return
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC1040d
    /* renamed from: a */
    public android.content.Context mo2806a() {
            r1 = this;
            android.content.Context r0 = r1.f26944a
            return r0
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC1040d
    /* renamed from: b */
    public java.lang.String mo2807b() {
            r1 = this;
            java.lang.String r0 = r1.f26947d
            return r0
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC1040d
    /* renamed from: c */
    public p050d4.InterfaceC1277a mo2808c() {
            r1 = this;
            d4.a r0 = r1.f26946c
            return r0
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC1040d
    /* renamed from: d */
    public p050d4.InterfaceC1277a mo2809d() {
            r1 = this;
            d4.a r0 = r1.f26945b
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.datatransport.runtime.backends.AbstractC1040d
            r2 = 0
            if (r1 == 0) goto L3e
            com.google.android.datatransport.runtime.backends.d r5 = (com.google.android.datatransport.runtime.backends.AbstractC1040d) r5
            android.content.Context r1 = r4.f26944a
            android.content.Context r3 = r5.mo2806a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3c
            d4.a r1 = r4.f26945b
            d4.a r3 = r5.mo2809d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3c
            d4.a r1 = r4.f26946c
            d4.a r3 = r5.mo2808c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3c
            java.lang.String r1 = r4.f26947d
            java.lang.String r5 = r5.mo2807b()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L3c
            goto L3d
        L3c:
            r0 = 0
        L3d:
            return r0
        L3e:
            return r2
    }

    public int hashCode() {
            r3 = this;
            android.content.Context r0 = r3.f26944a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            d4.a r2 = r3.f26945b
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            d4.a r2 = r3.f26946c
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r1 = r3.f26947d
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "CreationContext{applicationContext="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            android.content.Context r1 = r3.f26944a
            r0.append(r1)
            java.lang.String r1 = ", wallClock="
            r0.append(r1)
            d4.a r1 = r3.f26945b
            r0.append(r1)
            java.lang.String r1 = ", monotonicClock="
            r0.append(r1)
            d4.a r1 = r3.f26946c
            r0.append(r1)
            java.lang.String r1 = ", backendName="
            r0.append(r1)
            java.lang.String r1 = r3.f26947d
            java.lang.String r2 = "}"
            java.lang.String r0 = p346u.C6269n.m12888a(r0, r1, r2)
            return r0
    }
}
