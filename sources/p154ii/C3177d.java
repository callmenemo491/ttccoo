package p154ii;

/* renamed from: ii.d */
/* loaded from: classes.dex */
public final class C3177d {

    /* renamed from: a */
    public static final p154ii.C3176c[] f12690a = null;

    /* renamed from: b */
    public static final java.util.Map<p260oi.C5287i, java.lang.Integer> f12691b = null;

    /* renamed from: c */
    public static final p154ii.C3177d f12692c = null;

    /* renamed from: ii.d$a */
    public static final class a {

        /* renamed from: a */
        public final java.util.List<p154ii.C3176c> f12693a;

        /* renamed from: b */
        public final p260oi.InterfaceC5286h f12694b;

        /* renamed from: c */
        public p154ii.C3176c[] f12695c;

        /* renamed from: d */
        public int f12696d;

        /* renamed from: e */
        public int f12697e;

        /* renamed from: f */
        public int f12698f;

        /* renamed from: g */
        public final int f12699g;

        /* renamed from: h */
        public int f12700h;

        public a(p260oi.InterfaceC5304z r1, int r2, int r3, int r4) {
                r0 = this;
                r4 = r4 & 4
                if (r4 == 0) goto L5
                r3 = r2
            L5:
                r0.<init>()
                r0.f12699g = r2
                r0.f12700h = r3
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r0.f12693a = r2
                oi.t r2 = new oi.t
                r2.<init>(r1)
                r0.f12694b = r2
                r1 = 8
                ii.c[] r1 = new p154ii.C3176c[r1]
                r0.f12695c = r1
                r1 = 7
                r0.f12696d = r1
                return
        }

        /* renamed from: a */
        public final void m7613a() {
                r4 = this;
                ii.c[] r0 = r4.f12695c
                int r1 = r0.length
                r2 = 0
                r3 = 0
                java.util.Arrays.fill(r0, r2, r1, r3)
                ii.c[] r0 = r4.f12695c
                int r0 = r0.length
                int r0 = r0 + (-1)
                r4.f12696d = r0
                r4.f12697e = r2
                r4.f12698f = r2
                return
        }

        /* renamed from: b */
        public final int m7614b(int r2) {
                r1 = this;
                int r0 = r1.f12696d
                int r0 = r0 + 1
                int r0 = r0 + r2
                return r0
        }

        /* renamed from: c */
        public final int m7615c(int r5) {
                r4 = this;
                r0 = 0
                if (r5 <= 0) goto L39
                ii.c[] r1 = r4.f12695c
                int r1 = r1.length
                int r1 = r1 + (-1)
            L8:
                int r2 = r4.f12696d
                if (r1 < r2) goto L28
                if (r5 <= 0) goto L28
                ii.c[] r2 = r4.f12695c
                r2 = r2[r1]
                p214m2.C4339q.m9704i(r2)
                int r2 = r2.f12687a
                int r5 = r5 - r2
                int r3 = r4.f12698f
                int r3 = r3 - r2
                r4.f12698f = r3
                int r2 = r4.f12697e
                int r2 = r2 + (-1)
                r4.f12697e = r2
                int r0 = r0 + 1
                int r1 = r1 + (-1)
                goto L8
            L28:
                ii.c[] r5 = r4.f12695c
                int r1 = r2 + 1
                int r2 = r2 + 1
                int r2 = r2 + r0
                int r3 = r4.f12697e
                java.lang.System.arraycopy(r5, r1, r5, r2, r3)
                int r5 = r4.f12696d
                int r5 = r5 + r0
                r4.f12696d = r5
            L39:
                return r0
        }

