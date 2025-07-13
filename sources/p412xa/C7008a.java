package p412xa;

/* renamed from: xa.a */
/* loaded from: classes.dex */
public final class C7008a extends com.google.firebase.installations.AbstractC1244a {

    /* renamed from: a */
    public final java.lang.String f27306a;

    /* renamed from: b */
    public final long f27307b;

    /* renamed from: c */
    public final long f27308c;

    /* renamed from: xa.a$a */
    public static /* synthetic */ class a {
    }

    public C7008a(java.lang.String r1, long r2, long r4, p412xa.C7008a.a r6) {
            r0 = this;
            r0.<init>()
            r0.f27306a = r1
            r0.f27307b = r2
            r0.f27308c = r4
            return
    }

    @Override // com.google.firebase.installations.AbstractC1244a
    /* renamed from: a */
    public java.lang.String mo3650a() {
            r1 = this;
            java.lang.String r0 = r1.f27306a
            return r0
    }

    @Override // com.google.firebase.installations.AbstractC1244a
    /* renamed from: b */
    public long mo3651b() {
            r2 = this;
            long r0 = r2.f27308c
            return r0
    }

    @Override // com.google.firebase.installations.AbstractC1244a
    /* renamed from: c */
    public long mo3652c() {
            r2 = this;
            long r0 = r2.f27307b
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.firebase.installations.AbstractC1244a
            r2 = 0
            if (r1 == 0) goto L2e
            com.google.firebase.installations.a r8 = (com.google.firebase.installations.AbstractC1244a) r8
            java.lang.String r1 = r7.f27306a
            java.lang.String r3 = r8.mo3650a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2c
            long r3 = r7.f27307b
            long r5 = r8.mo3652c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L2c
            long r3 = r7.f27308c
            long r5 = r8.mo3651b()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L2c
            goto L2d
        L2c:
            r0 = 0
        L2d:
            return r0
        L2e:
            return r2
    }

    public int hashCode() {
            r7 = this;
            java.lang.String r0 = r7.f27306a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            long r2 = r7.f27307b
            r4 = 32
            long r5 = r2 >>> r4
            long r2 = r2 ^ r5
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            long r1 = r7.f27308c
            long r3 = r1 >>> r4
            long r1 = r1 ^ r3
            int r2 = (int) r1
            r0 = r0 ^ r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "InstallationTokenResult{token="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f27306a
            r0.append(r1)
            java.lang.String r1 = ", tokenExpirationTimestamp="
            r0.append(r1)
            long r1 = r3.f27307b
            r0.append(r1)
            java.lang.String r1 = ", tokenCreationTimestamp="
            r0.append(r1)
            long r1 = r3.f27308c
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
