package p178k0;

/* renamed from: k0.e */
/* loaded from: classes.dex */
public final class C3629e {

    /* renamed from: a */
    public final java.lang.String f16011a;

    /* renamed from: b */
    public final java.lang.String f16012b;

    /* renamed from: c */
    public final java.lang.String f16013c;

    /* renamed from: d */
    public final java.util.List<java.util.List<byte[]>> f16014d;

    /* renamed from: e */
    public final java.lang.String f16015e;

    public C3629e(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.util.List<java.util.List<byte[]>> r4) {
            r0 = this;
            r0.<init>()
            r0.f16011a = r1
            r0.f16012b = r2
            r0.f16013c = r3
            java.util.Objects.requireNonNull(r4)
            r0.f16014d = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r1 = "-"
            r4.append(r1)
            r4.append(r2)
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            r0.f16015e = r1
            return
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FontRequest {mProviderAuthority: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = r6.f16011a
            r1.append(r2)
            java.lang.String r2 = ", mProviderPackage: "
            r1.append(r2)
            java.lang.String r2 = r6.f16012b
            r1.append(r2)
            java.lang.String r2 = ", mQuery: "
            r1.append(r2)
            java.lang.String r2 = r6.f16013c
            r1.append(r2)
            java.lang.String r2 = ", mCertificates:"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 0
            r2 = 0
        L32:
            java.util.List<java.util.List<byte[]>> r3 = r6.f16014d
            int r3 = r3.size()
            if (r2 >= r3) goto L70
            java.lang.String r3 = " ["
            r0.append(r3)
            java.util.List<java.util.List<byte[]>> r3 = r6.f16014d
            java.lang.Object r3 = r3.get(r2)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
        L48:
            int r5 = r3.size()
            if (r4 >= r5) goto L68
            java.lang.String r5 = " \""
            r0.append(r5)
            java.lang.Object r5 = r3.get(r4)
            byte[] r5 = (byte[]) r5
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r1)
            r0.append(r5)
            java.lang.String r5 = "\""
            r0.append(r5)
            int r4 = r4 + 1
            goto L48
        L68:
            java.lang.String r3 = " ]"
            r0.append(r3)
            int r2 = r2 + 1
            goto L32
        L70:
            java.lang.String r1 = "}"
            java.lang.String r2 = "mCertificatesArray: 0"
            java.lang.String r0 = p346u.C6269n.m12888a(r0, r1, r2)
            return r0
    }
}