        /* renamed from: d */
        public final p260oi.C5287i m7616d(int r4) {
                r3 = this;
                if (r4 < 0) goto Ld
                ii.d r0 = p154ii.C3177d.f12692c
                ii.c[] r0 = p154ii.C3177d.f12690a
                int r0 = r0.length
                int r0 = r0 + (-1)
                if (r4 > r0) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                if (r0 == 0) goto L17
                ii.d r0 = p154ii.C3177d.f12692c
                ii.c[] r0 = p154ii.C3177d.f12690a
                r4 = r0[r4]
                goto L2e
            L17:
                ii.d r0 = p154ii.C3177d.f12692c
                ii.c[] r0 = p154ii.C3177d.f12690a
                int r0 = r0.length
                int r0 = r4 - r0
                int r0 = r3.m7614b(r0)
                if (r0 < 0) goto L31
                ii.c[] r1 = r3.f12695c
                int r2 = r1.length
                if (r0 >= r2) goto L31
                r4 = r1[r0]
                p214m2.C4339q.m9704i(r4)
            L2e:
                oi.i r4 = r4.f12688b
                return r4
            L31:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Header index too large "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                int r4 = r4 + 1
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        /* renamed from: e */
        public final void m7617e(int r7, p154ii.C3176c r8) {
                r6 = this;
                java.util.List<ii.c> r0 = r6.f12693a
                r0.add(r8)
                int r0 = r8.f12687a
                r1 = -1
                if (r7 == r1) goto L19
                ii.c[] r2 = r6.f12695c
                int r3 = r6.f12696d
                int r3 = r3 + 1
                int r3 = r3 + r7
                r2 = r2[r3]
                p214m2.C4339q.m9704i(r2)
                int r2 = r2.f12687a
                int r0 = r0 - r2
            L19:
                int r2 = r6.f12700h
                if (r0 <= r2) goto L21
                r6.m7613a()
                return
            L21:
                int r3 = r6.f12698f
                int r3 = r3 + r0
                int r3 = r3 - r2
                int r2 = r6.m7615c(r3)
                if (r7 != r1) goto L58
                int r7 = r6.f12697e
                int r7 = r7 + 1
                ii.c[] r2 = r6.f12695c
                int r3 = r2.length
                if (r7 <= r3) goto L47
                int r7 = r2.length
                int r7 = r7 * 2
                ii.c[] r7 = new p154ii.C3176c[r7]
                r3 = 0
                int r4 = r2.length
                int r5 = r2.length
                java.lang.System.arraycopy(r2, r3, r7, r4, r5)
                ii.c[] r2 = r6.f12695c
                int r2 = r2.length
                int r2 = r2 + r1
                r6.f12696d = r2
                r6.f12695c = r7
            L47:
                int r7 = r6.f12696d
                int r1 = r7 + (-1)
                r6.f12696d = r1
                ii.c[] r1 = r6.f12695c
                r1[r7] = r8
                int r7 = r6.f12697e
                int r7 = r7 + 1
                r6.f12697e = r7
                goto L63
            L58:
                int r1 = r6.f12696d
                int r1 = r1 + 1
                int r1 = r1 + r7
                int r1 = r1 + r2
                int r1 = r1 + r7
                ii.c[] r7 = r6.f12695c
                r7[r1] = r8
            L63:
                int r7 = r6.f12698f
                int r7 = r7 + r0
                r6.f12698f = r7
                return
        }

        /* renamed from: f */
        public final p260oi.C5287i m7618f() {
                r11 = this;
                oi.h r0 = r11.f12694b
                byte r0 = r0.readByte()
                byte[] r1 = ci.C0988c.f5065a
                r0 = r0 & 255(0xff, float:3.57E-43)
                r1 = r0 & 128(0x80, float:1.8E-43)
                r2 = 128(0x80, float:1.8E-43)
                r3 = 0
                if (r1 != r2) goto L13
                r1 = 1
                goto L14
            L13:
                r1 = 0
            L14:
                r2 = 127(0x7f, float:1.78E-43)
                int r0 = r11.m7619g(r0, r2)
                long r4 = (long) r0
                if (r1 == 0) goto L96
                oi.e r0 = new oi.e
                r0.<init>()
                ii.q r1 = p154ii.C3190q.f12847d
                oi.h r1 = r11.f12694b
                java.lang.String r2 = "source"
                p214m2.C4339q.m9706k(r1, r2)
                ii.q$a r2 = p154ii.C3190q.f12846c
                r6 = 0
                r7 = r6
                r6 = 0
            L31:
                int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r9 >= 0) goto L6b
                byte r9 = r1.readByte()
                byte[] r10 = ci.C0988c.f5065a
                r9 = r9 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 8
                r3 = r3 | r9
                int r6 = r6 + 8
            L42:
                r9 = 8
                if (r6 < r9) goto L67
                int r9 = r6 + (-8)
                int r10 = r3 >>> r9
                r10 = r10 & 255(0xff, float:3.57E-43)
                ii.q$a[] r2 = r2.f12848a
                p214m2.C4339q.m9704i(r2)
                r2 = r2[r10]
                p214m2.C4339q.m9704i(r2)
                ii.q$a[] r10 = r2.f12848a
                if (r10 != 0) goto L65
                int r9 = r2.f12849b
                r0.m11539D0(r9)
                int r2 = r2.f12850c
                int r6 = r6 - r2
                ii.q$a r2 = p154ii.C3190q.f12846c
                goto L42
            L65:
                r6 = r9
                goto L42
            L67:
                r9 = 1
                long r7 = r7 + r9
                goto L31
            L6b:
                if (r6 <= 0) goto L91
                int r1 = 8 - r6
                int r1 = r3 << r1
                r1 = r1 & 255(0xff, float:3.57E-43)
                ii.q$a[] r2 = r2.f12848a
                p214m2.C4339q.m9704i(r2)
                r1 = r2[r1]
                p214m2.C4339q.m9704i(r1)
                ii.q$a[] r2 = r1.f12848a
                if (r2 != 0) goto L91
                int r2 = r1.f12850c
                if (r2 <= r6) goto L86
                goto L91
            L86:
                int r2 = r1.f12849b
                r0.m11539D0(r2)
                int r1 = r1.f12850c
                int r6 = r6 - r1
                ii.q$a r2 = p154ii.C3190q.f12846c
                goto L6b
            L91:
                oi.i r0 = r0.m11560b0()
                goto L9c
            L96:
                oi.h r0 = r11.f12694b
                oi.i r0 = r0.mo11571q(r4)
            L9c:
                return r0
        }

