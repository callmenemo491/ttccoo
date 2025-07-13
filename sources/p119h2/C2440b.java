package p119h2;

/* renamed from: h2.b */
/* loaded from: classes.dex */
public class C2440b implements p105g2.InterfaceC2215i {

    /* renamed from: a */
    public final p119h2.AbstractC2439a f10916a;

    /* renamed from: b */
    public final p119h2.C2441c f10917b;

    public C2440b(p119h2.AbstractC2439a r3) {
            r2 = this;
            h2.c r0 = new h2.c
            r1 = 4096(0x1000, float:5.74E-42)
            r0.<init>(r1)
            r2.<init>()
            r2.f10916a = r3
            r2.f10917b = r0
            return
    }

    /* renamed from: a */
    public p105g2.C2218l m6191a(p105g2.AbstractC2220n<?> r15) {
            r14 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
        L4:
            java.util.Collections.emptyList()
            r2 = 0
            r3 = 0
            g2.b$a r4 = r15.f10152k0     // Catch: java.io.IOException -> L67
            java.util.Map r4 = p119h2.C2443e.m6213a(r4)     // Catch: java.io.IOException -> L67
            h2.a r5 = r14.f10916a     // Catch: java.io.IOException -> L67
            h2.f r4 = r5.mo6190a(r15, r4)     // Catch: java.io.IOException -> L67
            int r6 = r4.f10937a     // Catch: java.io.IOException -> L64
            java.util.List r11 = r4.m6216a()     // Catch: java.io.IOException -> L64
            r5 = 304(0x130, float:4.26E-43)
            if (r6 != r5) goto L29
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> L64
            long r5 = r5 - r0
            g2.l r15 = p119h2.C2446h.m6221a(r15, r5, r11)     // Catch: java.io.IOException -> L64
            return r15
        L29:
            java.io.InputStream r5 = r4.f10940d     // Catch: java.io.IOException -> L64
            if (r5 == 0) goto L2e
            goto L2f
        L2e:
            r5 = r2
        L2f:
            if (r5 == 0) goto L3a
            int r7 = r4.f10939c     // Catch: java.io.IOException -> L64
            h2.c r8 = r14.f10917b     // Catch: java.io.IOException -> L64
            byte[] r5 = p119h2.C2446h.m6222b(r5, r7, r8)     // Catch: java.io.IOException -> L64
            goto L3c
        L3a:
            byte[] r5 = new byte[r3]     // Catch: java.io.IOException -> L64
        L3c:
            r12 = r5
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> L61
            long r7 = r7 - r0
            p119h2.C2446h.m6223c(r7, r15, r12, r6)     // Catch: java.io.IOException -> L61
            r5 = 200(0xc8, float:2.8E-43)
            if (r6 < r5) goto L5b
            r5 = 299(0x12b, float:4.19E-43)
            if (r6 > r5) goto L5b
            g2.l r13 = new g2.l     // Catch: java.io.IOException -> L61
            r8 = 0
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> L61
            long r9 = r9 - r0
            r5 = r13
            r7 = r12
            r5.<init>(r6, r7, r8, r9, r11)     // Catch: java.io.IOException -> L61
            return r13
        L5b:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.io.IOException -> L61
            r5.<init>()     // Catch: java.io.IOException -> L61
            throw r5     // Catch: java.io.IOException -> L61
        L61:
            r5 = move-exception
            r8 = r12
            goto L6b
        L64:
            r5 = move-exception
            r8 = r2
            goto L6b
        L67:
            r4 = move-exception
            r5 = r4
            r4 = r2
            r8 = r4
        L6b:
            boolean r6 = r5 instanceof java.net.SocketTimeoutException
            r13 = 1
            r7 = 2
            if (r6 == 0) goto L7e
            h2.h$b r3 = new h2.h$b
            g2.s r4 = new g2.s
            r4.<init>()
            java.lang.String r5 = "socket"
            r3.<init>(r5, r4, r2)
            goto Le3
        L7e:
            boolean r6 = r5 instanceof java.net.MalformedURLException
            if (r6 != 0) goto L13b
            if (r4 == 0) goto L135
            int r5 = r4.f10937a
            java.lang.Object[] r6 = new java.lang.Object[r7]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r6[r3] = r7
            java.lang.String r3 = r15.f10142a0
            r6[r13] = r3
            java.lang.String r3 = "Unexpected response code %d for %s"
            p105g2.C2227u.m5821c(r3, r6)
            if (r8 == 0) goto Ld7
            java.util.List r12 = r4.m6216a()
            g2.l r3 = new g2.l
            r9 = 0
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r10 = r6 - r0
            r6 = r3
            r7 = r5
            r6.<init>(r7, r8, r9, r10, r12)
            r4 = 401(0x191, float:5.62E-43)
            if (r5 == r4) goto Lc9
            r4 = 403(0x193, float:5.65E-43)
            if (r5 != r4) goto Lb4
            goto Lc9
        Lb4:
            r15 = 400(0x190, float:5.6E-43)
            if (r5 < r15) goto Lc3
            r15 = 499(0x1f3, float:6.99E-43)
            if (r5 <= r15) goto Lbd
            goto Lc3
        Lbd:
            g2.e r15 = new g2.e
            r15.<init>(r3)
            throw r15
        Lc3:
            g2.r r15 = new g2.r
            r15.<init>(r3)
            throw r15
        Lc9:
            h2.h$b r4 = new h2.h$b
            g2.a r5 = new g2.a
            r5.<init>(r3)
            java.lang.String r3 = "auth"
            r4.<init>(r3, r5, r2)
            r3 = r4
            goto Le3
        Ld7:
            h2.h$b r3 = new h2.h$b
            g2.k r4 = new g2.k
            r4.<init>()
            java.lang.String r5 = "network"
            r3.<init>(r5, r4, r2)
        Le3:
            g2.f r2 = r15.f10151j0
            int r4 = r2.f10121a
            g2.t r5 = r3.f10943b     // Catch: p105g2.C2226t -> L11b
            int r6 = r2.f10122b     // Catch: p105g2.C2226t -> L11b
            int r6 = r6 + r13
            r2.f10122b = r6     // Catch: p105g2.C2226t -> L11b
            float r7 = (float) r4     // Catch: p105g2.C2226t -> L11b
            r8 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 * r8
            int r7 = (int) r7     // Catch: p105g2.C2226t -> L11b
            int r7 = r7 + r4
            r2.f10121a = r7     // Catch: p105g2.C2226t -> L11b
            if (r6 > r13) goto Lfb
            r2 = 1
            goto Lfc
        Lfb:
            r2 = 0
        Lfc:
            if (r2 == 0) goto L117
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r3.f10942a
            r5 = 0
            r2[r5] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r2[r13] = r3
            java.lang.String r3 = "%s-retry [timeout=%s]"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r15.m5801e(r2)
            goto L4
        L117:
            r0 = 2
            throw r5     // Catch: p105g2.C2226t -> L119
        L119:
            r1 = move-exception
            goto L11e
        L11b:
            r0 = move-exception
            r1 = r0
            r0 = 2
        L11e:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = r3.f10942a
            r3 = 0
            r0[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0[r13] = r2
            java.lang.String r2 = "%s-timeout-giveup [timeout=%s]"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r15.m5801e(r0)
            throw r1
        L135:
            g2.m r15 = new g2.m
            r15.<init>(r5)
            throw r15
        L13b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Bad URL "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r15 = r15.f10142a0
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15, r5)
            throw r0
    }
}
