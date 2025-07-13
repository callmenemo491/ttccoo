package p124h7;

/* renamed from: h7.ed */
/* loaded from: classes.dex */
public final class C2607ed {

    /* renamed from: a */
    public final android.content.Context f11484a;

    /* renamed from: b */
    public p124h7.C2733ld f11485b;

    /* renamed from: c */
    public final java.lang.String f11486c;

    /* renamed from: d */
    public boolean f11487d;

    /* renamed from: e */
    public java.lang.String f11488e;

    public C2607ed(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f11487d = r0
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r3, r1)
            android.content.Context r3 = r3.getApplicationContext()
            r2.f11484a = r3
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r1 = "Fallback"
            r3[r0] = r1
            r0 = 1
            r3[r0] = r4
            java.lang.String r4 = "Android/%s/%s"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2.f11486c = r3
            return
    }

    /* renamed from: a */
    public final void m6647a(java.net.URLConnection r5) {
            r4 = this;
            boolean r0 = r4.f11487d
            if (r0 == 0) goto L1b
            java.lang.String r0 = r4.f11486c
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 19
            r2.<init>(r1)
            r2.append(r0)
            java.lang.String r0 = "/FirebaseUI-Android"
            goto L31
        L1b:
            java.lang.String r0 = r4.f11486c
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 21
            r2.<init>(r1)
            r2.append(r0)
            java.lang.String r0 = "/FirebaseCore-Android"
        L31:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            h7.ld r1 = r4.f11485b
            if (r1 != 0) goto L49
            h7.ld r1 = new h7.ld
            android.content.Context r2 = r4.f11484a
            java.lang.String r3 = r2.getPackageName()
            r1.<init>(r2, r3)
            r4.f11485b = r1
        L49:
            h7.ld r1 = r4.f11485b
            java.lang.String r1 = r1.f11747a
            java.lang.String r2 = "X-Android-Package"
            r5.setRequestProperty(r2, r1)
            h7.ld r1 = r4.f11485b
            java.lang.String r1 = r1.f11748b
            java.lang.String r2 = "X-Android-Cert"
            r5.setRequestProperty(r2, r1)
            java.lang.String r1 = p052d6.C1310h0.m3801c()
            java.lang.String r2 = "Accept-Language"
            r5.setRequestProperty(r2, r1)
            java.lang.String r1 = "X-Client-Version"
            r5.setRequestProperty(r1, r0)
            java.lang.String r0 = r4.f11488e
            java.lang.String r1 = "X-Firebase-Locale"
            r5.setRequestProperty(r1, r0)
            r5 = 0
            r4.f11488e = r5
            return
    }
}