        /* renamed from: g */
        public final int m7619g(int r3, int r4) {
                r2 = this;
                r3 = r3 & r4
                if (r3 >= r4) goto L4
                return r3
            L4:
                r3 = 0
            L5:
                oi.h r0 = r2.f12694b
                byte r0 = r0.readByte()
                byte[] r1 = ci.C0988c.f5065a
                r0 = r0 & 255(0xff, float:3.57E-43)
                r1 = r0 & 128(0x80, float:1.8E-43)
                if (r1 == 0) goto L1a
                r0 = r0 & 127(0x7f, float:1.78E-43)
                int r0 = r0 << r3
                int r4 = r4 + r0
                int r3 = r3 + 7
                goto L5
            L1a:
                int r3 = r0 << r3
                int r4 = r4 + r3
                return r4
        }
    }

    /* renamed from: ii.d$b */
    public static final class b {

        /* renamed from: a */
        public int f12701a;

        /* renamed from: b */
        public boolean f12702b;

        /* renamed from: c */
        public int f12703c;

        /* renamed from: d */
        public p154ii.C3176c[] f12704d;

        /* renamed from: e */
        public int f12705e;

        /* renamed from: f */
        public int f12706f;

        /* renamed from: g */
        public int f12707g;

        /* renamed from: h */
        public final boolean f12708h;

        /* renamed from: i */
        public final p260oi.C5283e f12709i;

        public b(int r2, boolean r3, p260oi.C5283e r4, int r5) {
                r1 = this;
                r0 = r5 & 1
                if (r0 == 0) goto L6
                r2 = 4096(0x1000, float:5.74E-42)
            L6:
                r5 = r5 & 2
                if (r5 == 0) goto Lb
                r3 = 1
            Lb:
                r1.<init>()
                r1.f12708h = r3
                r1.f12709i = r4
                r3 = 2147483647(0x7fffffff, float:NaN)
                r1.f12701a = r3
                r1.f12703c = r2
                r2 = 8
                ii.c[] r2 = new p154ii.C3176c[r2]
                r1.f12704d = r2
                r2 = 7
                r1.f12705e = r2
                return
        }

