package p405x3;

/* renamed from: x3.a */
/* loaded from: classes.dex */
public final class C6919a extends com.google.android.datatransport.runtime.backends.AbstractC1038b {

    /* renamed from: a */
    public final java.lang.Iterable<p385w3.AbstractC6784f> f26942a;

    /* renamed from: b */
    public final byte[] f26943b;

    /* renamed from: x3.a$a */
    public static /* synthetic */ class a {
    }

    public C6919a(java.lang.Iterable r1, byte[] r2, p405x3.C6919a.a r3) {
            r0 = this;
            r0.<init>()
            r0.f26942a = r1
            r0.f26943b = r2
            return
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC1038b
    /* renamed from: a */
    public java.lang.Iterable<p385w3.AbstractC6784f> mo2803a() {
            r1 = this;
            java.lang.Iterable<w3.f> r0 = r1.f26942a
            return r0
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC1038b
    /* renamed from: b */
    public byte[] mo2804b() {
            r1 = this;
            byte[] r0 = r1.f26943b
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.datatransport.runtime.backends.AbstractC1038b
            r2 = 0
            if (r1 == 0) goto L2f
            com.google.android.datatransport.runtime.backends.b r5 = (com.google.android.datatransport.runtime.backends.AbstractC1038b) r5
            java.lang.Iterable<w3.f> r1 = r4.f26942a
            java.lang.Iterable r3 = r5.mo2803a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2d
            byte[] r1 = r4.f26943b
            boolean r3 = r5 instanceof p405x3.C6919a
            if (r3 == 0) goto L22
            x3.a r5 = (p405x3.C6919a) r5
            byte[] r5 = r5.f26943b
            goto L26
        L22:
            byte[] r5 = r5.mo2804b()
        L26:
            boolean r5 = java.util.Arrays.equals(r1, r5)
            if (r5 == 0) goto L2d
            goto L2e
        L2d:
            r0 = 0
        L2e:
            return r0
        L2f:
            return r2
    }

    public int hashCode() {
            r2 = this;
            java.lang.Iterable<w3.f> r0 = r2.f26942a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            byte[] r1 = r2.f26943b
            int r1 = java.util.Arrays.hashCode(r1)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "BackendRequest{events="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Iterable<w3.f> r1 = r2.f26942a
            r0.append(r1)
            java.lang.String r1 = ", extras="
            r0.append(r1)
            byte[] r1 = r2.f26943b
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
