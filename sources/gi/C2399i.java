package gi;

/* renamed from: gi.i */
/* loaded from: classes.dex */
public final class C2399i implements bi.InterfaceC0804x {

    /* renamed from: a */
    public final bi.C0771a0 f10793a;

    public C2399i(bi.C0771a0 r2) {
            r1 = this;
            java.lang.String r0 = "client"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.f10793a = r2
            return
    }

    @Override // bi.InterfaceC0804x
    /* renamed from: a */
    public bi.C0783g0 mo2456a(bi.InterfaceC0804x.a r49) {
            r48 = this;
            r1 = r48
            r2 = r49
            gi.g r2 = (gi.C2397g) r2
            bi.c0 r0 = r2.f10786f
            fi.c r3 = r2.f10782b
            dh.k r4 = p062dh.C1475k.f7237Y
            r7 = 1
            r8 = r4
            r9 = 0
            r10 = 0
            r4 = r0
            r0 = 1
        L12:
            java.util.Objects.requireNonNull(r3)
            java.lang.String r11 = "request"
            p214m2.C4339q.m9706k(r4, r11)
            fi.b r11 = r3.f9947g0
            if (r11 != 0) goto L20
            r11 = 1
            goto L21
        L20:
            r11 = 0
        L21:
            if (r11 == 0) goto L313
            monitor-enter(r3)
            boolean r11 = r3.f9949i0     // Catch: java.lang.Throwable -> L30e
            r11 = r11 ^ r7
            if (r11 == 0) goto L2fe
            boolean r11 = r3.f9948h0     // Catch: java.lang.Throwable -> L30e
            r11 = r11 ^ r7
            if (r11 == 0) goto L2f0
            monitor-exit(r3)
            if (r0 == 0) goto L8c
            zb.e r0 = new zb.e
            fi.h r11 = r3.f9939Y
            bi.w r12 = r4.f4194b
            boolean r13 = r12.f4345a
            if (r13 == 0) goto L54
            bi.a0 r13 = r3.f9954n0
            javax.net.ssl.SSLSocketFactory r14 = r13.f4152m0
            if (r14 == 0) goto L4c
            javax.net.ssl.HostnameVerifier r15 = r13.f4156q0
            bi.h r13 = r13.f4157r0
            r19 = r13
            r17 = r14
            r18 = r15
            goto L5a
        L4c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "CLEARTEXT-only client"
            r0.<init>(r2)
            throw r0
        L54:
            r17 = 0
            r18 = 0
            r19 = 0
        L5a:
            bi.a r15 = new bi.a
            java.lang.String r13 = r12.f4349e
            int r14 = r12.f4350f
            bi.a0 r12 = r3.f9954n0
            bi.r r5 = r12.f4148i0
            javax.net.SocketFactory r6 = r12.f4151l0
            bi.c r7 = r12.f4150k0
            r21 = 0
            r25 = r8
            java.util.List<bi.b0> r8 = r12.f4155p0
            r26 = r9
            java.util.List<bi.l> r9 = r12.f4154o0
            java.net.ProxySelector r12 = r12.f4149j0
            r24 = r12
            r12 = r15
            r1 = r15
            r15 = r5
            r16 = r6
            r20 = r7
            r22 = r8
            r23 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            bi.s r5 = r3.f9940Z
            r0.<init>(r11, r1, r3, r5)
            r3.f9944d0 = r0
            goto L90
        L8c:
            r25 = r8
            r26 = r9
        L90:
            boolean r0 = r3.f9951k0     // Catch: java.lang.Throwable -> L2e7
            if (r0 != 0) goto L2da
            bi.g0 r0 = r2.m6150c(r4)     // Catch: java.io.IOException -> L25c fi.C2187i -> L29c java.lang.Throwable -> L2e7
            if (r10 == 0) goto L1ef
            bi.c0 r1 = r0.f4225Y     // Catch: java.lang.Throwable -> L1e6
            bi.b0 r4 = r0.f4226Z     // Catch: java.lang.Throwable -> L1e6
            int r5 = r0.f4228b0     // Catch: java.lang.Throwable -> L1e6
            java.lang.String r6 = r0.f4227a0     // Catch: java.lang.Throwable -> L1e6
            bi.u r7 = r0.f4229c0     // Catch: java.lang.Throwable -> L1e6
            bi.v r8 = r0.f4230d0     // Catch: java.lang.Throwable -> L1e6
            bi.v$a r8 = r8.m2430h()     // Catch: java.lang.Throwable -> L1e6
            bi.h0 r9 = r0.f4231e0     // Catch: java.lang.Throwable -> L1e6
            bi.g0 r11 = r0.f4232f0     // Catch: java.lang.Throwable -> L1e6
            bi.g0 r12 = r0.f4233g0     // Catch: java.lang.Throwable -> L1e6
            long r13 = r0.f4235i0     // Catch: java.lang.Throwable -> L1e6
            r15 = r2
            r16 = r3
            long r2 = r0.f4236j0     // Catch: java.lang.Throwable -> L1e4
            fi.b r0 = r0.f4237k0     // Catch: java.lang.Throwable -> L1e4
            r17 = r15
            bi.c0 r15 = r10.f4225Y     // Catch: java.lang.Throwable -> L1e4
            r18 = r0
            bi.b0 r0 = r10.f4226Z     // Catch: java.lang.Throwable -> L1e4
            r19 = r2
            int r2 = r10.f4228b0     // Catch: java.lang.Throwable -> L1e4
            java.lang.String r3 = r10.f4227a0     // Catch: java.lang.Throwable -> L1e4
            r21 = r13
            bi.u r13 = r10.f4229c0     // Catch: java.lang.Throwable -> L1e4
            bi.v r14 = r10.f4230d0     // Catch: java.lang.Throwable -> L1e4
            bi.v$a r14 = r14.m2430h()     // Catch: java.lang.Throwable -> L1e4
            r23 = r12
            bi.g0 r12 = r10.f4232f0     // Catch: java.lang.Throwable -> L1e4
            r24 = r11
            bi.g0 r11 = r10.f4233g0     // Catch: java.lang.Throwable -> L1e4
            r43 = r9
            bi.g0 r9 = r10.f4234h0     // Catch: java.lang.Throwable -> L1e4
            r44 = r7
            r45 = r8
            long r7 = r10.f4235i0     // Catch: java.lang.Throwable -> L1e4
            r46 = r4
            r47 = r5
            long r4 = r10.f4236j0     // Catch: java.lang.Throwable -> L1e4
            fi.b r10 = r10.f4237k0     // Catch: java.lang.Throwable -> L1e4
            r34 = 0
            if (r2 < 0) goto Lf2
            r27 = 1
            goto Lf4
        Lf2:
            r27 = 0
        Lf4:
            if (r27 == 0) goto L1c9
            if (r15 == 0) goto L1bd
            if (r0 == 0) goto L1b1
            if (r3 == 0) goto L1a5
            bi.v r33 = r14.m2434c()     // Catch: java.lang.Throwable -> L1e4
            bi.g0 r14 = new bi.g0     // Catch: java.lang.Throwable -> L1e4
            r27 = r14
            r28 = r15
            r29 = r0
            r30 = r3
            r31 = r2
            r32 = r13
            r35 = r12
            r36 = r11
            r37 = r9
            r38 = r7
            r40 = r4
            r42 = r10
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42)     // Catch: java.lang.Throwable -> L1e4
            bi.h0 r0 = r14.f4231e0     // Catch: java.lang.Throwable -> L1e4
            if (r0 != 0) goto L123
            r0 = 1
            goto L124
        L123:
            r0 = 0
        L124:
            if (r0 == 0) goto L199
            if (r47 < 0) goto L12a
            r0 = 1
            goto L12b
        L12a:
            r0 = 0
        L12b:
            if (r0 == 0) goto L17c
            if (r1 == 0) goto L170
            if (r46 == 0) goto L164
            if (r6 == 0) goto L158
            bi.v r33 = r45.m2434c()     // Catch: java.lang.Throwable -> L1e4
            bi.g0 r0 = new bi.g0     // Catch: java.lang.Throwable -> L1e4
            r27 = r0
            r28 = r1
            r29 = r46
            r30 = r6
            r31 = r47
            r32 = r44
            r34 = r43
            r35 = r24
            r36 = r23
            r37 = r14
            r38 = r21
            r40 = r19
            r42 = r18
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42)     // Catch: java.lang.Throwable -> L1e4
            goto L1f3
        L158:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1e4
            java.lang.String r1 = "message == null"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1e4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e4
            throw r0     // Catch: java.lang.Throwable -> L1e4
        L164:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1e4
            java.lang.String r1 = "protocol == null"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1e4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e4
            throw r0     // Catch: java.lang.Throwable -> L1e4
        L170:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1e4
            java.lang.String r1 = "request == null"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1e4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e4
            throw r0     // Catch: java.lang.Throwable -> L1e4
        L17c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e4
            r0.<init>()     // Catch: java.lang.Throwable -> L1e4
            java.lang.String r1 = "code < 0: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L1e4
            r1 = r47
            r0.append(r1)     // Catch: java.lang.Throwable -> L1e4
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1e4
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1e4
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1e4
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1e4
            throw r1     // Catch: java.lang.Throwable -> L1e4
        L199:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L1e4
            java.lang.String r1 = "priorResponse.body != null"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1e4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e4
            throw r0     // Catch: java.lang.Throwable -> L1e4
        L1a5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1e4
            java.lang.String r1 = "message == null"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1e4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e4
            throw r0     // Catch: java.lang.Throwable -> L1e4
        L1b1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1e4
            java.lang.String r1 = "protocol == null"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1e4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e4
            throw r0     // Catch: java.lang.Throwable -> L1e4
        L1bd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1e4
            java.lang.String r1 = "request == null"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1e4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e4
            throw r0     // Catch: java.lang.Throwable -> L1e4
        L1c9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e4
            r0.<init>()     // Catch: java.lang.Throwable -> L1e4
            java.lang.String r1 = "code < 0: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L1e4
            r0.append(r2)     // Catch: java.lang.Throwable -> L1e4
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1e4
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1e4
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1e4
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1e4
            throw r1     // Catch: java.lang.Throwable -> L1e4
        L1e4:
            r0 = move-exception
            goto L1e9
        L1e6:
            r0 = move-exception
            r16 = r3
        L1e9:
            r2 = r48
            r1 = r16
            goto L2eb
        L1ef:
            r17 = r2
            r16 = r3
        L1f3:
            r10 = r0
            r1 = r16
            fi.b r0 = r1.f9947g0     // Catch: java.lang.Throwable -> L257
            r2 = r48
            bi.c0 r4 = r2.m6151b(r10, r0)     // Catch: java.lang.Throwable -> L2e5
            if (r4 != 0) goto L225
            if (r0 == 0) goto L220
            boolean r0 = r0.f9922a     // Catch: java.lang.Throwable -> L2e5
            if (r0 == 0) goto L220
            boolean r0 = r1.f9946f0     // Catch: java.lang.Throwable -> L2e5
            r3 = 1
            r0 = r0 ^ r3
            if (r0 == 0) goto L214
            r1.f9946f0 = r3     // Catch: java.lang.Throwable -> L2e5
            fi.c$c r0 = r1.f9941a0     // Catch: java.lang.Throwable -> L2e5
            r0.m11532i()     // Catch: java.lang.Throwable -> L2e5
            goto L220
        L214:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e5
            java.lang.String r3 = "Check failed."
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2e5
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L2e5
            throw r0     // Catch: java.lang.Throwable -> L2e5
        L220:
            r3 = 0
            r1.m5755e(r3)
            return r10
        L225:
            bi.h0 r0 = r10.f4231e0     // Catch: java.lang.Throwable -> L2e5
            if (r0 == 0) goto L22c
            ci.C0988c.m2698c(r0)     // Catch: java.lang.Throwable -> L2e5
        L22c:
            int r9 = r26 + 1
            r0 = 20
            if (r9 > r0) goto L240
            r3 = 1
            r1.m5755e(r3)
            r3 = r1
            r1 = r2
            r2 = r17
            r8 = r25
            r0 = 1
            r7 = 1
            goto L12
        L240:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> L2e5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e5
            r3.<init>()     // Catch: java.lang.Throwable -> L2e5
            java.lang.String r4 = "Too many follow-up requests: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L2e5
            r3.append(r9)     // Catch: java.lang.Throwable -> L2e5
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2e5
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L2e5
            throw r0     // Catch: java.lang.Throwable -> L2e5
        L257:
            r0 = move-exception
            r2 = r48
            goto L2eb
        L25c:
            r0 = move-exception
            r17 = r2
            r1 = r3
            r2 = r48
            r3 = r0
            boolean r0 = r3 instanceof p154ii.C3174a     // Catch: java.lang.Throwable -> L2e5
            if (r0 != 0) goto L26a
            r0 = 1
            goto L26b
        L26a:
            r0 = 0
        L26b:
            boolean r0 = r2.m6152c(r3, r1, r4, r0)     // Catch: java.lang.Throwable -> L2e5
            if (r0 == 0) goto L296
            java.lang.String r0 = "<this>"
            r5 = r25
            p214m2.C4339q.m9706k(r5, r0)     // Catch: java.lang.Throwable -> L2e5
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2e5
            int r6 = r5.size()     // Catch: java.lang.Throwable -> L2e5
            r7 = 1
            int r6 = r6 + r7
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L2e5
            r0.addAll(r5)     // Catch: java.lang.Throwable -> L2e5
            r0.add(r3)     // Catch: java.lang.Throwable -> L2e5
            r1.m5755e(r7)
            r8 = r0
            r3 = r1
            r1 = r2
            r2 = r17
            r9 = r26
            r0 = 0
            goto L12
        L296:
            r5 = r25
            ci.C0988c.m2720y(r3, r5)     // Catch: java.lang.Throwable -> L2e5
            throw r3     // Catch: java.lang.Throwable -> L2e5
        L29c:
            r0 = move-exception
            r17 = r2
            r1 = r3
            r5 = r25
            r2 = r48
            r3 = r0
            java.io.IOException r0 = r3.f9989Y     // Catch: java.lang.Throwable -> L2e5
            r6 = 0
            boolean r0 = r2.m6152c(r0, r1, r4, r6)     // Catch: java.lang.Throwable -> L2e5
            if (r0 == 0) goto L2d4
            java.io.IOException r0 = r3.f9990Z     // Catch: java.lang.Throwable -> L2e5
            java.lang.String r3 = "<this>"
            p214m2.C4339q.m9706k(r5, r3)     // Catch: java.lang.Throwable -> L2e5
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2e5
            int r7 = r5.size()     // Catch: java.lang.Throwable -> L2e5
            r8 = 1
            int r7 = r7 + r8
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L2e5
            r3.addAll(r5)     // Catch: java.lang.Throwable -> L2e5
            r3.add(r0)     // Catch: java.lang.Throwable -> L2e5
            r1.m5755e(r8)
            r8 = r3
            r9 = r26
            r0 = 0
            r7 = 1
            r3 = r1
            r1 = r2
            r2 = r17
            goto L12
        L2d4:
            java.io.IOException r0 = r3.f9990Z     // Catch: java.lang.Throwable -> L2e5
            ci.C0988c.m2720y(r0, r5)     // Catch: java.lang.Throwable -> L2e5
            throw r0     // Catch: java.lang.Throwable -> L2e5
        L2da:
            r2 = r48
            r1 = r3
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L2e5
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L2e5
            throw r0     // Catch: java.lang.Throwable -> L2e5
        L2e5:
            r0 = move-exception
            goto L2eb
        L2e7:
            r0 = move-exception
            r2 = r48
            r1 = r3
        L2eb:
            r3 = 1
            r1.m5755e(r3)
            throw r0
        L2f0:
            r2 = r1
            r1 = r3
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L30c
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L30c
            throw r3     // Catch: java.lang.Throwable -> L30c
        L2fe:
            r2 = r1
            r1 = r3
            java.lang.String r0 = "cannot make a new request because the previous response is still open: please call response.close()"
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L30c
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L30c
            throw r3     // Catch: java.lang.Throwable -> L30c
        L30c:
            r0 = move-exception
            goto L311
        L30e:
            r0 = move-exception
            r2 = r1
            r1 = r3
        L311:
            monitor-exit(r1)
            throw r0
        L313:
            r2 = r1
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: b */
    public final bi.C0775c0 m6151b(bi.C0783g0 r11, fi.C2180b r12) {
            r10 = this;
            r0 = 0
            if (r12 == 0) goto La
            fi.g r1 = r12.f9923b
            if (r1 == 0) goto La
            bi.j0 r1 = r1.f9982q
            goto Lb
        La:
            r1 = r0
        Lb:
            int r2 = r11.f4228b0
            bi.c0 r3 = r11.f4225Y
            java.lang.String r3 = r3.f4195c
            r4 = 0
            r5 = 308(0x134, float:4.32E-43)
            r6 = 307(0x133, float:4.3E-43)
            r7 = 1
            if (r2 == r6) goto Lb5
            if (r2 == r5) goto Lb5
            r8 = 401(0x191, float:5.62E-43)
            if (r2 == r8) goto Lac
            r8 = 421(0x1a5, float:5.9E-43)
            if (r2 == r8) goto L81
            r12 = 503(0x1f7, float:7.05E-43)
            if (r2 == r12) goto L6b
            r12 = 407(0x197, float:5.7E-43)
            if (r2 == r12) goto L4d
            r12 = 408(0x198, float:5.72E-43)
            if (r2 == r12) goto L33
            switch(r2) {
                case 300: goto Lb5;
                case 301: goto Lb5;
                case 302: goto Lb5;
                case 303: goto Lb5;
                default: goto L32;
            }
        L32:
            return r0
        L33:
            bi.a0 r1 = r10.f10793a
            boolean r1 = r1.f4143d0
            if (r1 != 0) goto L3a
            return r0
        L3a:
            bi.g0 r1 = r11.f4234h0
            if (r1 == 0) goto L43
            int r1 = r1.f4228b0
            if (r1 != r12) goto L43
            return r0
        L43:
            int r12 = r10.m6153d(r11, r4)
            if (r12 <= 0) goto L4a
            return r0
        L4a:
            bi.c0 r11 = r11.f4225Y
            return r11
        L4d:
            p214m2.C4339q.m9704i(r1)
            java.net.Proxy r12 = r1.f4287b
            java.net.Proxy$Type r12 = r12.type()
            java.net.Proxy$Type r0 = java.net.Proxy.Type.HTTP
            if (r12 != r0) goto L63
            bi.a0 r12 = r10.f10793a
            bi.c r12 = r12.f4150k0
            bi.c0 r11 = r12.mo2362a(r1, r11)
            return r11
        L63:
            java.net.ProtocolException r11 = new java.net.ProtocolException
            java.lang.String r12 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r11.<init>(r12)
            throw r11
        L6b:
            bi.g0 r1 = r11.f4234h0
            if (r1 == 0) goto L74
            int r1 = r1.f4228b0
            if (r1 != r12) goto L74
            return r0
        L74:
            r12 = 2147483647(0x7fffffff, float:NaN)
            int r12 = r10.m6153d(r11, r12)
            if (r12 != 0) goto L80
            bi.c0 r11 = r11.f4225Y
            return r11
        L80:
            return r0
        L81:
            if (r12 == 0) goto Lab
            zb.e r1 = r12.f9926e
            java.lang.Object r1 = r1.f27919f
            bi.a r1 = (bi.C0770a) r1
            bi.w r1 = r1.f4124a
            java.lang.String r1 = r1.f4349e
            fi.g r2 = r12.f9923b
            bi.j0 r2 = r2.f9982q
            bi.a r2 = r2.f4286a
            bi.w r2 = r2.f4124a
            java.lang.String r2 = r2.f4349e
            boolean r1 = p214m2.C4339q.m9702c(r1, r2)
            r1 = r1 ^ r7
            if (r1 != 0) goto L9f
            goto Lab
        L9f:
            fi.g r12 = r12.f9923b
            monitor-enter(r12)
            r12.f9975j = r7     // Catch: java.lang.Throwable -> La8
            monitor-exit(r12)
            bi.c0 r11 = r11.f4225Y
            return r11
        La8:
            r11 = move-exception
            monitor-exit(r12)
            throw r11
        Lab:
            return r0
        Lac:
            bi.a0 r12 = r10.f10793a
            bi.c r12 = r12.f4144e0
            bi.c0 r11 = r12.mo2362a(r1, r11)
            return r11
        Lb5:
            bi.a0 r12 = r10.f10793a
            boolean r12 = r12.f4145f0
            if (r12 != 0) goto Lbd
            goto L155
        Lbd:
            r12 = 2
            java.lang.String r1 = "Location"
            java.lang.String r12 = bi.C0783g0.m2380a(r11, r1, r0, r12)
            if (r12 == 0) goto L155
            bi.c0 r1 = r11.f4225Y
            bi.w r1 = r1.f4194b
            java.util.Objects.requireNonNull(r1)
            bi.w$a r12 = r1.m2444f(r12)
            if (r12 == 0) goto Ld8
            bi.w r12 = r12.m2447a()
            goto Ld9
        Ld8:
            r12 = r0
        Ld9:
            if (r12 == 0) goto L155
            java.lang.String r1 = r12.f4346b
            bi.c0 r2 = r11.f4225Y
            bi.w r2 = r2.f4194b
            java.lang.String r2 = r2.f4346b
            boolean r1 = p214m2.C4339q.m9702c(r1, r2)
            if (r1 != 0) goto Lf0
            bi.a0 r1 = r10.f10793a
            boolean r1 = r1.f4146g0
            if (r1 != 0) goto Lf0
            goto L155
        Lf0:
            bi.c0 r1 = r11.f4225Y
            java.util.Objects.requireNonNull(r1)
            bi.c0$a r2 = new bi.c0$a
            r2.<init>(r1)
            boolean r1 = gi.C2396f.m6147a(r3)
            if (r1 == 0) goto L13d
            int r1 = r11.f4228b0
            java.lang.String r8 = "PROPFIND"
            boolean r9 = p214m2.C4339q.m9702c(r3, r8)
            if (r9 != 0) goto L10e
            if (r1 == r5) goto L10e
            if (r1 != r6) goto L10f
        L10e:
            r4 = 1
        L10f:
            boolean r8 = p214m2.C4339q.m9702c(r3, r8)
            r7 = r7 ^ r8
            if (r7 == 0) goto L11d
            if (r1 == r5) goto L11d
            if (r1 == r6) goto L11d
            java.lang.String r3 = "GET"
            goto L123
        L11d:
            if (r4 == 0) goto L123
            bi.c0 r0 = r11.f4225Y
            bi.f0 r0 = r0.f4197e
        L123:
            r2.m2367c(r3, r0)
            if (r4 != 0) goto L13d
            java.lang.String r0 = "Transfer-Encoding"
            bi.v$a r1 = r2.f4201c
            r1.m2435d(r0)
            java.lang.String r0 = "Content-Length"
            bi.v$a r1 = r2.f4201c
            r1.m2435d(r0)
            java.lang.String r0 = "Content-Type"
            bi.v$a r1 = r2.f4201c
            r1.m2435d(r0)
        L13d:
            bi.c0 r11 = r11.f4225Y
            bi.w r11 = r11.f4194b
            boolean r11 = ci.C0988c.m2696a(r11, r12)
            if (r11 != 0) goto L14e
            java.lang.String r11 = "Authorization"
            bi.v$a r0 = r2.f4201c
            r0.m2435d(r11)
        L14e:
            r2.m2369e(r12)
            bi.c0 r0 = r2.m2365a()
        L155:
            return r0
    }

    /* renamed from: c */
    public final boolean m6152c(java.io.IOException r3, fi.C2181c r4, bi.C0775c0 r5, boolean r6) {
            r2 = this;
            bi.a0 r5 = r2.f10793a
            boolean r5 = r5.f4143d0
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            if (r6 == 0) goto Lf
            boolean r5 = r3 instanceof java.io.FileNotFoundException
            if (r5 == 0) goto Lf
            return r0
        Lf:
            boolean r5 = r3 instanceof java.net.ProtocolException
            r1 = 1
            if (r5 == 0) goto L15
            goto L31
        L15:
            boolean r5 = r3 instanceof java.io.InterruptedIOException
            if (r5 == 0) goto L20
            boolean r3 = r3 instanceof java.net.SocketTimeoutException
            if (r3 == 0) goto L31
            if (r6 != 0) goto L31
            goto L33
        L20:
            boolean r5 = r3 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L2d
            java.lang.Throwable r5 = r3.getCause()
            boolean r5 = r5 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L2d
            goto L31
        L2d:
            boolean r3 = r3 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r3 == 0) goto L33
        L31:
            r3 = 0
            goto L34
        L33:
            r3 = 1
        L34:
            if (r3 != 0) goto L37
            return r0
        L37:
            zb.e r3 = r4.f9944d0
            p214m2.C4339q.m9704i(r3)
            int r4 = r3.f27915b
            if (r4 != 0) goto L4a
            int r4 = r3.f27922i
            if (r4 != 0) goto L4a
            int r4 = r3.f27923j
            if (r4 != 0) goto L4a
            r3 = 0
            goto L73
        L4a:
            java.lang.Object r4 = r3.f27918e
            bi.j0 r4 = (bi.C0789j0) r4
            if (r4 == 0) goto L51
            goto L72
        L51:
            bi.j0 r4 = r3.m14383c()
            if (r4 == 0) goto L5a
            r3.f27918e = r4
            goto L72
        L5a:
            java.lang.Object r4 = r3.f27914a
            fi.j$a r4 = (fi.C2188j.a) r4
            if (r4 == 0) goto L67
            boolean r4 = r4.m5778a()
            if (r4 != r1) goto L67
            goto L72
        L67:
            java.lang.Object r3 = r3.f27916c
            fi.j r3 = (fi.C2188j) r3
            if (r3 == 0) goto L72
            boolean r3 = r3.m5776a()
            goto L73
        L72:
            r3 = 1
        L73:
            if (r3 != 0) goto L76
            return r0
        L76:
            return r1
    }

    /* renamed from: d */
    public final int m6153d(bi.C0783g0 r4, int r5) {
            r3 = this;
            java.lang.String r0 = "Retry-After"
            r1 = 0
            r2 = 2
            java.lang.String r4 = bi.C0783g0.m2380a(r4, r0, r1, r2)
            if (r4 == 0) goto L31
            java.lang.String r5 = "\\d+"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r0 = "compile(pattern)"
            p214m2.C4339q.m9705j(r5, r0)
            java.util.regex.Matcher r5 = r5.matcher(r4)
            boolean r5 = r5.matches()
            if (r5 == 0) goto L2d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Integer.valueOf(header)"
            p214m2.C4339q.m9705j(r4, r5)
            int r4 = r4.intValue()
            return r4
        L2d:
            r4 = 2147483647(0x7fffffff, float:NaN)
            return r4
        L31:
            return r5
    }
}