        /* renamed from: a */
        public final void m7620a() {
                r4 = this;
                ii.c[] r0 = r4.f12704d
                int r1 = r0.length
                r2 = 0
                r3 = 0
                java.util.Arrays.fill(r0, r2, r1, r3)
                ii.c[] r0 = r4.f12704d
                int r0 = r0.length
                int r0 = r0 + (-1)
                r4.f12705e = r0
                r4.f12706f = r2
                r4.f12707g = r2
                return
        }

        /* renamed from: b */
        public final int m7621b(int r5) {
                r4 = this;
                r0 = 0
                if (r5 <= 0) goto L4f
                ii.c[] r1 = r4.f12704d
                int r1 = r1.length
                int r1 = r1 + (-1)
            L8:
                int r2 = r4.f12705e
                if (r1 < r2) goto L31
                if (r5 <= 0) goto L31
                ii.c[] r2 = r4.f12704d
                r2 = r2[r1]
                p214m2.C4339q.m9704i(r2)
                int r2 = r2.f12687a
                int r5 = r5 - r2
                int r2 = r4.f12707g
                ii.c[] r3 = r4.f12704d
                r3 = r3[r1]
                p214m2.C4339q.m9704i(r3)
                int r3 = r3.f12687a
                int r2 = r2 - r3
                r4.f12707g = r2
                int r2 = r4.f12706f
                int r2 = r2 + (-1)
                r4.f12706f = r2
                int r0 = r0 + 1
                int r1 = r1 + (-1)
                goto L8
            L31:
                ii.c[] r5 = r4.f12704d
                int r1 = r2 + 1
                int r2 = r2 + 1
                int r2 = r2 + r0
                int r3 = r4.f12706f
                java.lang.System.arraycopy(r5, r1, r5, r2, r3)
                ii.c[] r5 = r4.f12704d
                int r1 = r4.f12705e
                int r2 = r1 + 1
                int r1 = r1 + 1
                int r1 = r1 + r0
                r3 = 0
                java.util.Arrays.fill(r5, r2, r1, r3)
                int r5 = r4.f12705e
                int r5 = r5 + r0
                r4.f12705e = r5
            L4f:
                return r0
        }

        /* renamed from: c */
        public final void m7622c(p154ii.C3176c r7) {
                r6 = this;
                int r0 = r7.f12687a
                int r1 = r6.f12703c
                if (r0 <= r1) goto La
                r6.m7620a()
                return
            La:
                int r2 = r6.f12707g
                int r2 = r2 + r0
                int r2 = r2 - r1
                r6.m7621b(r2)
                int r1 = r6.f12706f
                int r1 = r1 + 1
                ii.c[] r2 = r6.f12704d
                int r3 = r2.length
                if (r1 <= r3) goto L2e
                int r1 = r2.length
                int r1 = r1 * 2
                ii.c[] r1 = new p154ii.C3176c[r1]
                r3 = 0
                int r4 = r2.length
                int r5 = r2.length
                java.lang.System.arraycopy(r2, r3, r1, r4, r5)
                ii.c[] r2 = r6.f12704d
                int r2 = r2.length
                int r2 = r2 + (-1)
                r6.f12705e = r2
                r6.f12704d = r1
            L2e:
                int r1 = r6.f12705e
                int r2 = r1 + (-1)
                r6.f12705e = r2
                ii.c[] r2 = r6.f12704d
                r2[r1] = r7
                int r7 = r6.f12706f
                int r7 = r7 + 1
                r6.f12706f = r7
                int r7 = r6.f12707g
                int r7 = r7 + r0
                r6.f12707g = r7
                return
        }

