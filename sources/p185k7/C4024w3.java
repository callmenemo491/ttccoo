package p185k7;

/* renamed from: k7.w3 */
/* loaded from: classes.dex */
public final class C4024w3 extends p185k7.AbstractC3908n4 {

    /* renamed from: a */
    public final android.content.Context f16920a;

    /* renamed from: b */
    public final p185k7.InterfaceC3986t4<p185k7.AbstractC3960r4<p185k7.C3785e4>> f16921b;

    public C4024w3(android.content.Context r1, p185k7.InterfaceC3986t4<p185k7.AbstractC3960r4<p185k7.C3785e4>> r2) {
            r0 = this;
            r0.<init>()
            r0.f16920a = r1
            r0.f16921b = r2
            return
    }

    @Override // p185k7.AbstractC3908n4
    /* renamed from: a */
    public final android.content.Context mo8840a() {
            r1 = this;
            android.content.Context r0 = r1.f16920a
            return r0
    }

    @Override // p185k7.AbstractC3908n4
    /* renamed from: b */
    public final p185k7.InterfaceC3986t4<p185k7.AbstractC3960r4<p185k7.C3785e4>> mo8841b() {
            r1 = this;
            k7.t4<k7.r4<k7.e4>> r0 = r1.f16921b
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p185k7.AbstractC3908n4
            r2 = 0
            if (r1 == 0) goto L2a
            k7.n4 r5 = (p185k7.AbstractC3908n4) r5
            android.content.Context r1 = r4.f16920a
            android.content.Context r3 = r5.mo8840a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2a
            k7.t4<k7.r4<k7.e4>> r1 = r4.f16921b
            k7.t4 r5 = r5.mo8841b()
            if (r1 != 0) goto L22
            if (r5 != 0) goto L2a
            goto L29
        L22:
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L29
            goto L2a
        L29:
            return r0
        L2a:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            android.content.Context r0 = r2.f16920a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            k7.t4<k7.r4<k7.e4>> r1 = r2.f16921b
            if (r1 != 0) goto L12
            r1 = 0
            goto L16
        L12:
            int r1 = r1.hashCode()
        L16:
            r0 = r0 ^ r1
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            android.content.Context r0 = r5.f16920a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            k7.t4<k7.r4<k7.e4>> r1 = r5.f16921b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r0.length()
            int r3 = r1.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 46
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "FlagsContext{context="
            java.lang.String r3 = ", hermeticFileOverrides="
            p179k1.C3661s.m8090a(r4, r2, r0, r3, r1)
            java.lang.String r0 = "}"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            return r0
    }
}
