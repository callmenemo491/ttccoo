package gi;

/* renamed from: gi.g */
/* loaded from: classes.dex */
public final class C2397g implements bi.InterfaceC0804x.a {

    /* renamed from: a */
    public int f10781a;

    /* renamed from: b */
    public final fi.C2181c f10782b;

    /* renamed from: c */
    public final java.util.List<bi.InterfaceC0804x> f10783c;

    /* renamed from: d */
    public final int f10784d;

    /* renamed from: e */
    public final fi.C2180b f10785e;

    /* renamed from: f */
    public final bi.C0775c0 f10786f;

    /* renamed from: g */
    public final int f10787g;

    /* renamed from: h */
    public final int f10788h;

    /* renamed from: i */
    public final int f10789i;

    public C2397g(fi.C2181c r2, java.util.List<? extends bi.InterfaceC0804x> r3, int r4, fi.C2180b r5, bi.C0775c0 r6, int r7, int r8, int r9) {
            r1 = this;
            java.lang.String r0 = "call"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "interceptors"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "request"
            p214m2.C4339q.m9706k(r6, r0)
            r1.<init>()
            r1.f10782b = r2
            r1.f10783c = r3
            r1.f10784d = r4
            r1.f10785e = r5
            r1.f10786f = r6
            r1.f10787g = r7
            r1.f10788h = r8
            r1.f10789i = r9
            return
    }

    /* renamed from: b */
    public static gi.C2397g m6148b(gi.C2397g r11, int r12, fi.C2180b r13, bi.C0775c0 r14, int r15, int r16, int r17, int r18) {
            r0 = r11
            r1 = r18 & 1
            if (r1 == 0) goto L9
            int r1 = r0.f10784d
            r5 = r1
            goto La
        L9:
            r5 = r12
        La:
            r1 = r18 & 2
            if (r1 == 0) goto L12
            fi.b r1 = r0.f10785e
            r6 = r1
            goto L13
        L12:
            r6 = r13
        L13:
            r1 = r18 & 4
            if (r1 == 0) goto L1b
            bi.c0 r1 = r0.f10786f
            r7 = r1
            goto L1c
        L1b:
            r7 = r14
        L1c:
            r1 = r18 & 8
            if (r1 == 0) goto L24
            int r1 = r0.f10787g
            r8 = r1
            goto L25
        L24:
            r8 = r15
        L25:
            r1 = r18 & 16
            if (r1 == 0) goto L2d
            int r1 = r0.f10788h
            r9 = r1
            goto L2f
        L2d:
            r9 = r16
        L2f:
            r1 = r18 & 32
            if (r1 == 0) goto L37
            int r1 = r0.f10789i
            r10 = r1
            goto L39
        L37:
            r10 = r17
        L39:
            java.lang.String r1 = "request"
            p214m2.C4339q.m9706k(r7, r1)
            gi.g r1 = new gi.g
            fi.c r3 = r0.f10782b
            java.util.List<bi.x> r4 = r0.f10783c
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
    }

    /* renamed from: a */
    public bi.InterfaceC0790k m6149a() {
            r1 = this;
            fi.b r0 = r1.f10785e
            if (r0 == 0) goto L7
            fi.g r0 = r0.f9923b
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    /* renamed from: c */
    public bi.C0783g0 m6150c(bi.C0775c0 r14) {
            r13 = this;
            java.lang.String r0 = "request"
            p214m2.C4339q.m9706k(r14, r0)
            int r0 = r13.f10784d
            java.util.List<bi.x> r1 = r13.f10783c
            int r1 = r1.size()
            r2 = 0
            r3 = 1
            if (r0 >= r1) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 == 0) goto L117
            int r0 = r13.f10781a
            int r0 = r0 + r3
            r13.f10781a = r0
            fi.b r0 = r13.f10785e
            java.lang.String r1 = " must call proceed() exactly once"
            java.lang.String r4 = "network interceptor "
            if (r0 == 0) goto L7f
            zb.e r0 = r0.f9926e
            bi.w r5 = r14.f4194b
            boolean r0 = r0.m14384d(r5)
            if (r0 == 0) goto L5a
            int r0 = r13.f10781a
            if (r0 != r3) goto L33
            r0 = 1
            goto L34
        L33:
            r0 = 0
        L34:
            if (r0 == 0) goto L37
            goto L7f
        L37:
            java.lang.StringBuilder r14 = android.support.v4.media.C0144c.m256a(r4)
            java.util.List<bi.x> r0 = r13.f10783c
            int r2 = r13.f10784d
            int r2 = r2 - r3
            java.lang.Object r0 = r0.get(r2)
            bi.x r0 = (bi.InterfaceC0804x) r0
            r14.append(r0)
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        L5a:
            java.lang.StringBuilder r14 = android.support.v4.media.C0144c.m256a(r4)
            java.util.List<bi.x> r0 = r13.f10783c
            int r1 = r13.f10784d
            int r1 = r1 - r3
            java.lang.Object r0 = r0.get(r1)
            bi.x r0 = (bi.InterfaceC0804x) r0
            r14.append(r0)
            java.lang.String r0 = " must retain the same host and port"
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        L7f:
            int r0 = r13.f10784d
            int r6 = r0 + 1
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 58
            r5 = r13
            r8 = r14
            gi.g r14 = m6148b(r5, r6, r7, r8, r9, r10, r11, r12)
            java.util.List<bi.x> r0 = r13.f10783c
            int r5 = r13.f10784d
            java.lang.Object r0 = r0.get(r5)
            bi.x r0 = (bi.InterfaceC0804x) r0
            bi.g0 r5 = r0.mo2456a(r14)
            java.lang.String r6 = "interceptor "
            if (r5 == 0) goto Lfd
            fi.b r7 = r13.f10785e
            if (r7 == 0) goto Ld7
            int r7 = r13.f10784d
            int r7 = r7 + r3
            java.util.List<bi.x> r8 = r13.f10783c
            int r8 = r8.size()
            if (r7 >= r8) goto Lb7
            int r14 = r14.f10781a
            if (r14 != r3) goto Lb5
            goto Lb7
        Lb5:
            r14 = 0
            goto Lb8
        Lb7:
            r14 = 1
        Lb8:
            if (r14 == 0) goto Lbb
            goto Ld7
        Lbb:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r4)
            r14.append(r0)
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        Ld7:
            bi.h0 r14 = r5.f4231e0
            if (r14 == 0) goto Ldc
            r2 = 1
        Ldc:
            if (r2 == 0) goto Ldf
            return r5
        Ldf:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r6)
            r14.append(r0)
            java.lang.String r0 = " returned a response with no body"
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        Lfd:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r0)
            java.lang.String r0 = " returned null"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r14.<init>(r0)
            throw r14
        L117:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
    }
}