        /* renamed from: d */
        public final void m7623d(p260oi.C5287i r11) {
                r10 = this;
                java.lang.String r0 = "data"
                p214m2.C4339q.m9706k(r11, r0)
                boolean r0 = r10.f12708h
                r1 = 127(0x7f, float:1.78E-43)
                r2 = 0
                if (r0 == 0) goto L92
                ii.q r0 = p154ii.C3190q.f12847d
                java.lang.String r0 = "bytes"
                p214m2.C4339q.m9706k(r11, r0)
                int r0 = r11.mo11585h()
                r3 = 0
                r6 = r3
                r5 = 0
            L1b:
                if (r5 >= r0) goto L2e
                byte r8 = r11.mo11588o(r5)
                byte[] r9 = ci.C0988c.f5065a
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte[] r9 = p154ii.C3190q.f12845b
                r8 = r9[r8]
                long r8 = (long) r8
                long r6 = r6 + r8
                int r5 = r5 + 1
                goto L1b
            L2e:
                r0 = 7
                long r8 = (long) r0
                long r6 = r6 + r8
                r0 = 3
                long r5 = r6 >> r0
                int r0 = (int) r5
                int r5 = r11.mo11585h()
                if (r0 >= r5) goto L92
                oi.e r0 = new oi.e
                r0.<init>()
                ii.q r5 = p154ii.C3190q.f12847d
                java.lang.String r5 = "source"
                p214m2.C4339q.m9706k(r11, r5)
                java.lang.String r5 = "sink"
                p214m2.C4339q.m9706k(r0, r5)
                int r5 = r11.mo11585h()
                r6 = r3
                r3 = 0
            L52:
                if (r2 >= r5) goto L78
                byte r4 = r11.mo11588o(r2)
                byte[] r8 = ci.C0988c.f5065a
                r4 = r4 & 255(0xff, float:3.57E-43)
                int[] r8 = p154ii.C3190q.f12844a
                r8 = r8[r4]
                byte[] r9 = p154ii.C3190q.f12845b
                r4 = r9[r4]
                long r6 = r6 << r4
                long r8 = (long) r8
                long r6 = r6 | r8
                int r3 = r3 + r4
            L68:
                r4 = 8
                if (r3 < r4) goto L75
                int r3 = r3 + (-8)
                long r8 = r6 >> r3
                int r4 = (int) r8
                r0.mo11543G(r4)
                goto L68
            L75:
                int r2 = r2 + 1
                goto L52
            L78:
                if (r3 <= 0) goto L87
                int r11 = 8 - r3
                long r4 = r6 << r11
                r6 = 255(0xff, double:1.26E-321)
                long r2 = r6 >>> r3
                long r2 = r2 | r4
                int r11 = (int) r2
                r0.mo11543G(r11)
            L87:
                oi.i r11 = r0.m11560b0()
                int r0 = r11.mo11585h()
                r2 = 128(0x80, float:1.8E-43)
                goto L96
            L92:
                int r0 = r11.mo11585h()
            L96:
                r10.m7625f(r0, r1, r2)
                oi.e r0 = r10.f12709i
                r0.m11582z0(r11)
                return
        }

