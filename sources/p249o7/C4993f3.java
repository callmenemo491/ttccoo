package p249o7;

/* renamed from: o7.f3 */
/* loaded from: classes.dex */
public final class C4993f3 {

    /* renamed from: a */
    public int f19671a;

    /* renamed from: b */
    public boolean f19672b;

    /* renamed from: c */
    public boolean f19673c;

    /* renamed from: d */
    public final java.lang.Object f19674d;

    public C4993f3(com.google.android.gms.measurement.internal.C1111b r1, int r2, boolean r3, boolean r4) {
            r0 = this;
            r0.f19674d = r1
            r0.<init>()
            r0.f19671a = r2
            r0.f19672b = r3
            r0.f19673c = r4
            return
    }

    public C4993f3(java.util.List r2) {
            r1 = this;
            java.lang.String r0 = "connectionSpecs"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.f19674d = r2
            return
    }

    /* renamed from: a */
    public bi.C0792l m11167a(javax.net.ssl.SSLSocket r13) {
            r12 = this;
            int r0 = r12.f19671a
            java.lang.Object r1 = r12.f19674d
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
        La:
            if (r0 >= r1) goto L24
            java.lang.Object r2 = r12.f19674d
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r2.get(r0)
            bi.l r2 = (bi.C0792l) r2
            boolean r3 = r2.m2404b(r13)
            if (r3 == 0) goto L21
            int r0 = r0 + 1
            r12.f19671a = r0
            goto L25
        L21:
            int r0 = r0 + 1
            goto La
        L24:
            r2 = 0
        L25:
            if (r2 == 0) goto Lf4
            boolean r0 = r12.m11168b(r13)
            r12.f19672b = r0
            boolean r0 = r12.f19673c
            java.lang.String[] r1 = r2.f4301c
            if (r1 == 0) goto L49
            java.lang.String[] r1 = r13.getEnabledCipherSuites()
            java.lang.String r3 = "sslSocket.enabledCipherSuites"
            p214m2.C4339q.m9705j(r1, r3)
            java.lang.String[] r3 = r2.f4301c
            bi.j$b r4 = bi.C0788j.f4284t
            java.util.Comparator<java.lang.String> r4 = bi.C0788j.f4266b
            java.util.Comparator<java.lang.String> r4 = bi.C0788j.f4266b
            java.lang.String[] r1 = ci.C0988c.m2710o(r1, r3, r4)
            goto L4d
        L49:
            java.lang.String[] r1 = r13.getEnabledCipherSuites()
        L4d:
            java.lang.String[] r3 = r2.f4302d
            if (r3 == 0) goto L63
            java.lang.String[] r3 = r13.getEnabledProtocols()
            java.lang.String r4 = "sslSocket.enabledProtocols"
            p214m2.C4339q.m9705j(r3, r4)
            java.lang.String[] r4 = r2.f4302d
            eh.b r5 = p079eh.C1851b.f8035Y
            java.lang.String[] r3 = ci.C0988c.m2710o(r3, r4, r5)
            goto L67
        L63:
            java.lang.String[] r3 = r13.getEnabledProtocols()
        L67:
            java.lang.String[] r4 = r13.getSupportedCipherSuites()
            java.lang.String r5 = "supportedCipherSuites"
            p214m2.C4339q.m9705j(r4, r5)
            bi.j$b r5 = bi.C0788j.f4284t
            java.util.Comparator<java.lang.String> r5 = bi.C0788j.f4266b
            java.util.Comparator<java.lang.String> r5 = bi.C0788j.f4266b
            byte[] r6 = ci.C0988c.f5065a
            int r6 = r4.length
            r7 = 0
        L7a:
            r8 = -1
            if (r7 >= r6) goto L93
            r9 = r4[r7]
            r10 = r5
            bi.j$a r10 = (bi.C0788j.a) r10
            java.lang.String r11 = "TLS_FALLBACK_SCSV"
            int r9 = r10.compare(r9, r11)
            if (r9 != 0) goto L8c
            r9 = 1
            goto L8d
        L8c:
            r9 = 0
        L8d:
            if (r9 == 0) goto L90
            goto L94
        L90:
            int r7 = r7 + 1
            goto L7a
        L93:
            r7 = -1
        L94:
            java.lang.String r5 = "cipherSuitesIntersection"
            if (r0 == 0) goto Lb8
            if (r7 == r8) goto Lb8
            p214m2.C4339q.m9705j(r1, r5)
            r0 = r4[r7]
            java.lang.String r4 = "supportedCipherSuites[indexOfFallbackScsv]"
            p214m2.C4339q.m9705j(r0, r4)
            int r4 = r1.length
            int r4 = r4 + 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r4)
            java.lang.String r4 = "java.util.Arrays.copyOf(this, newSize)"
            p214m2.C4339q.m9705j(r1, r4)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r4 = p062dh.C1468d.m3987I(r1)
            r1[r4] = r0
        Lb8:
            bi.l$a r0 = new bi.l$a
            r0.<init>(r2)
            p214m2.C4339q.m9705j(r1, r5)
            int r4 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r4)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.m2408c(r1)
            java.lang.String r1 = "tlsVersionsIntersection"
            p214m2.C4339q.m9705j(r3, r1)
            int r1 = r3.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.m2411f(r1)
            bi.l r0 = r0.m2406a()
            java.util.List r1 = r0.m2405c()
            if (r1 == 0) goto Le8
            java.lang.String[] r1 = r0.f4302d
            r13.setEnabledProtocols(r1)
        Le8:
            java.util.List r1 = r0.m2403a()
            if (r1 == 0) goto Lf3
            java.lang.String[] r0 = r0.f4301c
            r13.setEnabledCipherSuites(r0)
        Lf3:
            return r2
        Lf4:
            java.net.UnknownServiceException r0 = new java.net.UnknownServiceException
            java.lang.String r1 = "Unable to find acceptable protocols. isFallback="
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            boolean r2 = r12.f19673c
            r1.append(r2)
            r2 = 44
            r1.append(r2)
            java.lang.String r3 = " modes="
            r1.append(r3)
            java.lang.Object r3 = r12.f19674d
            java.util.List r3 = (java.util.List) r3
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = " supported protocols="
            r1.append(r2)
            java.lang.String[] r13 = r13.getEnabledProtocols()
            p214m2.C4339q.m9704i(r13)
            java.lang.String r13 = java.util.Arrays.toString(r13)
            java.lang.String r2 = "java.util.Arrays.toString(this)"
            p214m2.C4339q.m9705j(r13, r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
    }

    /* renamed from: b */
    public boolean m11168b(javax.net.ssl.SSLSocket r4) {
            r3 = this;
            int r0 = r3.f19671a
            java.lang.Object r1 = r3.f19674d
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
        La:
            if (r0 >= r1) goto L21
            java.lang.Object r2 = r3.f19674d
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r2.get(r0)
            bi.l r2 = (bi.C0792l) r2
            boolean r2 = r2.m2404b(r4)
            if (r2 == 0) goto L1e
            r4 = 1
            return r4
        L1e:
            int r0 = r0 + 1
            goto La
        L21:
            r4 = 0
            return r4
    }

    /* renamed from: c */
    public void m11169c(java.lang.String r10) {
            r9 = this;
            java.lang.Object r0 = r9.f19674d
            r1 = r0
            com.google.android.gms.measurement.internal.b r1 = (com.google.android.gms.measurement.internal.C1111b) r1
            int r2 = r9.f19671a
            boolean r3 = r9.f19672b
            boolean r4 = r9.f19673c
            r6 = 0
            r7 = 0
            r8 = 0
            r5 = r10
            r1.m3145y(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    /* renamed from: d */
    public void m11170d(java.lang.String r10, java.lang.Object r11) {
            r9 = this;
            java.lang.Object r0 = r9.f19674d
            r1 = r0
            com.google.android.gms.measurement.internal.b r1 = (com.google.android.gms.measurement.internal.C1111b) r1
            int r2 = r9.f19671a
            boolean r3 = r9.f19672b
            boolean r4 = r9.f19673c
            r7 = 0
            r8 = 0
            r5 = r10
            r6 = r11
            r1.m3145y(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    /* renamed from: e */
    public void m11171e(java.lang.String r10, java.lang.Object r11, java.lang.Object r12) {
            r9 = this;
            java.lang.Object r0 = r9.f19674d
            r1 = r0
            com.google.android.gms.measurement.internal.b r1 = (com.google.android.gms.measurement.internal.C1111b) r1
            int r2 = r9.f19671a
            boolean r3 = r9.f19672b
            boolean r4 = r9.f19673c
            r8 = 0
            r5 = r10
            r6 = r11
            r7 = r12
            r1.m3145y(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    /* renamed from: f */
    public void m11172f(java.lang.String r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
            r9 = this;
            java.lang.Object r0 = r9.f19674d
            r1 = r0
            com.google.android.gms.measurement.internal.b r1 = (com.google.android.gms.measurement.internal.C1111b) r1
            int r2 = r9.f19671a
            boolean r3 = r9.f19672b
            boolean r4 = r9.f19673c
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r1.m3145y(r2, r3, r4, r5, r6, r7, r8)
            return
    }
}
