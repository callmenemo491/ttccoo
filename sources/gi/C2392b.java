package gi;

/* renamed from: gi.b */
/* loaded from: classes.dex */
public final class C2392b implements bi.InterfaceC0804x {

    /* renamed from: a */
    public final boolean f10775a;

    public C2392b(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.f10775a = r1
            return
    }

    @Override // bi.InterfaceC0804x
    /* renamed from: a */
    public bi.C0783g0 mo2456a(bi.InterfaceC0804x.a r28) {
            r27 = this;
            java.lang.String r1 = "call"
            r0 = r28
            gi.g r0 = (gi.C2397g) r0
            fi.b r2 = r0.f10785e
            p214m2.C4339q.m9704i(r2)
            bi.c0 r0 = r0.f10786f
            bi.f0 r3 = r0.f4197e
            long r4 = java.lang.System.currentTimeMillis()
            bi.s r6 = r2.f9925d     // Catch: java.io.IOException -> L2ad
            fi.c r7 = r2.f9924c     // Catch: java.io.IOException -> L2ad
            java.util.Objects.requireNonNull(r6)     // Catch: java.io.IOException -> L2ad
            p214m2.C4339q.m9706k(r7, r1)     // Catch: java.io.IOException -> L2ad
            gi.d r6 = r2.f9927f     // Catch: java.io.IOException -> L2ad
            r6.mo6141e(r0)     // Catch: java.io.IOException -> L2ad
            bi.s r6 = r2.f9925d     // Catch: java.io.IOException -> L2ad
            fi.c r7 = r2.f9924c     // Catch: java.io.IOException -> L2ad
            java.util.Objects.requireNonNull(r6)     // Catch: java.io.IOException -> L2ad
            p214m2.C4339q.m9706k(r7, r1)     // Catch: java.io.IOException -> L2ad
            java.lang.String r6 = r0.f4195c
            boolean r6 = gi.C2396f.m6147a(r6)
            r7 = 0
            r8 = 0
            r9 = 1
            if (r6 == 0) goto L91
            if (r3 == 0) goto L91
            java.lang.String r6 = "Expect"
            java.lang.String r6 = r0.m2364b(r6)
            java.lang.String r10 = "100-continue"
            boolean r6 = p362uh.C6463i.m13053J(r10, r6, r9)
            if (r6 == 0) goto L64
            gi.d r6 = r2.f9927f     // Catch: java.io.IOException -> L55
            r6.mo6140d()     // Catch: java.io.IOException -> L55
            bi.g0$a r6 = r2.m5745c(r9)
            r2.m5746d()
            r10 = 0
            goto L66
        L55:
            r0 = move-exception
            bi.s r3 = r2.f9925d
            fi.c r4 = r2.f9924c
            java.util.Objects.requireNonNull(r3)
            p214m2.C4339q.m9706k(r4, r1)
            r2.m5747e(r0)
            throw r0
        L64:
            r10 = 1
            r6 = r7
        L66:
            if (r6 != 0) goto L79
            oi.x r7 = r2.m5744b(r0, r8)
            oi.g r7 = p101fh.C2174f.m5715e(r7)
            r3.mo2373c(r7)
            oi.s r7 = (p260oi.C5297s) r7
            r7.close()
            goto L8f
        L79:
            fi.c r3 = r2.f9924c
            r3.m5757g(r2, r9, r8, r7)
            fi.g r3 = r2.f9923b
            boolean r3 = r3.m5770i()
            if (r3 != 0) goto L8f
            gi.d r3 = r2.f9927f
            fi.g r3 = r3.mo6144h()
            r3.m5772k()
        L8f:
            r7 = r6
            goto L97
        L91:
            fi.c r3 = r2.f9924c
            r3.m5757g(r2, r9, r8, r7)
            r10 = 1
        L97:
            gi.d r3 = r2.f9927f     // Catch: java.io.IOException -> L29e
            r3.mo6139c()     // Catch: java.io.IOException -> L29e
            if (r7 != 0) goto Lab
            bi.g0$a r7 = r2.m5745c(r8)
            p214m2.C4339q.m9704i(r7)
            if (r10 == 0) goto Lab
            r2.m5746d()
            r10 = 0
        Lab:
            r7.m2388g(r0)
            fi.g r3 = r2.f9923b
            bi.u r3 = r3.f9969d
            r7.f4242e = r3
            r7.f4248k = r4
            long r11 = java.lang.System.currentTimeMillis()
            r7.f4249l = r11
            bi.g0 r3 = r7.m2382a()
            int r6 = r3.f4228b0
            r7 = 100
            if (r6 != r7) goto Le9
            bi.g0$a r3 = r2.m5745c(r8)
            p214m2.C4339q.m9704i(r3)
            if (r10 == 0) goto Ld2
            r2.m5746d()
        Ld2:
            r3.m2388g(r0)
            fi.g r0 = r2.f9923b
            bi.u r0 = r0.f9969d
            r3.f4242e = r0
            r3.f4248k = r4
            long r4 = java.lang.System.currentTimeMillis()
            r3.f4249l = r4
            bi.g0 r3 = r3.m2382a()
            int r6 = r3.f4228b0
        Le9:
            bi.s r0 = r2.f9925d
            fi.c r4 = r2.f9924c
            java.util.Objects.requireNonNull(r0)
            p214m2.C4339q.m9706k(r4, r1)
            r4 = r27
            boolean r0 = r4.f10775a
            java.lang.String r5 = "message == null"
            java.lang.String r7 = "protocol == null"
            java.lang.String r8 = "request == null"
            java.lang.String r9 = "code < 0: "
            if (r0 == 0) goto L183
            r0 = 101(0x65, float:1.42E-43)
            if (r6 != r0) goto L183
            bi.c0 r11 = r3.f4225Y
            bi.b0 r12 = r3.f4226Z
            int r14 = r3.f4228b0
            java.lang.String r13 = r3.f4227a0
            bi.u r15 = r3.f4229c0
            bi.v r0 = r3.f4230d0
            bi.v$a r0 = r0.m2430h()
            bi.g0 r1 = r3.f4232f0
            bi.g0 r10 = r3.f4233g0
            bi.g0 r4 = r3.f4234h0
            r28 = r8
            r16 = r9
            long r8 = r3.f4235i0
            r26 = r6
            r17 = r7
            long r6 = r3.f4236j0
            fi.b r3 = r3.f4237k0
            bi.h0 r18 = ci.C0988c.f5067c
            if (r14 < 0) goto L130
            r19 = 1
            goto L132
        L130:
            r19 = 0
        L132:
            if (r19 == 0) goto L173
            if (r11 == 0) goto L169
            if (r12 == 0) goto L15f
            if (r13 == 0) goto L155
            bi.v r16 = r0.m2434c()
            bi.g0 r0 = new bi.g0
            r5 = r10
            r10 = r0
            r17 = r18
            r18 = r1
            r19 = r5
            r20 = r4
            r21 = r8
            r23 = r6
            r25 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25)
            goto L1fa
        L155:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r5.toString()
            r0.<init>(r1)
            throw r0
        L15f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r17.toString()
            r0.<init>(r1)
            throw r0
        L169:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r28.toString()
            r0.<init>(r1)
            throw r0
        L173:
            r0 = r16
            java.lang.String r0 = android.support.v4.media.C0142a.m254a(r0, r14)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L183:
            r26 = r6
            r17 = r7
            r28 = r8
            r0 = r9
            bi.c0 r4 = r3.f4225Y
            bi.b0 r6 = r3.f4226Z
            int r7 = r3.f4228b0
            java.lang.String r8 = r3.f4227a0
            bi.u r9 = r3.f4229c0
            bi.v r10 = r3.f4230d0
            bi.v$a r10 = r10.m2430h()
            bi.g0 r11 = r3.f4232f0
            bi.g0 r12 = r3.f4233g0
            bi.g0 r13 = r3.f4234h0
            long r14 = r3.f4235i0
            r18 = r0
            r16 = r1
            long r0 = r3.f4236j0
            r19 = r0
            fi.b r0 = r3.f4237k0
            java.lang.String r1 = "Content-Type"
            r21 = r5
            r5 = 0
            r22 = r0
            r0 = 2
            java.lang.String r0 = bi.C0783g0.m2380a(r3, r1, r5, r0)     // Catch: java.io.IOException -> L28d
            gi.d r1 = r2.f9927f     // Catch: java.io.IOException -> L28d
            r23 = r14
            long r14 = r1.mo6137a(r3)     // Catch: java.io.IOException -> L28d
            gi.d r1 = r2.f9927f     // Catch: java.io.IOException -> L28d
            oi.z r1 = r1.mo6142f(r3)     // Catch: java.io.IOException -> L28d
            fi.b$b r3 = new fi.b$b     // Catch: java.io.IOException -> L28d
            r3.<init>(r2, r1, r14)     // Catch: java.io.IOException -> L28d
            gi.h r1 = new gi.h     // Catch: java.io.IOException -> L28d
            oi.t r5 = new oi.t     // Catch: java.io.IOException -> L28d
            r5.<init>(r3)     // Catch: java.io.IOException -> L28d
            r1.<init>(r0, r14, r5)     // Catch: java.io.IOException -> L28d
            if (r7 < 0) goto L1d9
            r0 = 1
            goto L1da
        L1d9:
            r0 = 0
        L1da:
            if (r0 == 0) goto L27d
            if (r4 == 0) goto L273
            if (r6 == 0) goto L269
            if (r8 == 0) goto L25f
            bi.v r0 = r10.m2434c()
            bi.g0 r21 = new bi.g0
            r3 = r21
            r5 = r6
            r6 = r8
            r8 = r9
            r9 = r0
            r10 = r1
            r14 = r23
            r16 = r19
            r18 = r22
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18)
            r0 = r21
        L1fa:
            bi.c0 r1 = r0.f4225Y
            java.lang.String r3 = "Connection"
            java.lang.String r1 = r1.m2364b(r3)
            java.lang.String r4 = "close"
            r5 = 1
            boolean r1 = p362uh.C6463i.m13053J(r4, r1, r5)
            if (r1 != 0) goto L218
            r1 = 2
            r6 = 0
            java.lang.String r1 = bi.C0783g0.m2380a(r0, r3, r6, r1)
            boolean r1 = p362uh.C6463i.m13053J(r4, r1, r5)
            if (r1 == 0) goto L222
            goto L219
        L218:
            r6 = 0
        L219:
            gi.d r1 = r2.f9927f
            fi.g r1 = r1.mo6144h()
            r1.m5772k()
        L222:
            r1 = 204(0xcc, float:2.86E-43)
            r2 = r26
            if (r2 == r1) goto L22c
            r1 = 205(0xcd, float:2.87E-43)
            if (r2 != r1) goto L25e
        L22c:
            bi.h0 r1 = r0.f4231e0
            if (r1 == 0) goto L235
            long r3 = r1.mo2394h()
            goto L237
        L235:
            r3 = -1
        L237:
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L25e
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r3 = "HTTP "
            java.lang.String r4 = " had non-zero Content-Length: "
            java.lang.StringBuilder r2 = androidx.appcompat.widget.C0300r0.m777a(r3, r2, r4)
            bi.h0 r0 = r0.f4231e0
            if (r0 == 0) goto L253
            long r3 = r0.mo2394h()
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
        L253:
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L25e:
            return r0
        L25f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r21.toString()
            r0.<init>(r1)
            throw r0
        L269:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r17.toString()
            r0.<init>(r1)
            throw r0
        L273:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r28.toString()
            r0.<init>(r1)
            throw r0
        L27d:
            r0 = r18
            java.lang.String r0 = android.support.v4.media.C0142a.m254a(r0, r7)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L28d:
            r0 = move-exception
            bi.s r1 = r2.f9925d
            fi.c r3 = r2.f9924c
            java.util.Objects.requireNonNull(r1)
            r1 = r16
            p214m2.C4339q.m9706k(r3, r1)
            r2.m5747e(r0)
            throw r0
        L29e:
            r0 = move-exception
            bi.s r3 = r2.f9925d
            fi.c r4 = r2.f9924c
            java.util.Objects.requireNonNull(r3)
            p214m2.C4339q.m9706k(r4, r1)
            r2.m5747e(r0)
            throw r0
        L2ad:
            r0 = move-exception
            bi.s r3 = r2.f9925d
            fi.c r4 = r2.f9924c
            java.util.Objects.requireNonNull(r3)
            p214m2.C4339q.m9706k(r4, r1)
            r2.m5747e(r0)
            throw r0
    }
}