        /* renamed from: e */
        public final void m7624e(java.util.List<p154ii.C3176c> r14) {
                r13 = this;
                boolean r0 = r13.f12702b
                r1 = 0
                if (r0 == 0) goto L1e
                int r0 = r13.f12701a
                int r2 = r13.f12703c
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L12
                r13.m7625f(r0, r4, r3)
            L12:
                r13.f12702b = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r13.f12701a = r0
                int r0 = r13.f12703c
                r13.m7625f(r0, r4, r3)
            L1e:
                int r0 = r14.size()
                r2 = 0
            L23:
                if (r2 >= r0) goto L100
                java.lang.Object r3 = r14.get(r2)
                ii.c r3 = (p154ii.C3176c) r3
                oi.i r4 = r3.f12688b
                oi.i r4 = r4.mo11591r()
                oi.i r5 = r3.f12689c
                ii.d r6 = p154ii.C3177d.f12692c
                java.util.Map<oi.i, java.lang.Integer> r6 = p154ii.C3177d.f12691b
                java.lang.Object r6 = r6.get(r4)
                java.lang.Integer r6 = (java.lang.Integer) r6
                r7 = -1
                if (r6 == 0) goto L70
                int r6 = r6.intValue()
                int r6 = r6 + 1
                r8 = 7
                r9 = 2
                if (r9 <= r6) goto L4b
                goto L6d
            L4b:
                if (r8 < r6) goto L6d
                ii.c[] r8 = p154ii.C3177d.f12690a
                int r9 = r6 + (-1)
                r9 = r8[r9]
                oi.i r9 = r9.f12689c
                boolean r9 = p214m2.C4339q.m9702c(r9, r5)
                if (r9 == 0) goto L5d
                r8 = r6
                goto L72
            L5d:
                r8 = r8[r6]
                oi.i r8 = r8.f12689c
                boolean r8 = p214m2.C4339q.m9702c(r8, r5)
                if (r8 == 0) goto L6d
                int r8 = r6 + 1
                r12 = r8
                r8 = r6
                r6 = r12
                goto L72
            L6d:
                r8 = r6
                r6 = -1
                goto L72
            L70:
                r6 = -1
                r8 = -1
            L72:
                if (r6 != r7) goto Lb4
                int r9 = r13.f12705e
                int r9 = r9 + 1
                ii.c[] r10 = r13.f12704d
                int r10 = r10.length
            L7b:
                if (r9 >= r10) goto Lb4
                ii.c[] r11 = r13.f12704d
                r11 = r11[r9]
                p214m2.C4339q.m9704i(r11)
                oi.i r11 = r11.f12688b
                boolean r11 = p214m2.C4339q.m9702c(r11, r4)
                if (r11 == 0) goto Lb1
                ii.c[] r11 = r13.f12704d
                r11 = r11[r9]
                p214m2.C4339q.m9704i(r11)
                oi.i r11 = r11.f12689c
                boolean r11 = p214m2.C4339q.m9702c(r11, r5)
                if (r11 == 0) goto La5
                int r6 = r13.f12705e
                int r9 = r9 - r6
                ii.d r6 = p154ii.C3177d.f12692c
                ii.c[] r6 = p154ii.C3177d.f12690a
                int r6 = r6.length
                int r6 = r6 + r9
                goto Lb4
            La5:
                if (r8 != r7) goto Lb1
                int r8 = r13.f12705e
                int r8 = r9 - r8
                ii.d r11 = p154ii.C3177d.f12692c
                ii.c[] r11 = p154ii.C3177d.f12690a
                int r11 = r11.length
                int r8 = r8 + r11
            Lb1:
                int r9 = r9 + 1
                goto L7b
            Lb4:
                if (r6 == r7) goto Lbe
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.8E-43)
                r13.m7625f(r6, r3, r4)
                goto Lfc
            Lbe:
                r6 = 64
                if (r8 != r7) goto Lcb
                oi.e r7 = r13.f12709i
                r7.m11539D0(r6)
                r13.m7623d(r4)
                goto Lf6
            Lcb:
                oi.i r7 = p154ii.C3176c.f12681d
                java.util.Objects.requireNonNull(r4)
                java.lang.String r9 = "prefix"
                p214m2.C4339q.m9706k(r7, r9)
                byte[] r9 = r7.f20508a0
                int r9 = r9.length
                boolean r7 = r4.mo11589p(r1, r7, r1, r9)
                if (r7 == 0) goto Lf1
                oi.i r7 = p154ii.C3176c.f12686i
                boolean r4 = p214m2.C4339q.m9702c(r7, r4)
                r4 = r4 ^ 1
                if (r4 == 0) goto Lf1
                r3 = 15
                r13.m7625f(r8, r3, r1)
                r13.m7623d(r5)
                goto Lfc
            Lf1:
                r4 = 63
                r13.m7625f(r8, r4, r6)
            Lf6:
                r13.m7623d(r5)
                r13.m7622c(r3)
            Lfc:
                int r2 = r2 + 1
                goto L23
            L100:
                return
        }

