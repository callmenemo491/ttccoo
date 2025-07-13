package gi;

/* renamed from: gi.a */
/* loaded from: classes.dex */
public final class C2391a implements bi.InterfaceC0804x {

    /* renamed from: a */
    public final bi.InterfaceC0795o f10774a;

    public C2391a(bi.InterfaceC0795o r2) {
            r1 = this;
            java.lang.String r0 = "cookieJar"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.f10774a = r2
            return
    }

    @Override // bi.InterfaceC0804x
    /* renamed from: a */
    public bi.C0783g0 mo2456a(bi.InterfaceC0804x.a r26) {
            r25 = this;
            r0 = r25
            r1 = r26
            gi.g r1 = (gi.C2397g) r1
            bi.c0 r3 = r1.f10786f
            java.util.Objects.requireNonNull(r3)
            bi.c0$a r2 = new bi.c0$a
            r2.<init>(r3)
            bi.f0 r4 = r3.f4197e
            java.lang.String r5 = "Content-Type"
            r6 = -1
            java.lang.String r8 = "Content-Length"
            if (r4 == 0) goto L46
            bi.y r9 = r4.mo2372b()
            if (r9 == 0) goto L25
            java.lang.String r9 = r9.f4366a
            r2.m2366b(r5, r9)
        L25:
            long r9 = r4.mo2371a()
            java.lang.String r4 = "Transfer-Encoding"
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L3c
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r2.m2366b(r8, r9)
            bi.v$a r9 = r2.f4201c
            r9.m2435d(r4)
            goto L46
        L3c:
            java.lang.String r9 = "chunked"
            r2.m2366b(r4, r9)
            bi.v$a r4 = r2.f4201c
            r4.m2435d(r8)
        L46:
            java.lang.String r4 = "Host"
            java.lang.String r9 = r3.m2364b(r4)
            r10 = 0
            if (r9 != 0) goto L58
            bi.w r9 = r3.f4194b
            java.lang.String r9 = ci.C0988c.m2716u(r9, r10)
            r2.m2366b(r4, r9)
        L58:
            java.lang.String r4 = "Connection"
            java.lang.String r9 = r3.m2364b(r4)
            if (r9 != 0) goto L65
            java.lang.String r9 = "Keep-Alive"
            r2.m2366b(r4, r9)
        L65:
            java.lang.String r4 = "Accept-Encoding"
            java.lang.String r9 = r3.m2364b(r4)
            java.lang.String r11 = "gzip"
            r12 = 1
            if (r9 != 0) goto L7d
            java.lang.String r9 = "Range"
            java.lang.String r9 = r3.m2364b(r9)
            if (r9 != 0) goto L7d
            r2.m2366b(r4, r11)
            r4 = 1
            goto L7e
        L7d:
            r4 = 0
        L7e:
            bi.o r9 = r0.f10774a
            bi.w r13 = r3.f4194b
            java.util.List r9 = r9.mo2416b(r13)
            boolean r13 = r9.isEmpty()
            r13 = r13 ^ r12
            r14 = 0
            if (r13 == 0) goto Ld6
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.util.Iterator r9 = r9.iterator()
            r15 = 0
        L98:
            boolean r16 = r9.hasNext()
            if (r16 == 0) goto Lc8
            java.lang.Object r16 = r9.next()
            int r17 = r15 + 1
            if (r15 < 0) goto Lc4
            r10 = r16
            bi.m r10 = (bi.C0793m) r10
            if (r15 <= 0) goto Lb1
            java.lang.String r15 = "; "
            r13.append(r15)
        Lb1:
            java.lang.String r15 = r10.f4312a
            r13.append(r15)
            r15 = 61
            r13.append(r15)
            java.lang.String r10 = r10.f4313b
            r13.append(r10)
            r15 = r17
            r10 = 0
            goto L98
        Lc4:
            p074e9.C1805a.m4539x()
            throw r14
        Lc8:
            java.lang.String r9 = r13.toString()
            java.lang.String r10 = "StringBuilder().apply(builderAction).toString()"
            p214m2.C4339q.m9705j(r9, r10)
            java.lang.String r10 = "Cookie"
            r2.m2366b(r10, r9)
        Ld6:
            java.lang.String r9 = "User-Agent"
            java.lang.String r10 = r3.m2364b(r9)
            if (r10 != 0) goto Le3
            java.lang.String r10 = "okhttp/4.9.0"
            r2.m2366b(r9, r10)
        Le3:
            bi.c0 r2 = r2.m2365a()
            bi.g0 r1 = r1.m6150c(r2)
            bi.o r2 = r0.f10774a
            bi.w r9 = r3.f4194b
            bi.v r10 = r1.f4230d0
            gi.C2395e.m6146b(r2, r9, r10)
            bi.b0 r9 = r1.f4226Z
            int r10 = r1.f4228b0
            java.lang.String r13 = r1.f4227a0
            bi.u r15 = r1.f4229c0
            bi.v r2 = r1.f4230d0
            bi.v$a r2 = r2.m2430h()
            bi.h0 r6 = r1.f4231e0
            bi.g0 r7 = r1.f4232f0
            bi.g0 r12 = r1.f4233g0
            bi.g0 r14 = r1.f4234h0
            r19 = r14
            r18 = r15
            long r14 = r1.f4235i0
            r20 = r14
            long r14 = r1.f4236j0
            fi.b r0 = r1.f4237k0
            r22 = r2
            java.lang.String r2 = "request"
            p214m2.C4339q.m9706k(r3, r2)
            if (r4 == 0) goto L16d
            java.lang.String r2 = "Content-Encoding"
            r4 = 2
            r23 = r6
            r24 = r7
            r6 = 0
            java.lang.String r7 = bi.C0783g0.m2380a(r1, r2, r6, r4)
            r6 = 1
            boolean r7 = p362uh.C6463i.m13053J(r11, r7, r6)
            if (r7 == 0) goto L172
            boolean r7 = gi.C2395e.m6145a(r1)
            if (r7 == 0) goto L172
            bi.h0 r7 = r1.f4231e0
            if (r7 == 0) goto L172
            oi.m r11 = new oi.m
            oi.h r7 = r7.mo2396l()
            r11.<init>(r7)
            bi.v r7 = r1.f4230d0
            bi.v$a r7 = r7.m2430h()
            r7.m2435d(r2)
            r7.m2435d(r8)
            bi.v r2 = r7.m2434c()
            bi.v$a r2 = r2.m2430h()
            r7 = 0
            java.lang.String r1 = bi.C0783g0.m2380a(r1, r5, r7, r4)
            gi.h r4 = new gi.h
            oi.t r5 = new oi.t
            r5.<init>(r11)
            r7 = -1
            r4.<init>(r1, r7, r5)
            r23 = r4
            goto L174
        L16d:
            r23 = r6
            r24 = r7
            r6 = 1
        L172:
            r2 = r22
        L174:
            if (r10 < 0) goto L177
            goto L178
        L177:
            r6 = 0
        L178:
            if (r6 == 0) goto L1b2
            if (r9 == 0) goto L1a6
            if (r13 == 0) goto L19a
            bi.v r8 = r2.m2434c()
            bi.g0 r1 = new bi.g0
            r2 = r1
            r4 = r9
            r5 = r13
            r6 = r10
            r10 = r24
            r7 = r18
            r9 = r23
            r11 = r12
            r12 = r19
            r15 = r14
            r13 = r20
            r17 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17)
            return r1
        L19a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "message == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1a6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "protocol == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1b2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "code < 0: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }
}