        /* renamed from: f */
        public final void m7625f(int r2, int r3, int r4) {
                r1 = this;
                if (r2 >= r3) goto L9
                oi.e r3 = r1.f12709i
                r2 = r2 | r4
            L5:
                r3.m11539D0(r2)
                return
            L9:
                oi.e r0 = r1.f12709i
                r4 = r4 | r3
                r0.m11539D0(r4)
                int r2 = r2 - r3
            L10:
                r3 = 128(0x80, float:1.8E-43)
                if (r2 < r3) goto L1f
                r4 = r2 & 127(0x7f, float:1.78E-43)
                oi.e r0 = r1.f12709i
                r3 = r3 | r4
                r0.m11539D0(r3)
                int r2 = r2 >>> 7
                goto L10
            L1f:
                oi.e r3 = r1.f12709i
                goto L5
        }
    }

    static {
            ii.d r0 = new ii.d
            r0.<init>()
            p154ii.C3177d.f12692c = r0
            r0 = 61
            ii.c[] r0 = new p154ii.C3176c[r0]
            ii.c r1 = new ii.c
            oi.i r2 = p154ii.C3176c.f12686i
            java.lang.String r3 = ""
            r1.<init>(r2, r3)
            r2 = 0
            r0[r2] = r1
            ii.c r1 = new ii.c
            oi.i r4 = p154ii.C3176c.f12683f
            java.lang.String r5 = "GET"
            r1.<init>(r4, r5)
            r5 = 1
            r0[r5] = r1
            ii.c r1 = new ii.c
            java.lang.String r5 = "POST"
            r1.<init>(r4, r5)
            r4 = 2
            r0[r4] = r1
            ii.c r1 = new ii.c
            oi.i r4 = p154ii.C3176c.f12684g
            java.lang.String r5 = "/"
            r1.<init>(r4, r5)
            r5 = 3
            r0[r5] = r1
            ii.c r1 = new ii.c
            java.lang.String r5 = "/index.html"
            r1.<init>(r4, r5)
            r4 = 4
            r0[r4] = r1
            ii.c r1 = new ii.c
            oi.i r4 = p154ii.C3176c.f12685h
            java.lang.String r5 = "http"
            r1.<init>(r4, r5)
            r5 = 5
            r0[r5] = r1
            ii.c r1 = new ii.c
            java.lang.String r5 = "https"
            r1.<init>(r4, r5)
            r4 = 6
            r0[r4] = r1
            ii.c r1 = new ii.c
            oi.i r4 = p154ii.C3176c.f12682e
            java.lang.String r5 = "200"
            r1.<init>(r4, r5)
            r5 = 7
            r0[r5] = r1
            ii.c r1 = new ii.c
            java.lang.String r5 = "204"
            r1.<init>(r4, r5)
            r5 = 8
            r0[r5] = r1
            ii.c r1 = new ii.c
            java.lang.String r5 = "206"
            r1.<init>(r4, r5)
            r5 = 9
            r0[r5] = r1
            ii.c r1 = new ii.c
            java.lang.String r5 = "304"
            r1.<init>(r4, r5)
            r5 = 10
            r0[r5] = r1
            ii.c r1 = new ii.c
            java.lang.String r5 = "400"
            r1.<init>(r4, r5)
            r5 = 11
            r0[r5] = r1
            ii.c r1 = new ii.c
            java.lang.String r5 = "404"
            r1.<init>(r4, r5)
            r5 = 12
            r0[r5] = r1
            ii.c r1 = new ii.c
            java.lang.String r5 = "500"
            r1.<init>(r4, r5)
            r4 = 13
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "accept-charset"
            r1.<init>(r4, r3)
            r4 = 14
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "accept-encoding"
            java.lang.String r5 = "gzip, deflate"
            r1.<init>(r4, r5)
            r4 = 15
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "accept-language"
            r1.<init>(r4, r3)
            r4 = 16
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "accept-ranges"
            r1.<init>(r4, r3)
            r4 = 17
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "accept"
            r1.<init>(r4, r3)
            r4 = 18
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "access-control-allow-origin"
            r1.<init>(r4, r3)
            r4 = 19
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "age"
            r1.<init>(r4, r3)
            r4 = 20
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "allow"
            r1.<init>(r4, r3)
            r4 = 21
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "authorization"
            r1.<init>(r4, r3)
            r4 = 22
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "cache-control"
            r1.<init>(r4, r3)
            r4 = 23
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "content-disposition"
            r1.<init>(r4, r3)
            r4 = 24
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "content-encoding"
            r1.<init>(r4, r3)
            r4 = 25
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "content-language"
            r1.<init>(r4, r3)
            r4 = 26
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "content-length"
            r1.<init>(r4, r3)
            r4 = 27
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "content-location"
            r1.<init>(r4, r3)
            r4 = 28
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "content-range"
            r1.<init>(r4, r3)
            r4 = 29
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "content-type"
            r1.<init>(r4, r3)
            r4 = 30
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "cookie"
            r1.<init>(r4, r3)
            r4 = 31
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "date"
            r1.<init>(r4, r3)
            r4 = 32
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "etag"
            r1.<init>(r4, r3)
            r4 = 33
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "expect"
            r1.<init>(r4, r3)
            r4 = 34
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "expires"
            r1.<init>(r4, r3)
            r4 = 35
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "from"
            r1.<init>(r4, r3)
            r4 = 36
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "host"
            r1.<init>(r4, r3)
            r4 = 37
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "if-match"
            r1.<init>(r4, r3)
            r4 = 38
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "if-modified-since"
            r1.<init>(r4, r3)
            r4 = 39
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "if-none-match"
            r1.<init>(r4, r3)
            r4 = 40
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "if-range"
            r1.<init>(r4, r3)
            r4 = 41
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "if-unmodified-since"
            r1.<init>(r4, r3)
            r4 = 42
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "last-modified"
            r1.<init>(r4, r3)
            r4 = 43
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "link"
            r1.<init>(r4, r3)
            r4 = 44
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "location"
            r1.<init>(r4, r3)
            r4 = 45
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "max-forwards"
            r1.<init>(r4, r3)
            r4 = 46
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "proxy-authenticate"
            r1.<init>(r4, r3)
            r4 = 47
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "proxy-authorization"
            r1.<init>(r4, r3)
            r4 = 48
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "range"
            r1.<init>(r4, r3)
            r4 = 49
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "referer"
            r1.<init>(r4, r3)
            r4 = 50
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "refresh"
            r1.<init>(r4, r3)
            r4 = 51
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "retry-after"
            r1.<init>(r4, r3)
            r4 = 52
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "server"
            r1.<init>(r4, r3)
            r4 = 53
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "set-cookie"
            r1.<init>(r4, r3)
            r4 = 54
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "strict-transport-security"
            r1.<init>(r4, r3)
            r4 = 55
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "transfer-encoding"
            r1.<init>(r4, r3)
            r4 = 56
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "user-agent"
            r1.<init>(r4, r3)
            r4 = 57
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "vary"
            r1.<init>(r4, r3)
            r4 = 58
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "via"
            r1.<init>(r4, r3)
            r4 = 59
            r0[r4] = r1
            ii.c r1 = new ii.c
            java.lang.String r4 = "www-authenticate"
            r1.<init>(r4, r3)
            r3 = 60
            r0[r3] = r1
            p154ii.C3177d.f12690a = r0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r3 = r0.length
            r1.<init>(r3)
            int r0 = r0.length
        L2b7:
            if (r2 >= r0) goto L2d3
            ii.c[] r3 = p154ii.C3177d.f12690a
            r4 = r3[r2]
            oi.i r4 = r4.f12688b
            boolean r4 = r1.containsKey(r4)
            if (r4 != 0) goto L2d0
            r3 = r3[r2]
            oi.i r3 = r3.f12688b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r1.put(r3, r4)
        L2d0:
            int r2 = r2 + 1
            goto L2b7
        L2d3:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r1)
            java.lang.String r1 = "Collections.unmodifiableMap(result)"
            p214m2.C4339q.m9705j(r0, r1)
            p154ii.C3177d.f12691b = r0
            return
    }

    public C3177d() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public final p260oi.C5287i m7612a(p260oi.C5287i r6) {
            r5 = this;
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r6, r0)
            int r0 = r6.mo11585h()
            r1 = 0
        La:
            if (r1 >= r0) goto L35
            r2 = 65
            byte r2 = (byte) r2
            r3 = 90
            byte r3 = (byte) r3
            byte r4 = r6.mo11588o(r1)
            if (r2 <= r4) goto L19
            goto L1b
        L19:
            if (r3 >= r4) goto L1e
        L1b:
            int r1 = r1 + 1
            goto La
        L1e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "PROTOCOL_ERROR response malformed: mixed case name: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r6 = r6.m11592s()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L35:
            return r6
    }
}
